/**
 * 
 */
package assignment_1_1;

import java.util.Scanner;

/**
 * design a method which can accept an int and 
 * return true if the int is prime,
 * false if int is not a prime
 */
public class Pro_1_3 {
	
	public static boolean isPrime(int num) {
		// count number of factors
		int count = 2; // 1 and n are already factors of n
		for(int i = 2; i <= num/2; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		return count == 2;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// call the method 
//		isPrime(3);
		
//		Scanner s_obj = new Scanner(System.in);
//		int num = s_obj.nextInt();
		
//		if (isPrime(num)) {
//			System.out.println("it is prime");
//		} else {
//			System.out.println("it is not prime");
//
//		}
		
		// print prime number between 10 and 20
		for(int i = 10; i <= 20; i++) {
			if (isPrime(i)) {
				System.out.println(i);
				
			}
		}
		
		
		

	}

}
