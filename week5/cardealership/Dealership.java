package week5.cardealership;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private String name;
    private String address;
    private String phone;
    private List<Vehicle> inventory;

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = new ArrayList<>();
    }

    // Add a vehicle to the dealership's inventory
    public void addVehicle(Vehicle v) {
        inventory.add(v);
    }

    // Remove a vehicle from the dealership's inventory
    public void removeVehicle(Vehicle v) {
        inventory.remove(v);
    }

    // Get all vehicles from the dealership's inventory
    public List<Vehicle> getAllVehicles() {
        return inventory;
    }

    // Set the inventory list directly
    public void setInventory(List<Vehicle> inventory) {
        this.inventory = inventory;
    }

    // Get the dealership name
    public String getName() {
        return name;
    }

    // Get the dealership phone number
    public String getPhone() {
        return phone;
    }

    // Get the dealership address
    public String getAddress() {
        return address;  // Added getter for address
    }

    // Additional getter and setter methods for other fields can be added if needed
}
