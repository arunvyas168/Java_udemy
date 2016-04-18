package com.company;

public class Main {

    public static void main(String[] args) {

        League<Team<FootballPlayer>> footballLeague = new League<>("AFL");
        Team<FootballPlayer> usc = new Team<>("USC");
        Team<FootballPlayer> stanford = new Team<>("Stanford");
        Team<FootballPlayer> seattle = new Team<>("Seattle");
        Team<FootballPlayer> la = new Team<>("LA");

        footballLeague.add(usc);
        footballLeague.add(stanford);
        footballLeague.add(seattle);
        footballLeague.add(la);

        seattle.matchResult(la, 1,0);
        seattle.matchResult(usc,1,2);

        footballLeague.showLeagueTable();

        /*
        The Below will also work but we need to make sure we use generic.
        Otherwise we can add any kind of player to any kind of team and
        any kind of team to any kind of league.
        To make sure we are able to catch such mishap at compile time we use Generics

        League  error = new League("ERR");
        Team  arun = new Team("arun");
        Team  shal = new Team("shal");
        error.add(arun);
        error.add(shal);
        error.add(usc);
        arun.matchResult(shal,10,0);
        error.showLeagueTable();*/



    }
}
