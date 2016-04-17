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
        myLinkedList.removeItems(new Node("Arun"));
        myLinkedList.traverse(myLinkedList.getRoot());
        System.out.println("###############################");
        myLinkedList.removeItems(new Node("Adelaide"));
        myLinkedList.traverse(myLinkedList.getRoot());
        System.out.println("###############################");
        myLinkedList.removeItems(new Node("Perth"));
        myLinkedList.traverse(myLinkedList.getRoot());
        System.out.println("###############################");
        myLinkedList.removeItems(new Node("Sydney"));
        myLinkedList.traverse(myLinkedList.getRoot());
        System.out.println("###############################");
        myLinkedList.removeItems(new Node("Brisbane"));
        myLinkedList.traverse(myLinkedList.getRoot());
        System.out.println("###############################");
        myLinkedList.removeItems(new Node("Darwin"));
        myLinkedList.traverse(myLinkedList.getRoot());
        System.out.println("###############################");
        myLinkedList.removeItems(new Node("Melbourne"));
        myLinkedList.traverse(myLinkedList.getRoot());
        System.out.println("###############################");
        myLinkedList.removeItems(new Node("Canberra"));
        myLinkedList.traverse(myLinkedList.getRoot());
        System.out.println("###############################");

        /*myLinkedList.ReverseTraverse(myLinkedList.getRoot());*/

        SearchTree tree = new SearchTree(null);
        for (String s : data){
            //System.out.println("Adding: "+s);
            tree.addItems(new Node(s));
        }
        tree.traverse(tree.getRoot());

        tree.removeItems(new Node("Darwin"));
        System.out.println("###############################");
        tree.traverse(tree.getRoot());


    }
}
