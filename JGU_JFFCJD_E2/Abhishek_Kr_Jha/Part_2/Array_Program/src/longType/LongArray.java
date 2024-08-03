/**
 * 
 */
package longType;

import java.util.Scanner;

/**
 * 
 */
public class LongArray {
	public static void longTypeArray() {
		Scanner scan_lta = new Scanner(System.in);
		
		System.out.println("enter the size of array: ");
		int size_of_array = scan_lta.nextInt();
		
		long[] user_array = new long[size_of_array];
		
		System.out.println("enter " + size_of_array + " element: ");
		
		for (int i = 0; i < user_array.length; i++) {
			System.out.print("enter element " + (i + 1) + " :");
			user_array[i] = scan_lta.nextLong();
			
		}
		
		System.out.println("Print the reference variable of array:" + user_array);

		System.out.println("Print the no. of element present in the array:" + user_array.length);
		
		for (int i = 0; i < user_array.length; i++) {
			System.out.println("element at indext " + i + " :" + user_array[i]);
			
			
		}
		
		scan_lta.close();
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		longTypeArray();

	}

}
