package com.company;

/**
 * Created by arun on 4/14/16.
 */
public abstract class Bird extends Animal implements CanFly{

    public Bird(String name){
        super(name);
    }

    @Override
    public void eat(){
        System.out.println(this.getName() + " is pecking");
    }

    @Override
    public void breathe(){
        System.out.println("Bird: breathe in, breathe out, repeat ");
    }

    @Override
    public void fly(){
        System.out.println(this.getName()+ " Flapping wings");
    }
}
