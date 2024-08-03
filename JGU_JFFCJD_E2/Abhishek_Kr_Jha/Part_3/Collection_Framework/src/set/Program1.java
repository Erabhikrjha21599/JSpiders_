/**
 * 
 */
package set;

import java.util.LinkedHashSet;

/**
 * 
 */
public class Program1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add(9);
		lhs.add("Mritunjay");
		lhs.add(false);
		lhs.add(3.2);
		
		for (Object object : lhs) {
			System.out.println(lhs);
		}

	}

}
