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
public class FileRead_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String spath_2 = "Folder_1/File_1.txt";
		File f2 = new File(spath_2); 
		
		
		try {
			FileReader fr2 = new FileReader(f2);
			System.out.println((char) fr2.read());
			System.out.println((char) fr2.read());
			System.out.println((char) fr2.read());
			System.out.println((char) fr2.read());
			System.out.println((char) fr2.read());
			System.out.println((char) fr2.read());
			System.out.println((char) fr2.read());
			System.out.println((char) fr2.read());
			System.out.println((char) fr2.read());
			System.out.println((char) fr2.read());
			System.out.println((char) fr2.read());
			System.out.println((char) fr2.read());
			System.out.println((char) fr2.read());
			System.out.println((char) fr2.read());
			
//			int i = fr2.read();
//			while (i != -1) {
//				System.out.println((char)i);
//				i = fr2.read();
//			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
		}
		

	}

}
