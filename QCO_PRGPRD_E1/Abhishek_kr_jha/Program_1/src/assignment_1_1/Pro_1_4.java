/**
 * 
 */
package assignment_1_1;

import java.util.Scanner;

/**
 * WAJP to calculate the GCD of two given natural number
 */
public class Pro_1_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s_obj = new Scanner(System.in);
		System.out.println("enter the value of num_1:- ");
		int num_1 = s_obj.nextInt();
		System.out.println("enter the value of num_2:- ");
		int num_2 = s_obj.nextInt();
		
		// s2: find largest
		int largest = num_1 > num_2 ? num_1 : num_2;
		
		// s3: initialize hcf = 1
		int hcf = 1;
		
		// s4: find hcf from i = largest/2 upto 2
		for(int i = largest/2; i >= 2; i--) {
			//check for cf
			if (num_1 % i == 0 && num_2 % i == 0) {
				hcf = i;
				break;
			} // end of if
		} // end of for
		System.out.println(hcf);
		
		

	}
	

}
