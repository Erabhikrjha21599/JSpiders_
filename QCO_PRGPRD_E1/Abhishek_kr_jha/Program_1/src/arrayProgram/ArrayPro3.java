/**
 * 
 */
package arrayProgram;



/**
 * Count The Number Of Even Element In The Array 
 */
public class ArrayPro3 {
	
	// design a method 
	public static int evenCount(int[] array) {
		// S1: create count and initialize with 0
		int count = 0;
		// S2: 
		for(int i = 0; i < array.length; i++) {
			// check for even 
			if(array[i] % 2 == 0) {
				// increase the count
				count++;
			} // end 
		}
		
		return count;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = { 2, 3, 4, 5, 6};
		System.out.println(evenCount(a));
		
	
		
		
		

	}

}
