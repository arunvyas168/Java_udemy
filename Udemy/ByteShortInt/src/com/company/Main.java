package com.company;

public class Main {

    public static void main(String[] args) {
	    //Int has a width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;

        // Byte has a width of 8
        byte myByteValue = 127;
        byte typecastByte = (byte) (myByteValue/2);
        System.out.println("value of typecastByte is:" + typecastByte);

        //Short has a width of 16
        short myShortValue = 32767;
        short typecastShort = (short)(myShortValue/2);
        System.out.println("value of typecastShort is:" + typecastShort);

        /*long has a width of 64
        can be added L for representation */
        long myLongVlaue = 100L;
        long noTypecastNeeded = (myByteValue * myLongVlaue * myMaxValue * myMinValue*myShortValue);

        System.out.println("value of noTypecastNeeded is: "+ noTypecastNeeded);
    }
}
