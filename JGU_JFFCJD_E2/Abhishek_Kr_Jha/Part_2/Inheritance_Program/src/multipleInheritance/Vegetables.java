/**
 * 
 */
package multipleInheritance;

/**
 * 
 */
public class Vegetables {

	int v_price1 = 120;
	static int v_price2 = 150;
	
	public void name() {
		System.out.println("multiple inheritance ");
	}
	
	public static void vMethod1() {
		System.out.println("vegetable static fMethod1");
		
	}
	
	public void vMethod2() {
		System.out.println("vegetable non-staic fMethod2");
		
	}
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vegetables v = new Vegetables();
		
		System.out.println("vegetables non-static variable: " + v.v_price1);
		System.out.println("vegetables static variable: " + Vegetables.v_price2);
		
		Vegetables.vMethod1();
		v.vMethod2();

	}

}
