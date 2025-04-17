package week1;

import java.util.Scanner;

public class PayrollCalculator {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Enter your name:");
     String name = scanner.nextLine();

     System.out.println("Enter hours worked:");
     double hoursWorked = scanner.nextDouble();

     System.out.print("Enter your pay rate:");
     double payRate = scanner.nextDouble();

     double grossPay = hoursWorked * payRate;

     System.out.println("\nPayroll Summary");
     System.out.println("---------------");
     System.out.println("Employee Name: " + name);
     System.out.println("Hours Worked: " + hoursWorked);
     System.out.println("Pay Rate: $" + payRate);
     System.out.println("Gross Pay: $" + grossPay);

     scanner.close();
 }
}


