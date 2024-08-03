package Abhishek_Kr_Jha.Part_1.Control_Statement_.Conditional_Statement_.Switch_Statement_;

//import java.util.Scanner;

public class PrintCharIsVowelOrConsonant {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Enter a character: ");
        // char c1 = scanner.next().charAt(0);

        char c1 = 'a';

        switch (c1) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(c1 + " is a vowel");
                break;
            case 'b':
            case 'c':
            case 'd':
            case 'f':
            case 'g':
            case 'h':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                System.out.println(c1 + " is a consonant");
                break;
            default:
                System.out.println(c1 + " is an invalid character");
        }
    }
}
