package itmo.java.basic.homework4.part1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1:");
        task1();
        System.out.println("===============");
        System.out.println("Task 2:");
        task2();
        System.out.println("===============");
        System.out.println("Task 3:");
        int first = readInt("Введите первое число: ");
        int second = readInt("Введите второе число: ");
        int third = readInt("Введите третье число: ");
        boolean result = task3(first, second, third);
        System.out.println("Результат: " + result);
        System.out.println("===============");
        System.out.println("Task 4:");
        first = readInt("Введите первое число: ");
        second = readInt("Введите второе число: ");
        third = readInt("Введите третье число: ");
        result = task4(first, second, third);
        System.out.println("Результат: " + result);

        System.out.println("===============");
        System.out.println("Task 5:");
        int[] arr = {3, -3, 7, 4, 5, 4, 5};
        result = task5(arr);
        System.out.println(result);
        int[] arr2 = {5, -3, 7, 4, 5, 4, 3};
        result = task5(arr2);
        System.out.println(result);
        int[] arr3 = {4, -3, 7, 4, 5, 4, 5};
        result = task5(arr3);
        System.out.println(result);

        System.out.println("===============");
        System.out.println("Task 6:");
        int[] arr4 = {5, -3, 4, 4, 1, 4, 5};
        result = task6(arr4);
        System.out.println(result);
        int[] arr5 = {5, -3, 4, 3, 5, 4, 5};
        result = task6(arr5);
        System.out.println(result);
        int[] arr6 = {5, -3, 4, 4, 5, 4, 5};
        result = task6(arr6);
        System.out.println(result);
    }

    private static void task1() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    private static void task2() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                System.out.println("Делится на 3: " + i);
            }

            if (i % 5 == 0 && i % 3 != 0) {
                System.out.println("Делится на 5: " + i);
            }

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Делится на 3 и на 5: " + i);
            }
        }
    }

    private static boolean task3(int first, int second, int third) {
        return (first + second == third);
    }

    private static boolean task4(int first, int second, int third) {
        return (second > first && third > second);
    }

    private static boolean task5(int[] array) {
        if (array.length < 2) {
            System.out.println("Массив должен содержать как минимум два элемента.");
            return false;
        }

        return (array[0] == 3 || array[array.length - 1] == 3);
    }

    private static boolean task6(int[] array) {
        boolean contains = false;

        for (int num : array) {
            if (num == 1 || num == 3) {
                contains = true;
                break;
            }
        }

        return contains;
    }

    private static int readInt(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextInt();
    }
}
