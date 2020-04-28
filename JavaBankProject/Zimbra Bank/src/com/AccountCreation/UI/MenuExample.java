package com.AccountCreation.UI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class MenuExample implements ActionListener 
{

	
	 private JFrame frame;
	  private JMenuBar menuBar;
	  private JMenu fileMenu;
	  private JMenu editMenu;
	  private JMenuItem openMenuItem;
	  private JMenuItem viewMenuItem;
	  private JMenuItem exitMenu;
	  private JMenuItem cutMenuItem;
	
	public MenuExample() 
	{
		frame = new JFrame("Welcome To Zimbra Bank ");
	    menuBar = new JMenuBar();
	    
	    // build the File menu
	    fileMenu = new JMenu("File");
	    openMenuItem = new JMenuItem("Create Customer Account");
	    openMenuItem.addActionListener(this);
	    viewMenuItem = new JMenuItem("View Customer Details");
	    viewMenuItem.addActionListener(this);
	    exitMenu=new JMenuItem("Exit");
	    exitMenu.addActionListener(this);
	    fileMenu.add(openMenuItem);
	    fileMenu.add(viewMenuItem);
	    fileMenu.add(exitMenu);
	 
	    // build the Edit menu
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
				new CustomerInsertUI();
				//frame.setVisible(false);
			}
			
			if(e.getSource()==viewMenuItem)
			{
				JOptionPane.showMessageDialog(null, "Restricted","Message",JOptionPane.INFORMATION_MESSAGE);
				
			}
			
			if(e.getSource()==exitMenu)
			{
				System.exit(0);
			}
			
			if(e.getSource()==cutMenuItem)
			{
				JOptionPane.showMessageDialog(null, "Restricted","Message",JOptionPane.INFORMATION_MESSAGE);
			}
		
		
	}
	
	
	public static void main(String[] args) 
	{
			new  MenuExample();

	}

}
