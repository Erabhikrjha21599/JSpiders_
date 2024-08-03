package Abhishek_Kr_Jha.Part_1.Control_Statement_.Conditional_Statement_.If_Else_Laddar_Statement_;
//import java.util.Scanner;

public class PrintHowManyDayInMonth {
    public static void main(String[] args) {
        // Scanner myScanner = new Scanner(System.in);
        // System.out.println("enter the value:-");
        // int i1 = myScanner.nextInt();

        int i1 = 1;

        if ((i1 == 1) || (i1 == 8)) {
            System.out.println("31 days");

        } else if (i1 == 2) {
            System.out.println("28 or 29 days");

        } else if (i1 == 4 || i1 == 9) {
            System.out.println("30 days");

        } else {
            System.out.println("invalid");
        }

    }
}
