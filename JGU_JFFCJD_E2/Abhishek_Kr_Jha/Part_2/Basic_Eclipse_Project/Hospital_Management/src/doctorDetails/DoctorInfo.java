/**
 * 
 */
package doctorDetails;

import java.util.Scanner;

/**
 * 
 */
public class DoctorInfo {
	
	public static void doctor() {
		Scanner dscan = new Scanner(System.in);
		
		System.out.println("Enter the doctor Emp_No.:-");
		int doctor_mr_no = dscan.nextInt();
		
		dscan.nextLine();
		System.out.println("Enter the doctor name:-");
		String doctor_name = dscan.nextLine();
		
		
		System.out.println("Enter the doctor gender:-");
		String doctor_gender = dscan.next();
		
		System.out.println("Enter the doctor age:-");
		int doctor_age = dscan.nextInt();
		
		dscan.nextLine();
		System.out.println("Enter the doctor notes:-");
		String doctor_notes = dscan.nextLine();
		
		System.out.println("Specialist for :-");
		String doctor_specialist = dscan.nextLine();
		
		
		
		System.out.println("== YOUR ENTERED DETAILS IS ==");
		System.out.println("doctor MR_No is:- " + doctor_mr_no);
		System.out.println("doctor name is:- " + doctor_name);
		System.out.println("doctor gender is:- " + doctor_gender);
		System.out.println("doctor age is:- " + doctor_age);
		System.out.println("doctor notes is:- " + doctor_notes);
		System.out.println("doctor notes is:- " + doctor_specialist);
		
		
//		dscan.close();
		
		
		
	}

	/**
	 * @param args
	 */
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		doctor();
//
//	}
	

}
