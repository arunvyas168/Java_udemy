package com.company;

public class Main {

    public static void main(String[] args) {
        Printer printer1 = new Printer("Buttonwood","Duplex");
        printer1.Print(30);
        printer1.Print(200);

        Printer printer2 = new Printer("Deloitte","Simplex");
        System.out.println("Total number of pages available is: "+ printer2.getTotalNumberOfPages());
        printer2.Print(200);
        System.out.println("Total number of pages available is: "+ printer2.getTotalNumberOfPages());
        System.out.println("Toner Level is "+ printer2.getTonerLevelInPercent());
        printer2.RefillToner(200);
        printer2.RefillToner(100);
        System.out.println("Toner Level is "+ printer2.getTonerLevelInPercent());
    }
}
