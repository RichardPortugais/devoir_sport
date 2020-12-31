package com.company;

import com.company.models.Team;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class CmdInteraction {
     public static Scanner sc = new Scanner(System.in);


    public static void announceWinner(String winner){
        System.out.println("The winner is " );
        suspense();
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" );
        System.out.println(winner);
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" );
    }

    public static void suspense()  {
        try{
            for (int i = 1;i<=3;i++){
                System.out.println(i);
                TimeUnit.SECONDS.sleep(1);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void printMenu(){
        System.out.println("");
        System.out.println("-------------------------------------------------------------");
        System.out.println("Hello and welcome to THESIMULATION");
        System.out.println("-------------------------------------------------------------");
        System.out.println("press 1 for simulating a game");
        System.out.println("press 2 for adding a new team");
        System.out.println("press 3 for removing a team");
        System.out.println("press 4 if you want to see all the teams");
        System.out.println("press 5 for printing the team to a file");
        System.out.println("press 6 for exit");

    }

    public static void end(){
        System.out.println("We Enjoyed Helping you simulating a match");
        System.out.println("We Hope to see you soon");
        System.out.println("GOOD BY");
        System.out.println("-------------------------------------------------------------");
    }

    public static void printTeams(ArrayList<Team> teamList){
        int index =0;
        System.out.println("Here are all the Teams");
        for(Team team : teamList) {
            System.out.println(index +") "+team.printTeamDescription());
            index++;
        };
    }
}
