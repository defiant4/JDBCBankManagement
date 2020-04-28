package com.AccountCreation.BSL;
import java.sql.*;

import com.AccountCreation.DAO.ConnectionDAO;


public class CustomerBSL 
{

	static Connection con;
	static PreparedStatement pst;

	
	//Method for Insert Data(USER)
	
	public static String validateUser(String userName,String password)
	{
		
		String result="";
		
		  try
		  {
			 con=ConnectionDAO.dbConnection();
			String qry="Select * from   T_User_Details where username=? and password=?";
			pst=con.prepareStatement(qry);
			pst.setString(1,userName);
			pst.setString(2,password);
			ResultSet rs;
			rs=pst.executeQuery();
			if(rs.next())
			{
				result=rs.getString(4);
			}
			else
			{
				result="F";
			}
 
		  }
		  catch(Exception ess)
			{
				  System.out.print("error in Insert  " +ess.toString());
			}
		  
		  return result;
	}
	
	
	
	
 //Method for Insert Data(CUSTOMER)
	
		public static int insertCustomer(String Name,String DateOfBirth,String FatherName,String Gender,String MaritalStatus,String CommunicationAddress,String ContactDetails,String NominationName,String NomineeAddress,String StatusIDProof,String StatusIDAddressProof,String IDProofDocument,String AddressProofDocument,int RequestID,String RequestDate,String StatusOfRequest,String StatusOfAccountOpening)
		{
			
			int result=0;
				try
				{
			con=ConnectionDAO.dbConnection();
			String qry="Insert into  T_CustomerBank007 values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

			pst=con.prepareStatement(qry);
			pst.setString(1,Name);
			pst.setString(2,DateOfBirth);
			pst.setString(3,FatherName);
			pst.setString(4,Gender);
			pst.setString(5,MaritalStatus);
			pst.setString(6,CommunicationAddress);
			pst.setString(7,ContactDetails);
			pst.setString(8,NominationName);
			pst.setString(9,NomineeAddress);
			pst.setString(10,StatusIDProof);
			pst.setString(11,StatusIDAddressProof);
			pst.setString(12,IDProofDocument);
			pst.setString(13,AddressProofDocument);
			pst.setInt(14,RequestID);
			pst.setString(15,RequestDate);
			pst.setString(16,StatusOfRequest);
			pst.setString(17,StatusOfAccountOpening);
			
			result=pst.executeUpdate();
				}
				catch(Exception es)
				{
					  System.out.print("error in Insert  " +es.toString());
				}
			
		
			return result;
			
		}

		
		//Method For Update
		public static int updateCustomer(String Name,String DateOfBirth,String FatherName,String Gender, String MaritalStatus,String CommunicationAddress,String ContactDetails,String NominationName,String NomineeAddress,String StatusIDProof,String StatusIDAddressProof,String IDProofDocument,String AddressProofDocument,int RequestID,String RequestDate,String StatusOfRequest,String StatusOfAccountOpening)
		{
			
			int result=0;
				try
				{
					con=ConnectionDAO.dbConnection();
		String qry="Update T_CustomerBank007 set CUSTOMER_NAME=? ,DATE_OF_BIRTH=?, FATHERS_NAME_SPOUSE_NAME=? ,GENDER=?, MARITAL_STATUS=? , COMMUNICATION_ADDRESS=? ,CONTACT_DETAILS=?,NOMINATION_NAME=?,NOMINEE_ADDRESS=?,STATUS_OF_ID_PROOF=?,STATUS_OF_ADDRESS_PROOF=?,ID_PROOF_DOCUMENT=?,ADDRESS_PROOF_DOCUMENT=?,REQUEST_DATE=?,STATUS_OF_REQUEST=? ,STATUS_OF_ACCOUNT_OPENING=? where REQUEST_ID=?";
		
		
	pst=con.prepareStatement(qry);
	
	pst.setString(1,Name);
	pst.setString(2,DateOfBirth);
	pst.setString(3,FatherName);
	pst.setString(4,Gender);
	pst.setString(5,MaritalStatus);
	pst.setString(6,CommunicationAddress);
	pst.setString(7,ContactDetails);
	pst.setString(8,NominationName);
	pst.setString(9,NomineeAddress);
	pst.setString(10,StatusIDProof);
	pst.setString(11,StatusIDAddressProof);
	pst.setString(12,IDProofDocument);
	pst.setString(13,AddressProofDocument);
	pst.setString(14,RequestDate);
	pst.setString(15,StatusOfRequest);
	pst.setString(16,StatusOfAccountOpening);
	pst.setInt(17,RequestID);
	
			
			result=pst.executeUpdate();
				}
				catch(Exception es)
				{
					  System.out.print("error in Update " +es.toString());
				}
			
		
			return result;
			
		}
		
		//Display All Customer Details
		public static ResultSet fetchAllCustomer()
		{
			
			ResultSet rs=null;
				try
				{
					con=ConnectionDAO.dbConnection();
	String qry="Select *  from  T_CustomerBank007";

			pst=con.prepareStatement(qry);
	 
		 
			  rs=pst.executeQuery();
				}catch(Exception es)
				{
					  System.out.print("error in Display  " +es.toString());
				}
			
		
			return rs;
			
		}
		
		
	
		
	//Method for Display By Id
		
		public static ResultSet fetchCustomerById(int RequestID)
		{
			
			ResultSet rs=null;
			
				try
				{
				
			con=ConnectionDAO.dbConnection();
	String qry="Select *  from  T_CustomerBank007 where REQUEST_ID=?";

			pst=con.prepareStatement(qry);
			pst.setInt(1,RequestID);
		 
			  rs=pst.executeQuery();
			 
			  
				}
				catch(Exception es)
				{
					  System.out.print("error in Viewing  " +es.toString());
				}
			
		
			return rs;
			
		}
		

}
