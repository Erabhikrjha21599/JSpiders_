/**
 * 
 */
package patternProgram;

/**
 * 
 */
public class AlphabetPattern {
	// print H 
	public static void hPattern(int num_1) {
		for(int i = 1; i <= num_1; i++) {
			for(int j = 1; j <= num_1; j++) {
				if(j == 1 || j == 5 || i == 3) {
					System.out.println("* ");
				}
				else {
					System.out.println("  ");
				}
			}
			System.out.println();
		}

	}



	// print X
	public static void xPattern(int num_1) {
		for(int i = 1; i <= num_1; i++) {
			for(int j = 1; j <= num_1; j++) {
				if (i == j || i + j == num_1 + 1) {
					System.out.print("* ");

				} else {
					System.out.print("  ");

				}
			}
			System.out.println();
		}

	}

	// print Z 
	public static void zPattern(int num_1) {
		for(int i = 1; i <= num_1; i++) {
			for(int j = 1; j <= num_1; j++) {
				if (i == 1 || i == num_1 || i + j == num_1 + 1) {
					System.out.print("* ");

				} else {
					System.out.print("  ");

				}
			}
			System.out.println();
		}

	}

	// print Y
	public static void yPattern(int num_1) {
		for(int i = 1; i <= num_1; i++) {
			for(int j = 1; j <= num_1; j++) {
				if ((i == j && i <= 3) || (j == 3 && i > 3) || (i + j == num_1 + 1 && i <= 3 )) {
					System.out.print("* ");

				} else {
					System.out.print("  ");

				}
			}
			System.out.println();
		}

	}

	// print A
	public static void aPattern(int num_1) {
		for(int i = 1; i <= num_1; i++) {
			for(int j = 1; j <= num_1; j++) {
				if ((j == 1 || ( i == 1 && j <=3) ) || j == 3 || (i == 3 && j <= 3)) {
					System.out.print("* ");

				} else {
					System.out.print("  ");

				}
			}
			System.out.println();
		}

	}

	// print B
	public static void bPattern(int num_1) {
		for(int i = 1; i <= num_1; i++) {
			for(int j = 1; j <= num_1; j++) {
				if (j == 1 || (i == 1 && j <= 3) || (i == 3 && j <= 3) || (i == 5 && j <= 3) || j == 3) {
					System.out.print("* ");

				} else {
					System.out.print("  ");

				}
			}
			System.out.println();
		}

	}

	// print C
	public static void cPattern(int num_1) {
		for(int i = 1; i <= num_1; i++) {
			for(int j = 1; j <= num_1; j++) {
				if (j == 1 || (i ==1 && j <= 3) || (i == 5 && j <= 3)) {
					System.out.print("* ");

				} else {
					System.out.print("  ");

				}
			}
			System.out.println();
		}

	}
	// print D
	public static void dPattern(int num_1) {
		for(int i = 1; i <= num_1; i++) {
			for(int j = 1; j <= num_1; j++) {
				if (j == 1 || (i ==1 && j <= 4) || (i == 5 && j <= 4) || (j == 5) ) {
					System.out.print("* ");

				} else {
					System.out.print("  ");

				}
			}
			System.out.println();
		}

	}





	/**
	 * @param args
	 * 


			public static void main(String[] args) {
				// TODO Auto-generated method stub
				hPattern(5);
				xPattern(5);
				System.out.println("#########################################");
				zPattern(5);
				System.out.println("#########################################");
				yPattern(5);
				System.out.println("#########################################");
				aPattern(5);
				System.out.println("#########################################");
				bPattern(5);
				System.out.println("#########################################");
				cPattern(5);
				System.out.println("#########################################");
				dPattern(5);



			}
	 */


}
