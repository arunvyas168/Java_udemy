package com.company;

import java.util.ArrayList;

public class Main {

    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        groceryList.addGroceryList("Avocado");
        groceryList.addGroceryList("Cheese");
        groceryList.addGroceryList("Egg");
        groceryList.addGroceryList("Milk");
        groceryList.addGroceryList("Almond");
        groceryList.addGroceryList("Tomatoes");
        groceryList.addGroceryList("Onions");

        groceryList.printGroceriesList();

        groceryList.deleteGroceryList(3);
        groceryList.deleteGroceryList(9);
        System.out.println("Item at index 1 is: " + groceryList.getItemGroceryList(1));
        groceryList.modifyGroceryList(0, "Rice");
        groceryList.printGroceriesList();
        System.out.println(groceryList.groceryListContains("Avocado"));
        System.out.println(groceryList.groceryListContains("Egg"));
        copyArrayList();

    }
    public static void copyArrayList() {
        ArrayList<String> carbonArrayList = new ArrayList<String>();
        carbonArrayList.addAll(groceryList.getGroceryList());
        System.out.println("#####: "+carbonArrayList.get(1));
    }

}
