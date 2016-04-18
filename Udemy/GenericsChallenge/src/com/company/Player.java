package com.company;

/**
 * Created by arun on 4/17/16.
 */
public abstract class Player {
    private String name;

    public Player(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
