package itmo.java.basic.homework11.Task4.Simple;

public class Main {
    public static void main(String[] args) {
        new NamePrinter("Thread-1").start();
        new NamePrinter("Thread-2").start();
    }
}

