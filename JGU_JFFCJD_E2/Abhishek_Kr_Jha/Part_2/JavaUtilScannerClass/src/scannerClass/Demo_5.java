/**
 * 
 */
package scannerClass;

/**
 * 
 */
import java.util.Scanner;

public class Demo_5 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your full name:- ");
		String full_name = sc.nextLine();
		
		System.out.println("your full_name is:- " + full_name);
		sc.close();
	}

}
