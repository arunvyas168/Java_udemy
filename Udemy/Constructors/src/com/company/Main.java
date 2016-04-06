package com.company;

public class Main {

    public static void main(String[] args) {

        bankAccount customer1 = new bankAccount("0006736443", 110000,"Arun Vyasnarayanan","arunvyas27@gmail.com","(703)505-0990");
        System.out.println("Name:               "+ customer1.getCustomerName());
        System.out.println("Account Number:     "+ customer1.getAccountNumber());
        System.out.println("Email id:           "+ customer1.getEmail());
        System.out.println("Phone Number:       "+ customer1.getPhoneNumber());
        System.out.println("Your balance is:    "+ customer1.getAccountBalance());
        customer1.depositFunds(6000);
        customer1.withdrawFunds(1000);
        System.out.println("********************************************************");
        bankAccount customer2 = new bankAccount("0001727500", 120000,"Shalini Sridhar","sridhar.shalini@gmail.com","(703)608-7771");
        System.out.println("Name:               "+ customer2.getCustomerName());
        System.out.println("Account Number:     "+ customer2.getAccountNumber());
        System.out.println("Email id:           "+ customer2.getEmail());
        System.out.println("Phone Number:       "+ customer2.getPhoneNumber());
        System.out.println("Your balance is:    "+ customer2.getAccountBalance());
        customer2.depositFunds(7000);
        customer2.withdrawFunds(2000);
        System.out.println("********************************************************");
        bankAccount customer3 = new bankAccount();
        System.out.println("Name:               "+ customer3.getCustomerName());
        System.out.println("Your balance is:    "+ customer3.getAccountBalance());

        System.out.println("********************************************************");
        vipCustomer vipCustomer1 = new vipCustomer();
        vipCustomer vipCustomer2 = new vipCustomer("Shalini","shal@deloitte.com");
        vipCustomer vipCustomer3 = new vipCustomer("shalarun","$25000","arunShal@buttonwood.com");

        System.out.println("vipCustomer3 name is: "+ vipCustomer3.getCustomerNasme());
        System.out.println("vipCustomer2 credit line is: "+ vipCustomer2.getCreditLimit());
        System.out.println("vipCustomer1 email id is: "+ vipCustomer1.getEmailId());

    }
}
