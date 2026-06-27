package hashmap_hashset.extra_task.task2;

import hashmap_hashset.extra_task.task2.comparators.BookRatingComparator;

import java.util.ArrayList;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
        Library<Book> bookLibrary = new Library<>();

        bookLibrary.createGenre("Fantasy");
        bookLibrary.createGenre("Programming");
        bookLibrary.createGenre("Science");
        bookLibrary.createGenre("Classic");

        bookLibrary.addBookToGenre("Programming",
                new Book("Документация по жава", "Оракл", 2020, 94));
        bookLibrary.addBookToGenre( new ArrayList<>(List.of("Classic", "Fantasy")),
                new Book("Властелин колец", "Толкин", 1999, 99));
        bookLibrary.addBookToGenre(new ArrayList<>(List.of("Classic", "Science")),
                new Book("Призрак в доспехах", "не помню", 2000, 95));
        bookLibrary.addBookToGenre("Fantasy",
                new Book("Игра престолов", "Мартин", 1996, 96));


        System.out.println(bookLibrary.findByGenre("Classic"));

        System.out.println(bookLibrary.findByName("Игра престолов"));

        for (String genre : bookLibrary.books.keySet()){
            bookLibrary.books.get(genre).sort(new BookRatingComparator());
        }
        System.out.println();

        for (String genre : bookLibrary.books.keySet()){
            System.out.println(genre);
            for (Book book : bookLibrary.books.get(genre)){
                System.out.println(book);
            }
        }

    }
}
