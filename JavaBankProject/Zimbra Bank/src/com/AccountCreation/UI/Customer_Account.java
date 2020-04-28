package com.AccountCreation.UI;

import java.sql.*;
import java.util.ArrayList;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

import com.AccountCreation.BSL.CustomerBSL;;


		
		public class Customer_Account extends JFrame   
		{
			
			
			Connection con;
			ResultSet rs;
			PreparedStatement pst;
			JTable table;
			
			String[] columnNames = {"Customer ID","Name","Date of Birth","Father's Name/Spouse Name","Gender","Marital Status","Communication Address","Contact Details","Nomination Name","Nominee Address"};
			
			public Customer_Account()
			{
			    //setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
				
				 setTitle("Simple example");
				setLayout(null);
				DefaultTableModel model=new DefaultTableModel();
				model.setColumnIdentifiers(columnNames);

				
				
			
			table=new JTable();
		 
			table.setModel(model);
			
				table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
				table.setFillsViewportHeight(true);

		        JScrollPane scroll = new JScrollPane(table);

		        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

		        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		        add(scroll);
				try
				{
					
					
					rs=CustomerBSL.fetchAllCustomer();
			
					while(rs.next())
					{
						model.addRow(new Object[]{rs.getInt(14),rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9)});
						
					}
					
					
					
				}
		                catch(Exception e)
				{
					System.out.print(e.toString());
				}
				add(table);
				table.setBounds(90, 60, 1200, 800);
				
				Dimension dimen=Toolkit.getDefaultToolkit().getScreenSize();
				int height=dimen.height;
				int width=dimen.width;
		
				setSize(width,height/2);
				setLocationRelativeTo(null);
				setVisible(true);
				
			}
			
			
			public static void main(String[] args) 
			{
				
					new Customer_Account();
			}

		}

