/**
 * 
 */
package intergerType;

import java.util.Scanner;

/**
 * 
 */



public class IntegerArray {


	public static void array1() {
		// TODO Auto-generated method stub
		int[] Array = new int[5];
		Array[0] = 10;
		Array[1] = 20;
		Array[2] = 30;
		Array[3] = 40;
		Array[4] = 50;
		
		System.out.println("print the reference variable of array:-" + Array);
		System.out.println("print no fo element present in array:-" + Array.length);
		
		 for (int i = 0; i < Array.length; i++) {
	            System.out.println("Element at index " + i + ": " + Array[i]);
	        }

	}
	
	public static void array2() {
        Scanner scan_ita = new Scanner(System.in);

        // Ask the user for the size of the array
        System.out.print("Enter the size of the array: ");
        int size_of_array = scan_ita.nextInt();

        // Create an array of the specified size
        int[] user_array = new int[size_of_array];

        // the user to enter values for each element of the array
        System.out.println("Enter " + size_of_array + " elements:");

        for (int i = 0; i < size_of_array; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            user_array[i] = scan_ita.nextInt();
        }
        
        // Print the reference variable of array
        System.out.println("Print reference variable of array:" + user_array );
        
        // Print the no. of element present in the array
        System.out.println("Print no. of element present in the array:" + user_array.length);

       

        // Print the elements of the array
        System.out.println("Elements of the array:");
        for (int i = 0; i < size_of_array; i++) {
            System.out.println("Element at index " + i + ": " + user_array[i]);
        }
        
        // Close the scanner to prevent resource leak
        scan_ita.close();
    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		array2();


	}

}
