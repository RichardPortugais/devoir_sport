package com.company.models;

import com.company.CmdInteraction;
import com.company.ProgramManager;

import java.util.ArrayList;

public class TennisTeam extends Team{

    public TennisTeam(String name, String citizenship) {
        super(name, citizenship);
    }
    public TennisTeam( String name, String citizenship,ArrayList playerList) {
        super( name, citizenship,playerList);
    }

    @Override
    public void initPlayers() {
        ArrayList<Player> playerList = new ArrayList<>();
        int gamePlayed,agility,endurance,power;
        String id, name,  nationality ;
        System.out.println("Lets create a tennis player");
        System.out.println("Please enter the id of the player");
        id = CmdInteraction.sc.nextLine();
        System.out.println("Please enter the name of the player");
        name = CmdInteraction.sc.nextLine();
        System.out.println("Please enter the nationality of the player");
        nationality = CmdInteraction.sc.nextLine();
        System.out.println("Please enter the number of game played by the player");
        gamePlayed = ProgramManager.getNumber();
        System.out.println("Please enter the agility grade of the player");
        agility = ProgramManager.getGrade();
        System.out.println("Please enter the endurance grade of the player");
        endurance = ProgramManager.getGrade();
        System.out.println("Please enter the power grade of the player");
        power = ProgramManager.getGrade();
        playerList.add(new TennisPlayer(id,name,nationality,gamePlayed,agility,endurance,power));

        super.setPlayerList(playerList);
    }

    @Override
    public String printTeamDescription(){
        return "Categorie: Tennis, "+ super.printTeamDescription();
    }
}
