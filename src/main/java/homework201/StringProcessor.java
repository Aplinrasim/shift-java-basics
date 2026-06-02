package homework201;

import java.util.Scanner;

public class StringProcessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");
        String input = scanner.nextLine();

        if (input.length() <= 1) {
            System.out.println("Ошибка: длина строки должна быть больше 1 символа");
            return;
        }

        if (!isValidString(input)) {
            System.out.println("Ошибка: строка содержит недопустимые символы!");
            System.out.println("Допустимы: буквы (латиница/кириллица), знаки препинания (. ? ! , : ;) и одиночные пробелы");
            return;
        }

        System.out.print("Введите символ для замены на пробел: ");
        String targetChar = scanner.next();

        if (targetChar.length() != 1) {
            System.out.println("Ошибка: нужно ввести ровно один символ");
            return;
        }

        if (targetChar.equals(" ")) {
            System.out.println("Символ не может быть пробелом");
            return;
        }
        scanner.close();

        // Нормализация пробелов
        String normalized = deleteExtraSpaces(input);
        // Замена символа на пробел
        String replaced = replaceCharWithSpace(normalized, targetChar);
        // Финальная нормализация (если после замены появились двойные пробелы)
        String result = deleteExtraSpaces(replaced);

        System.out.println("\n=== РЕЗУЛЬТАТ ===");
        System.out.println("Исходная строка (после нормализации): " + normalized);
        System.out.println("Преобразованная строка: " + result);

        if (normalized.equals(result)) {
            System.out.println("\nСтрока не изменилась после преобразований.");
        }
    }

    public static boolean isValidString(String str) {
        return str.matches("[a-zA-Zа-яА-Я.?!,:; ]+");
    }

    public static String deleteExtraSpaces(String str) {
        return str.replaceAll(" +", " ");
    }

    public static String replaceCharWithSpace(String str, String targetChars) {
        String escaped = java.util.regex.Pattern.quote(targetChars);
        return str.replaceAll(escaped, " ");
    }
}
