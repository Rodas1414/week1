package workshops1;

import java.util.Scanner;

public class financecalculators {

    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        System.out.println("Welcome to the Financial Calculator!");
        System.out.println("------------------------------------");

        System.out.println("1. Mortgage Calculator");
        System.out.println("2. Future Value Calculator");
        System.out.println("3. Present Value Calculator");
        System.out.println("4. Future Value of One-Time Deposit (Daily Compounding)");
        System.out.print("Enter your choice (1–4): ");

        int choice = -1;

        while (choice < 1 || choice > 4) {
            if (value.hasNextInt()) {
                choice = value.nextInt();
                if (choice < 1 || choice > 4) {
                    System.out.println("Invalid choice! Please enter 1, 2, 3, or 4.");
                }
            } else {
                System.out.println("Invalid input! Please enter a number (1, 2, 3, or 4).");
                value.next(); // clear invalid input
            }

            if (choice >= 1 && choice <= 4) break;

            System.out.print("Enter your choice (1–4): ");
        }

        switch (choice) {
            case 1:
                mortgageCalculator(value);
                break;
            case 2:
                futureValueCalculator(value);
                break;
            case 3:
                presentValueCalculator(value);
                break;
            case 4:
                futureValueOfDepositCalculator(value);
                break;
        }

        value.close();
        System.out.println("\nThank you for using the Financial Calculator!");
    }

    // 1. Mortgage Calculator
    public static void mortgageCalculator(Scanner value) {
        System.out.println("\n--- Mortgage Calculator ---");

        System.out.print("Enter the loan amount (principal): ");
        double principal = value.nextDouble();

        System.out.print("Enter the annual interest rate (e.g., 7.625): ");
        double annualRate = value.nextDouble();

        System.out.print("Enter the loan term in years: ");
        int years = value.nextInt();

        int n = years * 12; // total monthly payments
        double monthlyRate = annualRate / 100 / 12;

        double monthlyPayment = principal * (monthlyRate * Math.pow(1 + monthlyRate, n)) /
                (Math.pow(1 + monthlyRate, n) - 1);

        double totalInterest = (monthlyPayment * n) - principal;

        System.out.printf("\nMonthly Payment: $%.2f\n", monthlyPayment);
        System.out.printf("Total Interest Paid: $%.2f\n", totalInterest);
    }

    // 2. Future Value Calculator (Simple Compounding)
    public static void futureValueCalculator(Scanner value) {
        System.out.println("\n--- Future Value Calculator ---");

        System.out.print("Enter the initial investment amount: ");
        double principal = value.nextDouble();

        System.out.print("Enter the annual interest rate (e.g., 5): ");
        double annualRate = value.nextDouble();

        System.out.print("Enter the number of years: ");
        int years = value.nextInt();

        double futureValue = principal * Math.pow(1 + annualRate / 100, years);

        System.out.printf("\nFuture Value: $%.2f\n", futureValue);
    }

    // 3. Present Value Calculator
    public static void presentValueCalculator(Scanner value) {
        System.out.println("\n--- Present Value Calculator ---");

        System.out.print("Enter the future value: ");
        double futureValue = value.nextDouble();

        System.out.print("Enter the annual interest rate (e.g., 5): ");
        double annualRate = value.nextDouble();

        System.out.print("Enter the number of years: ");
        int years = value.nextInt();

        double presentValue = futureValue / Math.pow(1 + annualRate / 100, years);

        System.out.printf("\nPresent Value: $%.2f\n", presentValue);
    }

    // 4. Future Value of One-Time Deposit (Daily Compounding)
    public static void futureValueOfDepositCalculator(Scanner value) {
        System.out.println("\n--- Future Value of One-Time Deposit (Daily Compounding) ---");

        System.out.print("Enter the deposit amount (principal): ");
        double principal = value.nextDouble();

        System.out.print("Enter the annual interest rate (e.g., 1.75): ");
        double annualRate = value.nextDouble();

        System.out.print("Enter the number of years: ");
        int years = value.nextInt();

        double dailyRate = annualRate / 100 / 365;
        int totalDays = 365 * years;

        double futureValue = principal * Math.pow(1 + dailyRate, totalDays);
        double interestEarned = futureValue - principal;

        System.out.printf("\nFuture Value: $%.2f\n", futureValue);
        System.out.printf("Total Interest Earned: $%.2f\n", interestEarned);
    }
}