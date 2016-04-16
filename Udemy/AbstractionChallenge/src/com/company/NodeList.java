package com.company;

/**
 * Created by arun on 4/15/16.
 */
public interface NodeList {

    ListItems getRoot();
    boolean addItems(ListItems items);
    boolean removeItems(ListItems items);
    boolean traverse (ListItems root);


}
