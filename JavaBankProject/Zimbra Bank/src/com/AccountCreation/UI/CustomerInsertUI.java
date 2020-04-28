package com.AccountCreation.UI;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import com.AccountCreation.BSL.CustomerBSL;
import java.sql.*;
import java.util.Random;


public class CustomerInsertUI extends JFrame implements ActionListener
{

	JLabel lblid,lblCustomerName,lblDOB,lblFathersName,lblMaritalStatus,lblGender,lblCommunicationAddress,lblContactDetails,lblNominationName,lblNomineeAddress,lblStatusOfIdProof,lblStatusOfAddressProof,lblIDProofDocument,lblAddressProofDocument,lblRequestID,lblRequestDate,lblStatusOfRequest,lblStatusOfAccountOpening;
	JTextField txtCustomerName,txtDOB,txtFathersName,txtMaritalStatus,txtCommunicationAddress,txtContactDetails,txtNominationName,txtNomineeAddress,txtIDProofDocument,txtAddressProofDocument,txtRequestID,txtRequestDate;
	
	JButton submit;
	static JComboBox ddStatusOfRequest,ddStatusOfAccountOpening,ddStatusOfIdProof,ddStatusOfAddressProof,btnGender;
	String status[]={"Pending"};
	String type[]={"...........................................................................","Male","Female"};
	ResultSet rs;
	
	public CustomerInsertUI() 
	{
		//setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		 setTitle("Customer Registration");
		setLayout(null);
	
        lblid=new JLabel("Customer ID");
        lblid.setBounds(50,10,200,30);
        add(lblid);
        

		lblCustomerName=new JLabel("Enter Customer Name ");
		lblCustomerName.setBounds(50, 30, 200, 30);
		add(lblCustomerName);
		
		lblDOB=new JLabel("Enter Date Of Birth  ");
		lblDOB.setBounds(50, 70, 200, 30);
		add(lblDOB);
		
		
		lblFathersName=new JLabel("Enter Father's Name  ");
		lblFathersName.setBounds(50,110, 200, 30);
		add(lblFathersName);

		lblGender=new JLabel("Enter Gender ");
		lblGender.setBounds(50,150, 200, 30);
		add(lblGender);
		
		lblMaritalStatus=new JLabel("Enter Marital Status ");
		lblMaritalStatus.setBounds(50,190, 200, 30);
		add(lblMaritalStatus);
		
		lblCommunicationAddress=new JLabel("Enter Communication Address ");
		lblCommunicationAddress.setBounds(50,230, 200, 30);
		add(lblCommunicationAddress);
		
		lblContactDetails=new JLabel("Enter Contact Details ");
		lblContactDetails.setBounds(50,270, 200, 30);
		add(lblContactDetails);
		
		lblNominationName=new JLabel("Enter Nomination Name ");
		lblNominationName.setBounds(50,310, 200, 30);
		add(lblNominationName);
		
		lblNomineeAddress=new JLabel("Enter Nominee Address ");
		lblNomineeAddress.setBounds(50,350, 200, 30);
		add(lblNomineeAddress);
		
		lblStatusOfIdProof=new JLabel("Enter Status Of ID Proof ");
		lblStatusOfIdProof.setBounds(50,390, 200, 30);
		add(lblStatusOfIdProof);
		
		lblStatusOfAddressProof=new JLabel("Enter Status Of Adress Proof ");
		lblStatusOfAddressProof.setBounds(50,430, 200, 30);
		add(lblStatusOfAddressProof);
		
		lblIDProofDocument=new JLabel("Enter ID Proof Document ");
		lblIDProofDocument.setBounds(50,470, 200, 30);
		add(lblIDProofDocument);
		
		lblAddressProofDocument=new JLabel("Enter Address Proof Document ");
		lblAddressProofDocument.setBounds(50,510, 200, 30);
		add(lblAddressProofDocument);
	
	
		lblRequestDate=new JLabel("Enter Request Date");
		lblRequestDate.setBounds(50, 550, 160, 30);
		add(lblRequestDate);	
		
		
		lblStatusOfRequest=new JLabel("Enter Status Of Request ");
		lblStatusOfRequest.setBounds(50,590, 200, 30);
		add(lblStatusOfRequest);
		
		
		lblStatusOfAccountOpening=new JLabel("Enter Status of Account opening ");
		lblStatusOfAccountOpening.setBounds(50,630, 200, 30);
		add(lblStatusOfAccountOpening);
		
	
	
		txtCustomerName=new JTextField();
		txtCustomerName.setBounds(300, 30, 250, 30);
		add(txtCustomerName);
		
		txtDOB=new JTextField();
		txtDOB.setBounds(300, 70, 250, 30);
		add(txtDOB);
		
		txtFathersName=new JTextField();
		txtFathersName.setBounds(300, 110, 250, 30);
		add(txtFathersName);
	
		btnGender=new JComboBox(type);
		btnGender.setBounds(300, 150, 250, 30);
		add(btnGender);
		
		txtMaritalStatus=new JTextField();
		txtMaritalStatus.setBounds(300, 190, 250, 30);
		add(txtMaritalStatus);
		
		txtCommunicationAddress=new JTextField();
		txtCommunicationAddress.setBounds(300, 230, 250, 30);
		add(txtCommunicationAddress);
		
		txtContactDetails=new JTextField();
		txtContactDetails.setBounds(300, 270, 250, 30);
		add(txtContactDetails);
		
		txtNominationName=new JTextField();
		txtNominationName.setBounds(300, 310, 250, 30);
		add(txtNominationName);
		
		txtNomineeAddress=new JTextField();
		txtNomineeAddress.setBounds(300, 350, 250, 30);
		add(txtNomineeAddress);
		
		ddStatusOfIdProof=new JComboBox(status);
		ddStatusOfIdProof.setBounds(300, 390, 250, 30);
		add(ddStatusOfIdProof);
		
		ddStatusOfAddressProof=new JComboBox(status);
		ddStatusOfAddressProof.setBounds(300, 430, 250, 30);
		add(ddStatusOfAddressProof);
		
		txtIDProofDocument=new JTextField();
		txtIDProofDocument.setBounds(300, 470, 250, 30);
		add(txtIDProofDocument);
		
		txtAddressProofDocument=new JTextField();
		txtAddressProofDocument.setBounds(300, 510, 250, 30);
		add(txtAddressProofDocument);
	
		
		txtRequestDate=new JTextField();
		txtRequestDate.setBounds(300, 550, 250, 30);
		add(txtRequestDate);
		
		ddStatusOfRequest=new JComboBox(status);
		ddStatusOfRequest.setBounds(300, 590, 250, 30);
		add(ddStatusOfRequest);
		
		ddStatusOfAccountOpening=new JComboBox(status);
		ddStatusOfAccountOpening.setBounds(300, 630, 250, 30);
		add(ddStatusOfAccountOpening);
		
		
		
		submit=new JButton("Insert Customer Details");
		submit.setBounds(230, 670, 200, 30);
			add(submit);
			
			submit.addActionListener(this);//Register the button for Action
			
			Dimension dimen=Toolkit.getDefaultToolkit().getScreenSize();
			int height=dimen.height;
			int width=dimen.width;
			
			//setBounds(0,0,dimen.width,dimen.height);
			setSize(width/2,height);
			setLocationRelativeTo(null);
		
		setVisible(true);
		
	 
	}
	
