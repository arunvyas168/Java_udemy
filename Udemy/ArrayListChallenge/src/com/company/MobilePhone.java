package com.company;

import java.util.ArrayList;

/**
 * Created by arun on 4/8/16.
 */
public class MobilePhone {

    private ArrayList<Contacts> contactList;

    public MobilePhone() {
        this.contactList = new ArrayList<Contacts>();
    }

    //Store Contact to MobilePhone
    public void storeContact(String name, String number){
        Contacts contact = new Contacts(name,number);
        this.contactList.add(contact);
    }

    //Query contact info
    public Contacts getContactInfo(String name){

        for(int i = 0; i< this.contactList.size();i++) {
            if ((this.contactList.get(i)).getName().equals(name)) {
                return this.contactList.get(i);
            }
        }
        System.out.println("Search Failed: Contact with name: "+ name + " not in the directory");
        return null;
    }

    //Modify Contacts
    public void modifyContact(String name, String number){
        Contacts contact = new Contacts(name,number);
        for(int i = 0; i< this.contactList.size();i++) {
            if ((this.contactList.get(i)).getName().equals(name)) {
                this.contactList.set(i,contact);
                return;
            }
        }
        System.out.println("Modify Failed: Contact with name: "+ name + " not in the directory");
    }

    //Remove Contacts
    public void removeContact(String name){
        for(int i = 0; i< this.contactList.size();i++) {
            if ((this.contactList.get(i)).getName().equals(name)) {
                this.contactList.remove(i);
                System.out.println("Removed the contact with name: "+ name);
                return;
            }
        }
        System.out.println("Remove Failed: Contact with name: "+ name + " not in the directory");
    }
}
