package com.ksp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ksp.dao.IPassengerMasterDao;
import com.ksp.dto.PassengerMasterDTO;
import com.ksp.util.DBConnection;

public class PassengerMasterDaoImpl implements IPassengerMasterDao<PassengerMasterDTO> {

	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	int results =0;
	private StringBuilder strsql;
	
	@Override
	public int AddMaster(PassengerMasterDTO passengers) {
		
		strsql = new StringBuilder();
		int paramIndex=1;
			
		strsql.append("INSERT INTO passengermaster\r\n" + 
				"(	Passenger_Code,\r\n" + 
				"	Passenger_Name,\r\n" + 
				"	Passenger_Age,\r\n" + 
				"	Passenger_Gender,\r\n" + 
				"	Passenger_Contact_Number,\r\n" + 
				"	Passenger_Contact_Mail)\r\n" + 
				"VALUES\r\n" + 
				"(	?,\r\n" + 
				"	?,\r\n" + 
				"	?,\r\n" + 
				"	?,\r\n" + 
				"	?,\r\n" + 
				"	?\r\n" + 
				")\r\n" + 
				"");
		conn = DBConnection.getConnection();
		
		try {
			System.out.println("DAO "+passengers.getPassengerCode());
			pstmt = conn.prepareStatement(strsql.toString());
			pstmt.clearParameters();
			pstmt.setString(paramIndex++, passengers.getPassengerCode());
			pstmt.setString(paramIndex++, passengers.getPassengerName());
			pstmt.setInt(paramIndex++, passengers.getPassengerAge());
			pstmt.setString(paramIndex++, passengers.getPassengerGender());
			pstmt.setString(paramIndex++, passengers.getPassengerContactNumber());
			pstmt.setString(paramIndex++, passengers.getPassengerContactMail());
			results = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return 1;
	}

	@Override
	public int ModifyMaster(PassengerMasterDTO passengers) {
		// TODO Auto-generated method stub\
		strsql = new StringBuilder();
		int paramIndex=1;
		strsql.append("UPDATE passengermaster \r\n" + 
				"SET\r\n" + 
				" Passenger_Name  =?,\r\n" + 
				" Passenger_Age  =?,\r\n" + 
				" Passenger_Gender  = ?,\r\n" + 
				" Passenger_Contact_Number  = ?,\r\n" + 
				" Passenger_Contact_Mail  = ?\r\n" + 
				"WHERE  Passenger_Code  = ?");
		
		conn = DBConnection.getConnection();
		
		try {
			pstmt = conn.prepareStatement(strsql.toString());
			pstmt.clearParameters();
			pstmt.setString(paramIndex++, passengers.getPassengerName());
			pstmt.setInt(paramIndex++, passengers.getPassengerAge());
			pstmt.setString(paramIndex++,passengers.getPassengerGender());
			pstmt.setString(paramIndex++,passengers.getPassengerContactNumber());
			pstmt.setString(paramIndex++,passengers.getPassengerContactMail());
			pstmt.setString(paramIndex++, passengers.getPassengerCode());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 1;
	}

	@Override
	public void DeleteMaster(String Code) {
		// TODO Auto-generated method stub
		int paramIndex=1;
		strsql = new StringBuilder();
		
		strsql.append("DELETE FROM passengermaster WHERE passenger_code = ?");
		
		conn = DBConnection.getConnection();
		
		try {
			pstmt = conn.prepareStatement(strsql.toString());
			pstmt.clearParameters();
			pstmt.setString(paramIndex, Code);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

/*	@Override
	public List<PassengerMasterDTO> getInfo(String code) {
		// TODO Auto-generated method stub
		return null;
	}*/

	@Override
	public List<PassengerMasterDTO> getInfo(String passengerCode) {
		// TODO Auto-generated method stub
	
		pstmt=null;
		strsql = new StringBuilder();;
		int paramIndex =1;
		
		List<PassengerMasterDTO> PassengerList = new ArrayList<PassengerMasterDTO>();
		PassengerMasterDTO passengers;
		
		strsql.append(  "SELECT  Passenger_Code ,  Passenger_Name ,  Passenger_Age ,  Passenger_Gender ,  \r\n" + 
						"		Passenger_Contact_Number ,  Passenger_Contact_Mail  \r\n" + 
						"FROM  passengermaster\r\n" );
		
		
		try {
				conn = DBConnection.getConnection();
				pstmt = conn.prepareStatement(strsql.toString());
				pstmt.clearParameters();
				if (!"(ALL)".equals(passengerCode)) 
				{
					strsql.append( "WHERE Passenger_Code = ?");
					pstmt.setString(paramIndex, passengerCode);
				}
				
				rs = pstmt.executeQuery();
				while (rs.next())
				{
					passengers = new PassengerMasterDTO();
					passengers.setPassengerCode(rs.getString("Passenger_code"));
					passengers.setPassengerName(rs.getString("Passenger_Name"));
					passengers.setPassengerAge(rs.getInt("Passenger_Age"));
					passengers.setPassengerGender(rs.getString("Passenger_Gender"));
					passengers.setPassengerContactMail(rs.getString("Passenger_Contact_Mail"));
					passengers.setPassengerContactNumber(rs.getString("Passenger_Contact_Number"));
					
					PassengerList.add(passengers);
				}
				
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return PassengerList;
		
	}

}
