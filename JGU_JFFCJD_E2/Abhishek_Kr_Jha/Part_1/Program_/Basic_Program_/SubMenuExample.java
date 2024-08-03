import java.util.Scanner;

public class SubMenuExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create the main menu
        System.out.println("Main Menu");
        System.out.println("1. Submenu 1");
        System.out.println("2. Submenu 2");
        System.out.println("3. Exit");

        // Get the user's choice
        int choice = scanner.nextInt();

        // Switch on the user's choice
        switch (choice) {
            case 1:
                // Display the submenu for Submenu 1
                System.out.println("Submenu 1");
                System.out.println("1. Option 1");
                System.out.println("2. Option 2");
                System.out.println("3. Back");

                // Get the user's choice for the submenu
                int subChoice = scanner.nextInt();

                // Switch on the user's choice for the submenu
                switch (subChoice) {
                    case 1:
                        // Execute Option 1
                        System.out.println("You selected Option 1");
                        break;
                    case 2:
                        // Execute Option 2
                        System.out.println("You selected Option 2");
                        break;
                    case 3:
                        // Go back to the main menu
                        break;
                    default:
                        // Invalid choice
                        System.out.println("Invalid choice");
                        break;
                }

                break;
            case 2:
                // Display the submenu for Submenu 2
                System.out.println("Submenu 2");
                System.out.println("1. Option 1");
                System.out.println("2. Option 2");
                System.out.println("3. Back");

                // Get the user's choice for the submenu
                int subChoice = scanner.nextInt();

                // Switch on the user's choice for the submenu
                switch (subChoice) {
                    case 1:
                        // Execute Option 1
                        System.out.println("You selected Option 1");
                        break;
                    case 2:
                        // Execute Option 2
                        System.out.println("You selected Option 2");
                        break;
                    case 3:
                        // Go back to the main menu
                        break;
                    default:
                        // Invalid choice
                        System.out.println("Invalid choice");
                        break;
                }

                break;
            case 3:
                // Exit the program
                System.out.println("Exiting program...");
                System.exit(0);
                break;
            default:
                // Invalid choice
                System.out.println("Invalid choice");
                break;
        }

        scanner.close();
    }
}
