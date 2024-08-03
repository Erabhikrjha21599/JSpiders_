package Abhishek_Kr_Jha.Part_1.Method_.Home_Work_1_.Activity_6_;

public class CreateMethodAcceptTwoNoReturnProductOfDigit {

    public static int returnProduct(int number) {

        int product = 1;
        while (number > 0) {
            int digit = number % 10;
            product *= digit;
            number /= 10;
        }
        return product;
        
    }

        

    public static void main(String[] args) {
        System.out.println(returnProduct(123));
        
    }
}
