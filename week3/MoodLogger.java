package week3;

import java.io.*;
import java.time.LocalDate;
import java.util.Scanner;

public class MoodLogger {
    private static final String FILE_NAME = "mood_log.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("[1] Log a new mood");
            System.out.println("[2] View past moods");
            System.out.println("[3] Exit");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left over

            if (choice == 1) {
                logMood(scanner);
            } else if (choice == 2) {
                viewPastMoods();
            } else if (choice == 3) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Method to log a new mood
    private static void logMood(Scanner scanner) {
        System.out.print("How are you feeling today? ");
        String mood = scanner.nextLine();
        String date = LocalDate.now().toString();

        try (FileWriter writer = new FileWriter(FILE_NAME, true)) {
            writer.write(date + ": " + mood + "\n");
            System.out.println("Your mood has been logged.");
        } catch (IOException e) {
            System.out.println("An error occurred while saving your mood.");
            e.printStackTrace();
        }
    }

    // Method to view past moods
    private static void viewPastMoods() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            System.out.println("\nPast Moods:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading past moods.");
            e.printStackTrace();
        }
    }
}
