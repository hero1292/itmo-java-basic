package itmo.java.basic.homework11.Task1;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            final int threadNumber = i;

            Thread thread = new Thread(() -> {
                for (int j = 0; j <= 100; j++) {
                    System.out.printf("Thread-%d: %d%n", threadNumber, j);
                }
            });

            thread.start();
        }
    }
}
