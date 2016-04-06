package com.company;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

/**
 * Created by arun on 2/28/16.
 */
public class bankAccount {
    private String accountNumber;
    private double  accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public bankAccount(){
        this("07456443", 3453,"default name","defaultid@gmail.com","(911)505-0990");
        System.out.println("Inside Default Constructor");
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public bankAccount(String accountNumber, double accountBalance, String customerName, String email, String phoneNumber){
        System.out.println("Inside Overloaded Constructor");
        this.setAccountNumber(accountNumber);
        this.setAccountBalance(accountBalance);
        this.setCustomerName(customerName);
        this.setEmail(email);
        this.setPhoneNumber(phoneNumber);
    }

    public void depositFunds(double deposit){
        this.accountBalance = this.accountBalance + deposit;
        System.out.println("Transaction Complete! Your New Balance is: "+ this.accountBalance);
    }
    public void withdrawFunds(double withdraw){

        if(withdraw <= this.accountBalance){
            this.accountBalance = this.accountBalance - withdraw;
            System.out.println("Transaction Complete! Your New Balance is: "+ this.accountBalance);
        }else{
            System.out.println("Transaction can not be complected due to Insufficient Funds");
        }

    }

}
