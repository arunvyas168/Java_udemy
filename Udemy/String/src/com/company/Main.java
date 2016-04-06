package com.company;

public class Main {

    public static void main(String[] args) {
	/*
	    Types of data types called "primitive types" are:
	    1. byte
	    2. short
	    3. int
	    4. long
	    5. float
	    6. double
	    7. char
	    8. boolean
	*/

        String myString = "Arun is a good boy";
        System.out.println("the value of myString is : " + myString);
        myString = myString + ", But sometimes he can be mean :) ";
        System.out.println(myString);
        myString = myString + " \u00A9 2016";
        System.out.println(myString);

        // Any datatypes added to string becomes string
        String mystring2 = "My lucky number is: ";
        int num = 4;
        mystring2 = mystring2 + num;
        System.out.println(mystring2);
        boolean myBool = true;
        mystring2 = mystring2+ " " + myBool;
        System.out.println(mystring2);

    }
}
