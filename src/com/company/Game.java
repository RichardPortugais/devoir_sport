package com.company;

import com.company.models.SoccerTeam;
import com.company.models.Team;
import com.company.models.TennisTeam;

public class Game {
    private Team team1;
    private Team team2;

    public Game(Team team1, Team team2) {
        this.team1 = team1;
        this.team2 = team2;
    }

    public void play(){
        if((team1 instanceof SoccerTeam && team1 instanceof TennisTeam)||
                (team1 instanceof TennisTeam && team1 instanceof SoccerTeam)){
            System.out.println("This game cant be played cause the sport are different" );
        }else{
            System.out.println("This game will be "+ team1.getName() + " VS " + team2.getName() );
            CmdInteraction.announceWinner(this.getWinner().getName());
        }

    }

    private Team getWinner() {
        int grade1, grade2, randomWinner;
        grade1 = team1.getTeamGrade();
        grade2 = team2.getTeamGrade();

        if (grade1 > grade2) {
            return team1;
        } else if (grade1 < grade2) {
            return team2;
        }
        randomWinner = (int) Math.floor(Math.random() * 2) + 1;

        return (randomWinner == 1) ? team1 : team2;
    }

}
