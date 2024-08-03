package Abhishek_Kr_Jha.Part_1.Control_Statement_.Conditional_Statement_.If_Else_Statement_;

public class CheckCharIsDigitOrNot {
    public static void main(String[] args) {
        char c1 = 'J';
        if (c1>='A' && c1<='Z' || c1>='a' && c1<='z') {
            System.out.println("char is not digit");
            
        } else {
            System.out.println("char is digit");
            
        }
    }
}
