package Abhishek_Kr_Jha.Part_1.Method_.Home_Work_1_.Activity_6_;

public class CreateMethodAcceptTwoNoPrintCountOfNo {

    public static int countDigit(int number) {

        // int number;

        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }

        System.out.println("The number has " + count + " digits.");

        return 0;

    }

    public static void main(String[] args) {

        countDigit(12345);
    }
}
