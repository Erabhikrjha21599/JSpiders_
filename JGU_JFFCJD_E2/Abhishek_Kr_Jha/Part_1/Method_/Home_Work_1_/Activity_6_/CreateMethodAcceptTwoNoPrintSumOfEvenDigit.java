package Abhishek_Kr_Jha.Part_1.Method_.Home_Work_1_.Activity_6_;

public class CreateMethodAcceptTwoNoPrintSumOfEvenDigit {
    public static int returnProduct(int number) {

        int sum_of_even_digit = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {

                sum_of_even_digit += digit;
            }
            number /= 10;
        }
        return sum_of_even_digit;

    }

    public static void main(String[] args) {
        returnProduct(123456);
        System.out.println(returnProduct(123456));

    }
}
