package Abhishek_Kr_Jha.Part_1.Method_.Class_Work_1_;

public class LowerCharToUpperChar {

    public static void lowerToUpper(char ch_1) {
        if (ch_1 >= 97 && ch_1 <= 122) {
            ch_1 = (char) (ch_1 - 32);
            System.out.println(ch_1);
        }
        else if (ch_1 >= 65 && ch_1 <= 90) {
            ch_1 = (char) (ch_1 + 32);
            System.out.println(ch_1);
            
        } else {
            
        }

    }

    public static void main(String[] args) {
        lowerToUpper('A');
    }
}
