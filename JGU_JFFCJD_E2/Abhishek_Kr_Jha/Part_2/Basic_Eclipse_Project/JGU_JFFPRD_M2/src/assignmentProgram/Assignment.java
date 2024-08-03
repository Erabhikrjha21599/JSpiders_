/**
 * 
 */
package assignmentProgram;

import java.util.Scanner;

/**
 * 
 */
public class Assignment {

	public static void pattern_1(int number) {
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= 1; j++) {
				System.out.println("* ");

			}

		}

	}


	public static void oddNoOneToTen(int num_1, int num_2) {
		for(int i = num_1; i <= num_2; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}

	}


	public static void printNoOneToTen(int num_1, int num_2) {
		for(int i = num_1; i <= num_2; i++) {
			if(i == 5 || i == 7) {
				continue;
			}
			System.out.println(i);
		}

	}

	public static void printNo_1() {
		int num = 1;
		while(num <= 5) {
			System.out.println(num);
			num++;
		}


	}
	public static void printNo_2() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the value of num_1:-");
		int num_1 = scan.nextInt();
		System.out.println("enter value of num_1 is:-" + num_1);


		scan.close();



	}

	public static void pattern(int number) {
		for (int i = 1; i <= 1; i++) {
			for (int j = 1; j <= number; j++) {
				System.out.print("* ");

			}

		}
		System.out.println();

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
