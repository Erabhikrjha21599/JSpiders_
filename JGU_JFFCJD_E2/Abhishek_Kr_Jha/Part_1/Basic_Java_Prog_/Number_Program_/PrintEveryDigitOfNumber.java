package Abhishek_Kr_Jha.Part_1.Basic_Java_Prog_.Number_Program_;

public class PrintEveryDigitOfNumber {
    public static void main(String[] args) {
        int number = 12345;
        while (number>0) {
            int digit = number%10;
            System.out.println(digit);
            number/=10;
        }
        
    }
}
