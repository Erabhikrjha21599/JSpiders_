/**
 * 
 */
package program_1_1;

import java.util.Scanner;

/**
 * 
 */
public class Pro_1_1_LCM {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s_obj = new Scanner(System.in);
		
		// s1: read 2 numbers
		System.out.println("enter the value of num1:- ");
		int num1 = s_obj.nextInt();
		
		System.out.println("enter the value of num2:- ");
		int num2 = s_obj.nextInt();
		
		// s2: find largest number
//		int largest = num1 > num2 ? num1 : num2;
		int i = num1 > num2 ? num1 : num2;
		
		// s3: find LCM
//		int i = largest;
		
//		if (i % num1 == 0 && i % num2 == 0) {
//			System.out.println(i);
//			break;
//		}
//		while (true) {
//			if (i % num1 == 0 && i % num2 == 0) {
//				// i is a LCM of num1 & num2
//				System.out.println(i);
//				// stop the loop
//				break;
//			}
//			i++;
//		}
		
		
		for(; ; i++) {
			if (i % num1 == 0 && i % num2 == 0) {
				// i is a LCM of num1 & num2
				System.out.println(i);
				// stop the loop
				break;
			}
		
		}
		

	}
	
	public static void name(int num1, int num2) {
		
	}

}
