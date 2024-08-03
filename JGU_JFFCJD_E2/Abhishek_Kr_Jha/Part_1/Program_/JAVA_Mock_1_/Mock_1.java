package Abhishek_Kr_Jha.Part_1.Program_.JAVA_Mock_1_;

public class Mock_1 {

    public static void sumOfFactors(int number) {
        int sum_of_factors = 0;
        for (int factors = 1; factors < number; factors++) {
            if (number % factors == 0) {
                sum_of_factors += factors;

            }

        }
        System.out.println(sum_of_factors);
    }

    public static void swapThreeNo() {
        int a = 1, b = 2, c = 3;

        a = a + b + c;
        b = a - (b + c);
        c = a - (b + c);
        a = a - (b + c);

        System.out.println("a:" + a + "b:" + b + "c:" + c);
    }

    public static void rightTriangle() {

        for (char i = 'A'; i <= 'J'; i++) {
            for (char j = 'A'; j <= i; j++) {
                System.out.print(j);
                

            }
            System.out.println();
            
            

        }

    }

    public static void findLargestNo() {
        int a = 5, b = 10, c = 15;

        if (a > b) {
            System.out.println("a is greater than b");

        } else if (b > c) {
            System.out.println("b is greater than c");

        } else if (a > c) {
            System.out.println("a greater than c");

        } else if (c > b) {
            System.out.println("c is greater than b");

        } else if (b > a) {
            System.out.println("b is greater than a");
        }
    }

    public static void evenOdd(int number) {
        if ((number & 1) == 1) {
            System.out.println("odd");
        } else {
            System.out.println("even");
        }

    }

    public static void main(String[] args) {
        sumOfFactors(4);
        swapThreeNo();
        rightTriangle();
        findLargestNo();
        evenOdd(7);
    }
}
