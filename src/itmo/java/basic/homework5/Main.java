package itmo.java.basic.homework5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1:");
        String text = "Написать метод для поиска самого длинного слова в тексте!";
        String result = task1(text);
        System.out.println("Самое длинное слово: " + result);

        System.out.println("Task 2:");
        System.out.println(task2("А роза упала на лапу Азора"));
        System.out.println(task2("Madam, in Eden, I'm Adam"));
        System.out.println(task2("Привет"));

        System.out.println("Task 3:");
        // Исходя из задачи, меняем только "бяка", "бяки" не меняем
        String original = "Какая бяка! Просто БЯКА и ничего кроме бяки.";
        String censored = task3(original);
        System.out.println(censored);

        System.out.println("Task 4:");
        String text2 = "ababababa";
        String substring = "aba";
        System.out.println(task4(text2, substring));

        System.out.println("Task 5:");
        String text3 = "This is a test string";
        System.out.println("The given string is: " + text3);
        String reversed = task5(text3);
        System.out.println("The string reversed word by word is: " + reversed);
    }

    private static String task1(String text) {
        if (text == null || text.isEmpty()) {
            return "";
        }

        String[] words = text.split("[^\\p{L}]+");
        String longest = "";

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        return longest;
    }

    private static boolean task2(String word) {
        if (word == null || word.length() <= 1) {
            return true;
        }

        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            char c1 = word.charAt(left);
            char c2 = word.charAt(right);

            if (!Character.isLetterOrDigit(c1)) {
                left++;
                continue;
            }

            if (!Character.isLetterOrDigit(c2)) {
                right--;
                continue;
            }

            if (Character.toLowerCase(c1) != Character.toLowerCase(c2)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    private static String task3(String text) {
        if (text == null || text.isEmpty()) {
            return "";
        }

        String patternStr = "(?i)(?<=^|[^\\p{L}])бяка(?=[^\\p{L}]|$)";
        String replaceStr = "[вырезано цензурой]";

        Pattern pattern = Pattern.compile(patternStr, Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
        Matcher matcher = pattern.matcher(text);

        return matcher.replaceAll(replaceStr);
    }

    private static int task4(String text, String substring) {
        if ((text == null || substring == null) || (text.isEmpty() || substring.isEmpty())) {
            return 0;
        }

        int count = 0;
        int index = 0;

        while ((index = text.indexOf(substring, index)) != -1) {
            count++;
            index += substring.length();
        }

        return count;
    }

    private static String task5(String text) {
        if (text == null || text.isEmpty()) {
            return "";
        }

        String[] words = text.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            result.append(new StringBuilder(words[i]).reverse());

            if (i < words.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}
