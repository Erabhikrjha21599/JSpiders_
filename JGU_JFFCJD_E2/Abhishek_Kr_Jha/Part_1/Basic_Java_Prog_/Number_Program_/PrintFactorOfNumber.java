package Abhishek_Kr_Jha.Part_1.Basic_Java_Prog_.Number_Program_;

public class PrintFactorOfNumber {
    public static void main(String[] args) {
        int number = 4;

        for (int i = 1; i <= number ; i++) {
            if (number%i==0) {
                System.out.println(i);
                
            }
            
        }
    }
}
