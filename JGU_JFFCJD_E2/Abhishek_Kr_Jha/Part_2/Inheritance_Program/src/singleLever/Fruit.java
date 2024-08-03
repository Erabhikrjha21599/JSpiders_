/**
 * 
 */
package singleLever;

/**
 * 
 */
public class Fruit {

	int f_price1 = 120;
	static int f_price2 = 150;
	
	public static void fMethod1() {
		System.out.println("fruit static fMethod1");
		
	}
	
	public void fMethod2() {
		System.out.println("fruit non-staic fMethod2");
		
	}
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fruit f = new Fruit();
		
		System.out.println("fruit non-static variable: " + f.f_price1);
		System.out.println("fruit static variable: " + Fruit.f_price2);
		
		Fruit.fMethod1();
		f.fMethod2();

	}

}
