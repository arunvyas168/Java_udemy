package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.concurrent.SynchronousQueue;

public class Main {

    public static void main(String[] args) {

        Players arun = new Players("Arun",250,500);
        System.out.println(arun.toString());
        saveObject(arun);

        arun.setHealth(600);
        arun.setHitPoints(350);
        System.out.println(arun);
        saveObject(arun);

        loadObject(arun);
        System.out.println(arun);


        ISaveable werewolf = new Monster("Shalini",20,350);
        System.out.println(werewolf);
        saveObject(werewolf);

        ((Monster)werewolf).setName("Arun");
        ((Monster)werewolf).setHealth(500);
        ((Monster)werewolf).setHitPoints(800);
        System.out.println(werewolf);
        saveObject(werewolf);

        loadObject(werewolf);
        System.out.println(werewolf);
        saveObject(werewolf);



    }

    public static ArrayList<String> readValues(){

        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;

        System.out.println("Choose\n"+
                "1 to enter a string\n"+
                "0 to quit");
        while (!quit){
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a String: ");
                    String stringInput = scanner.nextLine();
                    values.add(index,stringInput);
                    index++;
                    break;
                default:
                    System.out.println("Wrong Option Selected");
            }
        }

        return values;

    }

    public static void saveObject(ISaveable objectToSave){
        List<String> objectToSaveList = objectToSave.write();
        for (int i =0;i<objectToSaveList.size();i++){
            System.out.println("Saving "+ objectToSaveList.get(i) + " to storage device");
        }
    }

    public static void loadObject(ISaveable objectToLoad){
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }
}
