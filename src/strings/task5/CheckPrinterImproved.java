package strings.task5;

public class CheckPrinterImproved {

    private static int findMaxLength(String[] elements) {
        int max = 0;
        for (String e : elements) {
            if (e.length() > max) {
                max = e.length();
            }
        }
        return max;
    }

    public static void printCheck(String[] items) {
        String[] names = new String[items.length];
        String[] nums = new String[items.length];
        String[] prices = new String[items.length];
        for (int i = 0; i < items.length; i++){
            String[] words = items[i].split(",");
            names[i] = words[0];
            nums[i] = words[1];
            prices[i] = words[2];
        }
        int maxLengthNames = findMaxLength(names);
        int maxLengthNums = findMaxLength(nums);
        int maxLengthPrices = findMaxLength(prices);

        String format = "%-" + (maxLengthNames + 2) + "s"
                + "%-" + (maxLengthNums + 2) + "s"
                + "%-" + maxLengthPrices + "s%n";
        for (int i = 0; i < items.length; i++){
            System.out.printf(format, names[i], nums[i], prices[i]);
        }
    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите количество записей:");
//        int n = Integer.parseInt(scanner.nextLine());
//        String[] values = new String[n];
//        for (int i = 0; i < n; ++i)
//            values[i] = scanner.nextLine();
//        printCheck(values);
        String[] values = new String[]{"Пицца, 1 шт., 1552.5", "Чай, 2 шт., 566.5", "Печенье, 1 уп., 378.75"};
        printCheck(values);
    }
}
