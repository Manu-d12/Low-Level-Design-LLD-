package snakeAndLadder;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Random;
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

    public void addSnakesAndLadders(int snakes, int ladders) {

        Random random = new Random();

        while (snakes > 0) {
            int snakeStart = random.nextInt(0, this.board.size() * this.board.size());
            int snakeEnd = random.nextInt(0, this.board.size() * this.board.size());

            if(snakeEnd >= snakeStart) continue;

            Cell cell = this.board.getCell(snakeStart);
            Jump jump = new Jump(snakeStart, snakeEnd);
            cell.jump = jump;
            --snakes;
        }

        while (ladders > 0) {
            int ladderStart = random.nextInt(0, this.board.size() * this.board.size());
            int ladderEnd = random.nextInt(0, this.board.size() * this.board.size());

            if(ladderStart >= ladderEnd) continue;

            Cell cell = this.board.getCell(ladderStart);
            Jump jump = new Jump(ladderStart, ladderEnd);
            cell.jump = jump;
            --ladders;
        }
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
            int cellDestination = cell.jump == null ? -1 : cell.jump.end;

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
