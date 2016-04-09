package com.company;

public class Main {

    public static void main(String[] args) {
        Bank bank1 = new Bank("BOFA", "California", "Arun");
        bank1.addCustomerTransaction(200.90);
        bank1.getCustomerTransaction("Arun");
        System.out.println("########### Next Customer ##########");
        Bank bank2 = new Bank("BOFA","California","Shalini");
        bank2.addCustomerTransaction(500.65);
        bank2.getCustomerTransaction("Shalini");
    }
}
