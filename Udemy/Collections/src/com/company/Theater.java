package com.company;

import java.util.*;

/**
 * Created by arun on 4/11/16.
 */
public class Theater {
    private final String theaterName;
    public List<Seat> seats = new LinkedList<>();

    public Theater(String theaterName, int numRows, int seatPerRow) {
        this.theaterName = theaterName;

        int lastRow = 'A' + (numRows-1);

        for (char row ='A'; row<=lastRow;row++){
            for(int seatNum = 1; seatNum<=seatPerRow; seatNum++){
                Seat seat = new Seat(row + String.format("%02d",seatNum));
                this.seats.add(seat);
            }
        }
        // this.seats.sort(null); no need as its been added in sorted order
    }

    public String getTheaterName() {
        return theaterName;
    }

    public boolean reserveSeat(String seatNumber){
        //Seat requestSeat = null;

        Seat requestedSeats = new Seat(seatNumber);
        int foundSeat  = Collections.binarySearch(this.seats,requestedSeats,null);
        if (foundSeat >=0){
            return seats.get(foundSeat).reserve();
        } else {
            System.out.println("There is no seat "+ seatNumber);
            return false;
        }
    }

    //For testing
    public void getSeats(){
        for (Seat seat : this.seats){
            System.out.println(seat.getSeatNumber());
        }
    }


    public class Seat implements Comparable<Seat>{
        private final String seatNumber;
        private boolean reserved = false;

        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
        }

        public boolean reserve(){
            if (!this.reserved){
                this.reserved = true;
                System.out.println("Seat "+ seatNumber + " reserved");
                return true;
            } else {
                return false;
            }
        }

        @Override
        public int compareTo(Seat seat) {
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        }

        public boolean cancel(){
            if (this.reserved){
                this.reserved = false;
                System.out.println("Reservation of seat "+ seatNumber + " cancelled");
                return true;
            } else {
                return false;
            }
        }

        public String getSeatNumber() {
            return this.seatNumber;
        }
    }




















}
