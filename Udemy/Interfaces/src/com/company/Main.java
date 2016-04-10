package com.company;

public class Main {

    public static void main(String[] args) {
        ITelephone arunPhone;
        arunPhone = new DeskPhone(1234567890);
        arunPhone.powerOn();
        arunPhone.callPhone(1234567890);
        arunPhone.answer();

        System.out.println("#####################################");

        arunPhone = new MobilePhone(1234567890);
        arunPhone.powerOn();
        arunPhone.callPhone(1234567890);
        arunPhone.answer();

    }
}
