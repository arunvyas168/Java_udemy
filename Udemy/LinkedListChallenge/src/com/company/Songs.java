package com.company;

/**
 * Created by arun on 4/9/16.
 */
public class Songs {
    private String tittle;
    private double duration;

    public Songs(String tittle, double duration) {
        this.duration = duration;
        this.tittle = tittle;
    }

    public String getTittle() {
        return tittle;
    }

    @Override
    public String toString() {
        return this.tittle +": "+ this.duration;
    }
}
