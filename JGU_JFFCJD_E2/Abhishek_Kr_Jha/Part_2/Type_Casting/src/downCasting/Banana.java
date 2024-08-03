/**
 * 
 */
package downCasting;

/**
 * 
 */
public class Banana extends Fruit {

	int bn_price = 56;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Banana b = new Banana();
		
		System.out.println(b.bn_price);
		System.out.println(b.ft_price);
		
		Fruit fb = new Banana(); // up casting 
		
		System.out.println(fb.ft_price);
//		System.out.println(fb.bn_price); // CTE
		
		if(fb instanceof Banana) { // down casting 
			Banana b1 = (Banana) fb;
			
			System.out.println(b1.bn_price);
			System.out.println(b1.ft_price);
			
		}
		else if(fb instanceof Apple){
			Apple a1 = (Apple) fb;
			
//			System.out.println(a1.bn_price);
			System.out.println(a1.ft_price);
			
		}
		
		

	}

}