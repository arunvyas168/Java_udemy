package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int x = 98;
        int y = 0;
        System.out.println(divideEAPP(x,y));
        System.out.println("###################");
        System.out.println(divideLBYL(x,y));
        System.out.println("The value of integer entered by user is: "+ getIntLBYL());
        System.out.println("The value of integer entered by user is: "+ getIntEAPP());
    }

    private static int divideLBYL(int x,int y){
        if (y!=0){
            return x/y;
        } else {
            System.out.println("is is a divide by error");
            return 0;
        }
    }

    private static int divideEAPP(int x , int y){
        try {
            return x/y;
        } catch (ArithmeticException e){
            System.out.println(e);
            return 0;
        }
    }

    private static int getIntLBYL(){
        Scanner s = new Scanner(System.in);
        String input = s.next();
        boolean isValidInt  = true;
        for (int i = 0; i< input.length();i++){
            if (!Character.isDigit(input.charAt(i))){
                isValidInt = false;
                break;
            }
        }
        if (isValidInt){
            return Integer.parseInt(input);
        } else{
            System.out.println("Invalid integer value");
            return -1;
        }
    }

    public static int getIntEAPP(){
        Scanner s = new Scanner(System.in);
        try {
            return s.nextInt();
        } catch(InputMismatchException e){
            System.out.println(e);
            return -1;
        }
    }
}
