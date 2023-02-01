/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.sg.guessthenumber.data;

import com.sg.guessthenumber.models.Round;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Nickee Coco
 */
public interface RoundDao {
    
    Round createNewRound(Round round, int gameId);
    
    List<Round> getAllRounds(int gameId);
    
}
