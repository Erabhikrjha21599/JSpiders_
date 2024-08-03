/**
 * 
 */
package multiLevel;

/**
 * 
 */
public class RedApple extends Apple {

	int ra_price1 = 120;
	static int ra_price2 = 150;
	
	public static void raMethod1() {
		System.out.println("rapple static raMethod1");
		
	}
	
	public void raMethod2() {
		System.out.println("rapple non-staic raMethod2");
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		RedApple Class Property
		RedApple ra = new RedApple();
		
		System.out.println("rapple non-static variable: " + ra.ra_price1);
		System.out.println("rapple static variable: " + RedApple.ra_price2);
		
		RedApple.raMethod1();
		ra.raMethod2();
		
		
//		Apple Class Property
		System.out.println("apple non-static variable: " + ra.a_price1);
		System.out.println("apple static variable: " + RedApple.a_price2);
		
		RedApple.aMethod1();
		ra.aMethod2();
		
//		Fruit Class Property
//		System.out.println("fruit non-static variable: " + f.f_price1);
		System.out.println("fruit static variable: " + Fruit.f_price2);
		System.out.println("fruit static variable: " + Apple.f_price2);
		
		RedApple.fMethod1();
//		f.fMethod2();
		RedApple.fMethod1();
		ra.fMethod2();
	}

}
