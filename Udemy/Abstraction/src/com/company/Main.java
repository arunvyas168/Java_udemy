package com.company;

import javafx.scene.AmbientLight;

public class Main {

    public static void main(String[] args) {
        Dog puppy = new Dog("shalini");
        puppy.breathe();
        puppy.eat();
        Parrot parrot = new Parrot("Mithu");
        parrot.eat();
        parrot.breathe();
        parrot.fly();
        Penguin penguin = new Penguin("Pingu");
        penguin.eat();
        penguin.breathe();
        penguin.fly();
    }
}
