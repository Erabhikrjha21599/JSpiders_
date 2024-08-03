/**
 * 
 */
package program_1_1;

import java.util.Scanner;

/**
 * 
 */
public class Pro_1_2_Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		// read 1 num 
		System.out.println("enter the value of num:- ");
		int num = s.nextInt();
		
		int temp = num;
		
		// initialize rev to 0
		// logic to reverse 
		int reverse = 0;
		while (num != 0) {
			int digit = num % 10;
			reverse = reverse * 10 + digit;
			num = num / 10;
			
			
		}
		System.out.println(reverse);
		
		// check for palindrome
		// compare original number with reversed number
//		System.out.println(num);
		
		if (temp == reverse) {
			System.out.println("it is palindrome");
		} else {
			System.out.println("it is not palindrome");

		}

	}

}
