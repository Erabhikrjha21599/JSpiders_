/**
 * 
 */
package assignmnet;

/**
 * 
 */
public class Employee {

	private String emp_name; // r
	private int emp_salary; // r/w
	private int emp_id; // r
	private int emp_joiningdate; // r
	private String emp_cname; // r

	public Employee(String emp_name, int emp_salary, int emp_id, int emp_joiningdate, String emp_cname) {
		this.emp_name = emp_name;
		this.emp_salary = emp_salary;
		this.emp_id = emp_id;
		this.emp_joiningdate = emp_joiningdate;
		this.emp_cname = emp_cname;
	}

	public String getEmpName(int emp_id) {
//		this.emp_id = emp_id;
		if (this.emp_id == emp_id) {
			return emp_name;

		} else {
			return "Invalid id";

		}
//		return emp_name;

	}

	public int getEmpSalary(int emp_id) {
//		this.emp_id = emp_id;
		if (this.emp_id == emp_id) {
			return emp_salary;

		} else {
			System.out.println("Invalid id");

		}
		return emp_salary;

	}

	public void setEmpSalary(int emp_salary) {
		this.emp_salary = emp_salary;

	}

	public int getEmpId() {
		return emp_id;

	}

	public int getEmpJoiningDate(int emp_id) {
//		this.emp_id = emp_id;
		if (this.emp_id == emp_id) {
			return emp_joiningdate;

		} else {
			System.out.println("Invalid id");

		}
		return emp_joiningdate;

	}

	public String getEmpCname(int emp_id) {
//		this.emp_id = emp_id;
		if (this.emp_id == emp_id) {
			return emp_cname;

		} else {
			return "Invalid id";

		}
//		return emp_cname;
	}

	/**
	 * @param args
	 * 
	 *             public static void main(String[] args) { // TODO Auto-generated
	 *             method stub
	 * 
	 *             Employee scan_c = new Employee(null, 0, 0, 0, null);
	 * 
	 * 
	 *             System.out.println(scan_c.getEmpName());
	 * 
	 *             System.out.println(scan_c.getEmpSalary());
	 *             scan_c.setEmpSalary(5000);
	 *             System.out.println(scan_c.getEmpSalary());
	 * 
	 *             System.out.println(scan_c.getEmpId());
	 * 
	 *             System.out.println(scan_c.getEmpJoiningDate());
	 * 
	 *             System.out.println(scan_c.getEmpCname());
	 * 
	 * 
	 * 
	 * 
	 *             }
	 */
}
