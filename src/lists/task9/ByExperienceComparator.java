package lists.task9;

import java.util.Comparator;

public class ByExperienceComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o2.experience, o1.experience);
    }
}
