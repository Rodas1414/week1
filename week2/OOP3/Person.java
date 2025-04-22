package week2.OOP3;

public class Person {
    private String name;
    private int age;
    private String favoriteColor;

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getFavoriteColor() {
        return favoriteColor;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative. Setting default age to 0.");
            this.age = 0;
        }
    }

    public void setFavoriteColor(String favoriteColor) {
        if (favoriteColor != null && !favoriteColor.trim().isEmpty()) {
            this.favoriteColor = favoriteColor;
        } else {
            this.favoriteColor = "unknown";
            System.out.println("Favorite color not specified. Setting it to 'unknown'.");
        }
    }
}
