package com.company;

public class Main {

    public static void main(String[] args) {
        double var1 = 20d;
        double var2 = 80;
        double sum = var1+var2;
        System.out.println("sum = " + sum);
        double result = sum*25;
        System.out.println("result = "+ result);
        double reminder = result%40;
        System.out.println("reminder = "+ reminder);
        if(reminder <= 20) {
            System.out.println("Total was over the limit: " + reminder + ">20");
        } else {
            System.out.println("Total was within the limit: " + reminder + "<=20");
        }
    }

}