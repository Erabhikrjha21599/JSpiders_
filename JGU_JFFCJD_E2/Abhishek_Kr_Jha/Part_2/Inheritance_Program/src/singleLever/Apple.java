/**
 * 
 */
package singleLever;

/**
 * 
 */
public class Apple extends Fruit {

	int a_price1 = 120;
	static int a_price2 = 150;
	
	public static void aMethod1() {
		System.out.println("apple static aMethod1");
		
	}
	
	public void aMethod2() {
		System.out.println("apple non-staic aMethod2");
		
	}
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Apple Class Property
		Apple a = new Apple();
		
		System.out.println("apple non-static variable: " + a.a_price1);
		System.out.println("apple static variable: " + Apple.a_price2);
		
		Apple.aMethod1();
		a.aMethod2();
		
//		Fruit Class Property
//		System.out.println("fruit non-static variable: " + f.f_price1);
		System.out.println("fruit static variable: " + Fruit.f_price2);
		System.out.println("fruit static variable: " + Apple.f_price2);
		
		Fruit.fMethod1();
//		f.fMethod2();
		Apple.fMethod1();
		a.fMethod2();
		

	}

}
