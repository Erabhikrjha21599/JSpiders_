/**
 * 
 */
package numberProgram;

/**
 * 
 */
public class AllNumberProgram {

	public static void separate() {
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    public static void findDigit(int number) {
        int digit = 0;
        while (number > 0) {
            digit = number % 10;

            number /= 10;

        }
        System.out.print(digit);

    }

    public static void sumOfDigit(int number) {
        int sum_of_digit = 0;
        while (number > 0) {
            int digit = number % 10;
            sum_of_digit += digit;
            number /= 10;
        }
        System.out.println(sum_of_digit);
    }

    public static void sumOfSqrOfDigit(int number) {
        int sum_of_sqr_of_digit = 0;
        while (number > 0) {
            int digit = number % 10;
            sum_of_sqr_of_digit += digit * digit;
            number /= 10;
        }
        System.out.println(sum_of_sqr_of_digit);
    }

    public static void sumOfCubeOfDigit(int number) {
        int sum_of_cube_of_digit = 0;
        while (number > 0) {
            int digit = number % 10;
            sum_of_cube_of_digit += digit * digit * digit;
            number /= 10;
        }
        System.out.println(sum_of_cube_of_digit);
    }

    public static void productOfDigit(int number) {
        int product_of_digit = 1;
        while (number > 0) {
            int digit = number % 10;
            product_of_digit *= digit;
            number /= 10;
        }
        System.out.println(product_of_digit);
    }

    public static void productOfSqrOfDigit(int number) {
        int product_of_sqr_of_digit = 1;
        while (number > 0) {
            int digit = number % 10;
            product_of_sqr_of_digit *= digit * digit;
            number /= 10;
        }
        System.out.println(product_of_sqr_of_digit);
    }

    public static void productOfCubeOfDigit(int number) {
        int product_of_cube_of_digit = 1;
        while (number > 0) {
            int digit = number % 10;
            product_of_cube_of_digit *= digit * digit * digit;
            number /= 10;
        }
        System.out.println(product_of_cube_of_digit);
    }

    public static void factorsOfNumber(int number) {
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                System.out.println(i);

            }
        }
    }

    public static void factorialsOfNumber(int number) {
        int factorials = 1;
        for (int i = 1; i <= number; i++) {
            factorials *= i;
        }
        System.out.println(factorials);
    }

    ///////////////////// NUMBER_PROGRAM/////////////////////////

    public static void reverseNumber(int number) {
        int reverse_number = 0;
        while (number > 0) {
            int digit = number % 10;
            reverse_number = reverse_number * 10 + digit;
            number /= 10;

        }
        System.out.println(reverse_number);

    }

    public static void palindrome(int number) {
        int m = number;
        int reverse_number = 0;
        while (number > 0) {
            int digit = number % 10;
            reverse_number = reverse_number * 10 + digit;
            number /= 10;
        }
        System.out.println(reverse_number);

        if (reverse_number == m) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }

    }

    public static void spyNumber(int number) {
        int sum_of_digit = 0;
        int product_of_digit = 1;
        while (number > 0) {
            int digit = number % 10;
            sum_of_digit += digit;
            product_of_digit *= digit;
            number /= 10;
        }

        if (sum_of_digit == product_of_digit) {
            System.out.println("spy number");
        } else {
            System.out.println("not spy number");
        }
    }

    public static void specialNumber(int number) {
        int m = number;
        int sum_of_digit = 0;
        int product_of_digit = 1;
        while (number > 0) {
            int digit = number % 10;
            sum_of_digit += digit;
            product_of_digit *= digit;
            number /= 10;
        }
        int sum_plus_product = sum_of_digit + product_of_digit;

        if (sum_plus_product == m) {
            System.out.println("special number");
        } else {
            System.out.println("not special number");
        }
    }

    public static void nivenOrHarshadNumber(int number) {
        int m = number;
        int sum_of_digit = 0;
        while (number > 0) {
            int digit = number % 10;
            sum_of_digit += digit;
            number /= 10;
        }

        if (m % sum_of_digit == 0) {
            System.out.println("niven or harshad number");
        } else {
            System.out.println("not niven or harshad number");
        }
    }

    public static void duckNumber(int number) {
        int m = number;
        int count = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit == 0) {
                count++;
            }
            number /= 10;
        }

        if (count > 0) {
            System.out.println("duck number");
        } else {
            System.out.println("not duck number");
        }
    }

   

/**
 * @param args
 *
public static void main(String[] args) {
	// TODO Auto-generated method stub
	//AllNumberProgram.peterson(145);
	
	  findDigit(123);
        separate();

        sumOfDigit(123);
        separate();

        sumOfSqrOfDigit(123);
        separate();

        sumOfCubeOfDigit(123);
        separate();

        productOfDigit(123);
        separate();

        productOfSqrOfDigit(123);
        separate();

        productOfCubeOfDigit(123);
        separate();

        factorsOfNumber(6);
        separate();

        factorialsOfNumber(5);
        separate();
        ////////////////// number program ////////////////

        System.out.println("number program");
        reverseNumber(123);
        separate();

        palindrome(121);
        separate();

        spyNumber(123);
        separate();

        specialNumber(59);
        separate();

        nivenOrHarshadNumber(156);
        separate();

        duckNumber(2060);
        separate();
*/

}
