/**
 * 
 */
package hybridInheritance;

/**
 * 
 */
public class Banana extends Fruit {
	int b_price1 = 50;
	static int b_price2 = 60;
	
	public static void bMethod1() {
		System.out.println("banana static bMethod1");
		
	}
	
	public void bMethod2() {
		System.out.println("banana non-static bMethod2");
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Banana Class Property
		Banana b = new Banana();
		
		System.out.println("banana non-static variable: " + b.b_price1);
		System.out.println("banana static variable: " + Banana.b_price2);
		
		Banana.bMethod1();
		b.bMethod2();
		
//		Fruit class property
//		System.out.println("fruit non-static variable: " + f.f_price1);
		System.out.println("fruit static variable: " + Fruit.f_price2);
		System.out.println("fruit static variable: " + Banana.f_price2);
		
		Fruit.fMethod1();
//		f.fMethod2();
		Apple.fMethod1();
		b.fMethod2();

	}

}
