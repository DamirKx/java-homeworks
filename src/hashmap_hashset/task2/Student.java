package hashmap_hashset.task2;

public class Student {
    String name;
    String group;
    String studentId;

    Student(String name, String group, String studentId){
        this.name = name;
        this.group = group;
        this.studentId = studentId;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
