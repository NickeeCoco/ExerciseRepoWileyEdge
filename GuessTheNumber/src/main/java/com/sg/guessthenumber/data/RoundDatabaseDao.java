/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.guessthenumber.data;

import com.sg.guessthenumber.models.Game;
import com.sg.guessthenumber.models.Round;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Nickee Coco
 */
@Repository
public class RoundDatabaseDao implements RoundDao {
    
    private JdbcTemplate jdbcTemplate;
    
    @Autowired
    public RoundDatabaseDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Round createNewRound(Round round, int gameId) {
        
        final String query = "INSERT INTO round(guess, guessTime, result, gameId) VALUES(?,?,?,?);";
        GeneratedKeyHolder keyHolder = new GeneratedKeyHolder();
        
        jdbcTemplate.update((Connection conn) -> {
            
            PreparedStatement statement = conn.prepareStatement(
                    query,
                    Statement.RETURN_GENERATED_KEYS);
            
            statement.setString(1, round.getGuess());
            statement.setTimestamp(2, Timestamp.valueOf(round.getGuessTime()));
            statement.setString(3, round.getResult());
            statement.setInt(4, gameId);
            
            return statement;
        }, keyHolder);
        
        round.setId(keyHolder.getKey().intValue());
        
        return round;
        
    }

    @Override
    public List<Round> getAllRounds(int gameId) {
        final String query = "SELECT * FROM round JOIN game ON game.id = round.gameId WHERE game.id = ?;";
        return jdbcTemplate.query(query, new RoundMapper(), gameId);
    }
    
    private static final class RoundMapper implements RowMapper<Round> {

        @Override
        public Round mapRow(ResultSet rs, int i) throws SQLException {
            Round round = new Round();
            round.setId(rs.getInt("id"));
            round.setGuess(rs.getString("guess"));
            round.setGuessTime(rs.getTimestamp("guessTime").toLocalDateTime());
            round.setResult(rs.getString("result"));
            
            Game game = new Game();
            game.setId(rs.getInt("gameId"));
            game.setAnswer(rs.getString("answer"));
            game.setIsFinished(rs.getBoolean("isFinished"));
            
            round.setGame(game);
            
            return round;
        }
    
    }
}
