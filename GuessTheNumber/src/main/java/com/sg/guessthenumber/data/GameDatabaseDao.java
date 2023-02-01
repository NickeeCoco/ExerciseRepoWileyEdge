/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.guessthenumber.data;

import com.sg.guessthenumber.models.Game;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Nickee Coco
 */

@Repository
public class GameDatabaseDao implements GameDao {
    
    private JdbcTemplate jdbcTemplate;
    
    @Autowired
    public GameDatabaseDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int createNewGame(Game game) {
        
        final String query = "INSERT INTO game(answer) VALUES(?);";
        GeneratedKeyHolder keyHolder = new GeneratedKeyHolder();
        
        jdbcTemplate.update((Connection conn) -> {
            
            PreparedStatement statement = conn.prepareStatement(
                    query,
                    Statement.RETURN_GENERATED_KEYS);
            
            statement.setString(1, game.getAnswer());
            return statement;
            
        }, keyHolder);
        
        game.setId(keyHolder.getKey().intValue());
        
        return game.getId();
    }

    @Override
    public List<Game> getAllGames() {
        final String query = "SELECT * FROM game;";
        return jdbcTemplate.query(query, new GameMapper());
    }

    @Override
    public Game findGameById(int id) {
        final String query = "SELECT * FROM game WHERE id = ?";
        
        try {
            return jdbcTemplate.queryForObject(query, new GameMapper(), id);
        } catch(EmptyResultDataAccessException e) {
            return null;
        }
    }

    @Override
    public void endGame(int gameId) {
        final String query = "UPDATE game SET isFinished = true WHERE id =?;";
        
        jdbcTemplate.update(query, gameId);
    }
    
    public static final class GameMapper implements RowMapper<Game> {

        @Override
        public Game mapRow(ResultSet rs, int i) throws SQLException {
            
            Game game = new Game();
            game.setId(rs.getInt("id")); 
            game.setAnswer(rs.getString("answer"));
            game.setIsFinished(rs.getBoolean("isFinished"));
            
            return game;
        }
        
    }
    
}
