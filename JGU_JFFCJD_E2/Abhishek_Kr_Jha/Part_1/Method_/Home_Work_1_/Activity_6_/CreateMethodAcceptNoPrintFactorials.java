package Abhishek_Kr_Jha.Part_1.Method_.Home_Work_1_.Activity_6_;


public class CreateMethodAcceptNoPrintFactorials {
     public static int factorialOfNumber(int number) {
       int factorial = 1;
        for (int i = 1; i <= number; ++i) {
            factorial *= i;
        }

        

        return factorial;
    }

    public static void main(String[] args) {
        System.out.println(factorialOfNumber(5));
        factorialOfNumber(5);
    }
}
