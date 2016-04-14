package com.company;

/**
 * Created by arun on 4/14/16.
 */
public class Penguin extends Bird {

    public Penguin(String name){
        super(name);
    }

    @Override
    public void fly(){
        super.fly();
        System.out.println("I am not very good at that, can i fly instead");
    }
}
