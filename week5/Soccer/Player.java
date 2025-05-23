package week5.Soccer;

public class Player {
    private String name;
    private String position;
    private int number;

    public Player(String name, String position, int number) {
        this.name = name;
        this.position = position;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

