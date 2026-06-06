package abstractions_interfaces.task1;

public class Practice {
    public static void main(String[] args) {
        Administrator administrator = new User("Диас");
        Reader reader = new User("Дамир");
        Librarian librarian = new User("Дильназ");
        Supplier supplier = new User("Абылай");


        reader.takeBook(librarian, "Игра престолов");
        administrator.overdueNotification(reader, "Игра престолов");
        reader.returnBook(librarian, "Игра престолов");
        librarian.orderBooks(supplier, "Основы Java");
        supplier.bringBooks(librarian, "Основы Java");


    }
}
