package week3.mapmini;

import java.util.HashMap;
import java.util.Map;

public class PeopleAges {
    public static void main(String[] args) {
        // Step 1: Create a HashMap
        HashMap<String, Integer> ages = new HashMap<>();

        // Step 2: Add at least 4 people and their ages
        ages.put("Alice", 28);
        ages.put("Bob", 34);
        ages.put("Charlie", 22);
        ages.put("Diana", 30);

        // Step 3: Print the age of one specific person
        System.out.println("Bob's age: " + ages.get("Bob"));

        // Step 4: Increase one person's age by 1
        ages.put("Alice", ages.get("Alice") + 1);
        System.out.println("Alice's updated age: " + ages.get("Alice"));

        // Step 5: Remove one person from the map
        ages.remove("Charlie");

        // Step 6: Loop over the map and print name and age
        System.out.println("\nAll people in the map:");
        for (Map.Entry<String, Integer> entry : ages.entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", Age: " + entry.getValue());
        }
    }
}
