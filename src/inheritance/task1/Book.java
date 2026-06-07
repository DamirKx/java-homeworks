package inheritance.task1;

public class Book {
    private String title;
    private Status status;

    public Book(String title) {
        this.title = title;
        status = Status.AVAILABLE;

    }
}
