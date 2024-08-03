/**
 * 
 */
package assignment_1_1;

/**
 * 
 */
public class Prog_1_5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4};
		int[] arrr = {0, 0, 0, 0};
		
		for(int i = 0; i < arr.length; i++) {
			int mul = 1;
			for(int j = 0; j < arr.length; j++) {
				if (i != j) {
					mul = mul*arr[j];
				}
				arrr[i] = mul;
			}
				
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arrr[i]);
		}

	}

}
