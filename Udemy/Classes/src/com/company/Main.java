package com.company;

public class Main {

    public static void main(String[] args) {
        Car porche = new Car();
        Car mustang = new Car();
        porche.setModel("Carrera");
        System.out.println("Model is: "+porche.getModel());
        mustang.setModel("gtr");
        System.out.println("Model is: "+mustang.getModel());
    }
}
