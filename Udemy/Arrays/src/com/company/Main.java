package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntArray = getIntArray(5);
        for(int i =0;i<5;i++){
            System.out.println("The interger at position "+ i + " in array myIntArray is: " + myIntArray[i]);
        }
        System.out.println("The average of the values in myIntArray is: "+ getAverage(myIntArray));
    }

    public static int[] getIntArray(int size){
        System.out.println("Enter " + size + " integer values: \r");
        int[] values = new int[size];

        for (int i = 0; i<values.length; i++){
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static double getAverage(int[] array){
        double arraySum = 0;
        for(int i=0; i< array.length;i++){
            arraySum += array[i];
        }

        return (arraySum/array.length);
    }
}
