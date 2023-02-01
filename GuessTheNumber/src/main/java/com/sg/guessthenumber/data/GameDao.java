/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.sg.guessthenumber.data;

import com.sg.guessthenumber.models.Game;
import java.util.List;

/**
 *
 * @author Nickee Coco
 */
public interface GameDao {
    
    int createNewGame(Game game);
    
    List<Game> getAllGames();
    
    Game findGameById(int id);
    
    void endGame(int gameId);
}
