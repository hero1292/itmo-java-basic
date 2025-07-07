package itmo.java.basic.homework11.Task2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= 10; i++) {
            final int threadNumber = i;

            Thread thread = new Thread(() -> {
                for (int j = 0; j <= 100; j++) {
                    if (j % 25 == 0) {
                        System.out.printf("Thread-%d: %d (State: %s)%n",
                                threadNumber, j, Thread.currentThread().getState());
                    }

                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            });

            System.out.printf("Thread-%d state before start: %s%n",
                    threadNumber, thread.getState());

            thread.start();

            System.out.printf("Thread-%d state after start: %s%n",
                    threadNumber, thread.getState());

            Thread.sleep(5);
            System.out.printf("Thread-%d state during execution: %s%n",
                    threadNumber, thread.getState());
        }
    }
}
