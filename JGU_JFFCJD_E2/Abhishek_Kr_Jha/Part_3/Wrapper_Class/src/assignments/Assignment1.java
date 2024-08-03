/**
 * 
 */
package assignments;

import java.util.Scanner;

/**
 * WAJP to read student information as a string value and then converted into number
 * formate
 */
public class Assignment1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s_obj = new Scanner(System.in);
		
		System.out.println("entet the studen name:- ");
		String s_name = s_obj.nextLine();
		System.out.println(s_name);
		
		
		System.out.println("enter the student roll number:- ");
		String s_roll_no = s_obj.nextLine();
		
		int s_roll = Integer.parseInt(s_roll_no);
		System.out.println(s_roll);
		
		System.out.println("enter the student batch:- ");
		String s_batch = s_obj.nextLine();
		
		int s_bat = Integer.parseInt(s_batch);
		System.out.println(s_bat);
		
		System.out.println("enter the student phone number:- ");
		String s_ph_no = s_obj.nextLine();
		
		long s_ph = Long.parseLong(s_ph_no);
		System.out.println(s_ph);
		
		System.out.println("enter the student percentage:- ");
		String s_percentage = s_obj.nextLine();
		
		float s_per = Float.parseFloat(s_percentage);
		System.out.println(s_per);
		
		s_obj.close();
		
		

	}

}
