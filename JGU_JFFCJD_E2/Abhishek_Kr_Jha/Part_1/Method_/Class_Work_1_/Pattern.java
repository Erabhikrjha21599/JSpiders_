package Abhishek_Kr_Jha.Part_1.Method_.Class_Work_1_;

public class Pattern {
    public static void main(String[] args) {
        // m1();
        // m2();
        m2();
        m4(5,7 );
        m5(123);

    }

    public static void m1() {
        // char c1 = 'A';
        for (int i = 1; i <= 2; i++) {
            char c1 = 'A';
            for (int j = 1; j <= 3; j++) {
                System.out.print(c1);

            }
            System.out.println();
            c1++;

        }
        // c1++;

    }

    public static void m3() {
        // char c1 = 'A';
        for (int i = 1; i <= 2; i++) {
            char c1 = 'A';
            for (int j = 1; j <= 4; j++) {
                System.out.print(c1);
                c1++;

            }
            System.out.println();
            // c1++;

        }
        // c1++;

    }

    public static void m2() {
        // char c1 = 'A';
        for (int i = 1; i <= 2; i++) {
            char c1 = 'A';
            for (int j = 1; j <= 4; j++) {
                System.out.print(c1);
                c1++;

            }
            System.out.println();
            // c1++;

        }
        // c1++;

    }

    public static int m4(int a, int b) {
        int c = a * b;
        System.out.println(c);

        return c;

    }

    public static void m5(int number) {
        int digit = 0;
        while (number > 0) {
            int last_digit = number%=10;
            last_digit++;
            
        }
        System.out.println(digit);
        System.out.println(last_digit);
    }
}
