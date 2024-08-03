/**
 * 
 */
package autoUnboxing;

/**
 * 
 */
public class IntegersDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 6;
		
		// autoboxing 
		Integer i = new Integer(x);
		
		System.out.println(x);
		System.out.println(i);
		
		// autounboxing
		int p = i;
		System.out.println(p);
		

	}

}
