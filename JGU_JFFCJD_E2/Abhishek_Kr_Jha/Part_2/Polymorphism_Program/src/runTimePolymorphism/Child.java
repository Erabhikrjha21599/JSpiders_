/**
 * 
 */
package runTimePolymorphism;

/**
 * 
 */
public class Child extends Parent {
	
	public void method1() {
		System.out.println("method1 in child class");
		
	}
	
	public void method2() {
		System.out.println("method2 in child class");
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child c = new Child();
		
		c.method1();
		
		Parent p = new Parent();
		
		p.method1();
		
	}

}
