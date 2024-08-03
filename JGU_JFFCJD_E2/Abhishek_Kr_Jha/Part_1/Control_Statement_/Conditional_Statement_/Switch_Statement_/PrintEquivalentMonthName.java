package Abhishek_Kr_Jha.Part_1.Control_Statement_.Conditional_Statement_.Switch_Statement_;

//import java.util.Scanner;

public class PrintEquivalentMonthName {
    public static void main(String[] args) {
        // Scanner myScanner = new Scanner(System.in);
        // System.out.println("enter number:-");
        // int month = myScanner.nextInt();

        int month = 1;
        switch (month) {
            case 1: {
                System.out.println("january");
                break;

            }
            case 2: {
                System.out.println("february");
                break;

            }
            case 12: {
                System.out.println("december");
                break;

            }

            default: {
                System.out.println("invalid");
                break;

            }
        }
    }
}
