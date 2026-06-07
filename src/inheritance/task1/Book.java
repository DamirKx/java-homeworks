package inheritance.task1;

public class Book {
    private String title;
    private Status status;

    public Book(String title) {
        this.title = title;
        status = Status.AVAILABLE;
    }

    public String getTitle() {
        return title;
    }

    public Status getStatus() {
        return status;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
