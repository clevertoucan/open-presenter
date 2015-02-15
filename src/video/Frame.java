// file: EmptyFrame.java
// Adapted from Core Java, vol.1, by Horstmann & Cornell
	package video;
	import javax.swing.*;
	import java.awt.*;
	
class Frame extends JFrame {
	  	GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
		int width = gd.getDisplayMode().getWidth();
		int height = gd.getDisplayMode().getHeight();
		
	public Frame() {
		setTitle("My Empty Frame");
		setSize(width/2,height/2); // default size is 0,0
		setLocation(width/4,height/4); // default is 0,0 (top left corner)
		setBackground(Color.white);
	}
	
	public static void main(String[] args) {
		JFrame f = new Frame();
		f.setVisible(true);
	}
}