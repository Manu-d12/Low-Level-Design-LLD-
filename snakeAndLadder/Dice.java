package snakeAndLadder;

import java.util.Random;

public class Dice {
    Random random;

    public Dice() {
        this.random = new Random();
    }

    public int throwDice() {
        int val = this.random.nextInt(0, 6);
        return val + 1;
    }
}
