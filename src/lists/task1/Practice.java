package lists.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        // task 1.1
        students.add(new Student("Tom", new ArrayList<>(List.of(78, 91, 64, 85, 99))));
        students.add(new Student("Anna", new ArrayList<>(List.of(56, 73, 88, 92, 67))));
        students.add(new Student("Mike", new ArrayList<>(List.of(100, 84, 79, 61, 90))));
        students.add(new Student("Sara", new ArrayList<>(List.of(45, 58, 77, 83, 69))));
        students.add(new Student("John", new ArrayList<>(List.of(95, 87, 93, 76, 81))));
        // task 1.2
        System.out.println("Средний балл студентов: ");
        for (Student student : students){
            System.out.println(student.name + ": " + student.averageGrade());
        }
        // task 1.3
        System.out.println("Самый высокий балл у " + printHighAverageGrade(students));

        // task 1.4
        System.out.println("Студенты у которых средний балл меньше 70:");
        for (Student student : students){
            if (student.averageGrade() < 70){
                System.out.println(student.name);
            }
        }

        // task 1.5
    }

    public static String printHighAverageGrade(List<Student> students){
        int highGrade = 0;
        String name = "";
        for (Student student :students){
            if (student.averageGrade() > highGrade){
                highGrade = student.averageGrade();
                name = student.name;
            }
        }
        return name;
    }
}
