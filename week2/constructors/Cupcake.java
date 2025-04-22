package week2.constructors;

public class Cupcake {
    String flavor;
    int calories;

    public Cupcake(String flavor, int calories) {
        this.flavor = flavor;
        this.calories = calories;
        System.out.println("Created a cupcake: " + flavor + ", " + calories + " kcal");

        if (isHealthy()) {
            System.out.println("This cupcake is healthy-ish.");
        } else {
            System.out.println("Treat yourself! ");
        }
    }

    public boolean isHealthy() {
        return calories < 200;
    }
}

