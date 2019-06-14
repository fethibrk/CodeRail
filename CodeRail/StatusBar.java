package CodeRail;

/*
================================================================================
						Project CodeRail
================================================================================

	Author:
			Suraj Singh Bisht
			surajsinghbisht054@gmail.com


			himanshu sharma
	


*/


// import modules
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;


// status bar
public class StatusBar extends JPanel {
	
	//variables to store some useful data
	private Editor editor;
	private JLabel TabSize=new JLabel();
	private JLabel TotalLine = new JLabel();
	private int tabsize;
	private int totalline;
	

	// Constructor
	public StatusBar(Editor e){
		
		// Initialize editor  object
		editor = e;

		// Configurations
		setVisible(true);
		setFocusable(true);
		setBackground(Color.WHITE);
		setLayout(new FlowLayout(FlowLayout.RIGHT,10,5));
		
		//Calling  methods
		TabSize();
		TotalLine();
	}

	
	//method to display tab size
	public void TabSize()
	{	
		tabsize=editor.getTabSize();
		TabSize.setText("Tab Size: "+tabsize);
		TabSize.setBounds(2,10,10,30);
		add(TabSize);

	}

	//method to display total number of line
	public void TotalLine()
	{

		totalline=editor.getLineCount();
		TotalLine.setText("Total Lines: "+totalline);
		add(TotalLine);
	}

}


