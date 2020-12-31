package com.company;

import com.company.models.*;

import java.util.ArrayList;

public class ProgramManager {

    private ArrayList<Team> teamList ;

    public ProgramManager() {
        //init the list with hardCoded objects
        this.teamList = HardCodedTeamsGenerator.generate();
    }


    public  void start()
    {
        while(true) {
            CmdInteraction.printMenu();
            int command = getNumber();

            switch(command) {
                case 1 :
                     simulateMatch();
                    break;
                case 2 :
                    addTeam();
                    break;
                case 3 :
                    removeTeam();
                    break;
                case 4 :
                    CmdInteraction.printTeams(teamList);
                    break;
                case 5 :
                    FileInteraction.writeTeamList(teamList);
                    break;
                case 6 :
                    CmdInteraction.end();
                    break;
                default:
                    System.out.println("Wrong Command");
            }

        }
    }

    public void simulateMatch(){
        int  teamIndex1, teamIndex2;

        CmdInteraction.printTeams(teamList);
        System.out.println("Press the number of the two team you want to face each other");
        teamIndex1 = getNumber();
        teamIndex2 = getNumber();
        while (teamIndex1 == teamIndex2){
            System.out.println("Please select DIFFERENTS teams");
            teamIndex1 = getNumber();
            teamIndex2 = getNumber();
        }
        try{
            Game game = new Game(teamList.get(teamIndex1),teamList.get(teamIndex2));
            game.play();
        }catch (IndexOutOfBoundsException e){
            System.out.println("Please enter an available index team");
            simulateMatch();
        }
    }

    public void removeTeam(){
        CmdInteraction.printTeams(teamList);
        System.out.println("Press the number of the team you want to remove");
        int index = getNumber();
        try{
            this.teamList.remove(index);
        }catch (IndexOutOfBoundsException e){
            System.out.println("Please enter an available index team");
            removeTeam();
        }
    }

    public void addTeam(){
        String citizenship,name;
        int sportType;
        sportType = getSportType();
        System.out.println("Please enter the citizenship of the team");
        citizenship = CmdInteraction.sc.nextLine();
        System.out.println("Please enter the name of the team");
        name = CmdInteraction.sc.nextLine();

        Team newTeam = getTeam(sportType,name,citizenship);
        newTeam.initPlayers();
        teamList.add(newTeam);
    }


    private int getSportType(){
        int sportType = 0;
        System.out.println("Please enter 1 for tennis team and 2 for soccer team");
        sportType = getNumber();

        while(sportType > 2 || sportType < 1){
            System.out.println("Please enter 1 for tennis team and 2 for soccer team");
            sportType = getNumber();
        }
        return sportType;
    }


    private Team getTeam(int sportType,String name,String citizenship){
       Team newTeam = null;
        switch(sportType) {
            case 1 :
                newTeam =  new TennisTeam(name,citizenship);
                break;
            case 2 :
                newTeam =  new SoccerTeam(name,citizenship);
                break;
            default:
                System.out.println("Wrong Command");
        }

        return newTeam;
    }

    public static int getGrade(){
        int newGrade;
        System.out.println("Grade must be between 1 and 100");
         newGrade = getNumber();
         while( !((newGrade <= 100) && (newGrade >= 0) )){
             System.out.println("Grade must be between 1 and 100");
             newGrade = getNumber();
         }
           return newGrade;
    }

    public static int getNumber(){
        String line = CmdInteraction.sc.nextLine();
        int command = -1;
        try {
            command = Integer.parseInt(line);
        } catch (Exception e) {
            System.out.println("Enter correct number");
            getNumber();
        }
        return command;
    }

}
