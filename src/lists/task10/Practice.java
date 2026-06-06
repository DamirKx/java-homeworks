package lists.task10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        List<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true){
            menu();
            int command = scanner.nextInt();
            if (command == 1){
                scanner.nextLine();
                System.out.println("Введите задачу для планирования:");
                String task = scanner.nextLine();
                tasks.add(task);
            } else if (command == 2) {
                System.out.println("Список задач:");
                for (int i = 0; i < tasks.size(); i++){
                    System.out.println((i + 1) + ". " + tasks.get(i));
                }
            } else if (command == 3){
                System.out.println("Выберите задачу для удаления");
                int i = scanner.nextInt();
                tasks.remove(i);
            } else if (command == 4){
                break;
            } else {
                System.out.println("Введите верную команду");
            }
        }

    }

    public static void menu(){
        System.out.println("Выберите действие:\n" +
                "1. Добавить задачу\n" +
                "2. Вывести список задач\n" +
                "3. Удалить задачу\n" +
                "0. Выход");
    }
}
