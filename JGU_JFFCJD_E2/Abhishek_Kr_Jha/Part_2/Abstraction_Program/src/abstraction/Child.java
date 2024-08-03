/**
 * 
 */
package abstraction;

/**
 * 
 */
public class Child extends Parent {
	
	int y = 5;
	
	public void m1() {
		System.out.println("m1 method");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child c = new Child();
		
		c.m1();
		System.out.println(c.x);
		System.out.println(c.y);
		
		Parent p = new Child();
		
		p.m1();
		System.out.println(p.x);
//		System.out.println(p.y);
		

	}

}
