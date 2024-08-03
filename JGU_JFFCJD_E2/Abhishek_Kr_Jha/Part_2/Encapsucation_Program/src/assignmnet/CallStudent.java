/**
 * 
 */
package assignmnet;

/**
 * 
 */
public class CallStudent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Student scan_c = new Student(null, 0, 0, 0, null, null);
		
//		scan_c.getStuName();
		System.out.println(scan_c.getStuName());
		
		scan_c.setStuPhno(8002564538L);
		System.out.println(scan_c.getStuPhno());
		
		System.out.println(scan_c.getStuRollno());
		
		scan_c.setStuMark(75.2F);
		System.out.println(scan_c.getStuMark());
		
		System.out.println(scan_c.getStuCollegeName());

	}

}
