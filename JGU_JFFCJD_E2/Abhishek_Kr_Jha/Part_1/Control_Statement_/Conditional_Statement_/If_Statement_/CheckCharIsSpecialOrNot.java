package Abhishek_Kr_Jha.Part_1.Control_Statement_.Conditional_Statement_.If_Statement_;

public class CheckCharIsSpecialOrNot {
    public static void main(String[] args) {
        char c1 = '@';
        if (c1>=0 && c1<=9 || c1>='a' && c1<='z' || c1>='A' && c1<='Z') {
            System.out.println("char is not special char");
            
        } 
    }
}
