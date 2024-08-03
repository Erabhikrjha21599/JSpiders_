/**
 * 
 */
package assignmnet;

/**
 * 
 */
public class ArrayQ7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ref_varialbe = new int[5];
		
		ref_varialbe[0] = 2;
		ref_varialbe[1] = 5;
		ref_varialbe[2] = 7;
		ref_varialbe[3] = 8;
		ref_varialbe[4] = 4;
		
		// print reference variable 
		System.out.println("reference variable: " + ref_varialbe);
		
		// print the size of array 
		System.out.println("size of array: " + ref_varialbe.length);
		
		// print all the element by the help of index
		System.out.println("element at index 0: " + ref_varialbe[0]);
		System.out.println("element at index 1: " + ref_varialbe[1]);
		System.out.println("element at index 2: " + ref_varialbe[2]);
		System.out.println("element at index 3: " + ref_varialbe[3]);
		System.out.println("element at index 4: " + ref_varialbe[4]);
		
		
		// print all the element in forward direction using loop while, do-while & for
		
		// for loop
		for (int i = 0; i < ref_varialbe.length; i++) {
			System.out.println("element at index " + i + " : " + ref_varialbe[i]);
		}
		
		// while loop
		int j = 0;
		while (j < ref_varialbe.length) {
			System.out.println("element at index " + j + " : " + ref_varialbe[j]);
			j++;
		}
		
		// do-while loop
		int k = 0;
		do {
			System.out.println("element at index " + k + " : " + ref_varialbe[k]);
			k++;
			
		} while (k < ref_varialbe.length);
		
		// print all the element in backward direction using loop while, do-while & for
		
		for (int i = ref_varialbe.length -1; i >= 0; i--) {
			System.out.println("element at index " + i + " : " + ref_varialbe[i]);
		}
		
		// while loop
//		int j = 0;
		while (j < ref_varialbe.length -1) {
			System.out.println("element at index " + j + " : " + ref_varialbe[j]);
			j++;
		}
		
		// do-while loop
//		int k = 0;
		do {
			System.out.println("element at index " + k + " : " + ref_varialbe[k]);
			k++;
			
		} while (k < ref_varialbe.length -1);
		
		
	}

}
