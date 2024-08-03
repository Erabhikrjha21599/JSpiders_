package Abhishek_Kr_Jha.Part_1.Control_Statement_.Conditional_Statement_.Switch_Statement_;
//import java.util.Scanner;

public class PrintEquivalentDayName {
    public static void main(String[] args) {
        // Scanner myScanner = new Scanner(System.in);
        // System.out.println("enter the number:-");
        // int day = myScanner.nextInt();

        int day = 1;
        switch (day) {
            case 1: {
                System.out.println("sunday");
                break;
            }
            case 2: {
                System.out.println("monday");
                break;
            }
            case 7: {
                System.out.println("saturday");
                break;
            }
            default: {
                System.out.println("invalid");
                break;

            }
        }
    }
}
