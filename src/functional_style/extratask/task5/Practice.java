package functional_style.extratask.task5;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Practice {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Alex", 25, 350_000, "IT"),
                new Employee("Anna", 31, 520_000, "IT"),
                new Employee("John", 29, 380_000, "Sales"),
                new Employee("Kate", 35, 600_000, "IT"),
                new Employee("Bob", 22, 290_000, "Sales"),
                new Employee("Mike", 40, 700_000, "Management"),
                new Employee("Tom", 28, 450_000, "IT"),
                new Employee("Alice", 33, 410_000, "Sales")
        );

        List<String> sortedEmployees = employees.stream()
                .filter(employee -> employee.getAge() > 25 &&
                        employee.getSalary() >= 400_000 && !employee.getDepartment().equals("Management"))
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .limit(3)
                .map(employee -> employee.getName().toUpperCase())
                .toList();

        System.out.println(sortedEmployees);


        // task 6


        Map<String, Double> departments = employees.stream()
                .filter(employee -> employee.getAge() > 25 && employee.getSalary() >= 400_000)
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)
                ));

        System.out.println(departments);
    }
}

