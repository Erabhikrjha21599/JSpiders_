/**
 * 
 */
package array;

/**
 * 
 */
public class Student {
	
	String s_name;
	int s_roll;
	long s_phno;
	
	

	/**
	 * @param s_name
	 * @param s_roll
	 * @param s_phno
	 */
	public Student(String s_name, int s_roll, long s_phno) {
		this.s_name = s_name;
		this.s_roll = s_roll;
		this.s_phno = s_phno;
	}



	/**
	 * @param args
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student("Abhishek kr jha", 2072042, 8002564538L);
		Student s2 = new Student("Sonu kumar", 2072036, 9576184519L);
		Student s3 = new Student("Raushan kumar", 2072051, 8002564538L);
		Student s4 = new Student("Jigmet", 2072050, 8002564538L);
		Student s5 = new Student("Mritunjay chaudhary", 2072039, 8002564538L);
		Student s6 = new Student("Roushan kumar", 2072055, 8002564538L);
		
		Student s[] = {s1, s2, s3, s4, s5, s6};
		
		System.out.println(s[0].s_roll);
		System.out.println(s[1].s_roll);
		System.out.println(s[2].s_roll);
		System.out.println(s[3].s_roll);
		System.out.println(s[4].s_roll);
		System.out.println(s[5].s_roll);
		
		for (Student student : s) {
			System.out.println(s);
		}
		
		
		
	}
	 

}
