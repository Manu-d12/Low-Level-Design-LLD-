package snakeAndLadder;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class GameOrchestrator {
    private Board board;
    private Queue<Player> players;
    private WinStrategy winStrategy;
    private Dice dice;

    public GameOrchestrator(Board board, Dice dice, WinStrategy winStrategy) {
        this.board = board;
        this.dice = dice;
        this.winStrategy = winStrategy;
        this.players = new ArrayDeque<>();
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public void addSnake(int snakeStart, int snakeEnd) {
        Cell cell = this.board.getCell(snakeStart);
        cell.setDestination(snakeEnd);
    }

    public void addLadder(int ladderStart, int ladderEnd) {
        Cell cell = this.board.getCell(ladderStart);
        cell.setDestination(ladderEnd);
    }

    public void start() {
        int boardSize = this.board.size();
        Scanner scn = new Scanner(System.in);
        System.out.println("Game Started....");
        while (true) {
            Player player = this.players.remove();
            players.add(player);

            System.out.println(player.getName() + " press 1 to throw die...");
            scn.next();
            int currPos = player.getPosition();

            int diceVal = this.dice.throwDice();

            System.out.println("Die value " + diceVal);

            int nextPos = currPos + diceVal;
            if(nextPos > boardSize * boardSize) continue;

            Cell cell = this.board.getCell(nextPos);
            int cellDestination = cell.getDestination();

            int finalPos = cellDestination == -1 ? nextPos : cellDestination;

            player.setPosition(finalPos);

            System.out.println(player.getName() + " current position " + player.getPosition());

            boolean isWin = this.winStrategy.checkWin(boardSize, player);
            if (isWin) {
                System.out.println("Player " + player.getName() + " wins...");
                break;
            }
        }
        System.out.println("Game Over...");
        scn.close();
    }
}
