/**
 * 
 */
package alphabetPattern;

/**
 * 
 */
public class Bpattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				if (j == 1 || i == 1 || (i == 5 && i + j != 10) || j == 5 || i == 3) {
					System.out.print("* ");
					
				} else {
					System.out.print("  ");

				}
			}
			System.out.println();
		}

	}

}
