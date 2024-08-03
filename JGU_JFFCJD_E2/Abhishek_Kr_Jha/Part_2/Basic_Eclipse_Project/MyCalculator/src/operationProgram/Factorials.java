/**
 * 
 */
package operationProgram;

/**
 * 
 */
public class Factorials {
	// this method valid for integer value
	public static int facto(int num_1) {
		int factorials = 1;
		for (int i = 1; i <= num_1; i++) {
			factorials *= i;
		}
		//System.out.println(factorials);
		
		return factorials;
		
	}
	
	// this method is valid for decimal value
	public static double facto(double num_1) {
		double factorials = 1;
		for (int i = 1; i <= num_1; i++) {
			factorials *= i;
		}
		//System.out.println(factorials);
		
		return factorials;
		
	}
	
	/*
	 * this is main method
	public static void main(String [] args) {
		facto(5);
		
	}
	*/

}
