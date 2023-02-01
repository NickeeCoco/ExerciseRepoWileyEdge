/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.sg.guessthenumber.service;

import com.sg.guessthenumber.exceptions.GuessTheNumberFinishedGameException;
import com.sg.guessthenumber.exceptions.GuessTheNumberInvalidAnswerException;
import com.sg.guessthenumber.exceptions.GuessTheNumberInvalidGameIdException;
import com.sg.guessthenumber.models.Game;
import com.sg.guessthenumber.models.Guess;
import com.sg.guessthenumber.models.Round;
import java.util.List;

/**
 *
 * @author Nickee Coco
 */
public interface GuessTheNumberService {
    
    int createNewGame();
    List<Game> getAllGames();
    Game findGameById(int id) throws GuessTheNumberInvalidGameIdException;
    
    Round makeGuess(Guess guess)  throws
            GuessTheNumberFinishedGameException,
            GuessTheNumberInvalidAnswerException,
            GuessTheNumberInvalidGameIdException;
    
    List<Round> getAllRounds(int gameId) throws GuessTheNumberInvalidGameIdException;
}
