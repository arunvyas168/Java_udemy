package com.company;

public class Main {

    public static void main(String[] args) {

        Theater theater = new Theater("Centuries",10,10);
        theater.getSeats();
        if (theater.reserveSeat("H10")){
            System.out.println("Please pay");
        } else {
            System.out.println("Seat can not be reserved.");
        }

        if (theater.reserveSeat("H10")){
            System.out.println("Please pay");
        } else {
            System.out.println("Seat can not be reserved.");
        }

    }
}
