package com.ksp.service.impl;

import com.ksp.dao.IFareMasterDao;
import com.ksp.dao.impl.FareMasterDaoImpl;
import com.ksp.dto.FareMasterDTO;
import com.ksp.service.IFareMasterService;

public class FareMasterServiceImpl implements IFareMasterService<FareMasterDTO>{
	
	IFareMasterDao<FareMasterDTO> fares = new FareMasterDaoImpl();

	@Override
	public void AddMstService(FareMasterDTO dataObj) {
		// TODO Auto-generated method stub
		fares.AddMaster(dataObj);
		
	}

	@Override
	public void ModifyMstService(FareMasterDTO dataObj) {
		// TODO Auto-generated method stub
		
		fares.ModifyMaster(dataObj);
		
	}

	@Override
	public void DeleteMStService(String code) {
		// TODO Auto-generated method stub
		fares.DeleteMaster(code);
	}

	@Override
	public void getInfo(String code) {
		// TODO Auto-generated method stub
		
	}

}
