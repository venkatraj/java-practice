package com.venkatraj;

import java.util.ArrayList;

//    Create a program that implements a simple mobile phone with the following capabilities.
//    Able to store, modify, remove and query contact names.
//    You will want to create a separate class for Contacts (name and phone number).
//    Create a master class (MobilePhone) that holds the ArrayList of Contacts
//    The MobilePhone class has the functionality listed above.
//    Add a menu of options that are available.
//    Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
//    and search/find contact.
//    When adding or updating be sure to check if the contact already exists (use name)
//    Be sure not to expose the inner workings of the Arraylist to MobilePhone
//    e.g. no ints, no .get(i) etc
//    MobilePhone should do everything with Contact objects only.
public class MobilePhone {
    public ArrayList<Contact> contacts;

    public MobilePhone() {
        this.contacts = new ArrayList<Contact>();
    }

    public void addContact(String name, String phoneNumber) {
        Contact contact = new Contact(name, phoneNumber);
        contacts.add(contact);
    }

    public boolean modifyContact(String name, String newName, String newPhoneNumber) {
        for(int i=0; i < contacts.size(); i++) {
            Contact contact = contacts.get(i);
            if (contacts.get(i).getName() == name) {
                contact.setName(newName);
                contact.setPhoneNumber(newPhoneNumber);
                return true;
            }
        }
        return false;
    }

    public boolean removeContact(String name) {
        for(int i=0; i < contacts.size(); i++) {
            Contact contact = contacts.get(i);
            if (contacts.get(i).getName() == name) {
                contacts.remove(i);
                return true;
            }
        }
        return false;
    }

}
