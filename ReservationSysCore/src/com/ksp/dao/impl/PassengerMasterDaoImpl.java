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
	private StringBuilder strsql = new StringBuilder();
	
	@Override
	public int AddMaster(PassengerMasterDTO passengers) {
		
		strsql = null;
		int rowIndex=1;
			
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
			pstmt = conn.prepareStatement(strsql.toString());
			pstmt.clearParameters();
			pstmt.setString(rowIndex++, passengers.getPassenger_Code());
			pstmt.setString(rowIndex++, passengers.getPassenger_Name());
			pstmt.setInt(rowIndex++, passengers.getPassenger_Age());
			pstmt.setString(rowIndex++, passengers.getPassenger_Gender());
			pstmt.setString(rowIndex++, passengers.getPassenger_Contact_Number());
			pstmt.setString(rowIndex++, passengers.getPassenger_Contact_Mail());
			results = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return 0;
	}

	@Override
	public int ModifyMaster(PassengerMasterDTO passengers) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void DeleteMaster(String Code) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<PassengerMasterDTO> getPassengersInfo(String passenger_code) {
		// TODO Auto-generated method stub
	
		pstmt=null;
		strsql=null;
		int paramIndex =1;
		
		List<PassengerMasterDTO> PassengerList = new ArrayList<PassengerMasterDTO>();
		PassengerMasterDTO passengers = new PassengerMasterDTO();
		
		strsql.append(  "SELECT  Passenger_Code ,  Passenger_Name ,  Passenger_Age ,  Passenger_Gender ,  \r\n" + 
						"		Passenger_Contact_Number ,  Passenger_Contact_Mail  \r\n" + 
						"FROM  passengermaster\r\n" + 
						"WHERE Passenger_Code = ?\r\n" + 
						"");
		try {
				conn = DBConnection.getConnection();
				pstmt = conn.prepareStatement(strsql.toString());
				pstmt.clearParameters();
				pstmt.setString(paramIndex, passenger_code);
				rs = pstmt.executeQuery();
				while (rs.next())
				{
					passengers.setPassenger_Code(rs.getString("Passenger_code"));
					passengers.setPassenger_Name(rs.getString("Passenger_Name"));
					passengers.setPassenger_Age(rs.getInt("Passenger_Age"));
					passengers.setPassenger_Gender(rs.getString("Passenger_Gender"));
					passengers.setPassenger_Contact_Mail(rs.getString("Passenger_Contact_Mail"));
					passengers.setPassenger_Contact_Number(rs.getString("Passenger_Contact_Number"));
				}
				
				PassengerList.add(passengers);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return PassengerList;
		
	}

}