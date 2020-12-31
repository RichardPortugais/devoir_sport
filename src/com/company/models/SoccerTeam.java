package com.company.models;

import com.company.CmdInteraction;
import com.company.ProgramManager;

import java.util.ArrayList;


public class SoccerTeam extends Team{
    public SoccerTeam( String name, String citizenship) {
        super(name, citizenship);
    }
    public SoccerTeam( String name, String citizenship,ArrayList playerList) {
        super(name, citizenship,playerList);
    }

    public void initPlayers(){
        ArrayList<Player> playerList = new ArrayList<>();
        int gamePlayed,speed,shoot,defense;
        String id,name,  nationality ,post;
        System.out.println("Lets create a soccer player");
        for (int i =0 ;i<11;i++){
            System.out.println("Please enter the id of the player");
            id = CmdInteraction.sc.nextLine();
            System.out.println("Please enter the name of the player");
            name = CmdInteraction.sc.nextLine();
            System.out.println("Please enter the nationality of the player");
            nationality = CmdInteraction.sc.nextLine();
            System.out.println("Please enter the number of game played by the player");
            gamePlayed = ProgramManager.getNumber();
            System.out.println("Please enter the post of the player");
            post = CmdInteraction.sc.nextLine();
            System.out.println("Please enter the speed grade of the player");
            speed = ProgramManager.getGrade();
            System.out.println("Please enter the shoot grade of the player");
            shoot = ProgramManager.getGrade();
            System.out.println("Please enter the defense grade of the player");
            defense = ProgramManager.getGrade();
            playerList.add(new SoccerPlayer(id,name,nationality,gamePlayed,post,speed,shoot,defense));
        }
        super.setPlayerList(playerList);
    }

    @Override
    public String printTeamDescription(){
        return "Categorie: Soccer, "+ super.printTeamDescription();
    }
}
