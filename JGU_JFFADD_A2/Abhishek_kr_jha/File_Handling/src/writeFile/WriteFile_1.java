/**
 * 
 */
package writeFile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 */
public class WriteFile_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String spath_1 = "Folder_1/File_1.txt";
		File f1 = new File(spath_1);
		
//		f1.mkdir();
//		
//		try {
//			f1.createNewFile();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		try {
			FileWriter fw1 = new FileWriter(f1,true);
			fw1.write("heloo Abhishek");
			fw1.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
