package itmo.java.basic.homework9.Task2;

import java.util.List;
import java.util.Random;

public class ListBenchmark {
    public static long addElements(List<Integer> list, int count) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            list.add(i);
        }
        return System.currentTimeMillis() - start;
    }

    public static long randomSelect(List<Integer> list, int count) {
        Random rand = new Random();
        int size = list.size();
        long start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            int idx = rand.nextInt(size);
            int val = list.get(idx);

            if (val == -1) {
                System.out.println("Never happens");
            }
        }
        return System.currentTimeMillis() - start;
    }
}
