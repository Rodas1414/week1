import java.io.*;
import java.util.*;

public class Main {

    // Method to load student data from a file and create an array of Student objects
    public static Student[] loadFromFile(String filename) throws IOException {
        // Create a FileReader to read from the file
        FileReader file = new FileReader(filename);
      
        Scanner scanner = new Scanner(file);

        
        String numberOfStudentsStr = scanner.nextLine();
        int numberOfStudents = Integer.valueOf(numberOfStudentsStr);  // Convert string to number using Integer.valueOf()

    
        Student[] studentsArray = new Student[numberOfStudents];

        // Read each student's data from the file
        for (int i = 0; i < numberOfStudents; i++) {
            // Read student ID, name, and GPA as strings (no parse)
            String idStr = scanner.nextLine();    // Student ID (as a string)
            String nameStr = scanner.nextLine();  // Student Name
            String gpaStr = scanner.nextLine();   // Student GPA (as a string)

            // Store the student in the array using basic conversion and concatenation
            int id = Integer.valueOf(idStr);   // Convert string ID to integer
            double gpa = Double.valueOf(gpaStr);  // Convert string GPA to double
            Student student = new Student(id, nameStr, gpa); // Create student object

            // Store the student object in the array
            studentsArray[i] = student;
        }

        // Close the file after reading
        scanner.close();

        return studentsArray;
    }

    // Method to arrange students based on GPA, moving Dean's List students to the end
    public static void arrangeStudents(Student[] students) {
        int low = 0;
        int high = students.length - 1;

        // Loop through the students array and arrange them based on GPA
        while (low < high) {
            if (students[low].getGpa() >= 96 && students[high].getGpa() < 96) {
                /
                Student temp = students[low];
                students[low] = students[high];
                students[high] = temp;
                low++;
                high--;
            } else if (students[low].getGpa() < 96) {
                low++;
            } else if (students[high].getGpa() >= 96) {
                high--;
            }
        }
    }

    // Additional method to print Dean's List students (those with GPA >= 96)
    public static void printDeanList(Student[] students) {
        System.out.println("Dean's List Students (GPA >= 96):");
        for (int i = 0; i < students.length; i++) {
            if (students[i].getGpa() >= 96) {
                System.out.println("Name: " + students[i].getName() + ", GPA: " + students[i].getGpa());
            }
        }
        System.out.println();
    }

    // Main method to run the program
    public static void main(String[] args) {
        try {
            // Load the students from the file
            Student[] students = loadFromFile("StudentData.txt");

            // Arrange students so that Dean's List students are at the end
            arrangeStudents(students);

         
            System.out.println("All Students:");
            for (int i = 0; i < students.length; i++) {
                System.out.println("ID: " + students[i].getId());
                System.out.println("Name: " + students[i].getName());
                System.out.println("GPA: " + students[i].getGpa());
                System.out.println();
            }

         
            printDeanList(students);

        } catch (IOException e) {
            System.out.println("Error reading the file.");
        }
    }
}
