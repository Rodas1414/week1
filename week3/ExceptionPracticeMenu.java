package week3;

import java.util.*;

public class ExceptionPracticeMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n📚 Java Exception Handling Practice Menu:");
            System.out.println("1. Divide Two Numbers");
            System.out.println("2. String to Integer Conversion");
            System.out.println("3. Age Input Validation");
            System.out.println("4. Guess the Number Game");
            System.out.println("5. Temperature Converter");
            System.out.println("6. Even or Odd Checker");
            System.out.println("7. Simple Calculator");
            System.out.println("8. Add Three Numbers");
            System.out.println("9. Username Length Check");
            System.out.println("0. Exit");
            System.out.print("Choose an option (0-9): ");

            try {
                int choice = scanner.nextInt();
                scanner.nextLine(); // clear newline

                switch (choice) {
                    case 1 -> divideExample(scanner);
                    case 2 -> stringToInt(scanner);
                    case 3 -> ageInput(scanner);
                    case 4 -> guessGame(scanner);
                    case 5 -> tempConverter(scanner);
                    case 6 -> evenChecker(scanner);
                    case 7 -> calculator(scanner);
                    case 8 -> addThreeNumbers(scanner);
                    case 9 -> usernameCheck(scanner);
                    case 0 -> {
                        System.out.println("👋 Exiting... Goodbye!");
                        running = false;
                    }
                    default -> System.out.println("❗ Invalid choice. Try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("⚠️ Invalid input. Please enter a number.");
                scanner.nextLine(); // clear invalid input
            }
        }
    }

    static void divideExample(Scanner scanner) {
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Oops! You can't divide by zero.");
        }
    }

    static void stringToInt(Scanner scanner) {
        System.out.print("Enter a number (as text): ");
        String input = scanner.nextLine();

        try {
            int number = Integer.parseInt(input);
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("That's not a valid number.");
        }
    }

    static void ageInput(Scanner scanner) {
        boolean valid = false;
        int age = 0;

        while (!valid) {
            try {
                System.out.print("Enter your age: ");
                age = scanner.nextInt();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("That doesn't seem to be a valid number.");
                scanner.nextLine(); // Clear invalid input
            }
        }

        System.out.println("Your age is: " + age);
    }

    static void guessGame(Scanner scanner) {
        int secret = 7;
        boolean guessed = false;

        while (!guessed) {
            try {
                System.out.print("Guess the number: ");
                int guess = scanner.nextInt();

                if (guess == secret) {
                    System.out.println("🎉 Correct!");
                    guessed = true;
                } else {
                    System.out.println("❌ Nope, try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("⚠️ Please enter a valid number.");
                scanner.nextLine(); // Clear invalid input
            }
        }
    }

    static void tempConverter(Scanner scanner) {
        try {
            System.out.print("Enter temperature in Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = celsius * 9 / 5 + 32;
            System.out.println("Fahrenheit: " + fahrenheit);
        } catch (InputMismatchException e) {
            System.out.println("❌ That wasn't a valid temperature.");
            scanner.nextLine();
        }
    }

    static void evenChecker(Scanner scanner) {
        boolean done = false;

        while (!done) {
            try {
                System.out.print("Enter a number: ");
                int num = scanner.nextInt();
                if (num % 2 == 0) {
                    System.out.println("✅ That's an even number.");
                } else {
                    System.out.println("🟠 That's an odd number.");
                }
                done = true;
            } catch (InputMismatchException e) {
                System.out.println("❗ Not a valid number.");
                scanner.nextLine();
            }
        }
    }

    static void calculator(Scanner scanner) {
        try {
            System.out.print("Enter first number: ");
            int a = scanner.nextInt();
            System.out.print("Enter second number: ");
            int b = scanner.nextInt();
            scanner.nextLine(); // Consume leftover newline
            System.out.print("Enter operator (+, -, *, /): ");
            String op = scanner.nextLine();

            int result = switch (op) {
                case "+" -> a + b;
                case "-" -> a - b;
                case "*" -> a * b;
                case "/" -> a / b;
                default -> {
                    System.out.println("Unknown operator.");
                    yield 0;
                }
            };

            if (op.matches("[+\\-*/]")) {
                System.out.println("Result: " + result);
            }
        } catch (InputMismatchException e) {
            System.out.println("❗ Invalid number!");
            scanner.nextLine();
        } catch (ArithmeticException e) {
            System.out.println("🚫 Cannot divide by zero!");
        }
    }

    static void addThreeNumbers(Scanner scanner) {
        int total = 0;
        int count = 0;

        while (count < 3) {
            System.out.print("Enter number " + (count + 1) + ": ");
            try {
                int num = scanner.nextInt();
                total += num;
                count++;
            } catch (InputMismatchException e) {
                System.out.println("❌ Invalid number. Try again.");
                scanner.nextLine(); // Clear input
            }
        }

        System.out.println("✅ Total sum: " + total);
    }

    static void usernameCheck(Scanner scanner) {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        if (username.length() < 3) {
            throw new IllegalArgumentException("❌ Username too short! Must be at least 3 characters.");
        }

        System.out.println("👋 Welcome, " + username + "!");
    }
}
