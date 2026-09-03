package work_with_files.extra_task.task2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Practice {
    public static void main(String[] args) {
        try (BufferedReader fileReader = new BufferedReader(new FileReader("src\\work_with_files\\task3\\input.txt"))) {
            fileReader.readLine();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
