package com.company;

/**
 * Created by arun on 4/7/16.
 */
public class HealthyBurger extends Hamburger{

    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown Rye");
    }

    public void addHealthAddition1(String name, double price){
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }
    public void addHealthAddition2(String name, double price){
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double healthHamburgerPrice =  super.itemizeHamburger();
        if(healthyExtra1Name != null){
            healthHamburgerPrice += healthyExtra1Price;
            System.out.println("HealthyBurger: Added "+this.healthyExtra1Name + "for an extra price of " + this.healthyExtra1Price);
        }
        if(healthyExtra2Name != null){
            healthHamburgerPrice += healthyExtra2Price;
            System.out.println("HealthyBurger: Added "+this.healthyExtra2Name + "for an extra price of " + this.healthyExtra2Price);
        }
        return healthHamburgerPrice;
    }
}
