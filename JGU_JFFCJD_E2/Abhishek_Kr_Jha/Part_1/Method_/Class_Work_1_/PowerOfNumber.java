package Abhishek_Kr_Jha.Part_1.Method_.Class_Work_1_;

public class PowerOfNumber {

    public static void powerOfNumber(int base, int exponent) {
        // int base;
        // int exponent;
        int retsult =1 ;

        for (int i = 0; i < exponent; ++i) {
            retsult *= base;
        }
        System.out.println(retsult);
        
    }
    public static void main(String[] args) {
        powerOfNumber(2, 3);
        
    }
}
