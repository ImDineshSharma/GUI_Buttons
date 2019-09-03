//Main class

import javax.swing.JFrame;


public class apples {
     public static void main(String[] args) {
    	 
        Gui go = new Gui();
        
        go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        go.setSize(300,200);
        go.setVisible(true);
        
    	 
     }     
}



//Gui class

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Gui extends JFrame {
        // two buttons
	private JButton reg;
	private JButton custom;
	
	//constructor
	public Gui() {
		super("The title");//adds title to the window
		setLayout(new FlowLayout());// makes the layout for buttons
		
		reg = new JButton("reg Button");//create a button
		add(reg);// add that button to the screen
		
		//insert two images with Icon class
		Icon b = new ImageIcon(getClass().getResource("redbutton.png"));
		Icon x = new ImageIcon(getClass().getResource("multicolor.png"));
		
		//convert those two images into buttons
		custom = new JButton("Custom", b);
		
		
		custom.setRolloverIcon(x);//hover method so that when mouse is hovered something happns
		add(custom);// add custom button to the screen
		
		// Event handling stuff (when a button is clicked something happens)
		HandlerClass handler = new HandlerClass();// HandlerClass object
		
		//adding action listener
		reg.addActionListener(handler);
		custom.addActionListener(handler);
		

	
	}
	
		// Handler class
	private class HandlerClass implements ActionListener {
		//overrides the actionPerformed method from inherited from actionListener class
		public void actionPerformed(ActionEvent event) {
			JOptionPane.showMessageDialog(null, String.format("%s", event.getActionCommand()));
		}
	}
	
}
