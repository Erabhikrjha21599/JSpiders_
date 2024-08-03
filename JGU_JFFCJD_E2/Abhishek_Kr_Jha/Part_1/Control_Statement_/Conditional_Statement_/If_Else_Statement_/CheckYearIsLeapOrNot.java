package Abhishek_Kr_Jha.Part_1.Control_Statement_.Conditional_Statement_.If_Else_Statement_;

public class CheckYearIsLeapOrNot {
    public static void main(String[] args) {
        int i1 = 2024;
        if (i1%4==0 && i1%100!=0) {
            System.out.println("year is leap year");
            
        } else {
            System.out.println("year is not leap year");
            
        }
    }
}
