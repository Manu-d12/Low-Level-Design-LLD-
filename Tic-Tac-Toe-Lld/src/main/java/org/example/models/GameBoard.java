package org.example.models;

import org.example.enums.PieceType;

public class GameBoard {
    private final int boardSize;
    private final PieceType [][] board;

    public GameBoard(int boardSize) {
        this.boardSize = boardSize;
        this.board = new PieceType[boardSize][boardSize];
    }

    public void printBoard() {
        for(int i = 0; i < boardSize; i++) {
            for(int j = 0; j < boardSize; j++) {
                if(board[i][j] == null) {
                    System.out.print(" | ");
                } else {
                    System.out.print(board[i][j] + "| ");
                }
            }
            System.out.println();
        }
    }

    public PieceType[][] getBoard() {
        return this.board;
    }

    public boolean addPiece(int x, int y, PieceType piece) {
        if(board[x][y] != null) {
            return false;
        }
        board[x][y] = piece;
        return true;
    }
}
