package week2.constructors;

public class Car {
    String brand;
    int year;
    boolean isElectric;

    public Car(String brand, int year, boolean isElectric) {
        this.brand = brand;
        this.year = year;
        this.isElectric = isElectric;
    }

    public void startEngine() {
        if (isElectric) {
            System.out.println(brand + " hums quietly. ");
        } else {
            System.out.println(brand + " roars to life! ");
        }
    }
}

