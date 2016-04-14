package com.company;

/**
 * Created by arun on 4/14/16.
 */
public class Parrot extends Bird{

    public Parrot(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(this.getName()+" can fly. So fly() is valid");
    }
}
