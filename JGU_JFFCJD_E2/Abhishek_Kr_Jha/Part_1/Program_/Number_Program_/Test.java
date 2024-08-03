public class Test {

    public static void digit(int number) {
        int digit_of_no = 0;
        while (number > 0) {
            int digit = number % 10;
            digit_of_no = digit;
            System.out.print(digit_of_no);
            number /= 10;
        }
        System.out.println();
    }

    public static void digit1(int number) {
        for(; number>0; ){
            int digit_of_no = number % 10;
            System.out.print(digit_of_no);
            number /= 10;
        }
    }

    public static void main(String[] args) {
        digit(123);
        digit1(123);
    }
}
