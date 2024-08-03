/**
 * 
 */
package assignmnet;

/**
 * 
 */
public class CallEmployee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee scan_c = new Employee(null, 0, 21, 0, null);

		System.out.println(scan_c.getEmpName(21));

		System.out.println(scan_c.getEmpSalary(21));
		scan_c.setEmpSalary(5000);
		System.out.println(scan_c.getEmpSalary(21));

		System.out.println(scan_c.getEmpId());

		System.out.println(scan_c.getEmpJoiningDate(21));

		System.out.println(scan_c.getEmpCname(21));
	}

}
