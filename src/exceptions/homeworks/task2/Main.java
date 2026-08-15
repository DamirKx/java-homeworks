package exceptions.homeworks.task2;

public class Main {
    public static void main(String[] args) {
        for (Event event: getMovies()) {
            validEvent(event);
        }
        for (Event event: getTheatres()) {
            validEvent(event);
        }
        System.out.println("Все события корректны");
    }

    public static void validEvent(Event event){
        if((event.getTitle() == null) ||
                (event.getAge() == 0) ||
                (event.getReleaseYear() == 0)){
            System.out.println(event);
            throw new RuntimeException();
        }
    }

    public static Movie[] getMovies() {
        return new Movie[]{
                new Movie("Начало", 2010, 16),
                new Movie("Интерстеллар", 2014, 12),
                new Movie("Тёмный рыцарь", 2008, 16),
                new Movie("Побег из Шоушенка", 1994, 16),
                new Movie("Криминальное чтиво", 1994, 18)
        };
    }

    public static Theatre[] getTheatres() {
        return new Theatre[]{
                new Theatre("Анна Каренина", 2017, 16),
                new Theatre("Мастер и Маргарита", 2015, 12),
                new Theatre("Щелкунчик", 2019, 6),
                new Theatre("Призрак Оперы", 2014, 12),
                new Theatre("Гамлет", 2021, 16)
        };
    }
}
