package com.company;

import com.company.models.Team;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;


public class FileInteraction implements Serializable {

   public static final String filePath = "teamList.txt";

    public static void writeTeamList(ArrayList<Team> teamList){
        try {
            FileWriter myWriter = new FileWriter(filePath);
            for (Team team : teamList) {
                myWriter.write(team.printTeamDescription()+"\n");
            }
            myWriter.close();
            System.out.println("Successfully wrote to the file");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
}


}
