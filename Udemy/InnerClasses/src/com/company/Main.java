package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {

        //Calling inner local class which is implementing the interface.
        //This class is local to to the scope of main

        /*class ClickListener implements Button.OnClickListener{
            public ClickListener() {
                System.out.println("I have been attached");
            }

            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        }

        Button.OnClickListener onClickListenerObj = new ClickListener();
        btnPrint.setOnClickListener(onClickListenerObj);*/
        //We can do the above or we can do the following in an anonymous way:

        btnPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        });
        listen();

    /*
        //Inner class:  If Inner class is public: following is the method to create inner class object:
        Gearbox mcLaren = new Gearbox(6);                   // Outer Class
        Gearbox.Gear first = mcLaren.new Gear(1, 12.3);     // Inner Class -- outerObject.new keyword
        System.out.println("The drive speed for mcLaren is: "+first.driveSpeed(10000));
        //Gearbox.Gear second = new Gearbox.Gear(2,15.4); Cant tdo this
        // Gearbox.Gear third = new mcLaren.Gear(2,15.4); Cant tdo this
    */

        Gearbox mcLaren = new Gearbox(6);
        mcLaren.operateClutch(true);
        mcLaren.changeGear(1);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(1000));
        mcLaren.changeGear(2);
        System.out.println(mcLaren.wheelSpeed(3000));
        mcLaren.operateClutch(true);
        mcLaren.changeGear(3);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(6000));


    }

    private static void listen(){
        boolean quit = false;
        while (!quit){
            int input = scanner.nextInt();
            scanner.nextLine();
            switch (input){
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
                    break;
            }
        }
    }
}
