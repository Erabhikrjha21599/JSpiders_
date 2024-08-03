package classProgramTest;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Remove spaces from the string
        String noSpaceString = input.replaceAll("\\s+", "");
        
        // Check if the string without spaces is a palindrome
        if (isPalindrome(noSpaceString)) {
            System.out.println("The string \"" + input + "\" is a palindrome (ignoring spaces).");
        } else {
            System.out.println("The string \"" + input + "\" is not a palindrome (ignoring spaces).");
        }
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
