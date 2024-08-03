package classProgramTest;

//public class ArrayListExample {
//
//}



import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList to store Person objects
        ArrayList<Person> people = new ArrayList<>();

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Add Person objects to the ArrayList
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            System.out.print("Enter age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            // Create a new Person object and add it to the ArrayList
            people.add(new Person(name, age));
        }

        // Print all Person objects in the ArrayList
        System.out.println("People in the list:");
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
