/**
 * 
 */
package arrayProgram;

/**
 * WAJP to return the largest element in the given integer array
 */
public class ArrayPro4 {
	
	// Create a method to return the largest element present in the array
	public static int largestElement(int[] array) {
		// S1: create a large type variable 
		int largest = array[0];
		
		// S2: using loop 
		for(int i = 1; i < array.length; i++) {
			if(array[i] > largest) {
				largest = array[i];
			}
		}
		
		return largest;
		
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,2,3,4,5,6,15};
		System.out.println(largestElement(a));

	}

}
