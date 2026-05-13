package homework201;

import java.util.Scanner;

public class StringProcessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");
        String input = scanner.nextLine();

        System.out.print("Введите символ для замены на пробел: ");
        char targetChar = scanner.next().charAt(0);

        if (targetChar == ' ') {
            System.out.println("Символ не может быть пробелом");
            return;
        }
        scanner.close();

        // Нормализация пробелов
        String normalized = normalizeSpaces(input);

        // Замена символа на пробел
        String replaced = replaceCharWithSpace(normalized, targetChar);

        // Финальная нормализация (если после замены появились двойные пробелы)
        String result = normalizeSpaces(replaced);

        System.out.println("\n=== РЕЗУЛЬТАТ ===");
        System.out.println("Исходная строка (после нормализации): " + normalized);
        System.out.println("Преобразованная строка: " + result);

        if (normalized.equals(result)) {
            System.out.println("\nСтрока не изменилась после преобразований.");
        }
    }
        public static String normalizeSpaces(String str) {
            StringBuilder result = new StringBuilder();
            boolean lastWasSpace = false;

            for (int i = 0; i < str.length(); i++) {
                char currentChar = str.charAt(i);

                if (currentChar == ' ') {
                    // Если предыдущий символ НЕ был пробелом - добавляем пробел
                    if (!lastWasSpace) {
                        result.append(currentChar);
                        lastWasSpace = true;
                    }
                    // Если предыдущий уже пробел - пропускаем
                } else {
                    result.append(currentChar);
                    lastWasSpace = false;
                }
            }
            return result.toString();
        }

    public static String replaceCharWithSpace(String str, char target) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            if (currentChar == target) {
                result.append(' ');  // заменяем на пробел
            } else {
                result.append(currentChar);  // оставляем как есть
            }
        }

        return result.toString();
    }

}
