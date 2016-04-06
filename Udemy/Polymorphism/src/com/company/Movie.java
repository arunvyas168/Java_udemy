package com.company;

/**
 * Created by arun on 3/27/16.
 */
public class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot(){
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}
