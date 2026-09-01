package work_with_files.task2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
public class Practice {
    public static void main(String[] args) throws IOException {
        Map<String, Integer> frequencyMap = new HashMap<>();
        FileReader reader = new FileReader("src\\work_with_files\\task2\\result.txt");
        BufferedReader br = new BufferedReader(reader);
        // читайте файл построчно и сразу обновляйте frequencyMap.
        while (br.ready()) {
            String line = br.readLine();
            if (frequencyMap.containsKey(line)){
                frequencyMap.put(line, frequencyMap.get(line) + 1);
            } else {
                frequencyMap.put(line, 1);
            }
        }
        // выведите результат в формате "<буква>: <количество>".
        br.close();
        for (String key : frequencyMap.keySet()){
            System.out.format("%s: %s\n", key, frequencyMap.get(key));
        }
    }

}