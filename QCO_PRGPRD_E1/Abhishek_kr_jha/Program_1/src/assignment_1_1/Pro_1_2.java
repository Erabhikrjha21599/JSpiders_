/**
 * 
 */
package assignment_1_1;

import java.util.Scanner;

/**
 * WAJP to check the number is prime or not 
 */
public class Pro_1_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s_obj = new Scanner(System.in);
		System.out.println("enter the number:- ");
		int num = s_obj.nextInt();
		int count = 2; // 1 and num itself is a factor
		
		for(int i = 2; i <= num/2; i++) {
			if(num % i == 0) {
				count++;
			}
			
		}
		// check if it is prime
		if (count == 2) {
			System.out.println("it is prime");
		}
		else {
			System.out.println("it is not prime");
		}
		
		
		
		
		s_obj.close();

	}

}
