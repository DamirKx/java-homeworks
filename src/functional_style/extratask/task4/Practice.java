package functional_style.extratask.task4;

import java.util.List;

public class Practice {
    public static void main(String[] args) {
        List<User> users = List.of(
                new User("Alex", 17),
                new User("John", 24),
                new User("Anna", 19),
                new User("Bob", 15),
                new User("Kate", 27)
        );

        String firstUser = users.stream()
                .filter(user -> user.getAge() > 18)
                .findFirst()
                .map(User::getName)
                .orElse("Пользователь не найден");

        System.out.println(firstUser);
    }
}
