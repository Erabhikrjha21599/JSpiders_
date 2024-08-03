/**
 * 
 */
package scannerClass;

/**
 * 
 */
import java.util.Scanner;

public class Demo_3 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character:-");
		char ch_1 = sc.next().charAt(0);
		System.out.println("your character is:- " + ch_1);
		
		char ch_2 = sc.next().charAt(1);
		System.out.println("your character is:- " + ch_2);
		sc.close();
		
		
		
		
	}

}
