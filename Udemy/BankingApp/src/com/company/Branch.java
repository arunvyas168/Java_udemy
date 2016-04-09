package com.company;

import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * Created by arun on 4/8/16.
 */
public class Branch {

    private String branchName;
    private Customer customer;
    private ArrayList<Customer> customerList;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.customerList = new ArrayList<Customer>();
    }

    public void addBranchCustomer(String customerName){
        this.customer = new Customer(customerName);
        this.customerList.add(this.customer);
        System.out.println("Added Customer with name: "+ customerName + " to the "+ this.branchName + " office");
    }

    public void addBranchTransaction(Double amount){
        this.customer.addTransaction(amount);
    }


    public void getBranchTransaction(String customerName){
        this.customer.getTransaction(customerName);
    }

}
