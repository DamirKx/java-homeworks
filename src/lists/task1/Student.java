package lists.task1;

import java.util.ArrayList;

public class Student {
    String name;
    ArrayList<Integer> grades;

    public Student(String name, ArrayList<Integer> grades) {
        this.name = name;
        this.grades = grades;
    }

    public int averageGrade(){
        int average = 0;
        for(Integer grade : grades){
            average += grade;
        }
        return average / grades.size();
    }
}
