/**
 * 
 */
package shortType;

import java.util.Scanner;

/**
 * 
 */
public class ShortArray {
	public static void shortTypeArray() {
		Scanner scan_sta = new Scanner(System.in);

		System.out.println("enter the size of array: ");
		int size_of_array = scan_sta.nextInt();

		short[] user_array = new short[size_of_array];

		System.out.println("enter " + size_of_array + " element: ");

		for (int i = 0; i < user_array.length; i++) {
			System.out.print("enter element " + (i + 1) + " :");
			user_array[i] = scan_sta.nextShort();

		}

		System.out.println("Print the reference variable of array:" + user_array);

		System.out.println("Print the no. of element present in the array:" + user_array.length);

		for (int i = 0; i < user_array.length; i++) {
			System.out.println("element at indext " + i + " :" + user_array[i]);


		}

		scan_sta.close();

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shortTypeArray();
	}

}