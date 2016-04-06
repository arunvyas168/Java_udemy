package com.company;

public class Main {

    public static void main(String[] args) {
        animal animal1 = new animal("Animal",1,1,5,5);
        dog dog1 = new dog("Snooty",8,25,2,4,32,"brown");
        System.out.println("*****************dog1.eat();*****************");
        dog1.eat();
        System.out.println("*****************dog1.run();*****************");
        dog1.run();
        System.out.println("*****************dog1.walk();*****************");
        dog1.walk();
        System.out.println("*****************animal1.eat();*****************");
        animal1.eat();
    }
}
