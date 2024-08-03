package Abhishek_Kr_Jha.Part_1.Method_.Class_Work_1_;

public class FactorOfNumber {

    public static int facotOfNumber(int number) {

        for (int i = 1; i <= number; ++i) {
            if (number % i == 0) {
                System.out.println(i);

            }

        }

        return 0;
    }

    public static void main(String[] args) {
        facotOfNumber(6);
    }
}
