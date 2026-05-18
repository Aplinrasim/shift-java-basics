package homework19;

import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] arge) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        int first = scanner.nextInt(); // Прочитать первое число
        System.out.println("Введите второе число:");
        int second = scanner.nextInt(); // Прочитать второе число
        System.out.println(" Введите шаг:");
        int step = scanner.nextInt(); // Прочитать шаг
        int[] numbers = generateSequence(first, second, step);

        printMultiplicationTable(numbers);
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
    public static void printMultiplicationTable(int[] numbers) {
        int n = numbers.length;

        System.out.print("      ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%6d", numbers[i]);
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.printf("%6d", numbers[i]);
            for (int j = 0; j < n; j++) {
                int product = numbers[i] * numbers[j];
                System.out.printf("%6d", product);
            }
            System.out.println();
        }
    }
}
