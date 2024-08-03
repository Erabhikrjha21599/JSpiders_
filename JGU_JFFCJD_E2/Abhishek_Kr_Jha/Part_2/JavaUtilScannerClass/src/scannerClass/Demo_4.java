/**
 * 
 */
package scannerClass;

/**
 * 
 */
import java.util.Scanner;

public class Demo_4 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr your name:-");
		String name = sc.next();
		
		System.out.println("your name is:- " + name);
		sc.close();
	}

}
