package itmo.java.basic.homework11.Task4.Monitor;

public class Turn {
    public enum TurnType { FIRST, SECOND }
    private TurnType currentTurn = TurnType.FIRST;

    public TurnType getCurrentTurn() {
        return currentTurn;
    }

    public void toggle() {
        currentTurn = (currentTurn == TurnType.FIRST) ? TurnType.SECOND : TurnType.FIRST;
    }
}
