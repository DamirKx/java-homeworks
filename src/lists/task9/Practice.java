package lists.task9;

import java.util.ArrayList;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Алексей", 120000, 5));
        employees.add(new Employee("Дмитрий", 180000, 3));
        employees.add(new Employee("Борис",   90000,  1));
        employees.add(new Employee("Анна",    120000, 6));

        System.out.println("До сортировки");
        System.out.println(employees);

        employees.sort(new BySalaryComparator());
        System.out.println("После сортировки по зарплате");
        System.out.println(employees);

        employees.sort(new ByExperienceComparator());
        System.out.println("После сортировки по опыту");
        System.out.println(employees);

        for (int i = 0; i < 3; i++){
            System.out.println(employees.get(i));
        }

    }
}
