package lists.task3;

import java.util.ArrayList;
import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        ArrayList<Integer> temperatures =
                new ArrayList<>(Arrays.asList(
                        18, 27, 30, 31, 20,
                        5, 19, 33, 34, 10
                ));

        System.out.println("Температуры:");
        System.out.println(temperatures);

        System.out.println();

        System.out.println("Средняя температура:");
        System.out.println(averageTemperature(temperatures));

        System.out.println();

        System.out.println("Температуры выше среднего:");
        moreThanAverage(temperatures);

        System.out.println();

        System.out.println("Количество резких скачков:");
        System.out.println(shartJumpTemperature(temperatures));

        System.out.println();

        System.out.println("Самая длинная серия дней выше 25:");
        System.out.println(seriesTemperatures(temperatures));
    }
    public static void moreThanAverage(ArrayList<Integer> temperatures){
        int average = averageTemperature(temperatures);
        for (Integer temperature : temperatures){
            if (temperature > average){
                System.out.println(temperature);
            }
        }
    }
    public static int averageTemperature(ArrayList<Integer> temperatures){
        if (!temperatures.isEmpty()){
            int sum = 0;
            for (Integer temperature : temperatures){
                sum += temperature;
            }

            return sum / temperatures.size();
        }
        return 0;
    }

    public static int shartJumpTemperature(ArrayList<Integer> temperatures){
        if (!temperatures.isEmpty()){
            int sum = 0;
            int temperature = temperatures.get(0);
            for (int i = 1; i < temperatures.size(); i++){
                if (Math.abs(temperatures.get(i) - temperature) > 10){
                    sum++;
                }
                temperature = temperatures.get(i);
            }
            return sum;
        }
        return 0;
    }

    public static int seriesTemperatures(ArrayList<Integer> temperatures){
        int series = 0;
        int max = 0;
        for (Integer temperature : temperatures){
            if (temperature > 25){
                max++;
                series = max > series ? max : series;
            } else {
                max = 0;
            }
        }
        return series;
    }

}