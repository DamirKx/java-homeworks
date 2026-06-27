package hashmap_hashset.extra_task.task2.comparators;

import hashmap_hashset.extra_task.task2.Book;

import java.util.Comparator;

public class BookRatingComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return Double.compare(o1.getRating(), o2.getRating());
    }
}