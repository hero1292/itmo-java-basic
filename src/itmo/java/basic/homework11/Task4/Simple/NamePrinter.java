package itmo.java.basic.homework11.Task4.Simple;

public class NamePrinter extends Thread {
    public NamePrinter(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(getName());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}
