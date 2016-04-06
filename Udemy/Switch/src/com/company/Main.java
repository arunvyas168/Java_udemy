package com.company;

public class Main {

    public static void main(String[] args) {
        char charValue = 'A';
        switch(charValue){
            case 'A':
                System.out.println("Found: "+ charValue);
                break;
            case 'B':
                System.out.println("Found: "+ charValue);
                break;
            case 'C': case'D' :case'e':
                System.out.println("Found: "+ charValue);
                break;
            default:
                break;
        }

        String month = "jAnuaRY";

        switch(month.toLowerCase()){
            case "january":
                System.out.println("the month is: " + month.toUpperCase());
                break;
            case "Feb":
                System.out.println("the month is: " + month.toUpperCase());
                break;
            case "june":
                System.out.println("the month is: " + month.toUpperCase());
                break;
            default:
                System.out.println("the month is: " + month.toUpperCase());
        }

    }
}
