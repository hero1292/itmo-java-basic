package itmo.java.basic.homework6.task5;

import java.util.Scanner;

public class MainClass {
    int age;
    static Scanner scanner = new Scanner(System.in);

    public void getProp() {
        System.out.print("Введите ваш возраст: ");
        this.age = scanner.nextInt();
    }
}
