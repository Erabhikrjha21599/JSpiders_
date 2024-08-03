/**
 * 
 */
package loopingStatement;

import java.util.Scanner;

/**
 * WAJP to print the factorial of any numner 
 */
public class Pro_1_0 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter the value of num");
		int num = s.nextInt();
		int result = 1;
		for(int i = 2; i <= num; i++) {
			result *= i;
			
		}
		System.out.println(result);
		
		s.close();

	}

}
