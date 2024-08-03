/**
 * 
 */
package assignmnet;

import java.util.Scanner;

/**
 * 
 */
public class ArrayQ2 {

	Scanner scan_s = new Scanner(System.in);

	public void evenIndex() {
		System.out.println("enter the size of 1st array");
		int size_of_1starray = scan_s.nextInt();

		int[] user_1starray = new int[size_of_1starray];

		System.out.println("enter " + size_of_1starray + " element: ");

		// take all the element from user through loop
		for (int i = 0; i < user_1starray.length; i++) {
			System.out.print("enter element " + (i + 1) + " : ");
			user_1starray[i] = scan_s.nextInt();

		}


		System.out.println("print all the element of 1st array: ");
		// print all element through loop
		for (int i = 0; i < user_1starray.length; i++) {
			System.out.println("element at index " + i + " : " + user_1starray[i]);

		}


		// create another array to store 1st array element inside it

		System.out.println("enter the size of 2nd array");
		int size_of_2ndarray = scan_s.nextInt();

		int[] user_2ndarray = new int[size_of_2ndarray];

//		System.out.println("enter " + size_of_2ndarray + " element: ");
//
//		// take all the element from user through loop
//		for (int i = 0; i < user_2ndarray.length; i++) {
//			System.out.print("enter element " + (i + 1) + " : ");
//			user_2ndarray[i] = scan_s.nextInt();
//
//		}
		
		user_2ndarray = user_1starray;


		System.out.println("print all the element of 2nd array: ");
		// print all element through loop
		for (int i = user_2ndarray.length -1; i >= 0; i--) {
			System.out.println("element at index " + i + " : " + user_2ndarray[i]);

		}


	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayQ2 scan_c = new ArrayQ2();
		
		scan_c.evenIndex();


	}

}
