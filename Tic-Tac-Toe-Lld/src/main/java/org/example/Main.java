package org.example;

import org.example.enums.PieceType;
import org.example.models.Player;
import org.example.models.TicTacToeGame;


public class Main {
    public static void main(String[] args) {
        TicTacToeGame game = new TicTacToeGame(
                    new Player("Diksha", PieceType.O),
                    new Player("Manoj", PieceType.X),
                    4
                );


        game.startGame();
    }
}