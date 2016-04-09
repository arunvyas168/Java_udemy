package com.company;

import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * Created by arun on 4/8/16.
 */
public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<String>();

    public ArrayList<String> getGroceryList(){
        return groceryList;
    }

    public void addGroceryList(String items){
        System.out.println("Adding "+ items + "to the groceryList");
        groceryList.add(items);
    }

    public void modifyGroceryList(int index, String items){

        if(groceryList.size() > index){
            groceryList.set(index,items);
        } else {
            System.out.println("Invalid Index.");
        }
    }

    public String getItemGroceryList(int index){

        if(groceryList.size() > index){
            return groceryList.get(index);
        } else {
            System.out.println("Invalid Index.");
            return null;
        }
    }

    public void printGroceriesList(){
        System.out.println("Number of items in the groceryList is:  "+ groceryList.size());
        for(int i = 0;i<groceryList.size();i++){
            System.out.println("The item at index: " +i+ " is: "+ groceryList.get(i));
        }
    }

    public String deleteGroceryList(int index){
        if(groceryList.size() > index) {
            String itemOut = groceryList.get(index);
            groceryList.remove(index);
            return itemOut;
        } else {
            System.out.println("Invalid Index.");
            return null;
        }
    }

    public boolean groceryListContains(String item){
        if(groceryList.contains(item)) {
            System.out.println(item + " is present in the groceryList at index: " + groceryList.indexOf(item));
            return true;
        } else{
            System.out.println("Item not found in the groceryList");
            return false;
        }
    }


}
