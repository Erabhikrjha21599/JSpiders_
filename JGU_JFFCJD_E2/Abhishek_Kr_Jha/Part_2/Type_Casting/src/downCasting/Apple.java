/**
 * 
 */
package downCasting;

/**
 * 
 */
public class Apple extends Fruit {
	int ap_price = 30;
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		 downCasting means storing the parent reference into child reference variable
		
//		create child class object 
		Apple a = new Apple();
		
		System.out.println(a.ap_price);
		System.out.println(a.ft_price);
		
//		create parent class object 
		Fruit fa = new Fruit(); // up casting
		fa = a;
		System.out.println(fa.ft_price);
//		System.out.println(fa.ap_price); // CTE
		
		System.out.println(fa.ft_price);
//		System.out.println(fa.ap_price); // CTE
		
		if (fa instanceof Apple) {
			Apple a1 = (Apple) fa;
			
			System.out.println(a1.ap_price);
			System.out.println(a1.ft_price);
		}
		else if(fa instanceof Banana) {
			Banana b1 = (Banana) fa;
			
			System.out.println(b1.ft_price);
//			System.out.println(b1.ap_price); // CTE
		}
		


	}

}
