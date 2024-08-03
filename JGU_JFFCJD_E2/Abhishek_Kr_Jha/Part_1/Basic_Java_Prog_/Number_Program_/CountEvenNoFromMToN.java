package Abhishek_Kr_Jha.Part_1.Basic_Java_Prog_.Number_Program_;

public class CountEvenNoFromMToN {
    public static void main(String[] args) {
        int i = 2;
        for (int number = 1; number <= 10; number++) {

            if (number % i == 0) {
                System.out.println("even number form 1 to 10:-" + number);
            }
        }

    }
}
