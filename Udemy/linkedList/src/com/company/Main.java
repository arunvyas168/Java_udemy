package com.company;

public class Main {

    public static void main(String[] args) {
	    //Concept of making two reference to same object.
        Customer customer1 = new Customer("Arun", 1234.76);
        System.out.println(customer1.getName()+" has a balance of: $"+customer1.getBalance());
        Customer customer2;
        customer2 = customer1;
        customer2.setBalance(2345.98); // Change obj1 and it will reflect on obj2
        System.out.println(customer1.getName()+" has a balance of: $"+customer1.getBalance());



    }
}
