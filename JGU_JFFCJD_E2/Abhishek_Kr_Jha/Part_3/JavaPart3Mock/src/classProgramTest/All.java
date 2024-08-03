/**
 * 
 */
package classProgramTest;

/**
 * 
 */
public class All {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = {{1,2,3}, {2,4,3}};
		int b[][] = {{1,2,3}, {2,4,3}};
		
		int c[][]= new int[2][2];
		
		for(int i = 0; i<2; i++) {
			for(int j = 0; j<2; j++) {
				c[i][j]=a[i][j]+b[i][j];
				System.out.println(c[i][j] + " ");
			}
			System.out.println();
		}
		

	}

}
