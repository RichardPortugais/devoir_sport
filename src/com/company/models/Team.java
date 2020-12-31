package com.company.models;

import com.company.models.Player;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public abstract class  Team {

    private String sportName;
    private String name;
    private String citizenship;
    private ArrayList<Player> playerList;


    public Team(String name, String citizenship) {
        this.name = name;
        this.citizenship = citizenship;
        this.playerList = new ArrayList<>();
    }
    public Team(String name, String citizenship,ArrayList<Player> playerList) {
        this.name = name;
        this.citizenship = citizenship;
        this.playerList = playerList;
    }



    public abstract void initPlayers();
    public int getTeamGrade() {
        int sum = 0;

        for (Player player:
             this.playerList) {
            sum += player.getAverageGrade();
        }
     return sum / this.playerList.size();
    }

    public String printTeamDescription(){
        return "TeamName:"+ name+" ,Citizenship:"+citizenship;
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }


    public List<Player> getPlayerList() {
        return playerList;
    }

    public void setPlayerList(ArrayList<Player> playerList) {
        this.playerList = playerList;
    }
}
