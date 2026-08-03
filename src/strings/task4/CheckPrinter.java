package strings.task4;

public class CheckPrinter {
    public static void printCheck(String[] items) {
        // TODO
        for (int i = 0; i < items.length; i++){
            String[] split = items[i].split(",");
            System.out.printf("%-10s %-7s %-8s%n", split[0], split[1], split[2]);
        }
    }

    public static void main(String[] args) {
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество записей:");
        int n = Integer.parseInt(scanner.nextLine());
        String[] values = new String[n];
        for (int i = 0; i < n; ++i)
            values[i] = scanner.nextLine();
        printCheck(values);*/
        String[] values = new String[]{"Пицца, 1 шт., 1552.5", "Чай, 2 шт., 566.5", "Печенье, 1 уп., 378.75"};
        printCheck(values);
    }
}
