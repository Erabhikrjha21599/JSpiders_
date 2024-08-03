/**
 * 
 */
package assignmnet;

/**
 * 
 */
public class WhatsApp {
	
	private long ph_no;
	private String status;
	private String bio;
	
	
	

	/**
	 * @return the ph_no
	 */
	public long getPhno() {
		return ph_no;
	}




	/**
	 * @param ph_no the ph_no to set
	 */
	public void setPhno(long ph_no) {
		this.ph_no = ph_no;
	}




	/**
	 * @return the status
	 */
	public String getStatus(long ph_no) {
		//this.ph_no = ph_no;
		if (this.ph_no == ph_no) {
			return "Statud is update";
		} else {
			return "Invalid ph_no";

		}
		//return status;
	}




	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}




	/**
	 * @return the bio
	 */
	public String getBio(long ph_no) {
		//this.ph_no = ph_no;
		if (this.ph_no == ph_no) {
			return "Bio is update";
		} else {
			return "Invalid ph_no";

		}
		//return bio;
	}




	/**
	 * @param bio the bio to set
	 */
	public void setBio(String bio) {
		this.bio = bio;
	}




	/**
	 * @param ph_no
	 * @param status
	 * @param bio
	 */
	public WhatsApp(long ph_no, String status, String bio) {
		this.ph_no = ph_no;
		this.status = status;
		this.bio = bio;
	}




	/**
	 * @param args
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WhatsApp scan_c = new WhatsApp(0, null, null);
		
		System.out.println(scan_c.getPhno());
		scan_c.setPhno(8002564538L);
		System.out.println(scan_c.getPhno());
		
		System.out.println(scan_c.getStatus(8002564538L));
		scan_c.setStatus("hello how are you");
		System.out.println(scan_c.getStatus(8002564538L));
		
		System.out.println(scan_c.getBio(8002564538L));
		scan_c.setBio("i am good in coding ");
		System.out.println(scan_c.getBio(8002564538L));
		
		
		

	}
	*/

}
