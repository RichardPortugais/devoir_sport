package com.company.models;

import com.company.models.Player;

import java.io.Serializable;

public class SoccerPlayer  extends Player implements Serializable {
    private String post;
    private int speed;
    private int shoot;
    private int defense;


    public SoccerPlayer(String id, String name, String nationality,
                        int gamePlayed, String post, int speed, int shoot, int defense) {
        super(id,name, nationality, gamePlayed);
        this.post = post;
        this.speed = speed;
        this.shoot = shoot;
        this.defense = defense;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getShoot() {
        return shoot;
    }

    public void setShoot(int shoot) {
        this.shoot = shoot;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    @Override
    public int getAverageGrade() {
        return (this.defense+this.shoot+this.speed)/3;
    }

}
