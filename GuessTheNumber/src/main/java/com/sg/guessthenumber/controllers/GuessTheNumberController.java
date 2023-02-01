/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.guessthenumber.controllers;

import com.sg.guessthenumber.exceptions.GuessTheNumberFinishedGameException;
import com.sg.guessthenumber.exceptions.GuessTheNumberInvalidAnswerException;
import com.sg.guessthenumber.exceptions.GuessTheNumberInvalidAnswerTypeException;
import com.sg.guessthenumber.exceptions.GuessTheNumberInvalidGameIdException;
import com.sg.guessthenumber.models.Game;
import com.sg.guessthenumber.models.Guess;
import com.sg.guessthenumber.models.Round;
import com.sg.guessthenumber.service.GuessTheNumberService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Nickee Coco
 */

@RestController
@RequestMapping("/api/guessthenumber")
public class GuessTheNumberController {
    
    private final GuessTheNumberService service;
    
    public GuessTheNumberController(GuessTheNumberService service) {
        this.service = service;
    }
    
    @PostMapping("/begin")
    @ResponseStatus(HttpStatus.CREATED)
    public int createNewGame() {
        return service.createNewGame();
    }
    
    @GetMapping("/game")
    public List<Game> getAllGames() {
        List<Game> games = service.getAllGames();
        games.stream()
                .forEach(game -> hideAnswer(game));
        return games;
    }
    
    @GetMapping("/game/{id}")
    public Game findGameById(@PathVariable int id) throws GuessTheNumberInvalidGameIdException {
        Game game = service.findGameById(id);
        
        hideAnswer(game);
        
        return game;
    }
    
    @PostMapping("/guess")
    @ResponseStatus(HttpStatus.CREATED)
    public Round makeGuess(@RequestBody Guess guess) throws 
            GuessTheNumberInvalidAnswerTypeException, 
            GuessTheNumberFinishedGameException, 
            GuessTheNumberInvalidAnswerException, 
            GuessTheNumberInvalidGameIdException {
        
         // InvalidFormatException
        isGuessOnlyIntegers(guess.getGuess());
        
        Round round = service.makeGuess(guess);
        Game game = round.getGame();
        
        hideAnswer(game);
        
        return round;
    }
    
    @GetMapping("/rounds/{gameId}")
    public List<Round> getAllRounds(@PathVariable int gameId) throws GuessTheNumberInvalidGameIdException {
        
        List<Round> rounds = service.getAllRounds(gameId);
               
        rounds.stream()
                .forEach(round -> hideAnswer(round.getGame()));
        
        return rounds;        
    }
    
    private void isGuessOnlyIntegers(String guess) throws GuessTheNumberInvalidAnswerTypeException {
        try {
            int guessInt = Integer.parseInt(guess);
        } catch(NumberFormatException ex) {
            throw new GuessTheNumberInvalidAnswerTypeException(
                    "Your guess is invalid. It should only contain integers.");
        }
    }
    
    private void hideAnswer(Game game) {
        String answer = game.getAnswer();
        game.setAnswer(game.isFinished() ? answer : "****");
    }
    
}
