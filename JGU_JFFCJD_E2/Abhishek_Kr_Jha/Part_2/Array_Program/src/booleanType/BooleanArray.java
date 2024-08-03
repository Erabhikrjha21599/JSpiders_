/**
 * 
 */
package booleanType;

import java.util.Scanner;

/**
 * 
 */
public class BooleanArray {
	
	public static void array() {
		Scanner scan_bta = new Scanner(System.in);

		System.out.println("enter the size of array:");
		int size_of_array = scan_bta.nextInt();

		System.out.println("enter" + " " +  size_of_array + " " + "element");

		boolean[] user_array = new boolean[size_of_array];

		for (int i = 0; i < user_array.length; i++) {
			System.out.print("enter element" + " " + (i + 1) + " " + ":");
			user_array[i] = scan_bta.nextBoolean();

		}
		
		System.out.println("Print the reference variable of array:" + user_array);
		
		System.out.println("Print the no. of element present in the array:" + user_array.length);
		
		for (int i = 0; i < user_array.length; i++) {
			System.out.println("element at index " + i + ":" + user_array[i]);
		}
		
		int i = 0;
		while(i < user_array.length) {
			System.out.println("element at index " + i + ":" + user_array[i]);
			i++;
		}
		
		scan_bta.close();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		array();

	}

}
