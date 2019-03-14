package com.bank.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import com.bank.beans.Signing;
import com.bank.utility.Database;
public class SignImplDAO implements ISigningDAO{
	
	
	public Signing registration(Signing reg) throws Exception {
		Database db =  new Database();
		 Connection con = db.getConnection();
		String  statement ="insert into customer_details(first_name,last_name,email_id,password"
				+ ",aadhar_no,pancard_no,address,mobile_no,balance) values(?,?,?,?,?,?,?,?,?)";
		PreparedStatement pst = con.prepareStatement(statement);
		pst.setString(1, reg.getFirstName());
		pst.setString(2, reg.getLastName());
		pst.setString(3, reg.getEmailId());
		pst.setString(4, reg.getPassword());
		pst.setLong(5, reg.getAadharNo());
		pst.setString(6, reg.getAddress());
		pst.setLong(7, reg.getMobileNo());
		pst.setInt(4, reg.getBalance());
		long aadhar = reg.getAadharNo();
		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select account_no from customer_details where aadhar_no=aadhar");
			
		reg.setAccountNo(rs.getInt(1));
		rs.next();
		int update = pst.executeUpdate();
		return reg;
		}

	public Signing login(Signing log) {
	
		return null;

	}

}
