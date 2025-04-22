package week2.constructors;


public class Main {
    public static void main(String[] args) {
        // Book test
        Book b1 = new Book("Java for Starters", "Maaike", 100);
        Book b2 = new Book("Book One", "Alice", 150);
        Book b3 = new Book("Book Two", "Bob", 200);
        Book b4 = new Book(); // default values

        b1.describe();
        b2.describe();
        b3.describe();
        b4.describe();

        // Cupcake test
        Cupcake choco = new Cupcake("Chocolate", 180);
        Cupcake mega = new Cupcake("Mega Fudge", 350);

        // Person test
        Person p1 = new Person("Luna", -3);

        // Planet test
        Planet earth = new Planet("Earth", 12742);
        System.out.println("Planet: " + earth.getName());

        // Car test
        Car tesla = new Car("Tesla", 2022, true);
        Car bmw = new Car("BMW", 2020, false);
        tesla.startEngine();
        bmw.startEngine();

        // House/Room test
        Room kitchen = new Room("Kitchen");
        House house = new House(kitchen);
        house.describe();

        // Rectangle test
        Rectangle r1 = new Rectangle(4, 5);
        Rectangle r2 = new Rectangle(10, 3);
        System.out.println("Area 1: " + r1.getArea());
        System.out.println("Area 2: " + r2.getArea());
    }
}
