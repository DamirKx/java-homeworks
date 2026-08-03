package strings.task2;

public class Grades {

    private String capitalize(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }

    private String gradeToString(String grade) {
        switch (grade) {
            case "5": {
                return "Безупречно";
            }
            case "4": {
                return "Потрясающе";
            }
            case "3": {
                return "Восхитительно";
            }
            case "2": {
                return "Прекрасно";
            }
            default:
                return "Очаровательно";
        }
    }

    // grades - строка вида "имя,фамилия,предмет,оценка;имя,фамилия,предмет,оценка;"
    public void gradeBeautifier(String grades) {
         // реализуйте метод здесь
        String[] students = grades.split(";");
        for (String student : students){
            String[] split = student.split(",");
            String name = capitalize(split[0]);
            String lastName = capitalize(split[1]);
            String subject = split[2].toLowerCase();
            String grade = gradeToString(split[3]);
            System.out.println(name +
                    " " +
                    lastName +
                    " " +
                    subject +
                    " — " +
                    grade);

        }

    }
}