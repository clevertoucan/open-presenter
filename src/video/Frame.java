// file: EmptyFrame.java
// Adapted from Core Java, vol.1, by Horstmann & Cornell
	package video;
	import javax.swing.*;
import javax.swing.plaf.basic.BasicButtonListener;

import java.awt.*;
import java.util.Random;
	
class Frame extends JFrame {
	  	GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
		int width = gd.getDisplayMode().getWidth();
		int height = gd.getDisplayMode().getHeight();
		
	public Frame() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("My Empty Frame");
		setSize(width/2,height/2); // default size is 0,0
		setLocation(width/4,height/4); // default is 0,0 (top left corner)
		this.setRandBackColor();
		JButton setFreq = new JButton("Set Frequency");
		BasicButtonListener m = new BasicButtonListener(setFreq);
	}
	
	public void setRandBackColor(){
		Random rand = new Random();
	    int r= rand.nextInt(255);
	    int g= rand.nextInt(255);
	    int b= rand.nextInt(255);
		Color c = new Color(r,g,b);
		this.getContentPane().setBackground(c);
	}
}