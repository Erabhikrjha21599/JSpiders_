/**
 * 
 */
package patternProgram;

/**
 * 
 */
public class HollowPattern {
	
	public static void hollowDimond(int num) {
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= num; j++) {
				System.out.print(i + " " + j);
			}
			System.out.println();
		}
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		hollowDimond(5);

	}

}
