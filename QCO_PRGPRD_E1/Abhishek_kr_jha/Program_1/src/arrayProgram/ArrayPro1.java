/**
 * 
 */
package arrayProgram;

import java.util.Scanner;

/**
 * WAJP to create an array and take value from user 
 */
public class ArrayPro1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("enter the size of array:- ");
		int size_of_arr = s.nextInt();
		int[] arr = new int[size_of_arr];
		
		// enter element into array
		for(int index = 0; index < arr.length; index++) {
			arr[index] = s.nextInt();
			
		}
		
		// display array
		for(int index = 0; index < arr.length; index++) {
			System.out.print(arr[index] + ", ");
			
		}
		

		s.close();
	}

}
