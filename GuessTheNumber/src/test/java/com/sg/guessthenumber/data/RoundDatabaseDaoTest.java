/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.sg.guessthenumber.data;


import com.sg.guessthenumber.models.Game;
import com.sg.guessthenumber.models.Round;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Nickee Coco
 */
public class RoundDatabaseDaoTest {

    @Autowired
    GameDao gameDao;

    @Autowired
    RoundDao roundDao;

    /**
     * Test of createNewRound method, of class RoundDatabaseDao.
     */
    @Test
    public void testAddNewRound() {
        Game game = gameDao.findGameById(2);
        Round round = new Round();
        round.setGame(game);
        round.setGuess("9852");
        round.setResult("e:2:p:1");
        
        Round round2 = new Round();
        round2.setGame(game);
        round2.setGuess("7451");
        round2.setResult("e:0:p:0");
        
        List<Round> rounds = roundDao.getAllRounds(2);
        
        assertEquals(2, rounds.size());
        assertTrue(rounds.contains(round));
        assertTrue(rounds.contains(round2));
    }

}
