/**
 * 
 */
package loopingStatement;

import java.util.Scanner;

/**
 * WAJP to print the factor of any number 
 */
public class Pro_1_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s_obj = new Scanner(System.in);
		System.out.println("enter the value of num:-");
		int num = s_obj.nextInt();
		int count = 2;
		
		System.out.println(1 + ",");
		for(int i = 2; i < num; i++) {
			if (num % i == 0) {
				System.out.println(1 + ",");
				count++;
			}
		}
		System.out.println(num);
		System.out.println(count);
		
		s_obj.close();

	}

}
