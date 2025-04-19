package week2;

import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Collect full name
        System.out.print("Full name: ");
        String fullName = scanner.nextLine();

        // Collect Billing Address
        System.out.print("Billing Street: ");
        String billingStreet = scanner.nextLine();
        System.out.print("Billing City: ");
        String billingCity = scanner.nextLine();
        System.out.print("Billing State: ");
        String billingState = scanner.nextLine();
        System.out.print("Billing Zip: ");
        String billingZip = scanner.nextLine();

        // Collect Shipping Address
        System.out.print("Shipping Street: ");
        String shippingStreet = scanner.nextLine();
        System.out.print("Shipping City: ");
        String shippingCity = scanner.nextLine();
        System.out.print("Shipping State: ");
        String shippingState = scanner.nextLine();
        System.out.print("Shipping Zip: ");
        String shippingZip = scanner.nextLine();

        // Build the output using StringBuilder
        StringBuilder sb = new StringBuilder();

        sb.append(fullName).append("\n");
        sb.append("Billing Address:\n");
        sb.append(billingStreet).append("\n");
        sb.append(billingCity).append(", ").append(billingState).append(" ").append(billingZip).append("\n");

        sb.append("Shipping Address:\n");
        sb.append(shippingStreet).append("\n");
        sb.append(shippingCity).append(", ").append(shippingState).append(" ").append(shippingZip);

        // Print the final output
        System.out.println("\nCustomer Information:\n");
        System.out.println(sb.toString());

        scanner.close();
    }
}

