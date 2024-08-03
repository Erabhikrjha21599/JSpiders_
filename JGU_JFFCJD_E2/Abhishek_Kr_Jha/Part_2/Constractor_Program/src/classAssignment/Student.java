/**
 * 
 */
package classAssignment;

/**
 * 
 */
public class Student {

	String name;
	int roll;
	static String cname = "jsp";

	Student(String n){

		//name = n;
		System.out.println("Accoutn Is Created And Name Is Updated");

	}

	Student(String n, int r){

		System.out.println("Accoutn Is Created And Name And Roll Is Updated");

	}

	Student(int r){

		//roll = r;
		System.out.println("Accoutn Is Created And Roll Is Updated");

	}
	Student(){


		System.out.println("Accoutn Is Created And Date Is Not Updated");

	}
	
	public  void printDetails() {
		
		System.out.println(name);
		System.out.println(roll);
		
	}
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student();
		s1.printDetails();
		
		Student s2 = new Student(5);
		s1.printDetails();
		
		Student s3 = new Student("Dev" , 5);
		s3.printDetails();
		
		Student s4 = new Student("Devi" , 50);
		s4.printDetails();
		
		Student s5 = new Student("DeviLal");
		s5.printDetails();

	}

}
