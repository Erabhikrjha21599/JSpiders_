/**
 * 
 */
package programCallImplementaion;

/**
 * 
 */
import java.util.Scanner;

import patternProgram.AlphabetPattern;
//import patternProgram.NumberPattern;
//import patternProgram.StarPattern;
//import numberProgram.BasicProgram;
import numberProgram.AllNumberProgram;


//import alphabetPattern.AToZPattern;

public class CallImplementation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);


		int main_choice;

		do { // start of main do-while loop 

			System.out.println("== WELCOM TO MY PROGRAM HUB ==");
			System.out.println("1. Pattern Program");
			System.out.println("2. Number Program");
			System.out.println("9. Exit ");
			System.out.println("Enter Your Choice:-");
			main_choice = scan.nextInt();

			switch (main_choice) { // start main_choice switch block
			case 1: { // start main_choice switch block case 1

				//				yield type;
				int sub_choice_1;

				do { // start of sub_choice do-while loop
					System.out.println("YOU PRESS \"1\" ");
					System.out.println("== WELCOME TO PATTERN PROGRAM ==");
					System.out.println("1. Alphabet Pattern");
					System.out.println("2. Star Pattern");
					System.out.println("3. Number Pattern");
					System.out.println("9. Exit ");
					System.out.println("Enter Your Choice:-");
					sub_choice_1 = scan.nextInt();

					switch (sub_choice_1) { // start of sub_choice switch block
					case 1: { // start of sub_choice switch block case 1

						//						yield type;
						int sub_sub_choice_1;

						do { // start of sub_sub_choice_1 do-while loop 
							System.out.println("YOU PRESS \"1\" ");
							System.out.println("== WELCOME TO ALPHABET PATTERN ==");
							System.out.println("1. A Pattern");
							System.out.println("2. B Pattern");
							System.out.println("3. C Pattern");
							System.out.println("4. X Pattern");
							System.out.println("5. Y Pattern");
							System.out.println("6. Z Pattern");
							System.out.println("9. Exit ");
							System.out.println("Enter Your Choice:-");
							sub_sub_choice_1 = scan.nextInt();

							switch (sub_sub_choice_1) {
							case 1: { // start of sub_sub_choice_1 switch case 1

								//								yield type;
								System.out.println("YOU PRESS \"1\" ");
								System.out.println("== WELCOME TO STAR \"A\" PATTERN ==");
								System.out.println("Enter the value of num_1:-");
								int num_1 = scan.nextInt();
								System.out.println("Your Entered Value of num_1 is:-" + num_1);
								AlphabetPattern.aPattern(num_1);
							} break; // end of sub_sub_choice_1 switch case 1

							case 2: { // start of sub_sub_choice_1 switch case 2

								//								yield type;
								System.out.println("YOU PRESS \"2\" ");
								System.out.println("== WELCOME TO STAR \"B\" PATTERN ==");
								System.out.println("Enter the value of num_1:-");
								int num_1 = scan.nextInt();
								System.out.println("Your Entered Value of num_1 is:-" + num_1);
								AlphabetPattern.bPattern(num_1);
							} break; // end of sub_sub_choice_1 switch case 2

							case 3: { // start of sub_sub_choice_1 switch case 3

								//								yield type;
								System.out.println("YOU PRESS \"3\" ");
								System.out.println("== WELCOME TO STAR \"C\" PATTERN ==");
								System.out.println("Enter the value of num_1:-");
								int num_1 = scan.nextInt();
								System.out.println("Your Entered Value of num_1 is:-" + num_1);
								AlphabetPattern.cPattern(num_1);
							} break; // end of sub_sub_choice_1 switch case 3

							case 4: { // start of sub_sub_choice_1 switch case 4

								//								yield type;
								System.out.println("YOU PRESS \"4\" ");
								System.out.println("== WELCOME TO STAR \"X\" PATTERN ==");
								System.out.println("Enter the value of num_1:-");
								int num_1 = scan.nextInt();
								System.out.println("Your Entered Value of num_1 is:-" + num_1);
								AlphabetPattern.xPattern(num_1);
							} break; // end of sub_sub_choice_1 switch case 4

							case 5: { // start of sub_sub_choice_1 switch case 5

								//								yield type;
								System.out.println("YOU PRESS \"5\" ");
								System.out.println("== WELCOME TO STAR \"Y\" PATTERN ==");
								System.out.println("Enter the value of num_1:-");
								int num_1 = scan.nextInt();
								System.out.println("Your Entered Value of num_1 is:-" + num_1);
								AlphabetPattern.yPattern(num_1);
							} break; // end of sub_sub_choice_1 switch case 5

							case 6: { // start of sub_sub_choice_1 switch case 6

								//								yield type;
								System.out.println("YOU PRESS \"6\" ");
								System.out.println("== WELCOME TO STAR \"Z\" PATTERN ==");
								System.out.println("Enter the value of num_1:-");
								int num_1 = scan.nextInt();
								System.out.println("Your Entered Value of num_1 is:-" + num_1);
								AlphabetPattern.yPattern(num_1);
							} break; // end of sub_sub_choice_1 switch case 6



							default:
								System.out.println("Invalid Choice! Please Choose Valid Choice");
								//								throw new IllegalArgumentException("Unexpected value: " + sub_sub_choice_1);
							}


						} while (sub_sub_choice_1 != 9); // end of sub_sub_choice_1 do-while loop

					} break; // end of sub_choice switch block case 1

					case 2: { // start of sub_choice switch block case 2

						//						yield type;

					} break; // end of sub_choice switch block case 2

					case 3: { // start of sub_choice switch block case 3

						//						yield type;
					} break; // end of sub_choice switch block case 3

					case 9: { // start of sub_choice switch block case 9

						//						yield type;
					} break; // end of sub_choice switch block case 9

					default:
						//						throw new IllegalArgumentException("Unexpected value: " + sub_choice);
					} // end of sub_choice switch block 


				} while (sub_choice_1 != 9); // end of sub_choice do-while loop

			} break; // end of main_choice switch block case 1

			case 2: { // start of main_choice switch block case 2

				//				yield type;
				int sub_choice_2;

				do { // start of sub_choice do-while loop
					System.out.println("YOU PRESS \"2\" ");
					System.out.println("== WELCOME TO NUMBER PROGRAM ==");
					System.out.println("1. Number Program");
					System.out.println("2. Number Series");
					System.out.println("9. Exit");
					System.out.println("Enter Your Choice:-");
					sub_choice_2 = scan.nextInt();

					switch (sub_choice_2) { // start of sub_choice switch block
					case 1: { // start of sub_choice switch block case 1

						//						yield type;
						int sub_sub_choice_2;

						do { // start of sub_sub_choice do-while loop
							System.out.println("YOU PRESS \"1\" ");
							System.out.println("== WELCOME TO NUMBER PROGRAM ==");
							System.out.println("1. Palindrome Number");
							System.out.println("2. Niven Number");
							System.out.println("3. Special Number");
							System.out.println("4. Spy Number");
							System.out.println("5. Duck Number");
							System.out.println("9. Exit");
							System.out.println("Enter Your Choice:-");
							sub_sub_choice_2 = scan.nextInt();

							switch (sub_sub_choice_2) { // start of sub_sub_choice_2 switch block
							case 1: { // start of sub_sub_choice_2 switch block case 1

								//								yield type;
								System.out.println("YOU PRESS \"1\" ");
								System.out.println("== WELCOME TO PALINDROME NUMBER PROGRAM ==");
								System.out.println("Enter The value of num_1:-");
								int num_1 = scan.nextInt();
								System.out.println("Your Entered value of num_1 is:-" + num_1);
								AllNumberProgram.palindrome(num_1);

							} break; // end of sub_sub_choice_2 switch block case 1

							case 2: { // start of sub_sub_choice_2 switch block case 2

								//								yield type;
								System.out.println("YOU PRESS \"2\" ");
								System.out.println("== WELCOME TO NiVEN NUMBER PROGRAM ==");
								System.out.println("Enter The value of num_1:-");
								int num_1 = scan.nextInt();
								System.out.println("Your Entered value of num_1 is:-" + num_1);
								AllNumberProgram.nivenOrHarshadNumber(num_1);

							} break; // end of sub_sub_choice_2 switch block case 2
							
							case 3: { // start of sub_sub_choice_2 switch block case 3

								//								yield type;
								System.out.println("YOU PRESS \"3\" ");
								System.out.println("== WELCOME TO SPECIAL NUMBER PROGRAM ==");
								System.out.println("Enter The value of num_1:-");
								int num_1 = scan.nextInt();
								System.out.println("Your Entered value of num_1 is:-" + num_1);
								AllNumberProgram.specialNumber(num_1);

							} break; // end of sub_sub_choice_2 switch block case 3
							
							case 4: { // start of sub_sub_choice_2 switch block case 4

								//								yield type;
								System.out.println("YOU PRESS \"4\" ");
								System.out.println("== WELCOME TO SPECIAL NUMBER PROGRAM ==");
								System.out.println("Enter The value of num_1:-");
								int num_1 = scan.nextInt();
								System.out.println("Your Entered value of num_1 is:-" + num_1);
								AllNumberProgram.specialNumber(num_1);

							} break; // end of sub_sub_choice_2 switch block case 4
							
							case 5: { // start of sub_sub_choice_2 switch block case 5

								//								yield type;
								System.out.println("YOU PRESS \"5\" ");
								System.out.println("== WELCOME TO DUCK NUMBER PROGRAM ==");
								System.out.println("Enter The value of num_1:-");
								int num_1 = scan.nextInt();
								System.out.println("Your Entered value of num_1 is:-" + num_1);
								AllNumberProgram.duckNumber(num_1);

							} break; // end of sub_sub_choice_2 switch block case 5
							
							default:
								System.out.println("Invalid Choice! Please Choose Valid Choice");
								//								throw new IllegalArgumentException("Unexpected value: " + sub_sub_choice_2);
							} // end of sub_sub_choice_2 switch block 

						} while (sub_sub_choice_2 != 9); // end of sub_sub_choice do-while loop

					} break; // end of sub_choice switch block case 1

					case 2: { // start of sub_choice switch block case 2

						//						yield type;
					} break; // end of sub_choice switch block case 2

					case 3: { // start of sub_choice switch block case 3

						//						yield type;
					} break; // end of sub_choice switch block case 3

					case 9: { // start of sub_choice switch block case 9

						//						yield type;
					} break; // end of sub_choice switch block case 9

					default:
						//						throw new IllegalArgumentException("Unexpected value: " + sub_choice);
					} // end of sub_choice switch block 


				} while (sub_choice_2 != 9); // end of sub_choice do-while loop
			} break; // end of main_choice switch block case 2

			case 9: { // start of main_choice switch block case 9

				//				yield type;
			} break; // end of main_choice switch block case 9

			default:
				//				throw new IllegalArgumentException("Unexpected value: " + main_choice);
			} // end of main_choice switch block

		} while (main_choice != 9); // end of main do-while loop 

		scan.close(); // connection close 

	}

}
