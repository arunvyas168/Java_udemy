package com.company;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("220B","Dell","240",dimensions);

        Monitor theMonitor = new Monitor("beast-led","ASUS",27,new Resolution(2540,1440));

        Motherboard theMotherboard = new Motherboard("BJ-200","ASUS",4,6,"v2.44");

        PC thePC = new PC(theCase,theMonitor,theMotherboard);

        thePC.getMotherboard().loadProgram("Windows 10");
        thePC.getTheMonitor().drawPixelAt(1500,1200,"red");
        thePC.getTheCase().pressPowerButton();


    }
}
