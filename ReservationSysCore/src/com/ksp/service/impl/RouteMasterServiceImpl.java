package com.ksp.service.impl;

import com.ksp.dao.IRouteMasterDao;
import com.ksp.dao.impl.RouteMasterDaoImpl;
import com.ksp.dto.RouteMasterDTO;
import com.ksp.service.IRouteMasterService;

public class RouteMasterServiceImpl implements IRouteMasterService <RouteMasterDTO> {

	IRouteMasterDao<RouteMasterDTO> route = new RouteMasterDaoImpl();
	
	@Override
	public void AddMstService(RouteMasterDTO dataObj) {
		// TODO Auto-generated method stub
		route.AddMaster(dataObj);
	}

	@Override
	public void ModifyMstService(RouteMasterDTO dataObj) {
		// TODO Auto-generated method stub
		
		route.ModifyMaster(dataObj);
		
	}

	@Override
	public void DeleteMStService(String code) {
		// TODO Auto-generated method stub
		
		route.DeleteMaster(code);
	}

	@Override
	public void getInfo(String code) {
		// TODO Auto-generated method stub
		
	}

}
