/**
 * 
 */
package assignment;

/**
 * 
 */
public class Student {
	
	String s_name;
	int s_roll;
	
	

	/**
	 * @return the s_name
	 */
	public void getS_name(int s_roll) {
		if (this.s_roll == s_roll) {
			System.out.println(this.s_name);
			
		} else {
//			System.out.println("invalid Pwd");
			try {
				throw new InvalidPwd();
			}catch(InvalidPwd i) {
				System.out.println(i.getMessage());
//				i.getStackTrace();
				
			}

		}
	}



	/**
	 * @param s_name the s_name to set
	 */
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}



	/**
	 * @return the s_roll
	 */
	public int getS_roll() {
		return s_roll;
	}



	/**
	 * @param s_roll the s_roll to set
	 */
	public void setS_roll(int s_roll) {
		this.s_roll = s_roll;
	}



	/**
	 * @param s_name
	 * @param s_roll
	 */
	public Student(String s_name, int s_roll) {
		this.s_name = s_name;
		this.s_roll = s_roll;
	}



	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s = new Student("Abhishek", 20);
		
//		System.out.println(s.getS_name());
		System.out.println(s.getS_roll());
		s.getS_name(40);

	}

}
