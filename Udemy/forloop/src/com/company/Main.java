package com.company;

public class Main {

    public static void main(String[] args) {
        int minRange = 4;
        int maxrange = 98;
        int primeCount = 0;
        for(int i = minRange; i<maxrange; i++){
            if(isPrime(i)){
                System.out.println("the number is: "+ i);
                if(++primeCount == 3){
                    break;
                }
            }
        }
        System.out.println("The value of primeCount is: "+ primeCount);
    }


    public static boolean isPrime(int n){

        if(n == 1) {
            return false;
        }
        for(int i = 2; i<= n/2; i++){
            if(n%i == 0) {
                return false;
            }
        }
        return true;
    }
}
