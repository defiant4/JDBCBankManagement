package com.AccountCreation.UI;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import javax.swing.*;

import com.AccountCreation.BSL.CustomerBSL;


public class SelectByID_Update extends JFrame implements ActionListener
{
	
	JLabel lblid,lblCustomerName,lblDOB,lblFathersName,lblMaritalStatus,lblGender,lblCommunicationAddress,lblContactDetails,lblNominationName,lblNomineeAddress,lblStatusOfIdProof,lblStatusOfAddressProof,lblIDProofDocument,lblAddressProofDocument,lblRequestID,lblRequestDate,lblStatusOfRequest,lblStatusOfAccountOpening;
	JTextField txtid, txtCustomerName,txtDOB,txtFathersName,txtMaritalStatus,txtCommunicationAddress,txtContactDetails,txtNominationName,txtNomineeAddress,txtIDProofDocument,txtAddressProofDocument,txtRequestID,txtRequestDate;
	
	JButton display,edit;
	
	static JComboBox ddStatusOfRequest,ddStatusOfAccountOpening,btnStatusOfIdProof,btnStatusOfAddressProof,txtGender;
	String status[]={"...............................................................................","Approved","Pending","Rejected"};
	String type[]={"...........................................................................","Male","Female"};
	ResultSet rs;
	
	
	public SelectByID_Update() 
	{
		
		//setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		 setTitle("Verification & Validations");
		setLayout(null);
		
		lblid=new JLabel("Enter Customer ID ");
		lblid.setBounds(50, 20, 350, 30);
		add(lblid);
		

		lblCustomerName=new JLabel("Enter Customer Name ");
		lblCustomerName.setBounds(50, 55, 200, 30);
		add(lblCustomerName);
		
		lblDOB=new JLabel("Enter Date Of Birth  ");
		lblDOB.setBounds(50, 90, 200, 30);
		add(lblDOB);
		
		
		lblFathersName=new JLabel("Enter Father's Name  ");
		lblFathersName.setBounds(50,125, 200, 30);
		add(lblFathersName);

		lblGender=new JLabel("Enter Gender ");
		lblGender.setBounds(50,160, 200, 30);
		add(lblGender);
		
		lblMaritalStatus=new JLabel("Enter Marital Status ");
		lblMaritalStatus.setBounds(50,195, 200, 30);
		add(lblMaritalStatus);
		
		lblCommunicationAddress=new JLabel("Enter Communication Address ");
		lblCommunicationAddress.setBounds(50,230, 200, 30);
		add(lblCommunicationAddress);
		
		lblContactDetails=new JLabel("Enter Contact Details ");
		lblContactDetails.setBounds(50,265, 200, 30);
		add(lblContactDetails);
		
		lblNominationName=new JLabel("Enter Nomination Name ");
		lblNominationName.setBounds(50,300, 200, 30);
		add(lblNominationName);
		
		lblNomineeAddress=new JLabel("Enter Nominee Address ");
		lblNomineeAddress.setBounds(50,335, 200, 30);
		add(lblNomineeAddress);
		
		lblStatusOfIdProof=new JLabel("Enter Status Of ID Proof ");
		lblStatusOfIdProof.setBounds(50,370, 200, 30);
		add(lblStatusOfIdProof);
		
		lblStatusOfAddressProof=new JLabel("Enter Status Of Adress Proof ");
		lblStatusOfAddressProof.setBounds(50,405, 200, 30);
		add(lblStatusOfAddressProof);
		
		lblIDProofDocument=new JLabel("Enter ID Proof Document ");
		lblIDProofDocument.setBounds(50,440, 200, 30);
		add(lblIDProofDocument);
		
		lblAddressProofDocument=new JLabel("Enter Address Proof Document ");
		lblAddressProofDocument.setBounds(50,475, 200, 30);
		add(lblAddressProofDocument);
	
	
		lblRequestDate=new JLabel("Enter Request Date");
		lblRequestDate.setBounds(50, 510, 160, 30);
		add(lblRequestDate);	
		
		
		lblStatusOfRequest=new JLabel("Enter Status Of Request ");
		lblStatusOfRequest.setBounds(50,545, 200, 30);
		add(lblStatusOfRequest);
		
		
		lblStatusOfAccountOpening=new JLabel("Enter Status of Account opening ");
		lblStatusOfAccountOpening.setBounds(50,580, 200, 30);
		add(lblStatusOfAccountOpening);
		
	
	    txtid =new JTextField();
	    txtid.setBounds(300,20,250,30);
	    add(txtid);
	    
		txtCustomerName=new JTextField();
		txtCustomerName.setBounds(300, 55, 250, 30);
		add(txtCustomerName);
		
		txtDOB=new JTextField();
		txtDOB.setBounds(300, 90, 250, 30);
		add(txtDOB);
		
		txtFathersName=new JTextField();
		txtFathersName.setBounds(300, 125, 250, 30);
		add(txtFathersName);
	
		txtGender=new JComboBox(type);
		txtGender.setBounds(300, 160, 250, 30);
		add(txtGender);
		
		txtMaritalStatus=new JTextField();
		txtMaritalStatus.setBounds(300, 195, 250, 30);
		add(txtMaritalStatus);
		
		txtCommunicationAddress=new JTextField();
		txtCommunicationAddress.setBounds(300, 230, 250, 30);
		add(txtCommunicationAddress);
		
		txtContactDetails=new JTextField();
		txtContactDetails.setBounds(300, 265, 250, 30);
		add(txtContactDetails);
		
		txtNominationName=new JTextField();
		txtNominationName.setBounds(300, 300, 250, 30);
		add(txtNominationName);
		
		txtNomineeAddress=new JTextField();
		txtNomineeAddress.setBounds(300, 335, 250, 30);
		add(txtNomineeAddress);
		
		btnStatusOfIdProof=new JComboBox(status);
		btnStatusOfIdProof.setBounds(300, 370, 250, 30);
		add(btnStatusOfIdProof);
		
		btnStatusOfAddressProof=new JComboBox(status);
		btnStatusOfAddressProof.setBounds(300, 405, 250, 30);
		add(btnStatusOfAddressProof);
		
		txtIDProofDocument=new JTextField();
		txtIDProofDocument.setBounds(300, 440, 250, 30);
		add(txtIDProofDocument);
		
		txtAddressProofDocument=new JTextField();
		txtAddressProofDocument.setBounds(300, 475, 250, 30);
		add(txtAddressProofDocument);
	
		
		txtRequestDate=new JTextField();
		txtRequestDate.setBounds(300, 510, 250, 30);
		add(txtRequestDate);
		
		ddStatusOfRequest=new JComboBox(status);
		ddStatusOfRequest.setBounds(300, 545, 250, 30);
		add(ddStatusOfRequest);
		
		ddStatusOfAccountOpening=new JComboBox(status);
		ddStatusOfAccountOpening.setBounds(300, 580, 250, 30);
		add(ddStatusOfAccountOpening);
		
		
		
		display=new JButton("View Customer Details");
		display.setBounds(70, 650, 200, 30);
		display.addActionListener(this);
			add(display);
			
			
			edit=new JButton("Edit Customer Details");
			edit.setBounds(400, 650, 200, 30);
				add(edit);
			
			display.addActionListener(this);//Register the button for Action
	
			edit.addActionListener(this);
		
		
			Dimension dimen=Toolkit.getDefaultToolkit().getScreenSize();
			int height=dimen.height;
			int width=dimen.width;
			
			//setBounds(0,0,dimen.width,dimen.height);
			setSize(width/2,height);
			setLocationRelativeTo(null);
			
		setVisible(true);
		
		
	 }
	public void actionPerformed(ActionEvent e)
	{
		
		//Code for Search in Submit button.
		//JOptionPane.showMessageDialog(null, "Data Not Found ", "Confirmation Message", JOptionPane.INFORMATION_MESSAGE);
		try
		{
		if(e.getSource()==display)
		{
			int RequestID=Integer.parseInt(txtid.getText()); 
			
			rs=CustomerBSL.fetchCustomerById(RequestID);
			if(rs.next())
			{
				txtCustomerName.setText(rs.getString(1));
				txtDOB.setText(rs.getString(2));
				txtFathersName.setText(rs.getString(3));
				txtGender.setSelectedItem(rs.getString(4));
				txtMaritalStatus.setText(rs.getString(5));
				txtCommunicationAddress.setText(rs.getString(6));
				txtContactDetails.setText(rs.getString(7));
				txtNominationName.setText(rs.getString(8));
				txtNomineeAddress.setText(rs.getString(9));
				btnStatusOfIdProof.setSelectedItem(rs.getString(10));
				btnStatusOfAddressProof.setSelectedItem(rs.getString(11));
				txtIDProofDocument.setText(rs.getString(12));
				txtAddressProofDocument.setText(rs.getString(13));
				txtRequestDate.setText(rs.getString(15));
				ddStatusOfRequest.setSelectedItem(rs.getString(16));
				ddStatusOfAccountOpening.setSelectedItem(rs.getString(17));	
				
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Data Not Found ", "Confirmation Message", JOptionPane.INFORMATION_MESSAGE);
			}
			  
			
			
	} 	
		
	//Code for Selection Value from Combobox		
//JOptionPane.showMessageDialog(null,  countrycombo.getSelectedItem() , "Confirmation Message", JOptionPane.INFORMATION_MESSAGE);
		
		}
		catch(Exception ess)
		{
			JOptionPane.showMessageDialog(null, ess.toString(), "Error Message", JOptionPane.INFORMATION_MESSAGE);
		}
		
		
		//Code for Update
		
		try
		{
		if(e.getSource()==edit)
		{
			String Name=txtCustomerName.getText();    
			String DOB=txtDOB.getText();
			String fname=txtFathersName.getText();
			String mstatus=txtMaritalStatus.getText();
			String gen=txtGender.getSelectedItem().toString();
			String ca=txtCommunicationAddress.getText();
			String cd=txtContactDetails.getText();
			String nn=txtNominationName.getText();
			String na=txtNomineeAddress.getText();	
			String idproof=btnStatusOfIdProof.getSelectedItem().toString();
			String addproof=btnStatusOfAddressProof.getSelectedItem().toString();
			String idproofdoc=txtIDProofDocument.getText();
			String adproofdoc=txtAddressProofDocument.getText();
			String reqdate=txtRequestDate.getText();
			String statusofreq=ddStatusOfRequest.getSelectedItem().toString(); 
			String statusofaccountopening=ddStatusOfAccountOpening.getSelectedItem().toString();
			int reqid=Integer.parseInt(txtid.getText());
			int res=CustomerBSL.updateCustomer(Name,DOB,fname,gen,mstatus,ca,cd,nn,na,idproof,addproof,idproofdoc,adproofdoc,reqid,reqdate,statusofreq,statusofaccountopening); 
			if(res>0)
			{
				JOptionPane.showMessageDialog(null, "Data Updated Successfully", "Confirmation Message", JOptionPane.INFORMATION_MESSAGE);
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Data Not Updated ", "Confirmation Message", JOptionPane.INFORMATION_MESSAGE);
			}
			  
		}
		}
		catch(Exception ess)
		{
			JOptionPane.showMessageDialog(null, ess.toString(), "Error Message", JOptionPane.INFORMATION_MESSAGE);
		}
		
		
	}// End of Actionperformed
	

	
	
	
	
	
	
	
	
	public static void main(String[] args) 
	{
		 
  new SelectByID_Update();
	}

}
