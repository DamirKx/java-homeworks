package abstractions_interfaces.task1;

public interface Reader {
    void takeBook(Librarian librarian, String nameOfBook);

    void returnBook(Librarian librarian, String nameOfBook);
}
