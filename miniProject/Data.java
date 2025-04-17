package miniProject;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Data {
    public static void main(String[] args) {
        // 1. Set up Scanner
        Scanner scanner = new Scanner(System.in);

        // 2. Ask the user to enter a date
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String input = scanner.nextLine();

        // 3. Parse the date
        LocalDate date;
        try {
            date = LocalDate.parse(input); // Converts string to LocalDate
        } catch (Exception e) {
            System.out.println("Invalid date format. Please use yyyy-MM-dd.");
            scanner.close();
            return;
        }

        // 4. Show format options
        System.out.println("Choose a format:");
        System.out.println("1 - dd MMMM yyyy (e.g. 17 April 2025)");
        System.out.println("2 - EEEE, MMM d, yyyy (e.g. Thursday, Apr 17, 2025)");
        System.out.println("3 - MM/dd/yyyy (e.g. 04/17/2025)");
        System.out.print("Your choice: ");
        String formatChoice = scanner.nextLine();

        // 5. Choose the formatter based on user input
        DateTimeFormatter formatter;

        if (formatChoice.equals("1")) {
            formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        } else if (formatChoice.equals("2")) {
            formatter = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy");
        } else if (formatChoice.equals("3")) {
            formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        } else {
            System.out.println("Invalid format choice.");
            scanner.close();
            return;
        }

        // 6. Format and print the date
        String formatted = date.format(formatter);
        System.out.println("Formatted date: " + formatted);

        // 7. Close scanner
        scanner.close();
    }
}
