/**
 * 
 */
package program_1_0;

import java.util.Scanner;

/**
 * 
 */
public class Pro_1_0 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int count = 0;
		int num1 = s.nextInt();
		if (num1 % 2 == 0) {
			count++;
		}
		int num2 = s.nextInt();
		count = num2 % 2 == 0 ? count + 1: count;
		int num3 = s.nextInt();
		count = num3 % 2 == 0 ? count + 1 : count;

	}

}
