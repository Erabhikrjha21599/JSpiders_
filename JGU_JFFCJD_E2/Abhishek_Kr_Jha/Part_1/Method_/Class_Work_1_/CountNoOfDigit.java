package Abhishek_Kr_Jha.Part_1.Method_.Class_Work_1_;

public class CountNoOfDigit {

    public static void countNoOfDigit(int num) {

        int count_no_of_digit = 0;
        while (num > 0) {
            int last_digit = num /= 10;
            count_no_of_digit++;
        }
        System.out.println(count_no_of_digit);
        
    }
    public static void main(String[] args) {
        countNoOfDigit(1234567);
        
    }
}
