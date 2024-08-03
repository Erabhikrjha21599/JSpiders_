package Abhishek_Kr_Jha.Part_1.Method_.Class_Work_1_;

public class PrimeNumber {

    public static void primeNumber1(int number) {
        boolean b = true;
        for (int i = 2; i <= number / 2; i++) {

            if (number % 2 == 0) {

                b = false;
                break;

            }
        }

        if (b) {
            System.out.println(number + " " + "number is prime");
        } else {
            System.out.println(number + " " + "number is not prime");

        }

    }

    public static void primeNumber2(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.println("number is not prime");
                break;
            } else {
                System.out.println("number is prime");
                break;
            }
        }
    }

    public static void evenOdd(int number) {
        if ((number & 1) == 1) {
            System.out.println("number is odd");

        } else {
            System.out.println("number is even");
        }

    }

    public static void evenOdd1(int number) {
        if (number % 2 == 0) {
            System.out.println("number is even");

        } else {
            System.out.println("number is odd");

        }
    }

    public static void evenOdd2(int number) {
        String evenOdd = ((number & 1) == 0) ? "even" : "odd";
        System.out.println(evenOdd);
    }

    public static void main(String[] args) {

        // primeNumber1(7);
        // primeNumber1(6);
        // primeNumber2(6);
        // primeNumber2(7);
        // evenOdd(7);
        // evenOdd1(7);
        evenOdd2(6);
        evenOdd2(7);
        


    }

}
