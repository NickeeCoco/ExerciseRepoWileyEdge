/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.sg.guessthenumber.data;


import com.sg.guessthenumber.models.Game;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 *
 * @author Nickee Coco
 */
@ExtendWith(SpringExtension.class)
@SpringBootTest
public class GameDatabaseDaoTest {
    
    @Autowired
    GameDao gameDao;

    /**
     * Test of createNewGame method, of class GameDatabaseDao.
     */
    @Test
    public void testAddGetNewGame() {
        
        Game game = new Game();
        game.setAnswer("1234");
        
        gameDao.createNewGame(game);
        
        Game fromDao = gameDao.findGameById(game.getId());
        
        assertEquals(game, fromDao);
    }

    /**
     * Test of getAllGames method, of class GameDatabaseDao.
     */
    @Test
    public void testGetAllGames() {
        int offset = gameDao.getAllGames().size();
        
        Game game = new Game();
        game.setAnswer("4567");
        gameDao.createNewGame(game);
        
        Game game2 = gameDao.findGameById(1);
        
        List<Game> games = gameDao.getAllGames();
        
        assertEquals(offset + 2, games.size());
        assertTrue(games.contains(game));
        assertTrue(games.contains(game2));
    }

    /**
     * Test of endGame method, of class GameDatabaseDao.
     */
    @Test
    public void testEndGame() {
        Game game = gameDao.findGameById(8);
        
        gameDao.endGame(game.getId());
        
        assertEquals(true, game.isFinished());
    }
    
}
