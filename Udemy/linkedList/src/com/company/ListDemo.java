package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by arun on 4/9/16.
 */
public class ListDemo {
    public static void main(String[] args) {

        //Initialize the linked list
        /*LinkedList<String> placesToVisit = new LinkedList<String>();

        //Add elements to lined list
        placesToVisit.add("California");
        placesToVisit.add("Virginia");
        placesToVisit.add("Arizona");
        placesToVisit.add("Washington");
        placesToVisit.add("Idaho");
        placesToVisit.add("Nebraska");
        placesToVisit.add("New York");
        placesToVisit.add("Boston");

        printPlacesToVisit(placesToVisit);

        placesToVisit.add("Canada");
        placesToVisit.add(3, "Germany");
        printPlacesToVisit(placesToVisit);
        placesToVisit.remove(4);
        printPlacesToVisit(placesToVisit);
        placesToVisit.remove();
        printPlacesToVisit(placesToVisit);*/

        LinkedList<String> orderedPlaces = new LinkedList<String>();
        addInOrder(orderedPlaces,"California");
        addInOrder(orderedPlaces,"Virginia");
        addInOrder(orderedPlaces,"Arizona");
        addInOrder(orderedPlaces,"Washington");
        addInOrder(orderedPlaces,"Idaho");
        addInOrder(orderedPlaces,"Nebraska");
        addInOrder(orderedPlaces,"New York");
        addInOrder(orderedPlaces,"Boston");
        printPlacesToVisit(orderedPlaces);



    }

    private static void printPlacesToVisit(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();

        while (i.hasNext()){
            System.out.println("Now Visiting "+ i.next());
        }

        System.out.println("===================================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String cityName){

        ListIterator<String> stringListIterator = linkedList.listIterator();

        while(stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(cityName);
            if(comparison == 0){
                System.out.println(cityName +" is alredy in the list");
                return false;
            }
            if(comparison >0){
                stringListIterator.previous();
                stringListIterator.add(cityName);
                return true;
            }
        }

        stringListIterator.add(cityName);
        return true;
    }


















}
