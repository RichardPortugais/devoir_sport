package com.company.models;

import java.io.Serializable;
import java.util.ArrayList;

public abstract class Player extends Person implements Serializable {
    private int gamePlayed;

    public Player(String id,  String name, String nationality, int gamePlayed) {
        super(id, name, nationality);
        this.gamePlayed = gamePlayed;
    }

    public abstract  int getAverageGrade() ;

    public int getGamePlayed() {
        return gamePlayed;
    }

    public void setGamePlayed(int gamePlayed) {
        this.gamePlayed = gamePlayed;
    }
}
