/**
 * 
 */
package hasMap;

import java.util.HashMap;

/**
 * 
 */
public class program1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap h = new HashMap();
		h.put(1, "Abhishek");
		h.put(2, "Roushan");
		h.put(3, "jigmet");
		h.put(4, "Mritunjay");
		
		for (String string : args) {
			System.out.println(h);
		}

	}

}
