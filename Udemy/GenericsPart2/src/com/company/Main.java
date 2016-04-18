package com.company;

public class Main {

    public static void main(String[] args) {
        FootballPlayer reggie = new FootballPlayer("Reggie Bush");
        BaseballPlayer ryan = new BaseballPlayer("Ryan");
        SoccerPlayer messi = new SoccerPlayer("Messi");
        Team<FootballPlayer> usc = new Team<>("USC");
        usc.addPlayer(reggie);
        //usc.addPlayer(ryan);
        //usc.addPlayer(messi);
        System.out.println(usc.numPlayers());
        Team<BaseballPlayer> baseballPlayerTeam = new Team<>("Chicago Clubs");
        baseballPlayerTeam.addPlayer(ryan);

        //Team<String> brokenTeam = new Team<>("Mot a part of player");
        //brokenTeam.addPlayer("wont work");

        Team<SoccerPlayer> soccerPlayerTeam = new Team<>("Manchester");
        soccerPlayerTeam.addPlayer(messi);

        Team<FootballPlayer> stanford = new Team<>("Stanford");
        FootballPlayer james = new FootballPlayer("James");
        stanford.addPlayer(james);

        Team<FootballPlayer> seattle = new Team<>("Seattle");
        Team<FootballPlayer> la = new Team<>("LA");

        seattle.matchResult(la, 1,0);
        //seattle.matchResult(baseballPlayerTeam,1,0);
        seattle.matchResult(usc,1,2);

        System.out.println("############## Rankings ##############");
        System.out.println(seattle.getName()+ " : " + seattle.ranking());
        System.out.println(la.getName()+ " : " + la.ranking());
        System.out.println(usc.getName()+ " : " + usc.ranking());
        System.out.println(stanford.getName()+ " : " + stanford.ranking());
        System.out.println("########################################");

        System.out.println(seattle.compareTo(usc));
        System.out.println(seattle.compareTo(la));
        System.out.println(stanford.compareTo(usc));

    }
}
