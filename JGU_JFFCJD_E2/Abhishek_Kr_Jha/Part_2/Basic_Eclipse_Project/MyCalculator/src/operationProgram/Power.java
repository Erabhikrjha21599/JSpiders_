/**
 * 
 */
package operationProgram;

/**
 * 
 */
public class Power {
	public static int pow(int base, int exponant) {
		int power_of_num = 1;
		for(int i = 0; i < exponant; i++) {
			power_of_num *= base;
		}
		//System.out.println(power_of_num);
		
		return power_of_num;
		
	}
	
	public static double pow(double base, double exponant) {
		double power_of_num = 1;
		for(int i = 0; i < exponant; i++) {
			power_of_num *= base;
		}
		//System.out.println(power_of_num);
		
		return power_of_num;
		
	}
	
	
	
	public static void main(String [] args) {
		pow(2, 3);
	}

}
