package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> team1 = new Team<>("team1");
        team1.addPlayer(joe);
//        team1.addPlayer(pat);
//        team1.addPlayer(beckham);

        System.out.println(team1.numPlayers());

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);
        System.out.println(baseballTeam.numPlayers());
    }
}
