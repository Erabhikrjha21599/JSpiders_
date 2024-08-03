/**
 * 
 */
package assignmnet;

import java.util.Scanner;

/**
 * 
 */
public class ArrayQ3 {
	
Scanner scan_s = new Scanner(System.in);
	
	public void even() {
		System.out.println("enter the size of array");
		int size_of_array = scan_s.nextInt();
		
		int[] user_array = new int[size_of_array];
		
		System.out.println("enter " + size_of_array + " element: ");
		
		// take all the element from user through loop
		for (int i = 0; i < user_array.length; i++) {
			System.out.print("enter element " + (i + 1) + " : ");
			user_array[i] = scan_s.nextInt();
			
		}
		
		
		System.out.println("print all digit index array element: ");
		// print all element through loop
		for (int i = 0; i < user_array.length; i++) {
			System.out.println("element at index " + i + " : " + user_array[i]);
			
		}
		
		
		System.out.println("print even digit index array element: ");
		// print all the even element through loop
		for (int i = 0; i < user_array.length; i++) {
			if (user_array[i] % 2 == 0) {
				System.out.println("element at index " + i + " : " + user_array[i]);
				
			}
			
		}
		
		
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayQ3 scan_c = new ArrayQ3();
		
		scan_c.even();

	}

}
