package miniProject;

import java.util.Scanner;

public class Calculator {

    // Optional enhancement: a method to perform the calculation
    public static double calculate(double a, double b, String op) {
        if (op.equals("+")) {
            return a + b;
        } else if (op.equals("-")) {
            return a - b;
        } else if (op.equals("*")) {
            return a * b;
        } else if (op.equals("/")) {
            return a / b;
        } else {
            System.out.println("Unknown operator.");
            return 0;
        }
    }

    public static void main(String[] args) {
        // 1. Create Scanner to read user input
        Scanner scanner = new Scanner(System.in);

        // 2. Ask for the first number
        System.out.print("Enter the first number: ");
        double num1 = Double.parseDouble(scanner.nextLine());

        // 3. Ask for the second number
        System.out.print("Enter the second number: ");
        double num2 = Double.parseDouble(scanner.nextLine());

        // 4. Ask for the operator
        System.out.print("Choose an operator (+, -, *, /): ");
        String operator = scanner.nextLine();

        // 5. Call the calculate method
        double result = calculate(num1, num2, operator);

        // 6. Show the result
        System.out.println("Result: " + result);

        // 7. Close the scanner
        scanner.close();
    }
}
