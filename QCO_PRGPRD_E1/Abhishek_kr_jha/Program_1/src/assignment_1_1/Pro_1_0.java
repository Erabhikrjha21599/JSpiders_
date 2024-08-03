package assignment_1_1;

import java.util.Scanner;

public class Pro_1_0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String day = s.next().toLowerCase();

		switch (day) {
		case "monday": {

//			yield type;
			System.out.println();
			
		}break;
		
		case "wednesday": {

//			yield type;
			System.out.println("basket ball");
			
		}break;
		
		case "tuesday": {

//			yield type;
			System.out.println();
			
		}break;
		
		

		default: {

			throw new IllegalArgumentException("Unexpected value: " + day);
		}
		}

	}

}
