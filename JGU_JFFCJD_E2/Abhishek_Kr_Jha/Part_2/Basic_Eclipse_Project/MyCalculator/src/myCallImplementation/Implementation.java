/**
 * 
 */
package myCallImplementation;

import java.util.Scanner;
import additionProgram.Addition;
import subtractionProgram.Subtraction;
import multiplicationProgram.Multiplication;
import divisionProgram.Division;
import operationProgram.Square;
import operationProgram.Power;
import operationProgram.Cube;
import operationProgram.CountDigit;
import operationProgram.Factors;
import operationProgram.Factorials;



/**
 * 
 */
public class Implementation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int choice;


		do {

			//int choice;
			System.out.println("=====Welcome To My Program=====");
			System.out.println("Select the below option:-");
			System.out.println("1. Addition of two no.:-");
			System.out.println("2. Substraction of two no.:-");
			System.out.println("3. Multiplication of two no.:-");
			System.out.println("4. Division of two no.:-");
			System.out.println("5. Operation of two no.:-");
			System.out.println("6. Exit");
			System.out.println("Enter your choice:-");
			choice = scan.nextInt();

			switch (choice) {
			case 1: {

				//				yield type;
				System.out.println("1. Addition of two no.:-");
				System.out.println("Enter the value of num_1:-");
				int num_1 = scan.nextInt();
				System.out.println("Your enter value of num_1 is:-" + num_1);

				System.out.println("Enter the value of num_2:-");
				int num_2 = scan.nextInt();
				System.out.println("Your enter value of num_2 is:-" + num_2);
				System.out.println("Sum of num_1 & num_2 is:-" + " " + Addition.add(num_1, num_2));

			}break;

			case 2: {

				//				yield type;
				System.out.println("2. Subtraction of two no.:-");
				System.out.println("Enter the value of num_1:-");
				int num_1 = scan.nextInt();
				System.out.println("Your enter value of num_1 is:-" + num_1);

				System.out.println("Enter the value of num_2:-");
				int num_2 = scan.nextInt();
				System.out.println("Your enter value of num_2 is:-" + num_2);
				System.out.println("Subtraction of num_1 & num_2 is:-" + " " + Subtraction.sub(num_1, num_2));

			}break;

			case 3: {

				//				yield type;
				System.out.println("3. Multiplication of two no.:-");
				System.out.println("Enter the value of num_1:-");
				int num_1 = scan.nextInt();
				System.out.println("Your enter value of num_1 is:-" + num_1);

				System.out.println("Enter the value of num_2:-");
				int num_2 = scan.nextInt();
				System.out.println("Your enter value of num_2 is:-" + num_2);
				System.out.println("Multiplication of num_1 & num_2 is:-" + " " + Multiplication.multi(num_1, num_2));

			}break;

			case 4: {

				//				yield type;
				System.out.println("4. Division of two no.:-");
				System.out.println("Enter the value of num_1:-");
				int num_1 = scan.nextInt();
				System.out.println("Your enter value of num_1 is:-" + num_1);

				System.out.println("Enter the value of num_2:-");
				int num_2 = scan.nextInt();
				System.out.println("Your enter value of num_2 is:-" + num_2);
				System.out.println("Division of num_1 & num_2 is:-" + " " + Division.div(num_1, num_2));

			}break;

			case 5: {
				int sub_choice;
				boolean bool = false;

				do {

					//				yield type;
					System.out.println("5. Operation of no.:-");
					System.out.println("1. Square of no.:-");
					System.out.println("2. Cube of no.:-");
					System.out.println("3. Factors of no.:-");
					System.out.println("4. Count digit of no.:-");
					System.out.println("5. Power of no.");
					System.out.println("6. Factorials of no.:-");
					System.out.println("7. Exit:-");
					System.out.println("Enter your sub_choice:-");


				   sub_choice = scan.nextInt();

					switch (sub_choice) {
					case 1: {

						//					yield type;
						System.out.println("1. Square of no.:-");
						System.out.println("Enter the value of num_1:-");
						int num_1 = scan.nextInt();
						System.out.println("Your enter value of num_1 is:-" + num_1);

						/*
					System.out.println("Enter the value of num_2:-");
					int num_2 = scan.nextInt();
					System.out.println("Your enter value of num_2 is:-" + num_2);
						 */
						System.out.println("Square of num_1 is:-" + " " + Square.sqr(num_1));

					}break;

					case 2: {
						System.out.println("2. Cube of no.:-");
						System.out.println("Enter the value of num_1:-");
						int num_1 = scan.nextInt();
						System.out.println("Your enter value of num_1 is:-" + num_1);

						/*
					System.out.println("Enter the value of num_2:-");
					int num_2 = scan.nextInt();
					System.out.println("Your enter value of num_2 is:-" + num_2);
						 */
						System.out.println("Cube of num_1 is:-" + " " + Cube.cub(num_1));
					}break;

					case 3: {
						System.out.println("3. Facotrs of no.:-");
						System.out.println("Enter the value of num_1:-");
						int num_1 = scan.nextInt();
						System.out.println("Your enter value of num_1 is:-" + num_1);

						/*
					System.out.println("Enter the value of num_2:-");
					int num_2 = scan.nextInt();
					System.out.println("Your enter value of num_2 is:-" + num_2);
						 */
						System.out.println("Facotrs of num_1 is:-" + " " + Factors.fact(num_1));
					}break;

					case 4: {
						System.out.println("4. Count digit of no.:-");
						System.out.println("Enter the value of num_1:-");
						int num_1 = scan.nextInt();
						System.out.println("Your enter value of num_1 is:-" + num_1);

						/*
					System.out.println("Enter the value of num_2:-");
					int num_2 = scan.nextInt();
					System.out.println("Your enter value of num_2 is:-" + num_2);
						 */
						System.out.println("Count digit of num_1 is:-" + " " + CountDigit.count(num_1));
					}break;

					case 5: {
						System.out.println("5. Power of no.:-");
						System.out.println("Enter the value of base:-");
						int base = scan.nextInt();
						System.out.println("Your enter value of base is:-" + base);


						System.out.println("Enter the value of exponant:-");
						int exponant = scan.nextInt();
						System.out.println("Your enter value of exponant is:-" + exponant);

						System.out.println("Power of num_1 & num_2 is:-" + " " + Power.pow(base, exponant));
					}break;

					case 6: {
						System.out.println("5. Factorials of no.:-");
						System.out.println("Enter the value of num_1:-");
						int num_1 = scan.nextInt();
						System.out.println("Your enter value of num_1 is:-" + num_1);

						/*
					System.out.println("Enter the value of exponant:-");
					int exponant = scan.nextInt();
					System.out.println("Your enter value of exponant is:-" + exponant);
						 */

						System.out.println("Factorials of num_1 is:-" + " " + Factorials.facto(num_1));
					}break;

					case 7: {
						System.out.println("Exit operation program, GO TO MAIN MENU");
						System.exit(7);
					}break;


					default: {
						System.out.println("Invalid option, please choose Valid option:- ");
					}

					} // end of sub_switch 

				





				}while(bool);
			
				/*
				default:
					throw new IllegalArgumentException("Unexpected value: " + key);
				}
				 */



				/*
				System.out.println("Enter the value of num_1:-");
				int num_1 = scan.nextInt();
				System.out.println("Your enter value of num_1 is:-" + num_1);

				System.out.println("Enter the value of num_2:-");
				int num_2 = scan.nextInt();
				System.out.println("Your enter value of num_2 is:-" + num_2);
				System.out.println("Division of num_1 & num_2 is:-" + " " + Division.div(num_1, num_2));
				 */

			}break; // end of case 5 


			case 6: {
				System.out.println("6. Exit program");
				System.exit(6);
			}break;


			//			default:
			//				throw new IllegalArgumentException("Unexpected value: " + choice);
			//			}

			default: {
				System.out.println("Invalid option, please choose Valid option:- ");
			}


			} // end of switch
		}while (choice != 6); // end of do-while 

		scan.close();

	} // end of main method


} //end of Implementation class
