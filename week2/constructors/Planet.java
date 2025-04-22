package week2.constructors;

public class Planet {
    private final String name;
    private final double size;

    public Planet(String name, double size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public double getSize() {
        return size;
    }
}

