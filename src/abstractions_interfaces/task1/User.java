package abstractions_interfaces.task1;

public class User implements Administrator, Reader, Supplier, Librarian{

    private String name;
    public User(String name){
        this.name = name;
    }

    @Override
    public void overdueNotification(Reader reader, String nameBook) {
        System.out.println("Администратор " + this.name + " уведомил читателя " + ((User) reader).name +
                " о просрочке книги " + nameBook);
    }

    @Override
    public void findBook(Reader reader, String nameOfBook) {
        System.out.println("Администатор " + this.name + " нашел книгу " + nameOfBook + " для читателя " + ((User) reader).name);
    }

    @Override
    public void issueBook(Reader reader, String nameOfBook) {
        System.out.println("Администратор " + this.name + " выдал читателю " + ((User) reader).name +
                " книгу " + nameOfBook);
    }

    @Override
    public void orderBooks(Supplier supplier, String nameOfBooks) {
        System.out.println("Библиотекарь " + this.name + " заказала у поставщика " + ((User) supplier).name +
                " книгу " + nameOfBooks);
    }

    @Override
    public void takeBook(Librarian librarian, String nameOfBook) {
        System.out.println("Читатель " + this.name + " взял у библиотекаря " + ((User) librarian).name +
                " книгу " + nameOfBook);
    }

    @Override
    public void returnBook(Librarian librarian, String nameOfBook) {
        System.out.println("Читатель " + this.name + " вернул библиотекарю " + ((User) librarian).name +
                " книгу " + nameOfBook);
    }

    @Override
    public void bringBooks(Librarian librarian, String nameOfBook) {
        System.out.println("Поставщик " + this.name + " принес библиотекарю " + ((User) librarian).name +
                " книгу " + nameOfBook);
    }
}
