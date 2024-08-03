/**
 * 
 */
package arrayProgram;

/**
 * 
 */
public class ArrayPro7 {
	
	// create a method 
	public static int array() {
		int[] arr = {3, 7, 1, 8, 2, 3};
		int k = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != 3) {
				k++;
			}
		}
		System.out.println(k);
		
		return k;
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		array();
		
		

	}

}
