package assignment_1_1;

import java.util.Scanner;

public class Pro_1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Define the timetable
        String[] games = {
            "Monday: Basketball",
            "Tuesday: Soccer",
            "Wednesday: Volleyball",
            "Thursday: Tennis",
            "Friday: Baseball",
            "Saturday: Swimming",
            "Sunday: Rest day"
        };

        // the user to enter the day of the week
        System.out.println("Enter the day of the week (e.g., Monday, Tuesday, etc.):");
        String dayOfWeek = scanner.nextLine().trim();

        // Suggest the game based on the day of the week
        String suggestion = getGameSuggestion(dayOfWeek, games);
        if (suggestion != null) {
            System.out.println("Today you should play: " + suggestion);
        } else {
            System.out.println("Invalid day of the week entered.");
        }

        scanner.close();
    }

    // Method to get game suggestion based on the day of the week
    private static String getGameSuggestion(String dayOfWeek, String[] games) {
        for (String game : games) {
            if (game.toLowerCase().startsWith(dayOfWeek.toLowerCase())) {
                return game.split(": ")[1];
            }
        }
        return null;
		

	}

}





