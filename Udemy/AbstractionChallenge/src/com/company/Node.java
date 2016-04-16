package com.company;

/**
 * Created by arun on 4/15/16.
 */
public class Node extends ListItems {

    public Node(Object item) {
        super(item);
    }

    @Override
    ListItems setPreviousOrLeft(ListItems previousOrLeft) {
        this.previousOrLeft = previousOrLeft;

        return this.previousOrLeft;
    }

    @Override
    ListItems setNextOrRight(ListItems nextOrRight) {
        this.nextOrRight = nextOrRight;
        return this.nextOrRight;
    }

    @Override
    ListItems nextRight() {
        return this.nextOrRight;
    }

    @Override
    ListItems previuosLeft() {
        return this.previousOrLeft;
    }

    @Override
    int compareToListItem(ListItems listItems) {
        if (listItems!=null){
            return (this.item.toString().compareTo(listItems.item.toString()));
        } else {
            return -1;
        }
    }
}
