package arrays;

public class Practice {
    public static void main(String[] args) {
        int[] arr = {7, -3, 9, -11, 18, 99, 2, 11};

        // task 1
        System.out.println("task 1");
        for (int i = 0; i < 3; i++){
            System.out.println(arr[i]);
        }
        System.out.println();

        // task 2
        System.out.println("task 2");
        for (int i = 0; i < (arr.length / 2); i++){
            System.out.println(arr[i]);
        }
        System.out.println();

        // task 3
        System.out.println("task 3");
        for (int i = (arr.length / 2); i < arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println();

        // task 4
        System.out.println("task 4");
        for (int i = 1; i < arr.length - 1; i++){
            System.out.println(arr[i]);
        }
        System.out.println();

        // task 5
        System.out.println("task 5");

        for (int i = arr.length - 3; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println();

        // task 6
        System.out.println("task 6");

        for (int i = 1; i < arr.length; i+=2){
            System.out.println(arr[i]);
        }
        System.out.println();

        // task 7
        System.out.println("task 7");
        int positiveCount = 0;
        int negativeCount = 0;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] > 0){
                positiveCount++;
            } else {
                negativeCount++;
            }
        }

        System.out.println("Количество положительных элементов: " + positiveCount);
        System.out.println("Количество отрицательных элементов: " + negativeCount);

        System.out.println();

        // task 8
        System.out.println("task 8");

        for (int i = 1; i < arr.length; i++){
            if (arr[i - 1] < arr[i]){
                System.out.println(arr[i]);
            }
        }
        System.out.println();

        // task 9
        System.out.println("task 9");

        int maxElement = arr[0];
        int minElement = arr[0];

        for (int i = 1; i < arr.length; i++){
            if (arr[i] > maxElement){
                maxElement = arr[i];
            }
            if (arr[i] < minElement){
                minElement = arr[i];
            }
        }

        System.out.println(maxElement);
        System.out.println(minElement);

    }
}
