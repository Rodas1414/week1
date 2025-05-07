package week3;

import java.io.*;
import java.util.*;

public class SearchInventoryMap {

    // Map to store product name and price
    private static Map<String, Double> inventoryMap = new HashMap<>();

    public static void main(String[] args) {
        loadInventory();

        Scanner scanner = new Scanner(System.in);
        String searchAgain;

        do {
            System.out.print("Enter a product name to search: ");
            String productName = scanner.nextLine().trim();

            if (inventoryMap.containsKey(productName)) {
                System.out.println("Price of " + productName + ": $" + inventoryMap.get(productName));
            } else {
                System.out.println("Product not found in inventory.");
            }

            System.out.print("Do you want to search again? (yes/no): ");
            searchAgain = scanner.nextLine().trim().toLowerCase();

        } while (searchAgain.equals("yes"));

        scanner.close();
        System.out.println("Thank you for using the inventory search.");
    }

    // Method to load inventory from CSV
    private static void loadInventory() {
        try (BufferedReader reader = new BufferedReader(new FileReader("Inventory.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String name = parts[0].trim();
                    double price = Double.parseDouble(parts[1].trim());
                    inventoryMap.put(name, price);
                }
            }
            System.out.println("Inventory loaded successfully.");
        } catch (IOException e) {
            System.out.println("Error reading Inventory.csv: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error parsing price in Inventory.csv: " + e.getMessage());
        }
    }
}
