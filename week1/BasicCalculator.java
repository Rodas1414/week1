package week1;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number:");
        double num1 = scanner.nextInt();
        System.out.print("Enter the second number:");
        double num2 = scanner.nextInt();

        System.out.println("Possible calculations:");
        System.out.println("(A)dd");
        System.out.println("(S)ubstract");
        System.out.println("(M)utiply");
        System.out.println("(D)ivide");
        System.out.print("Please select an option: ");
        String choice = scanner.next(); // we won't use it, just pretending

        // Always multiply
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));

        scanner.close();
    }
}



