package week3.mapmini;

import java.util.*;

// Pet class (not public since we're using one file)
class Pet {
    private String name;
    private String type;

    public Pet(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}

public class OwnerMultiplePets {
    public static void main(String[] args) {
        // Step 1: Create a HashMap
        HashMap<String, Pet> petMap = new HashMap<>();

        // Step 2: Add 3 owners and their pets
        petMap.put("Alice", new Pet("Buddy", "dog"));
        petMap.put("Bob", new Pet("Whiskers", "cat"));
        petMap.put("Diana", new Pet("Goldie", "fish"));

        // Step 3: Get and print pet for a specific owner
        Pet bobsPet = petMap.get("Bob");
        System.out.println("Bob's pet: " + bobsPet.getName() + " the " + bobsPet.getType());

        // Step 4: Replace one owner's pet
        petMap.put("Alice", new Pet("Max", "rabbit"));

        // Step 5: Loop and print all owner-pet pairs
        System.out.println("\nAll owners and their pets:");
        for (Map.Entry<String, Pet> entry : petMap.entrySet()) {
            String owner = entry.getKey();
            Pet pet = entry.getValue();
            System.out.println("Owner: " + owner + " → Pet: " + pet.getName() + " the " + pet.getType());
        }
    }
}


