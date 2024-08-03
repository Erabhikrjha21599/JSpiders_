package Abhishek_Kr_Jha.Part_1.Basic_Java_Prog_.Number_Program_;

public class PrintSumOfDigit {
    public static void main(String[] args) {
        int number = 12345;
        int sum_of_digit = 0;

        while (number != 0) {
            int lastDigit = number % 10;
            sum_of_digit += lastDigit;
            number /= 10;
        }
        System.out.println(sum_of_digit);
    }
}
