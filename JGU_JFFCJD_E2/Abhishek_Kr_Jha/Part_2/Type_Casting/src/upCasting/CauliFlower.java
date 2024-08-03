/**
 * 
 */
package upCasting;

/**
 * 
 */
public class CauliFlower extends Vegetable {
	
	int cf_price = 50;
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		create child class object to access the parent class as well as child class property
		CauliFlower c = new CauliFlower();
		
		System.out.println(c.cf_price);
		System.out.println(c.vt_price);
		
//		upCasting means storing child class object reference into parent class reference variable
		
		Vegetable v =  new Vegetable();
		
		v = c;
		
//		System.out.println(v.cf_price);
		System.out.println(v.vt_price);
		
//		downCasting means storing parent class object reference into child class reference variable
		
		c = (CauliFlower) v;
		
		System.out.println(c.cf_price);
		System.out.println(c.vt_price);
		
		
		

	}

}