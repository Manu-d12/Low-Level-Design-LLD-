package org.example.models;

import org.example.enums.PieceType;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class TicTacToeGame {
    private Deque<Player> players = new ArrayDeque<>();
    private GameBoard board;
    private int boardSize;


    public TicTacToeGame(Player player1, Player player2, int boardSize) {
        players.add(player1);
        players.add(player2);

        this.boardSize = boardSize;
        board = new GameBoard(this.boardSize);
    }

    public void startGame() {
        System.out.println("Tic-Tac-Toe Game Started......");
        Scanner scanner = new Scanner(System.in);
        int validMovesSoFar = 0;
        while(validMovesSoFar < this.boardSize * this.boardSize) {
          Player currentPlayer = players.poll();
          PieceType piece = currentPlayer.getPiece();
          System.out.println(String.format("%s please enter row, col", currentPlayer.getName()));

            String s = scanner.nextLine();
            String[] split = s.split(",");
            int row = Integer.parseInt(split[0]);
            int col = Integer.parseInt(split[1]);

            boolean isPieceAdded = this.board.addPiece(row, col, piece);
            if(!isPieceAdded) {
                System.out.println("Invalid Move, Cell already filled...");
                players.addFirst(currentPlayer);
                continue;
            }

            if(this.checkWinner(row, col, piece)) {
                System.out.println(String.format("%s is winner...", currentPlayer.getName()));
                return;
            }

            validMovesSoFar++;
            this.board.printBoard();
            this.players.addLast(currentPlayer);
        }

        System.out.println("Match Tie...");
    }

    private boolean checkWinner(int row, int col, PieceType piece) {
        // check row
        boolean isRowWin = true;
        for(int j = 0; j < this.boardSize; j++) {
            if(this.board.getBoard()[row][j] != piece) {
                isRowWin = false;
                break;
            }
        }

        // check column
        boolean isColWin = true;
        for(int i = 0; i < this.boardSize; ++i) {
            if(this.board.getBoard()[i][col] != piece) {
                isColWin = false;
                break;
            }
        }

        // check diagonal
        boolean isDiaWin = true;
        for(int i = 0, j = 0; i < this.boardSize && j < this.boardSize; ++i, ++j) {
            if(this.board.getBoard()[i][j] != piece) {
                isDiaWin = false;
                break;
            }
        }

        // check reverse or anti diagonal
        boolean isRevDiaWin = true;
        for(int i = 0, j = this.boardSize - 1; j >= 0 && i < this.boardSize; i++, j--) {
            if(this.board.getBoard()[i][j] != piece) {
                isRevDiaWin = false;
                break;
            }
        }


        return  isRowWin | isColWin | isDiaWin | isRevDiaWin;
    }
}
