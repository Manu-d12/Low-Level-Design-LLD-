package snakeAndLadder;

public class Player {
    private String name;
    private Integer position;

    public Player(String name) {
        this.name = name;
        this.position = 1;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getName() {
        return this.name;
    }

    public Integer getPosition() {
        return this.position;
    }
}
