/**
 * 
 */
package javaSwing;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.ImageIcon;

/**
 * use to create a frame in java
 */
public class JFrames {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame(); 
		
		frame.setVisible(true);
		frame.setSize(320,320);
		frame.setTitle("JFrame title goes here");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		
		ImageIcon image = new ImageIcon("Abhi.jpg");
		frame.setIconImage(image.getImage());
		frame.getContentPane().setBackground(Color.gray);
//		frame.setBackground(Color.green);
		

	}

}
