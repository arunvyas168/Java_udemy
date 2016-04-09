package com.company;

public class Main {

    public static void main(String[] args) {

        MobilePhone mobilePhone = new MobilePhone();
        mobilePhone.storeContact("Arun", "703-505-0990");
        mobilePhone.storeContact("Shalini", "703-608-7771");
        mobilePhone.storeContact("Home", "981-115-0004");

        if(mobilePhone.getContactInfo("Shalini")!=null){
            System.out.println("The phone number of Shalini is: "+mobilePhone.getContactInfo("Shalini").getPhoneNumber());
        }

        mobilePhone.modifyContact("Home","999-955-0004");
        if(mobilePhone.getContactInfo("Home")!=null){
            System.out.println("The phone number of Home is: "+mobilePhone.getContactInfo("Home").getPhoneNumber());
        }

        mobilePhone.removeContact("Shalini");
        if(mobilePhone.getContactInfo("Shalini")!=null){
            System.out.println("The phone number of Shalini is: "+mobilePhone.getContactInfo("Shalini").getPhoneNumber());
        }

    }
}
