package exceptions.homeworks.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UserNotFoundException, AccessDeniedException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите логин");
        String login = scanner.nextLine();
        System.out.println("Введите пароль");
        String password = scanner.nextLine();

        //Проверить логин и пароль
        User user = getUserByLoginAndPassword(login, password);

        //Вызвать методы валидации пользователя
        validateUser(user);

        System.out.println("Доступ предоставлен");
    }


    public static User[] getUsers(){
        User user1 = new User("Иван Иванов", "ivan2000", "p@ssw0rd123", "ivan@example.com", 25);
        User user2 = new User("Анна Смирнова", "anna_s", "qwerty456", "anna.smirnova@gmail.com", 30);
        User user3 = new User("Алексей Петров", "alexp", "SecurePass789", "alex.petrov@mail.ru", 19);
        User user4 = new User("Елена Соколова", "elena_sok", "my_secret_pass", "elena@yandex.ru", 42);
        User user5 = new User("Дмитрий Кузнецов", "dmitry_k", "dima_pass2026", "kuznetsov@tech.org", 28);


        return new User[]{user1, user2, user3, user4, user5};
    }

    public static User getUserByLoginAndPassword(String login, String password) throws UserNotFoundException {
        User[] users = getUsers();
        for (User user : users) {
            if (user.getLogin().equals(login) && user.getPassword().equals(password)){
                return user;
            }
        }
        throw new UserNotFoundException("User not found");
    }
    public static void validateUser(User user) throws AccessDeniedException{
        if (user.getAge() < 18){
            throw new AccessDeniedException("Доступ запрещен");
        }
    }
}
