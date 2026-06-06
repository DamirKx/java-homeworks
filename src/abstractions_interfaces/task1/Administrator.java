package abstractions_interfaces.task1;

public interface Administrator {

    void overdueNotification(Reader reader, String nameBook);
    void findBook(Reader reader, String nameOfBook);
    void issueBook(Reader reader, String nameOfBook);
}
