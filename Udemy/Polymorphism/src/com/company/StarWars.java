package com.company;

/**
 * Created by arun on 3/27/16.
 */
public class StarWars extends Movie {
    public StarWars( ) {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial Forces try to take over the Universe";
    }
}
