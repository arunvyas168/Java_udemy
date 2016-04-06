package com.company;

class Cars {
    private String name;
    private boolean Engine= true;
    private int cylinders;
    private int wheels = 4;

    public Cars(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
    }

    public void startEngine(){
        System.out.println("Inside Cars::startEngine()");
    }
    public void accelerate(){
        System.out.println("Inside Cars::accelerate()");
    }
    public void breaks(){
        System.out.println("Inside Cars::breaks()");
    }
}

class honda extends Cars{
    public honda() {
        super("Honda", 4);
    }

    @Override
    public void startEngine() {
        System.out.println("Inside honda::startEngine()");
        super.startEngine();
    }

    public void accelerate(){
        System.out.println("Inside honda::accelerate()");
    }
}

public class Main {

    public static void main(String[] args) {
        honda accord = new honda();
        accord.startEngine();
        accord.accelerate();
        accord.breaks();
    }
}
