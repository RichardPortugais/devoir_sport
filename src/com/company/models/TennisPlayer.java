package com.company.models;

import com.company.models.Player;

import java.io.Serializable;
import java.util.ArrayList;

public class TennisPlayer extends Player implements Serializable {
    private int agility;
    private int endurance;
    private int power;

    public TennisPlayer(String id, String name, String nationality, int gamePlayed, int agility, int endurance, int power) {
        super(id, name, nationality, gamePlayed);
        this.agility = agility;
        this.endurance = endurance;
        this.power = power;
    }


    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getEndurance() {
        return endurance;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public int getAverageGrade() {
        return (this.agility+this.endurance+this.power)/3;
    }

}
