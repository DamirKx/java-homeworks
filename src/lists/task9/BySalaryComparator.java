package lists.task9;

import java.util.Comparator;

public class BySalaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o2.salary, o1.salary);
    }
}
