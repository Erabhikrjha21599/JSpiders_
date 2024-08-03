/**
 * 
 */
package other;

/**
 * 
 */
public class EClass {
	
	public void sqare(int num1) {
		int res = num1 * num1;
		
	}
	
	public void cube(int num1) {
		int res = num1 * num1 * num1;
		
	}
	
	public void sqare(int base, int exponent) {
		int res = 1;
		for(int i = 1; i < exponent; i++) {
			res *= base;
		}
		
	}
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
