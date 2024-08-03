package Abhishek_Kr_Jha.Part_1.Method_.Home_Work_1_.Activity_6_;

public class CreateMethodAcceptTwoNoReturnSumOfDigit {

    public static int returnSum(int number) {

        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        return sum;
        
    }

        

    public static void main(String[] args) {
        System.out.println(returnSum(123));
        
    }
    
}
