package com.company;

/**
 * Created by arun on 4/14/16.
 */
public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void eat();
    public abstract void breathe();


    public String getName() {
        return name;
    }
}
