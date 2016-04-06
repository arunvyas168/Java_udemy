package com.company;

/**
 * Created by arun on 2/28/16.
 */
public class animal {
    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;

    public animal(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    public void eat(){
        System.out.println("Animal.Eat Code");
    }

    public void move(int speed){
        System.out.println("animal.move() called");
        System.out.println("Moving at Speed: "+speed+" mph");
    }

    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
}
