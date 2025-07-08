package itmo.java.basic.homework11.Task4.Monitor;

public class NamePrinter extends Thread {
    private final Object lock;
    private final Turn turn;
    private final Turn.TurnType myTurn;
    private final int printCount;

    public NamePrinter(String name, Object lock, Turn turn, Turn.TurnType myTurn, int printCount) {
        super(name);
        this.lock = lock;
        this.turn = turn;
        this.myTurn = myTurn;
        this.printCount = printCount;
    }

    @Override
    public void run() {
        int printsLeft = printCount;

        while (printsLeft > 0 && !isInterrupted()) {
            synchronized (lock) {
                while (turn.getCurrentTurn() != myTurn) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                }

                System.out.println(getName());
                printsLeft--;
                turn.toggle();
                lock.notifyAll();
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}