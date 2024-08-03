package Abhishek_Kr_Jha.Part_1.Control_Statement_.Conditional_Statement_.Switch_Statement_;
//import java.util.Scanner;

public class PrintHowManyDayInMonth {
    public static void main(String[] args) {
        // Scanner myScanner = new Scanner(System.in);
        // System.out.println("enter the number");
        // int days = myScanner.nextInt();

        int days = 1;
        switch (days) {
            case 1: {
                System.out.println("31 days");
                break;
            }
            case 8: {
                System.out.println("31 days");
                break;
            }
            case 2: {
                System.out.println("28 or 29 days");
                break;
            }
            case 4: {
                System.out.println("30 days");
                break;
            }
            case 9: {
                System.out.println("30 days");
                break;
            }
            default: {
                System.out.println("invalid");
                break;
            }
        }
    }
}
