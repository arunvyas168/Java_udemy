package com.company;

/**
 * Created by arun on 4/15/16.
 */
public abstract class ListItems {
    protected Object item;
    protected ListItems nextOrRight;
    protected ListItems previousOrLeft;

    public ListItems(Object item) {
        this.item = item;
    }

    abstract ListItems setPreviousOrLeft(ListItems previousOrLeft) ;
    abstract ListItems setNextOrRight(ListItems nextOrRight);

    abstract ListItems nextRight();
    abstract ListItems previuosLeft();

    abstract int compareToListItem(ListItems listItems);





}
