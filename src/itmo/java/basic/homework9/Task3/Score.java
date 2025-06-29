package itmo.java.basic.homework9.Task3;

import java.util.Map;

public class Score {
    public static int getScoresByName(String inputName, Map<User, Integer> scores) {
        Integer score = scores.get(new User(inputName));
        return score == null ? -1 : score;
    }
}