package com.company;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Created by arun on 4/22/16.
 */
public class Example {
    public static void main(String[] args) {
        int result  = divide();
        System.out.println("The result is: "+ result);
    }

    public static int divide(){
        int x,y;
        try {
            x = getInt();
            y = getInt();
        } catch (NoSuchElementException e){
           throw new ArithmeticException("No suitable Input");
        }
        try {
            return x/y;
        } catch (ArithmeticException e){
            throw new ArithmeticException("Atempt to devide by Zero");
        }
    }

    public static int getInt(){
        Scanner s = new Scanner(System.in);
        System.out.printf("Please enter an integer: ");
        while (true){
            try {
                return s.nextInt();
            } catch (InputMismatchException e){
                s.nextLine();
                System.out.printf("Please enter only digits between 0 to 9 ");
            }
        }
    }
}
