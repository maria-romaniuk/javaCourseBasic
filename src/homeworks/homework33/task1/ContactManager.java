package homeworks.homework33.task1;

import java.util.*;

public class ContactManager {

    private Set<Contact> contacts = new HashSet<>();

    public void addContact(Contact contact){
       if(!contacts.contains((contact))){
           contacts.add(contact);
           System.out.println("Contact " + contact.getName() + " added.");
       } else{
           System.out.println("Contact " + contact.getName() + " is already exist.");
       }
    }
    public void removeContact(Contact contact){
        if (contacts.contains(contact)){
            contacts.remove(contact);
            System.out.println("Contact " + contact.getName() + " deleted.");
        } else{
            System.out.println("Contact " + contact.getName() + " doesn't exist.");
        }
    }

    public void getContacts(){
        Comparator<Contact> contactComparator = new Comparator<Contact>() {
            @Override
            public int compare(Contact o1, Contact o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
            TreeSet<Contact> contactsSorted = new TreeSet<>(contactComparator);
            contactsSorted.addAll(contacts);
        System.out.println(contactsSorted);

    }
    public Contact getContactByName(String name){
        for (Contact currentContact : contacts){
            if(currentContact.getName().equals(name)){
                return currentContact;
            }
        }
        return null;
    }
    public Contact getContactByPhoneNumber(String phoneNumber){
        for ( Contact contact : contacts){
            if (contact.getPhoneNumber().equals(phoneNumber)){
                return contact;
            }
        }
        return null;
    }
}
