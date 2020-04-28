package com.AccountCreation.UI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class MenuOfficer implements ActionListener 
{

	
	 private JFrame frame;
	  private JMenuBar menuBar;
	  private JMenu fileMenu;
	  private JMenu editMenu;
	  private JMenuItem openMenuItem;
	  private JMenuItem viewMenuItem;
	  private JMenuItem exitMenuItem;
	  private JMenuItem cutMenuItem;
	
	public MenuOfficer() 
	{
		
		frame = new JFrame("Welcome To Zimbra Bank");
	    menuBar = new JMenuBar();
	    
	    //build the File menu
	    fileMenu = new JMenu("File");
	    openMenuItem = new JMenuItem("Create Customer Account");
	    openMenuItem.addActionListener(this);
	    viewMenuItem = new JMenuItem("View Customer Details");
	    viewMenuItem.addActionListener(this);
	    exitMenuItem = new JMenuItem("Exit");
	    exitMenuItem.addActionListener(this);
	    fileMenu.add(openMenuItem);
	    fileMenu.add(viewMenuItem);
	    fileMenu.add(exitMenuItem);
	 
	    //build the Edit menu
	    editMenu = new JMenu("Edit");
	    cutMenuItem = new JMenuItem("Modify Customer Details");
	    cutMenuItem.addActionListener(this);
	    editMenu.add(cutMenuItem);
	 
	    // add menus to menubar
	    menuBar.add(fileMenu);
	    menuBar.add(editMenu);
	 
	    // put the menubar on the frame
	    frame.setJMenuBar(menuBar);
	 
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setPreferredSize(new Dimension(2000,2000));
	    frame.pack();
	    frame.setLocationRelativeTo(null);
	    frame.setVisible(true);
	}
	
	
	public void actionPerformed(ActionEvent e)
	{
		
		if(e.getSource()==openMenuItem)
		{
			JOptionPane.showMessageDialog(null, "Restricted","Message",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(e.getSource()==viewMenuItem)
		{
			new Customer_Account();	
			//frame.setVisible(false);
		}
		
		if(e.getSource()==exitMenuItem)
		{
			System.exit(0);
		}
			
			if(e.getSource()==cutMenuItem)
			{
				new SelectByID_Update();	
				//frame.setVisible(false);
			}
		
		
	}
	
	
	public static void main(String[] args) 
	{
		new  MenuOfficer();

	}

}

