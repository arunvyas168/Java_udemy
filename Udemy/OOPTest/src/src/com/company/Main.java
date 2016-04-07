package com.company;

public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic","Chicken", 5.0,"Wheat");
        hamburger.addHamburgerAddition1("Tomatoes",1.0);
        hamburger.addHamburgerAddition2("Pickle",1.0);
        hamburger.addHamburgerAddition3("Spinach",1.0);
        hamburger.addHamburgerAddition4("Avacado",2.0);
        System.out.println("Total price of the hamburger is: "+ hamburger.itemizeHamburger());

        System.out.println("################# Healthy Hamburger ###########################");

        HealthyBurger healthyBurger = new HealthyBurger("Fish",6.0);
        healthyBurger.addHealthAddition1("Egg", 2.0);
        healthyBurger.addHealthAddition2("Baked Potatoes",1.0);
        healthyBurger.addHamburgerAddition1("Tomatoes",1.0);
        healthyBurger.addHamburgerAddition2("Pickle",1.0);
        healthyBurger.addHamburgerAddition3("Spinach",1.0);
        healthyBurger.addHamburgerAddition4("Avacado",2.0);
        System.out.println("Total price of the Healthy hamburger is: "+ healthyBurger.itemizeHamburger());


        System.out.println("################# Deluxe Hamburger ###########################");

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addHamburgerAddition1("Tomatoes",1.0);
        deluxeBurger.addHamburgerAddition2("Pickle",1.0);
        deluxeBurger.addHamburgerAddition3("Spinach",1.0);
        deluxeBurger.addHamburgerAddition4("Avacado",2.0);
        System.out.println("Total price of the deluxeBurger is: "+ deluxeBurger.itemizeHamburger());

    }
}
