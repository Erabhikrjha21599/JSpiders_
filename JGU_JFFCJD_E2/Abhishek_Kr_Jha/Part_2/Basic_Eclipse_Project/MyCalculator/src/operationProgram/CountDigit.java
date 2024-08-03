/**
 * 
 */
package operationProgram;

/**
 * 
 */
public class CountDigit {
	
	// this method is valid for integer value
	public static int count(int num_1) {
		int count_digit = 0;
		while (num_1 > 0) {
			int digit = num_1 % 10;
			count_digit++;
			num_1 /= 10;
			
		}
		System.out.println(count_digit);
		
		return count_digit;
	}
	
	// this method is valid for decimal value;
	public static double count(double num_1) {
		int count_digit = 0;
		while (num_1 > 0) {
			double digit = num_1 % 10;
			count_digit++;
			num_1 /= 10;
			
		}
		System.out.println(count_digit);
		
		return count_digit;
	}
	
	/*
	public static void main(String [] args) {
		count(123);
	}
	*/

}
