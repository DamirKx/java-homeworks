package work_with_files.task2;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество участников: ");
        int playersNumber = scanner.nextInt();

        List<String> words = readWordsFromFile("words.txt");

        if (playersNumber <= 0) {
            System.out.println("Количество участников должно быть больше нуля.");
            return;
        }

        // Если слов меньше, чем участников, то выведите сообщение:
        if (words.size() < playersNumber){
            System.out.println("Недостаточно слов в файле. Добавьте слова и обновите файл.");
            return;
        }
        // "Недостаточно слов в файле. Добавьте слова и обновите файл."
        // и завершите выполнение программы

        // воспользуйтесь статическим методом Collections.shuffle(List<?> list),
        // чтобы поменять порядок слов случайным образом
        Collections.shuffle(words);

        int wordsNumber = words.size() / playersNumber;

        for (int i = 0; i < playersNumber; i++) {
            String filename = String.format("player%s.txt", i + 1);
            List<String> subList = words.subList(i * wordsNumber, (i + 1) * wordsNumber);

            writeListToFile(subList, filename);
        }

        System.out.println("Карточки готовы!");
    }

    private static List<String> readWordsFromFile(String filename) {
        // добавьте построчное чтение из файла с помощью BufferedReader
        // в случае ошибки выведите сообщение: "Произошла ошибка во время чтения файла."
        try (BufferedReader reader = new BufferedReader(new FileReader(filename));){
            return new ArrayList<>(reader.lines().toList());
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Произошла ошибка во время чтения файла.");
        }
        return Collections.emptyList();
    }

    private static void writeListToFile(List<String> list, String filename)  {
        // добавьте запись слов в файл с помощью FileWriter
        try (FileWriter fileWriter = new FileWriter(filename)){
            for (String word : list) {
                fileWriter.write(word + "\n");
            }
        } catch (IOException e){
            System.out.println("Произошла ошибка во время чтения файла.");
        }
    }
}
