package com.company;

import java.util.ArrayList;

/**
 * Created by arun on 4/8/16.
 */
public class Customer {

    private String name;
    private ArrayList<Double> transactionList;

    public Customer(String name) {
        this.name = name;
        this.transactionList = new ArrayList<Double>();
        System.out.println("Opening Account for "+ name + " with a minimum balance of: $50.00");
        this.addTransaction(50.00);
    }

    public void addTransaction(Double amount){
        this.transactionList.add(amount);
        System.out.println("Added $"+ amount + " in the name of: "+ this.name);
    }

    public void getTransaction(String name){
        for (int i=0; i<this.transactionList.size();i++){
            System.out.println("Customer " +this.name+ " transacted: $" +this.transactionList.get(i));
        }
    }
}
