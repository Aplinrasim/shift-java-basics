package homework202;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class MultiplicationTableToFile {
    public static void main(String[] arge) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        int first = scanner.nextInt(); // Прочитать первое число
        System.out.println("Введите второе число:");
        int second = scanner.nextInt(); // Прочитать второе число
        System.out.println(" Введите шаг:");
        int step = scanner.nextInt(); // Прочитать шаг
        int[] numbers = generateSequence(first, second, step);

        saveToFile(numbers, "src/main/java/homework202/multiplication_table.txt");

        scanner.close();

    }

    public static int[] generateSequence(int first, int second, int step) {
        int count = 0;
        for (int i = first; i <= second; i += step) {
            count++;
        }

        int[] numbers = new int[count];
        int index = 0;
        for (int i = first; i <= second; i += step) {
            numbers[index] = i;
            index++;
        }
        return numbers;

    }

    public static void saveToFile(int[] numbers, String filename) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            int n = numbers.length;

            writer.print("      ");
            for (int i = 0; i < n; i++) {
                writer.printf("%6d", numbers[i]);
            }
            writer.println();

            for (int i = 0; i < n; i++) {
                writer.printf("%6d", numbers[i]);
                for (int j = 0; j < n; j++) {
                    int product = numbers[i] * numbers[j];
                    writer.printf("%6d", product);
                }
                writer.println();
            }

            System.out.println("Таблица сохранена в файл: " + filename);

        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
}
