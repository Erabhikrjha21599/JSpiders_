/**
 * 
 */
package scannerClass;

/**
 * 
 */
import java.util.Scanner;

public class StudentInformation {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the Student name:-");
		String stu_name = sc.nextLine();
		System.out.println("student name is:-" + stu_name);
		
		System.out.println("enter the studen university roll number:-");
		int stu_rollno = sc.nextInt();
		System.out.println("student roll no is:-" + stu_rollno);
		
		System.out.println("enter the student section:-");
		char stu_sec = sc.next().charAt(0);
		System.out.println("student section is:-" + stu_sec);
		
		System.out.println("enter the student perscentage:-");
		double stu_per = sc.nextDouble();
		System.out.println("student percentage is:-" + stu_per);
		
		sc.close();
		
		
	}
	
	
	

}
