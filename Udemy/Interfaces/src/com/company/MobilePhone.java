package com.company;

/**
 * Created by arun on 4/10/16.
 */
public class MobilePhone implements ITelephone{
    private int myNumber;
    private boolean isRinging;
    private boolean isON = false;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isON = true;
        System.out.println("Mobile phone power up");
    }

    @Override
    public void dial(int phoneNumber) {
        if(isON){
            System.out.println("Now ringing "+ phoneNumber + " on Mobile Phone");
        } else {
            System.out.println("Phone is switched off");
        }
    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answering the Mobile Phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber && isON){
            isRinging = true;
            System.out.println("Melody Ring");
        } else {
            isRinging = false;
            System.out.println("Mobile Phone not powered on or the Number is different");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}

