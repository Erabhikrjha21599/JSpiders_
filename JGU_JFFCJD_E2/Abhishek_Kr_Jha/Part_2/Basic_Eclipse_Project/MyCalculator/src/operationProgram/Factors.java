/**
 * 
 */
package operationProgram;

/**
 * 
 */
public class Factors {
	// this method valid for integer value
	public static int fact(int num_1) {
		int factors;
		for(factors = 1; factors < num_1; factors++) {
			if(num_1 % factors == 0) {
				System.out.println(factors);
			}
		}
		return factors;
	}
	
	// this method valid for decimal value
	public static double fact(double num_1) {
		double factors;
		for(factors = 1; factors < num_1; factors++) {
			if(num_1 % factors == 0) {
				System.out.println(factors);
				
			}
		}
		return factors;
	}
	
	/* this is main method
	public static void main(String [] args) {
		fact(6);
	}
	*/

}
