/**
 * 
 */
package fileRead;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 */
public class FileRead_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String spath_1 = "Folder_1/File_1.txt";
		File f1 = new File(spath_1);
	
		try {
			FileReader fr1 = new FileReader(f1);
			
			System.out.println((char) fr1.read());
			System.out.println((char) fr1.read());
			System.out.println((char) fr1.read());
			System.out.println(fr1.read());
			
			int i = fr1.read();
			while (i != -1) {
				System.out.println((char)i);
				i = fr1.read();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
