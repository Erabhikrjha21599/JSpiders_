package program_1_0;

import java.util.Scanner;

public class Pro_1_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int result = 1;
		for(int i = 2; i <= num; i++) {
			result *= i;
			
		}
		System.out.println(result);
		
		s.close();

	}

}
