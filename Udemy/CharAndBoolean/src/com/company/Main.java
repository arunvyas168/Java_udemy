package com.company;

public class Main {

    public static void main(String[] args) {
        //width of char is 16 (2 bytes)
        char myChar1 = 'A';         //Has to be a single character any case
        char myChar2 = '1';         // Can be a number too but just a single number
        char myChar3 = '\u00A9';    //this represents a unicode for copyright symbol.
        System.out.println("myChar1 has a letter stored of value: "+ myChar1);
        System.out.println("myChar2 has a number stored of value: "+ myChar2);
        System.out.println("myChar3 has a unicaode stored of value: "+ myChar3);

        Boolean myBoolean1 = true;
        Boolean myBoolean2 = false;
        System.out.println("Value of myBoolean1 is: "+ myBoolean1);
        System.out.println("Value of myBoolean2 is: "+ myBoolean2);

        char registeredSymbol = '\u00AE';
        System.out.println("Printing the registeredSymbol: "+ registeredSymbol);

    }
}
