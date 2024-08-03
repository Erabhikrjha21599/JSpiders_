package classProgramTest;

//public class CharacterSequence {
//
//}



import java.util.HashMap;
import java.util.Scanner;

public class CharacterSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string from user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Find and print character sequence
        findCharacterSequence(input);
    }

    public static void findCharacterSequence(String str) {
        // HashMap to store character counts
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Convert string to character array
        char[] charArray = str.toCharArray();

        // Iterate over character array
        for (char c : charArray) {
            if (charCountMap.containsKey(c)) {
                // Increment count if character already exists in the map
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                // Add new character to the map with count 1
                charCountMap.put(c, 1);
            }
        }

        // Print character counts
        System.out.println("Character sequence in the given string:");
        for (char c : charCountMap.keySet()) {
            System.out.println(c + ": " + charCountMap.get(c));
        }
    }
}
