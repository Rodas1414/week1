package OOP2;

public class App {
    public static void main(String[] args) {
        // Print Latin names
        System.out.println("House Latin Name: " + House.latinName);
        System.out.println("Car Latin Name: " + Car.latinName);

        // Create two houses
        House myHouse = new House();
        myHouse.color = "blue";
        myHouse.numberOfRooms = 5;
        myHouse.hasGarden = true;
        myHouse.sizeInSquareMeters = 120.5;

        House hauntedHouse = new House();
        hauntedHouse.color = "dark purple";
        hauntedHouse.numberOfRooms = 13;
        hauntedHouse.hasGarden = false;
        hauntedHouse.sizeInSquareMeters = 666.6;

        // Create two cars
        Car tesla = new Car();
        tesla.brand = "Tesla";
        tesla.color = "white";
        tesla.year = 2021;
        tesla.isElectric = true;

        Car oldBeetle = new Car();
        oldBeetle.brand = "Volkswagen Beetle";
        oldBeetle.color = "red";
        oldBeetle.year = 1969;
        oldBeetle.isElectric = false;

        // Use methods
        myHouse.openDoor();
        hauntedHouse.openDoor();
        tesla.startEngine();
        oldBeetle.startEngine();

        // Object reference example
        Car anotherTesla = tesla;
        anotherTesla.color = "matte black";

        System.out.println("Tesla's new color? " + tesla.color);
    }
}

