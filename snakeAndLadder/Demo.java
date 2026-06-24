package snakeAndLadder;

public class Demo {
    public static void main(String[] args) {
        Player manoj = new Player("Manoj Dhiman");
        Player diksha = new Player("Diksha Kumari");

        Board board = new Board(5);
        WinStrategy reachFirstStrategy = new ReachFirstWinStrategy();

        Dice dice = new Dice();

        GameOrchestrator orchestrator = new GameOrchestrator(board, dice, reachFirstStrategy);
        orchestrator.addPlayer(manoj);
        orchestrator.addPlayer(diksha);

        orchestrator.start();
    }
}
