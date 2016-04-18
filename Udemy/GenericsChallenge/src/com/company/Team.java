package com.company;

import java.util.ArrayList;

/**
 * Created by arun on 4/17/16.
 */
public class Team<T extends Player> implements Comparable<Team<T>>{
    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public boolean addPlayer(T player){
        if (this.members.contains(player)){
            System.out.println(player.getName()+" is already on this team");
            return false;
        } else{
            this.members.add(player);
            System.out.println(player.getName() + " picked for the team: "+ this.name);
            return true;
        }
    }

    public int numPlayers(){
        return this.members.size();
    }

    public void matchResult(Team<T> opponent, int ourscore, int theirscore){
        String message;

        if (ourscore>theirscore){
            this.won++;
            message = " beat ";
        } else if(ourscore == theirscore){
            this.tied++;
            message = " drew with ";
        } else {
            this.lost++;
            message = " lost to ";
        }
        played++;
        if (opponent !=null){
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResult(null,theirscore,ourscore);
        }
    }

    public int ranking(){
        return (won *2)+ tied;
    }


    @Override
    public int compareTo(Team<T> team) {
        if (this.ranking() > team.ranking()){
            return -1;
        } else if (this.ranking() < team.ranking() ){
            return 1;
        } else {
            return 0;
        }
    }
}
