package com.ksp.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.ksp.dao.IPassengerMasterDao;
import com.ksp.dao.impl.PassengerMasterDaoImpl;
import com.ksp.dto.PassengerMasterDTO;
import com.ksp.service.IPassengerMasterService;

public class PassengerMasterServiceImpl implements IPassengerMasterService<PassengerMasterDTO> {

	IPassengerMasterDao<PassengerMasterDTO> passengers = new PassengerMasterDaoImpl();
	
	@Override
	public int AddMstService(PassengerMasterDTO dataObj) {
		// TODO Auto-generated method stub
		
		return passengers.AddMaster(dataObj);
		
	}

	@Override
	public int ModifyMstService(PassengerMasterDTO dataObj) {
		// TODO Auto-generated method stub
		
		return passengers.ModifyMaster(dataObj);
		
	}


	@Override
	public int DeleteMStService(String code) {
		return passengers.DeleteMaster(code);
		
	}

	@Override
	public List<PassengerMasterDTO> getInfo(String code) {
		// TODO Auto-generated method stub
		List<PassengerMasterDTO> passengersList = new ArrayList<>(); 
		passengersList = passengers.getInfo(code);
		
		for (PassengerMasterDTO passengerMaster : passengersList) {
			
			System.out.println(passengerMaster.getPassengerCode() + " "+ passengerMaster.getPassengerName()+ " "+
					passengerMaster.getPassengerAge() + " "+passengerMaster.getPassengerGender()+ " "+ 
					passengerMaster.getPassengerContactMail()+ " "+ passengerMaster.getPassengerContactNumber());
			
		}
		return passengersList;	
	}

	

}
