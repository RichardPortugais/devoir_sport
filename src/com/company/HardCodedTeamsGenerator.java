package com.company;

import com.company.models.*;

import java.util.ArrayList;

public class HardCodedTeamsGenerator {
    public static ArrayList<Team> generate(){
        ArrayList<Team> teamList = new ArrayList<>();

        ArrayList<Player> e = new ArrayList<Player>();
        e.add( new SoccerPlayer("323233223","nadal","spain",34,"attack",99,99,99));
        e.add( new SoccerPlayer("323233223","nadal","spain",34,"attack",99,99,99));
        e.add(  new SoccerPlayer("323233223","nadal","spain",34,"attack",99,99,99));
        e.add(  new SoccerPlayer("323233223","nadal","spain",34,"attack",99,99,99));
        e.add(  new SoccerPlayer("323233223","nadal","spain",34,"attack",99,99,99));
        e.add(  new SoccerPlayer("323233223","nadal","spain",34,"attack",99,99,99));
        e.add(  new SoccerPlayer("323233223","eadal","spain",34,"attack",99,99,99));
        e.add(  new SoccerPlayer("323233223","nadal","spain",34,"attack",99,99,99));
        e.add(  new SoccerPlayer("323233223","nadal","spain",34,"attack",99,99,99));
        e.add(  new SoccerPlayer("323233223","nadal","spain",34,"attack",99,99,99));
        e.add(  new SoccerPlayer("323233223","nadal","spain",34,"attack",99,99,99));
        e.add(  new SoccerPlayer("323233223","nadal","spain",34,"attack",99,99,99));

        Team team5 = new SoccerTeam("PSG","France",e);
        ArrayList<Player> f = new ArrayList<Player>();
        f.add( new SoccerPlayer("323233223","nadal","spain",34,"attack",99,55,99));
        f.add( new SoccerPlayer("323233223","nadal","spain",34,"attack",99,55,99));
        f.add(  new SoccerPlayer("323233223","nadal","spain",34,"attack",99,55,99));
        f.add(  new SoccerPlayer("323233223","nadal","spain",34,"attack",99,55,99));
        f.add(  new SoccerPlayer("323233223","nadal","spain",34,"attack",99,55,99));
        f.add(  new SoccerPlayer("323233223","nadal","spain",34,"attack",99,5,99));
        f.add(  new SoccerPlayer("323233223","eadal","spain",34,"attack",99,55,99));
        f.add(  new SoccerPlayer("323233223","nadal","spain",34,"attack",99,99,99));
        f.add(  new SoccerPlayer("323233223","nadal","spain",34,"attack",99,99,99));
        f.add(  new SoccerPlayer("323233223","nadal","spain",34,"attack",99,55,99));
        f.add(  new SoccerPlayer("323233223","nadal","spain",34,"attack",99,55,99));
        f.add(  new SoccerPlayer("323233223","nadal","spain",34,"attack",99,55,99));

        Team team6 = new SoccerTeam("OM","France",f);

        TennisPlayer nadal = new TennisPlayer("323233223","nadal","spain",34,99,99,99);
        TennisPlayer federer = new TennisPlayer("3222233","federer","spain",2,80,90,100);
        TennisPlayer Djoco = new TennisPlayer("323233223","Djoco","spain",33,78,87,67);
        TennisPlayer Tsonga = new TennisPlayer("323233223","Tsonga","spain",21,99,56,76);

        ArrayList<Player> a = new ArrayList<Player>();
        a.add(nadal);

        ArrayList<Player> b = new ArrayList<Player>();
        b.add(federer);

        ArrayList<Player> c = new ArrayList<Player>();
        c.add(Djoco);

        ArrayList<Player> d = new ArrayList<Player>();
        d.add(Tsonga);


        Team team1 = new TennisTeam("nadalTeam","spain",a);
        Team team2 = new TennisTeam("federerTeam","sweeden",b);
        Team team3 = new TennisTeam("DjocoTeam","spain",c);
        Team team4 = new TennisTeam("tsongaTeam","sweeden",d);

        teamList = new ArrayList<Team>();
        teamList.add(team1);
        teamList.add(team2);
        teamList.add(team3);
        teamList.add(team4);
        teamList.add(team5);
        teamList.add(team6);

        return teamList;
    }
}
