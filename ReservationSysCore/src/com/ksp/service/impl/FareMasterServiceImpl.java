package com.ksp.service.impl;

import java.util.List;

import com.ksp.dao.IFareMasterDao;
import com.ksp.dao.impl.FareMasterDaoImpl;
import com.ksp.dto.FareMasterDTO;
import com.ksp.service.IFareMasterService;

public class FareMasterServiceImpl implements IFareMasterService<FareMasterDTO>{
	
	IFareMasterDao<FareMasterDTO> fares = new FareMasterDaoImpl();

	@Override
	public int AddMstService(FareMasterDTO dataObj) {
		return fares.AddMaster(dataObj);
		
	}

	@Override
	public int ModifyMstService(FareMasterDTO dataObj) {
		// TODO Auto-generated method stub
		
		return fares.ModifyMaster(dataObj);
		
	}

	@Override
	public int DeleteMStService(String code) {
		// TODO Auto-generated method stub
		return fares.DeleteMaster(code);
	}

	@Override
	public List<FareMasterDTO> getInfo(String code) {
		return null;
		// TODO Auto-generated method stub
		
	}

}
