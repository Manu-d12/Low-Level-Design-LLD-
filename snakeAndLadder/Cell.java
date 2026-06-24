package snakeAndLadder;

public class Cell {
    int cellNumber;
    int destination;

    public Cell(int cellNumber) {
        this.cellNumber = cellNumber;
        this.destination = -1;
    }

    public void setCellNumber(int cellNumber) {
        this.cellNumber = cellNumber;
    }

    public void setDestination(int destination) {
        this.destination = destination;
    }

    public int getDestination() {
        return this.destination;
    }

    public int getCellNumber() {
        return this.cellNumber;
    }
}
