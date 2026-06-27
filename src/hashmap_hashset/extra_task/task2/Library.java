package hashmap_hashset.extra_task.task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Library <T extends Book>{
    HashMap<String, List<T>> books = new HashMap<>();

    public void createGenre(String genre){
        books.put(genre, new ArrayList<>());
        System.out.println("Жанр " + genre + " создан");
    }

    public void addBookToGenre(String genre, T book){
        if (books.containsKey(genre)){
            books.get(genre).add(book);
            System.out.println("Книга " + book + " добавлена");
        } else {
            System.out.println("Такого жанра нет");
        }
    }

    public void addBookToGenre(List<String> genres, T book){
        for (String genre : genres){
            addBookToGenre(genre, book);
        }
    }

    public List<T> findByGenre(String genre){
        if (books.containsKey(genre)){
            return books.get(genre);
        }
        return new ArrayList<>();
    }

    public T findByName(String title){
        for (List<T> list : books.values()){
            for (T book : list){
                if (book.getTitle().equals(title)){
                    return book;
                }
            }
        }
        return null;
    }

    public List<T> findByAuthor(String author){
        List<T> booksAuthor = new ArrayList<>();
        for (List<T> list : books.values()){
            for (T book : list){
                if (book.getAuthor().equals(author)){
                    booksAuthor.add(book);
                }
            }
        }
        return booksAuthor;
    }

}