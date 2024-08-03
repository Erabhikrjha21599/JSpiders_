/**
 * 
 */
package assignmnet;

/**
 * 
 */
public class CallWhatsApp {

	/**
	 * @param args
	 */
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

}
