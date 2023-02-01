/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.guessthenumber.service;

import com.sg.guessthenumber.data.GameDao;
import com.sg.guessthenumber.data.RoundDao;
import com.sg.guessthenumber.exceptions.GuessTheNumberFinishedGameException;
import com.sg.guessthenumber.exceptions.GuessTheNumberInvalidAnswerException;
import com.sg.guessthenumber.exceptions.GuessTheNumberInvalidGameIdException;
import com.sg.guessthenumber.models.Game;
import com.sg.guessthenumber.models.Guess;
import com.sg.guessthenumber.models.Round;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Nickee Coco
 */

@Service
public class GuessTheNumberServiceImpl implements GuessTheNumberService {

    @Autowired
    GameDao gameDao;
    
    @Autowired
    RoundDao roundDao;
    
    @Override
    public int createNewGame() {
        Game game = new Game();
        game.setAnswer(generateAnswer());
        return gameDao.createNewGame(game);
    }

    @Override
    public List<Game> getAllGames() {
        return gameDao.getAllGames();
    }

    @Override
    public Game findGameById(int id) throws 
            GuessTheNumberInvalidGameIdException {
        if(!isGameExists(id)) {
            throw new GuessTheNumberInvalidGameIdException(
                    "This game does not exist. Please select a valid, ongoing game.");
        }
        return gameDao.findGameById(id);
    }

    @Override
    public Round makeGuess(Guess guess) throws
            GuessTheNumberFinishedGameException,
            GuessTheNumberInvalidAnswerException,
            GuessTheNumberInvalidGameIdException {
        
        Game game = gameDao.findGameById(guess.getGameId());
        
        if(game == null) {
            throw new GuessTheNumberInvalidGameIdException(
                    "This game does not exist. Please select a valid, ongoing game.");
        }
        
        if(game.isFinished()) {
            throw new GuessTheNumberFinishedGameException(
                    "This game's answer has already been guessed. Please chose another game.");
        }
        
        if(isInvalidGuess(guess.getGuess())) {
            throw new GuessTheNumberInvalidAnswerException(
                    "Your guess is invalid. It should contain 4 unique numbers (ex: 1234, 2578, 9051)");
        }    
        
        Round round = new Round();
        round.setGuess(guess.getGuess());
        round.setResult(generateResult(guess.getGuess(), game.getAnswer()));
        round.setGame(game);
        
        if(guess.getGuess().equals(game.getAnswer())) {
            endGame(game);
        }
                
        return roundDao.createNewRound(round, guess.getGameId());
    }

    @Override
    public List<Round> getAllRounds(int gameId) throws GuessTheNumberInvalidGameIdException {
        if(!isGameExists(gameId)) {
            throw new GuessTheNumberInvalidGameIdException(
                    "This game does not exist. Please select a valid, ongoing game.");
        }
        return roundDao.getAllRounds(gameId);
    }
    
    private String generateAnswer() {
        Set<Integer> uniqueNumbers = new HashSet<>();
        Random rd = new Random();
        StringBuilder numberString = new StringBuilder();
        
        while(uniqueNumbers.size() < 4) {
            int rdInt = rd.nextInt(10);
            uniqueNumbers.add(rdInt);
        }
        
        for(int number : uniqueNumbers) {
            numberString.append(number);
        }
        
        return numberString.toString();
    }
    
    private boolean isInvalidGuess(String guess) {
        Set<Integer> uniqueNumbers = new HashSet<>();
        
        if(guess.length() != 4) {
            return true;
        }
        
        for(int i = 0; i < guess.length(); i++) {
            char guessChar = guess.charAt(i);
            int guessInt = Character.getNumericValue(guessChar);
            
            if(guessInt >= 0 && guessInt <= 9) {
                uniqueNumbers.add(guessInt);
            }
        }
        
        return uniqueNumbers.size() < 4;
    }
    
    private String generateResult(String guess, String answer) {
        int exact = 0;
        int partial = 0;
        
        for(int i = 0; i < guess.length(); i++) {
            char currentChar = guess.charAt(i);
            int charIndex = answer.indexOf(currentChar);
            
            if(charIndex == i) {
                exact++;
            } else if(charIndex >= 0) {
                partial++;
            }
        }
        
        return String.format("e:%s:p:%s", exact, partial);
    }

    private void endGame(Game game) {
        game.setIsFinished(true);
        gameDao.endGame(game.getId());
    }
    
    private boolean isGameExists(int id) {
        Game game = gameDao.findGameById(id);
        return game != null;
    }
}
