package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

        /*
        ########### here we are seeing various Collections functions like ############################
        ########### reverse, Shuffle, min, max, Collections.swap(list,i,j), copy #####################
        ########### for Collections.copy, The source needs to have actually X items ##################
        ########### before it copy a list of size X. Just initializing with size wont work ###########
        Theater amc = new Theater("AMC",8,12);
        List<Theater.Seat> seatCopy = new ArrayList<>(amc.seats);
        printList(seatCopy);

        //"Shallow Copy" reference to same objects inside list. But has 2 different copy.
        //If we change make changes on an object for eg: reserve seat
        // the change in object will reflect in both
        // But the list itself is separate,
        //each list for example reverse 1 and other will not reverse.
        seatCopy.get(1).reserve();
        if (amc.reserveSeat("A02")){
            System.out.println("Please pay");
        } else {
            System.out.println("Seat can not be reserved.");
        }

        //Reverse seatCopy
        Collections.reverse(seatCopy);
        System.out.println("Print seatCopy");
        printList(seatCopy);
        System.out.println("Print amc.seats");
        printList(amc.seats);
        Collections.shuffle(seatCopy);
        System.out.println("Print shuffle seatCopy");
        printList(seatCopy);
        Theater.Seat minseat = Collections.min(seatCopy);
        Theater.Seat maxseat = Collections.max(seatCopy);
        System.out.println("Min seat is: "+ minseat.getSeatNumber() + " and Max seat is: "+ maxseat.getSeatNumber());
        */

    }

    /*public static void printList(List<Theater.Seat> list){
        for (Theater.Seat seat : list){
            System.out.print(" "+seat.getSeatNumber());
        }
        System.out.println("\n #################################");
    }*/
}
