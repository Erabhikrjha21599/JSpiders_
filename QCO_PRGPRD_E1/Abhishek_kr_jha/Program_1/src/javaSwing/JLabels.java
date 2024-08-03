/**
 * 
 */
package javaSwing;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;



/**
 * 
 */
public class JLabels {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// JLabel = a GUI display area for a string of text, an image, or botbh
		
		ImageIcon image = new ImageIcon("java.png");
		
		JLabel label = new JLabel(); // create a label 
		label.setText("Hello Abhishek kr jha"); // set text of label
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT, CENTER, RIGHTof imageicon
		label.setVerticalTextPosition(JLabel.TOP); // set text TOP, CENTER, BOTTOM of imageicom
		label.setForeground(Color.green); // set font color of text
		label.setFont(new Font("MV Boli",Font.PLAIN,20)); // set font of text
		label.setIconTextGap(-25); // set gap of text to image
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.add(label);
		
		
		
		

	}

	

}
