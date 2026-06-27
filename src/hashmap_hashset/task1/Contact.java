package hashmap_hashset.task1;

import java.util.Objects;

public class Contact {
    String name;
    String numOfPhone;

    Contact(String name, String numOfPhone){
        this.name = name;
        this.numOfPhone = numOfPhone;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(name, contact.name) && Objects.equals(numOfPhone, contact.numOfPhone);
    }

    @Override
    public int hashCode() {
        return numOfPhone.hashCode();
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", numOfPhone='" + numOfPhone + '\'' +
                '}';
    }
}