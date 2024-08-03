/**
 * 
 */
package javaSwing;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

/**
 * 
 */
public class IconExample {
	
	IconExample(){   
		JFrame f=new JFrame();   
		Image icon = Toolkit.getDefaultToolkit().getImage("java.png");  
		f.setIconImage(icon);  
		f.setLayout(null);   
		f.setSize(200,200);   
		f.setVisible(true);   
		}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new IconExample();  
		   

	}

}
