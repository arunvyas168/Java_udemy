package com.company;

/**
 * Created by arun on 2/28/16.
 */
public class vipCustomer {
    private String customerNasme;
    private String creditLimit;
    private String emailId;

    public vipCustomer() {
        this("Arun Vyas", "$100,000", "avyasnar@cisco.com");
    }

    public vipCustomer(String customerNasme, String emailId) {
        this(customerNasme, "$10,000", emailId);
    }

    public vipCustomer(String customerNasme, String creditLimit, String emailId) {
        this.customerNasme = customerNasme;
        this.creditLimit = creditLimit;
        this.emailId = emailId;
    }

    public String getCustomerNasme() {
        return customerNasme;
    }

    public String getCreditLimit() {
        return creditLimit;
    }

    public String getEmailId() {
        return emailId;
    }
}
