package classProgramTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentMapExample {
    public static void main(String[] args) {
        // Create a Map to store Student objects with their ID as the key
        Map<Integer, Student> studentMap = new HashMap<>();

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Add Student objects to the Map
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter student ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            System.out.print("Enter student name: ");
            String name = scanner.nextLine();

            System.out.print("Enter student age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            // Create a new Student object and add it to the Map
            studentMap.put(id, new Student(id, name, age));
        }

        // Print all Student objects in the Map
        System.out.println("Students in the map:");
        for (Map.Entry<Integer, Student> entry : studentMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", " + entry.getValue());
        }
    }
}
