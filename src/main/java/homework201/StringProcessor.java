package homework201;

import java.util.Scanner;

public class StringProcessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");
        String input = scanner.nextLine();

        // Проверка на допустимые символы
        if (!isValidString(input)) {
            System.out.println("Ошибка: строка содержит недопустимые символы!");
            System.out.println("Допустимы: буквы (латиница/кириллица), знаки препинания (. ? ! , : ;) и одиночные пробелы");
            return;
        }

        System.out.print("Введите символ для замены на пробел: ");
        String targetChar = scanner.next();

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

    // Проверка допустимости содержания строки
    public static boolean isValidCharacter(char c) {
        if (c >= 'a' && c <= 'z') return true;
        if (c >= 'A' && c <= 'Z') return true;
        if (c >= 'а' && c <= 'я') return true;
        if (c >= 'А' && c <= 'Я') return true;
        if (c == '.' || c == '?' || c == '!' || c == ',' || c == ':' || c == ';') return true;
        if (c == ' ') return true;

        return false;  // Недопустимый символ
    }
    public static boolean isValidString(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!isValidCharacter(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

        public static String deleteExtraSpaces(String str) {
            return str.replaceAll("\\s+", " ");
        }

    public static String replaceCharWithSpace(String str, String targetChars) {
        String result = str;
        for (char c : targetChars.toCharArray()) {
            result = result.replace(c, ' ');
        }
        return result;
    }
}
