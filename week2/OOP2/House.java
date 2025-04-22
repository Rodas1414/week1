package week2.OOP2;

public class House {
    static String latinName = "domus";
    String color;
    int numberOfRooms;
    boolean hasGarden;
    double sizeInSquareMeters;

    public void openDoor() {
        System.out.println("Opening the door of a " + color + " house with " + numberOfRooms + " rooms.");
    }
}

