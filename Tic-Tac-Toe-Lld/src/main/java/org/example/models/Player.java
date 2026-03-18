package org.example.models;

import org.example.enums.PieceType;

public class Player {
    private final PieceType piece;
    private final String name;

    public Player(String name, PieceType piece) {
        this.piece = piece;
        this.name = name;
    }

    public PieceType getPiece() {
        return piece;
    }

    public String getName() {
        return name;
    }
}
