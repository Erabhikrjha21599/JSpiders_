/**
 * 
 */
package hospitalCallImplementation;

/**
 * 
 */

import java.util.Scanner;
import doctorDetails.DoctorInfo;
import patientDetails.PatientInfo;
public class CallImplementation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner scan = new Scanner(System.in);

		////////////////main_menu start ////////////////

		int main_menu;

		//////////////// start main_menu do-while block //////////////////////////////

		do {
			System.out.println("== HOSPITAL MANAGEMENT ==");
			System.out.println("Select Below Option...");
			System.out.println("1. Registration.");
			System.out.println("2. Patient Details.");
			System.out.println("3. Doctor Details.");
			System.out.println("4. Health Office.");
			System.out.println("5. Medical Records.");
			System.out.println("9. Exit.");
			System.out.println("Enter Your Choice:-");
			main_menu = scan.nextInt();

			///////////////// start main_menu switch block //////////////////
			switch (main_menu) {
			/////////////// start main_menu switch block case 1 //////////////////		
			case 1: {
				//				yield type; 1. Registration


				//////////////// sum_menu_1 start ////////////////
				int sub_menu_1;
				//////////////// start sub_menu_1 do-while block //////////////////////////////
				do {
					System.out.println("== HOSPITAL MANAGEMENT ==");
					System.out.println("Select Below Option...");
					System.out.println("1. Patient Registration.");
					System.out.println("2. Doctor Registration.");
					System.out.println("3. Child Registration.");
					System.out.println("9. Exit.");
					System.out.println("Enter Your Choice:-");
					sub_menu_1 = scan.nextInt();

					///////////////// start sub_menu_1 switch block //////////////////
					switch (sub_menu_1) {
					/////////////// start sub_menu_1 switch block case 1 //////////////////		
					case 1: {
						//				yield type; 1. Patient Registration


						System.out.println("1. Patient Registration.");
					} break; 		
					///////////////// end of sub_menu_1 switch block case 1 /////////////////////
					case 2: {
						//				yield type; 2. Doctor Registration


						System.out.println("2. Doctor Registration.");
					} break; 

					case 3: {
						//				yield type; 3. Child Registration


						System.out.println("3. Child Registration.");
					} break; 

					case 9: {
						//				yield type; 9. Exit and go to main_menu


						System.out.println("Stop And Go To Main Menu.");
					} break; 

					default:
						System.out.println("Invalid Choice! Please Select Valid Choice Thank Your!...");			}
				} while (sub_menu_1 != 9);
				/////////////// end of sub_menu_1 ///////////////////////////////////////


			} break; 	
			///////////////// end of main_menu switch block case 1 /////////////////////


			//////////////// start of main_menu switch block case 2 ////////////////////
			case 2: {
				//				yield type; Patient details


				System.out.println("== Patient Details ==");
				System.out.println("Enter The Patient Details:-");
				PatientInfo.patient();
			} break;
			//////////////// end of main_menu switch block case 2 ////////////////////////


			//////////////// start of main_menu switch block case 3 ///////////////////////
			case 3: {
				//				yield type; Doctor Details


				System.out.println("== Doctor Details ==");
				System.out.println("Enter The Doctor Details:-");
				DoctorInfo.doctor();
				System.out.println(main_menu);
				
			} break;
			////////////////////// end of main_menu switch block case 3 /////////////////////


			////////////////// start of main_menu switch block case 4 ////////////////////
			case 4: {
				//				yield type; Health Office


				System.out.println("== Health Office ==");
				
			} break;
			//////////////// end of main_menu switch block case 4 //////////////////////////////////


			////////////////// start of main_menu switch block case 5 /////////////////////
			case 5: {
				//				yield type; Medical Details


				System.out.println("== Medical Details ==");
			} break;
			//////////////// end of main_menu switch block case 5 ////////////////////////


			//////////////// start of main_menu switch block case 9 ///////////////////////
			case 9: {
				//				yield type; Exit


				System.out.println("Stop execution!");
			} break;
			//////////////// end of main_menu switch block case 9 /////////////////


			//////////// start of main_menu switch default block ///////////////////
			default: 
				System.out.println("Invalid Choice! Please Select Valid Choice Thank Your!...");
				///////// end of main_menu switch default block //////////////////
			}
		} while (main_menu != 9);
		///////////////// end of main_menu ///////////////////////////////////////

		////////////////// close object link /////////////
		scan.close();

	}

}
