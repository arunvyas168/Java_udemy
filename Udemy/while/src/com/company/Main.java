package com.company;

public class Main {

    public static void main(String[] args) {
        int startNumber = 0;
        int finishNumber = 20;
        int evenNumberCount = 0;
        while((startNumber<=finishNumber)&&(evenNumberCount<5)){
            if(isEvenNumber(startNumber)){
                System.out.println("the input number "+startNumber+" is an even number");
                evenNumberCount++;
            }
            startNumber++;
        }
        System.out.println("the value of evenNumberCount++; is: "+ evenNumberCount++);

    }

    public static boolean isEvenNumber(int n){
        if(n == 0) return true;
        if (n == 1) return false;
        if(n%2 == 0){
            return true;
        }else{
            return false;
        }
    }
}
