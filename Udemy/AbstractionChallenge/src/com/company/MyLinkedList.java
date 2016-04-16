package com.company;

/**
 * Created by arun on 4/15/16.
 */
public class MyLinkedList implements NodeList{

    private ListItems root = null;

    public MyLinkedList(ListItems root) {
        this.root = root;
    }

    @Override
    public ListItems getRoot() {
        return this.root;
    }

    @Override
    public boolean addItems(ListItems items) {
        if (this.root == null) {
            // The list was empty, so this item becomes the head of the list
            this.root = items;
            return true;
        }

        ListItems currentItem = this.root;
        while (currentItem != null) {
            int comparison = (currentItem.compareToListItem(items));
            if (comparison < 0) {
                // newItem is greater, move right if possible
                if (currentItem.nextRight() != null) {
                    currentItem = currentItem.nextRight();
                } else {
                    // there is no next, so insert at end of list
                    currentItem.setNextOrRight(items).setPreviousOrLeft(currentItem);
                    return true;
                }
            } else if (comparison > 0) {
                // newItem is less, insert before
                if (currentItem.previuosLeft() != null) {
                    currentItem.previuosLeft().setNextOrRight(items).setPreviousOrLeft(currentItem.previuosLeft());
                    items.setNextOrRight(currentItem).setPreviousOrLeft(items);
                } else {
                    // the node with a previous is the root
                    items.setNextOrRight(this.root).setPreviousOrLeft(items);
                    this.root = items;
                }
                return true;
            } else {
                // equal
                System.out.println(items.item + " is already present, not added.");
                return false;
            }
        }

        return false;
    }

    @Override
    public boolean removeItems(ListItems items) {
        if(items == null){
            return false;
        }
        ListItems currentItems = this.root;
        while (currentItems != null){
            if (currentItems.compareToListItem(items)!=0){
                currentItems = currentItems.nextRight();
            } else{
                ListItems previous = currentItems.previuosLeft();
                previous.setNextOrRight(items);
                items.setNextOrRight(currentItems.nextRight());
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean traverse(ListItems root) {
        if (root == null){
            System.out.println("List is empty");
            return false;
        }
        ListItems currentItems = root;
        while (currentItems!=null){
            System.out.println("Value = "+currentItems.item);
            currentItems = currentItems.nextRight();
        }
        return true;
    }

    /* For testing Purpose:

    public boolean ReverseTraverse(ListItems root) {
        if (root == null){
            System.out.println("List is empty");
            return false;
        }
        ListItems currentItems = root;
        while (currentItems.nextRight()!=null){
            currentItems = currentItems.nextRight();
        }
        while (currentItems.compareToListItem(this.root) != 0){
            System.out.println("Value = "+currentItems.item);
            currentItems = currentItems.previuosLeft();
        }
        System.out.println("Value = "+this.root.item);
        return true;
    } */



}
