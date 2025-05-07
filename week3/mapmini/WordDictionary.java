package week3.mapmini;

import java.util.HashMap;


public class WordDictionary {
    public static void main(String[] args) {
        // Step 1: Create a HashMap
        HashMap<String, String> dictionary = new HashMap<>();

        // Step 2: Add three words and their meanings
        dictionary.put("Java", "A high-level, object-oriented programming language.");
        dictionary.put("HashMap", "A collection that stores key-value pairs.");
        dictionary.put("Variable", "A storage location in programming that holds data.");

        // Step 3: Retrieve and print the meaning of one specific word
        System.out.println("Meaning of 'Java': " + dictionary.get("Java"));

        // Step 4: Replace the meaning of one of the words
        dictionary.put("Java", "A widely-used programming language known for portability.");
        System.out.println("Updated meaning of 'Java': " + dictionary.get("Java"));

        // Step 5: Check if a certain word exists
        String wordToCheck = "Loop";
        if (dictionary.containsKey(wordToCheck)) {
            System.out.println("'" + wordToCheck + "' exists in the dictionary.");
        } else {
            System.out.println("'" + wordToCheck + "' does not exist in the dictionary.");
        }

        // Step 6: Print all keys (the words)
        System.out.println("\nAll words in the dictionary:");
        for (String word : dictionary.keySet()) {
            System.out.println(word);
        }

        // Step 7: Print all values (the meanings)
        System.out.println("\nAll definitions in the dictionary:");
        for (String meaning : dictionary.values()) {
            System.out.println(meaning);
        }
    }
}
