/**
 * 
 */
package charType;

/**
 * 
 */

import java.util.Scanner;
public class CharArray {

	public static void charTypeArray() {
		Scanner scan_cta = new Scanner(System.in);

		System.out.println("enter the array size: ");
		int size_of_array = scan_cta.nextInt();

		System.out.println("enter " + size_of_array + " element: ");

		char[] user_array = new char[size_of_array];
		
		

		for (int i = 0; i < user_array.length; i++) {
			System.out.print("enter element" + " " + (i + 1) + " " + ":");
			user_array[i] = scan_cta.next().charAt(0);

		}

//		System.out.println("Print the reference variable of array:" + user_array);

		System.out.println("Print the no. of element present in the array:" + user_array.length);

		for (int i = 0; i < user_array.length; i++) {
			System.out.println("element at index " + i + ":" + user_array[i]);
			
		}
		
		int i = 0;
		while(i < user_array.length) {
			System.out.println("element at index " + i + ":" + user_array[i]);
			i++;
		}

		scan_cta.close();


	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		charTypeArray();

	}

}
