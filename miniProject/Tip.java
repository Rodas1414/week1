package miniProject;

import java.util.Scanner;

public class Tip {
    public static void main(String[] args) {
        // 1. Get User Input with Scanner
        Scanner scanner = new Scanner(System.in);

        // 2. Ask for the Bill Amount
        System.out.print("Enter the bill amount: ");
        double bill = Double.parseDouble(scanner.nextLine());

        // 3. Ask for the Tip Percentage
        System.out.print("Enter the tip percentage: ");
        double tipPercentage = Double.parseDouble(scanner.nextLine());

        // 4. Calculate the Tip and Total
        double tipAmount = bill * (tipPercentage / 100);
        double totalAmount = bill + tipAmount;

        // 5. Round with Math.ceil() and Math.floor()
        double roundedUpTotal = Math.ceil(totalAmount);
        double roundedDownTotal = Math.floor(totalAmount);

        // 6. Show Results to the User
        System.out.println("Tip amount: €" + tipAmount);
        System.out.println("Total amount: €" + totalAmount);
        System.out.println("Rounded up: €" + roundedUpTotal);
        System.out.println("Rounded down: €" + roundedDownTotal);

        // 7. Close the Scanner
        scanner.close();
    }
}
