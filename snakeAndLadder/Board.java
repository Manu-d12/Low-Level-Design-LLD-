package snakeAndLadder;

public class Board {
    private int boardSize;
    private Cell[][] cells;

    public Board(int boardSize) {
        this.boardSize = boardSize;
        this.cells = new Cell[boardSize][boardSize];

        for(int i = 0; i < boardSize; ++i) {
            for(int j = 0; j < boardSize; ++j) {
                this.cells[i][j] = new Cell(i * boardSize + j);
            }
        }
    }

    public int size() {
        return this.boardSize;
    }

    public Cell getCell(int cellNumber) {
        int row = cellNumber / boardSize;
        int col = cellNumber % boardSize;

        return this.cells[row][col];
    }
}
