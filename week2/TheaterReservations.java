package week2;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their full name
        System.out.println("Please enter your name: ");
        String fullName = scanner.nextLine().trim();

        // Split the full name into first and last name
        String[] nameParts = fullName.split(" ");
        String firstName = nameParts[0];
        String lastName = nameParts[1];

        // Prompt the user for the date of the show
        System.out.println("What date will you be coming (MM/dd/yyyy): ");
        String dateString = scanner.nextLine().trim();

        // Convert the string date to a Date object for formatting
        SimpleDateFormat inputDateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date showDate = null;
        try {
            showDate = inputDateFormat.parse(dateString);
        } catch (Exception e) {
            System.out.println("Invalid date format. Please use MM/dd/yyyy.");
            return;
        }

        // Prompt the user for the number of tickets
        System.out.println("How many tickets would you like? ");
        int numberOfTickets = scanner.nextInt();

        // Format the date to the desired format
        SimpleDateFormat outputDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = outputDateFormat.format(showDate);

        // Output the confirmation message based on the number of tickets
        if (numberOfTickets == 1) {
            System.out.println("1 ticket reserved for " + formattedDate + " under " + lastName + ", " + firstName);
        } else {
            System.out.println(numberOfTickets + " tickets reserved for " + formattedDate + " under " + lastName + ", " + firstName);
        }
    }
}
