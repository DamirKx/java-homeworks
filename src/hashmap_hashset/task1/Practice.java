package hashmap_hashset.task1;

public class Practice {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        Contact coworker1 = new Contact("Tom", "778_123_23_44");
        phoneBook.addGroup("work");
        phoneBook.addContact("work", coworker1);
        phoneBook.findContactByGroup("work");
        phoneBook.findContactByNumber("778_123_23_44");
    }
}
