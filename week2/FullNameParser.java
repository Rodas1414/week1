package week2;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their name
        System.out.println("Please enter your name: ");
        String fullName = scanner.nextLine().trim();  // Trim any leading/trailing spaces

        // Split the name into parts
        String[] nameParts = fullName.split(" ");

        String firstName = nameParts[0];  // First name is always the first part
        String middleName = (nameParts.length > 2) ? nameParts[1] : "(none)";  // Middle name if present
        String lastName = (nameParts.length > 1) ? nameParts[nameParts.length - 1] : "(none)";  // Last name is the last part

        // Output the parsed name components
        System.out.println("First name: " + firstName);
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name: " + lastName);
    }
}

