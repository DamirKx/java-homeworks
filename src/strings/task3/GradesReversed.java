package strings.task3;

public class GradesReversed {

    private String gradeStringToInt(String grade) {
        return switch (grade) {
            case "Безупречно" -> "5";
            case "Потрясающе" -> "4";
            case "Восхитительно" -> "3";
            case "Прекрасно" -> "2";
            default -> "1";
        };
    }

    public String serializeGrades(String[] grades) {
        StringBuilder students = new StringBuilder();
        for (String grade : grades){
            String[] info = grade.split(" ");
            String student = String.join(",",info[0].toLowerCase(),
                    info[1].toLowerCase(),
                    info[2].toLowerCase(),
                    gradeStringToInt(info[4]));
            students.append(student).append(";");
        }
        return students.toString();
    }
}
