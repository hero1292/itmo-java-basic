package itmo.java.basic.homework1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        task1();

        task2();

        task3();

        task4();

        task5(scanner);

        task6(scanner);
    }

    private static void task1() {
        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java.");
    }

    private static void task2() {
        double res1 = (46 + 10) * (10.0 / 3);
        int res2 = 29 * 4 * -15;
        System.out.println(res1);
        System.out.println(res2);
    }

    private static void task3() {
        int number = 10500;
        double result = (double) (number / 10) / 10;
        System.out.println(result);
    }

    private static void task4() {
        double multResult = 3.6 * 4.1 * 5.9;
        System.out.println(multResult);
    }

    private static void task5(Scanner scanner) {
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    private static void task6(Scanner scanner) {
        int b2 = scanner.nextInt();

        if (b2 % 2 != 0) {
            System.out.println("Нечетное");
        } else if (b2 > 100) {
            System.out.println("Выход за пределы диапазона");
        } else {
            System.out.println("Четное");
        }
    }
}
