package miniProject;
import java.util.Scanner;

public class Temperature {
    // 6. Optional: Static method to convert temperature
    public static double convertTemp(double temp, String direction) {
        if (direction.equals("C")) {
            return (temp * 9 / 5) + 32; // Celsius to Fahrenheit
        } else if (direction.equals("F")) {
            return (temp - 32) * 5 / 9; // Fahrenheit to Celsius
        } else {
            System.out.println("Invalid direction.");
            return 0;
        }
    }

    public static void main(String[] args) {
        // 1. Import and setup Scanner
        Scanner scanner = new Scanner(System.in);

        // 2. Ask the user which conversion they want
        System.out.print("Type C to convert from Celsius to Fahrenheit, or F to convert from Fahrenheit to Celsius: ");
        String choice = scanner.nextLine().toUpperCase(); // Normalize input to uppercase

        // 3. Ask for the temperature to convert
        System.out.print("Enter the temperature: ");
        double inputTemp = Double.parseDouble(scanner.nextLine());

        // 4. Do the conversion using if-else
        double converted;
        if (choice.equals("C")) {
            converted = (inputTemp * 9 / 5) + 32;
            System.out.println(inputTemp + "°C is " + converted + "°F");
        } else if (choice.equals("F")) {
            converted = (inputTemp - 32) * 5 / 9;
            System.out.println(inputTemp + "°F is " + converted + "°C");
        } else {
            System.out.println("Invalid choice.");
            return; // exit early if input is invalid
        }

        // 5. (Optional) Cast the result to an int
        int rounded = (int) converted;
        System.out.println("Rounded: " + rounded + "°");

        // 6. (Optional) Use static method
        // double result = convertTemp(inputTemp, choice);
        // System.out.println("Converted using method: " + result);

        // 7. Close the scanner
        scanner.close();
    }
}
