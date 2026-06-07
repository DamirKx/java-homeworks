package hashmap_hashset.task2;

import java.util.HashSet;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        HashSet<Student> studentHashSet = new HashSet<>();
        Scanner scanner =new Scanner(System.in);
        while (true){
            System.out.println("1 - Ввод информации о студентах");
            System.out.println("2 - Вывод списка студентов");
            System.out.println("3 - Выход");
            String command = scanner.nextLine();
            if (command.equals("1"))  {
                System.out.println("Введите информацию о студенте: \"ФИО, номер группы, номер студенческого билета\"");
                String[] input = scanner.nextLine().split(", ");
                String name = input[0];
                String group = input[1];
                String studentId = input[2];
                Student student = new Student(name, group, studentId);
                studentHashSet.add(student);
            } else if (command.equals("2")){
                for (Student student : studentHashSet){
                    System.out.println(student.name + " " + student.group + " " + student.studentId);
                }
            } else if (command.equals("end")){
                break;
            }
        }

    }
}
