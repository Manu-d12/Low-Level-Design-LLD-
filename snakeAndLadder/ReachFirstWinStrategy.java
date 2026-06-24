package snakeAndLadder;

public class ReachFirstWinStrategy implements WinStrategy{
    
    @Override
    public boolean checkWin(int boardSize, Player player) {
        return boardSize * boardSize == player.getPosition();
    }
}
