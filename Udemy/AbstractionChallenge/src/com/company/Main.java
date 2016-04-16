package com.company;

public class Main {

    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList(null);
        myLinkedList.addItems(new Node("Arun"));
        myLinkedList.traverse(myLinkedList.getRoot());
        String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";
        String [] data = stringData.split(" ");
        for (String s : data){
            myLinkedList.addItems(new Node(s));
        }
        myLinkedList.traverse(myLinkedList.getRoot());
        System.out.println("###############################");
        /*myLinkedList.ReverseTraverse(myLinkedList.getRoot());*/
    }
}
