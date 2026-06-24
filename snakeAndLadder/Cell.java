package snakeAndLadder;

public class Cell {
    int cellNumber;
    Jump jump;

    public Cell(int cellNumber) {
        this.cellNumber = cellNumber;
        this.jump = null;
    }

    public void setCellNumber(int cellNumber) {
        this.cellNumber = cellNumber;
    }

    public int getCellNumber() {
        return this.cellNumber;
    }
}
