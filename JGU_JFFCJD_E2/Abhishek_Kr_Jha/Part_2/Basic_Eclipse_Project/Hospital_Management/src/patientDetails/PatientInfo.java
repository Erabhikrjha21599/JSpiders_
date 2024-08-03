/**
 * 
 */
package patientDetails;

/**
 * 
 */
import java.util.Scanner;

public class PatientInfo {
	
	public static void patient() {
		Scanner pscan = new Scanner(System.in);
		
		System.out.println("Enter the patient MR_No.:-");
		int patient_mr_no = pscan.nextInt();
		
		pscan.nextLine();
		System.out.println("Enter the patient name:-");
		String patient_name = pscan.nextLine();
		
		
		System.out.println("Enter the patient gender:-");
		String patient_gender = pscan.next();
		
		System.out.println("Enter the patient age:-");
		int patient_age = pscan.nextInt();
		
		pscan.nextLine();
		System.out.println("Enter the patient notes:-");
		String patient_notes = pscan.nextLine();
		
		System.out.println("== YOUR ENTERED DETAILS IS ==");
		System.out.println("patient MR_No is:- " + patient_mr_no);
		System.out.println("patient name is:- " + patient_name);
		System.out.println("patient gender is:- " + patient_gender);
		System.out.println("patient age is:- " + patient_age);
		System.out.println("patient notes is:- " + patient_notes);
		
//		pscan.close();
		
		
		
	}

	/**
	 * @param args
	 */
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		patient();
//
//	}
//	

}
