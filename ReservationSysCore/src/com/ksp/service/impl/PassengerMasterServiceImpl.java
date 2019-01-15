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
	public void AddMstService(PassengerMasterDTO dataObj) {
		// TODO Auto-generated method stub
		
		passengers.AddMaster(dataObj);
		
	}

	@Override
	public void ModifyMstService(PassengerMasterDTO dataObj) {
		// TODO Auto-generated method stub
		
		passengers.ModifyMaster(dataObj);
		
	}


	@Override
	public void DeleteMStService(String code) {
		// TODO Auto-generated method stub
		passengers.DeleteMaster(code);
		
	}

	@Override
	public void getInfo(String code) {
		// TODO Auto-generated method stub
		List<PassengerMasterDTO> passengersList = new ArrayList<>(); 
		passengersList = passengers.getInfo(code);
		
		for (PassengerMasterDTO passengerMaster : passengersList) {
			
			System.out.println(passengerMaster.getPassengerCode() + " "+ passengerMaster.getPassengerName()+ " "+
					passengerMaster.getPassengerAge() + " "+passengerMaster.getPassengerGender()+ " "+ 
					passengerMaster.getPassengerContactMail()+ " "+ passengerMaster.getPassengerContactNumber());
			
		}	
	}

	

}
