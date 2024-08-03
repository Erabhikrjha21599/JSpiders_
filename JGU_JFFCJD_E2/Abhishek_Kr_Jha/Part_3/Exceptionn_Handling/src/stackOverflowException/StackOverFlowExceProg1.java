/**
 * 
 */
package stackOverflowException;

/**
 * 
 */
public class StackOverFlowExceProg1 {
	
	public static void method1() {
		System.out.println("method1");
		method2();
		
	}
	
	public static void method2() {
		System.out.println("method2");
		method1();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1();
		method2();

	}

}
