package com.company;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Created by arun on 4/22/16.
 */
public class Example {
    public static void main(String[] args) {
        try {
            int result  = divide();
            System.out.println("The result is: "+ result);
        } catch (ArithmeticException | NoSuchElementException e){  //Multiple exception catch
            System.out.println(e);
            System.out.println("Unable to perform division");
        }
    }

    public static int divide() {
        int x, y;
//        try {
            x = getInt();
            y = getInt();
            return x / y;
//        } catch (NoSuchElementException e) {
//            throw new ArithmeticException("No suitable Input");
//        } catch (ArithmeticException e) {
//            throw new ArithmeticException("Atempt to devide by Zero");
//        }
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
