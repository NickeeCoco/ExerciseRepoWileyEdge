/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.guessthenumber.models;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 *
 * @author Nickee Coco
 */
public class Round {
    private int id;
    private String guess;
    private LocalDateTime guessTime;
    private String result;
    private Game game;
    
    public Round() {
        this.guessTime = LocalDateTime.now();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGuess() {
        return guess;
    }

    public void setGuess(String guess) {
        this.guess = guess;
    }

    public LocalDateTime getGuessTime() {
        return guessTime;
    }
    
    public void setGuessTime(LocalDateTime guessTime) {
        this.guessTime = guessTime;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + this.id;
        hash = 73 * hash + Objects.hashCode(this.guess);
        hash = 73 * hash + Objects.hashCode(this.guessTime);
        hash = 73 * hash + Objects.hashCode(this.result);
        hash = 73 * hash + Objects.hashCode(this.game);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Round other = (Round) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.guess, other.guess)) {
            return false;
        }
        if (!Objects.equals(this.result, other.result)) {
            return false;
        }
        if (!Objects.equals(this.guessTime, other.guessTime)) {
            return false;
        }
        return Objects.equals(this.game, other.game);
    }
    
    
    
}
