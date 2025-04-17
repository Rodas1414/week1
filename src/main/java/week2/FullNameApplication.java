package week2;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // This lets us read input from the user

        System.out.println("Please enter your name");

        System.out.print("First name: ");
        String firstName = scanner.nextLine().trim();  // .trim() removes spaces before/after

        System.out.print("Middle name: ");
        String middleName = scanner.nextLine().trim();

        System.out.print("Last name: ");
        String lastName = scanner.nextLine().trim();

        System.out.print("Suffix: ");
        String suffix = scanner.nextLine().trim();

        // Build full name
        StringBuilder fullName = new StringBuilder();
        fullName.append(firstName).append(" ");

        if (!middleName.isEmpty()) {
            fullName.append(middleName).append(" ");
        }

        fullName.append(lastName);

        if (!suffix.isEmpty()) {
            fullName.append(", ").append(suffix);
        }

        System.out.println("Full name: " + fullName);
    }
}

