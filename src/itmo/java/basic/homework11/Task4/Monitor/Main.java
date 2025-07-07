package itmo.java.basic.homework11.Task4.Monitor;

public class Main {
    public static void main(String[] args) {
        Object lock = new Object();
        Turn turn = new Turn();
        int printCount = 10;

        Thread thread1 = new NamePrinter("Thread-1", lock, turn, Turn.TurnType.FIRST, printCount);
        Thread thread2 = new NamePrinter("Thread-2", lock, turn, Turn.TurnType.SECOND, printCount);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Main thread interrupted");
        }

        System.out.println("Printing finished");
    }
}

