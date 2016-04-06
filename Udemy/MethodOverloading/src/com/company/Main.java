package com.company;

public class Main {

    public static void main(String[] args) {
        double heightInCentimeter = calcFeetAndInchesToCentimeters(5,10);
        System.out.println("My Height is: "+ heightInCentimeter);
        double heightInInches = heightInCentimeter/2.54;
        System.out.println("My Height is: "+ calcFeetAndInchesToCentimeters(heightInInches));

    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if ((feet<=0)||(inches<=0)||(inches>12)){
            return -1;
        }
        double footToInch = 12*feet;
        double footToCentimeter = (2.54)*footToInch;
        double inchesToCentimeter = 2.54*inches;
        return (footToCentimeter+inchesToCentimeter);
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches<=0) return-1;

        double feet = (int) inches / 12;
        double remainingInches = (int)inches % 12;
        return calcFeetAndInchesToCentimeters(feet,remainingInches);
    }

}
