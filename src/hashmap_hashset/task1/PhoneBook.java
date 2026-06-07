package hashmap_hashset.task1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PhoneBook {
    HashMap<String, List<Contact>> phoneBook = new HashMap<>();

    void addGroup(String nameGroup){
        phoneBook.putIfAbsent(nameGroup, new ArrayList<>());
    }

    void addContact(String nameGroup, Contact contact){
        if (phoneBook.containsKey(nameGroup)){
            phoneBook.get(nameGroup).add(contact);
        } else {
            System.out.println("Группы не существует");
        }
    }

    void findContactByGroup(String nameGroup){
        if (phoneBook.containsKey(nameGroup)){
            for (Contact contact: phoneBook.get(nameGroup)){
                System.out.println("Имя: " + contact.name + " Номер: " + contact.numOfPhone);
            }
        } else {
            System.out.println("Такого номера нет!");
        }
    }

    void findContactByNumber(String number){
        for (List<Contact> group: phoneBook.values()) {
            for (Contact contact : group) {
                if (number.equals(contact.numOfPhone)) {
                    System.out.println(contact.name);
                }
            }
        }
    }

}