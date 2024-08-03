package Abhishek_Kr_Jha.Part_1.Method_.Home_Work_1_.Activity_6_;


public class CreateMethodAcceptNoPeintFactor {

    public static int factorsOfNumber(int number) {
       

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }

        return number;
    }


    public static void main(String[] args) {
        factorsOfNumber(12);
    }
}

