/**
 * 
 */
package interfacee;

/**
 * 
 */
public class Child implements Parent {
	int y = 6;
	
	public void m1() {
		System.out.println("m1 method ");
		
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child c = new Child();
		
		System.out.println(c.y); // child property
//		System.out.println(c.x); // parent property
		c.m1();
		
		Parent p = new Child();
		
		System.out.println(Parent.x); // parent property
//		System.out.println(p.y); // child property you can't access
		p.m1();
		
		
		
		
		

	}
	


}
