package itmo.java.basic.homework9.Task3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<User, Integer> scores = new HashMap<>();

        scores.put(new User("Артем"), 550);
        scores.put(new User("Светлана"), 68);
        scores.put(new User("Руслан"), 780);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя пользователя: ");
        String inputName = scanner.nextLine();

        int userScores = Score.getScoresByName(inputName, scores);

        if (userScores == -1) {
            System.out.println("Пользователь не найден.");
        } else {
            System.out.println("Очков у пользователя " + inputName + ": " + userScores);
        }
    }
}

