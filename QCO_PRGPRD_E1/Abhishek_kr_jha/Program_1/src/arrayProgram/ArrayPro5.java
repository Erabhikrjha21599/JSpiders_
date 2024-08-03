/**
 * 
 */
package arrayProgram;

/**
 * WAJP TO FIND THE FREQUENCY OF EACH ELEMENT IN THE GIVEN INTEGER ARRAY
 */
public class ArrayPro5 {
	
	// create a method for match the frequency 
	public static void countFrequency() {
		int[] array = {1,2,3,4,5,2,4};
//		int element = array[0];
		// s1: 
		int visited = -1; // instead of this we can use Integer.MIN_VALUE also
		//s2: find frequency
		for(int i = 1; i < array.length; i++) {
			// frequency for each elemet
			// check if it is visited or not
			int count = 1;
			if (array[i] != visited) {
				// not visited
				// frequency for ith element 
				for(int j = i + 1; j < array.length; j++) {
					// check if ithe element is same as jth element
					if (array[i] == array[j]) {
						count++;
						// replace the visited data
						array[j] = visited;
						
						
					}// end of if
				}// end of inner for
				System.out.println(array[i] + ":" + count);
				
			}
		}
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countFrequency();

	}

}
