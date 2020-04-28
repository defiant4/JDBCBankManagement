package com.AccountCreation.UI;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import com.AccountCreation.BSL.CustomerBSL;
import java.sql.*;


public class UserInsertUI extends JFrame implements ActionListener
{
	
	JLabel lblname,lblpass;
	JTextField txtname;
	JPasswordField txtpass;
	
	
		
	JButton submit,cancel;
	
	public UserInsertUI() 
	{
		
		setTitle("Zimbra Bank Employee Log-In");
		setLayout(null);
		

		lblname=new JLabel("Enter Username : ");
		lblname.setBounds(50, 90, 200, 20);
		add(lblname);
		
		

		lblpass=new JLabel("Enter Password : ");
		lblpass.setBounds(50,150, 200, 20);
		add(lblpass);
		
		
		txtname=new JTextField();
		txtname.setBounds(200, 90, 200, 20);
		add(txtname);
		
		txtpass=new JPasswordField();
		txtpass.setBounds(200, 150, 200, 20);
		txtpass.setEchoChar('*');
		add(txtpass);
		
		
		submit=new JButton("LOG  IN");
		submit.setBounds(30, 240, 150, 30);
			add(submit);
			
		cancel=new JButton("Cancel");
		cancel.setBounds(260,240,150,30);
		    add(cancel);
			
		  //Register the button for Action
		    submit.addActionListener(this);
			cancel.addActionListener(this);
			
			Dimension dimen=Toolkit.getDefaultToolkit().getScreenSize();
			int height=dimen.height;
			int width=dimen.width;
	
			setSize(width/3,height/2);
			setLocationRelativeTo(null);
		
		 setVisible(true);
		
	 
	}
	
	
	
	
	public void actionPerformed(ActionEvent  e)
	{
		try
		{
		if(e.getSource()==submit)
		{ 
			String username=txtname.getText();
			String password=txtpass.getText();
						
			String value=CustomerBSL.validateUser(username,password);
			
			if(value.equals("0"))
			{
				new MenuExample();
				UserInsertUI.this.dispose();
				UserInsertUI.this.setVisible(false);
			}
			if(value.equals("1"))
			{
				new MenuOfficer();
				UserInsertUI.this.dispose();
				UserInsertUI.this.setVisible(false);
			}
			
			if(value.equals("F"))
			{
				JOptionPane.showMessageDialog(null, "Incorrect Username/Password", "Confirmation Message", JOptionPane.INFORMATION_MESSAGE);	
			}
		}
		 if(e.getSource()==cancel)
		 {
			 System.exit(0);
		 }
		
		}
		catch(Exception es)
		{
			JOptionPane.showMessageDialog(null, es.toString(), "Error Message", JOptionPane.INFORMATION_MESSAGE);
		}
		
		
	}
	
	
	public static void main(String[] args) 
	{
		
      new UserInsertUI();
	}

}
