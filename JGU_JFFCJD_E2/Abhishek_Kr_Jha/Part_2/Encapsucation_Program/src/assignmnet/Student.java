/**
 * 
 */
package assignmnet;

/**
 * 
 */
public class Student {
	
	private String stu_name;
	private long stu_phno;
	private int stu_rollno;
	private float stu_mark;
	private String stu_collegename;
	private String stu_aadharno; // i am not using this variable because according to Q requirement 
	
	public Student(String stu_name, long stu_phno, int stu_rollno, float stu_mark, String stu_collegename, String stu_aadharno) {
		// TODO Auto-generated constructor stub
		
		this.stu_name = stu_name;
		this.stu_phno = stu_phno;
		this.stu_rollno = stu_rollno;
		this.stu_mark = stu_mark;
		this.stu_collegename = stu_collegename;
		this.stu_aadharno = stu_aadharno;
	}
	
	public String getStuName() {
		return stu_name;
		
	}
	
	public void setStuPhno(long stu_phno) {
		this.stu_phno = stu_phno;
		
	}
	
	public long getStuPhno() {
		return stu_phno;
		
	}
	
	public int getStuRollno() {
		return stu_rollno;
		
	}
	
	public void setStuMark(float stu_mark) {
		this.stu_mark = stu_mark;
		
	}
	
	public float getStuMark() {
		return stu_mark;
		
	}
	
	public String getStuCollegeName() {
		return stu_collegename;
		
	}
	
	
	
	
	
	
	

	/**
	 * @param args
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student scan_c = new Student(null, 0, 0, 0, null, null);
		
		scan_c.getStuName();
		System.out.println(scan_c.getStuName());
		
		scan_c.setStuPhno(8002564538L);
		System.out.println(scan_c.getStuPhno());
		
		System.out.println(scan_c.getStuRollno());
		
		scan_c.setStuMark(75.2F);
		System.out.println(scan_c.getStuMark());
		
		System.out.println(scan_c.getStuCollegeName());
		
		
		
		

	}
	*/

}
