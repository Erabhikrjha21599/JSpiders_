/**
 * 
 */
package doubleType;

/**
 * 
 */

import java.util.Scanner;
public class DoubleArray {
	
	public static void doubleTypeArray() {
		Scanner scan_dta = new Scanner(System.in);
		
		System.out.println("enter the size of array: ");
		int size_of_array = scan_dta.nextInt();
		
		double[] user_array = new double[size_of_array];
		
		System.out.println("enter " + size_of_array + " element: ");
		
		for (int i = 0; i < user_array.length; i++) {
			System.out.print("enter element " + (i + 1) + " :");
			user_array[i] = scan_dta.nextDouble();
			
		}
		
		System.out.println("Print the reference variable of array:" + user_array);

		System.out.println("Print the no. of element present in the array:" + user_array.length);
		
		for (int i = 0; i < user_array.length; i++) {
			System.out.println("element at indext " + i + " :" + user_array[i]);
			
			
		}
		
		scan_dta.close();
		
	}
	
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doubleTypeArray();

	}

}
