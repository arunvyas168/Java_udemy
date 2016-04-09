package com.company;

import java.util.ArrayList;

/**
 * Created by arun on 4/8/16.
 */
public class Bank {

    private String bankName;
    private Branch branch;
    private ArrayList<Branch> branchList;

    public Bank(String bankName, String branchName,String customerName) {
        this.bankName = bankName;
        this.branchList = new ArrayList<Branch>();
        this.branch = new Branch(branchName);
        this.branchList.add(this.branch);
        this.branch.addBranchCustomer(customerName);
    }

    public void addCustomerTransaction(Double amount){
        this.branch.addBranchTransaction(amount);
    }

    public void getCustomerTransaction(String customerName){
        this.branch.getBranchTransaction(customerName);
    }

}