	public static int RandomGeneration()
	{
		Random r=new Random();
		 long START =100000000L;
		 long END=999999999L;
		 if(START>END)
	     throw new IllegalArgumentException("Start cannot exceed End.");		
		 long range=END-START +1;
		 long fraction=(long)(range*r.nextInt());
		 int randomNumber=(int)(START+fraction);
		 if(randomNumber>=0)
		 return randomNumber;
		 else
		 return -randomNumber;
		 
	}
	
	
	public void actionPerformed(ActionEvent  e)
	{
		try
		{
		if(e.getSource()==submit)
		{
			
			int reqid=RandomGeneration();
			String name=txtCustomerName.getText();
			String dob=txtDOB.getText();
			String fname=txtFathersName.getText();
			String mstatus=txtMaritalStatus.getText();
			String gen=btnGender.getSelectedItem().toString();
			String ca=txtCommunicationAddress.getText();
			String cd=txtContactDetails.getText();
			String nn=txtNominationName.getText();
			String na=txtNomineeAddress.getText();
			String statusid=ddStatusOfIdProof.getSelectedItem().toString();
		    String statusadd=ddStatusOfAddressProof.getSelectedItem().toString();
			String idproof=txtIDProofDocument.getText();
			String adproof=txtAddressProofDocument.getText();	
			String reqdate=txtRequestDate.getText();
			String statusofreq=ddStatusOfRequest.getSelectedItem().toString();
			String statusofaccountopening=ddStatusOfAccountOpening.getSelectedItem().toString();
					
			
			
			int val=CustomerBSL.insertCustomer(name,dob,fname,gen,mstatus,ca,cd,nn,na,statusid,statusadd,idproof,adproof,reqid,reqdate,statusofreq,statusofaccountopening);
			if(val>0)
				{
				JOptionPane.showMessageDialog(null, "Data Inserted Successfully", "Confirmation Message", JOptionPane.INFORMATION_MESSAGE);
				//txtRequestID.setText(Integer.toString(reqid));
				}	
			else
				{
				JOptionPane.showMessageDialog(null, "Data Not Inserted ", "Confirmation Message", JOptionPane.INFORMATION_MESSAGE);
				}
			
			
		}
		}
		catch(Exception ess)
		{
			JOptionPane.showMessageDialog(null, ess.toString(), "Error Message", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
		 
			
	public static void main(String[] args) 
	{
		new CustomerInsertUI(); 
	}

}
