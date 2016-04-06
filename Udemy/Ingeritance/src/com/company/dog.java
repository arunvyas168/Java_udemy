package com.company;

/**
 * Created by arun on 2/28/16.
 */
public class dog extends animal{

    private int eyes;
    private int legs;
    private int teeth;
    private String coat;

    public dog(String name, int size, int weight, int eyes,int legs, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew(){
        System.out.println("dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("dog.eat() called");
        chew();
        super.eat();
    }

    public void walk(){
        System.out.println("dog.walk() called");
        super.move(3);
    }

    public void run(){
        System.out.println("dog.run() called");
        move(10);
    }
    private void movelegs(int speed){
        System.out.println("dog.movelegs() called");
    }
    @Override
    public void move(int speed) {
        System.out.println("dog.move() called");
        movelegs(speed);
        super.move(speed);
    }
}
