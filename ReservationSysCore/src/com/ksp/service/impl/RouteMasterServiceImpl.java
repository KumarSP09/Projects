package com.ksp.service.impl;

import java.util.List;

import com.ksp.dao.IRouteMasterDao;
import com.ksp.dao.impl.RouteMasterDaoImpl;
import com.ksp.dto.RouteMasterDTO;
import com.ksp.service.IRouteMasterService;

public class RouteMasterServiceImpl implements IRouteMasterService <RouteMasterDTO> {

	IRouteMasterDao<RouteMasterDTO> route = new RouteMasterDaoImpl();
	
	@Override
	public int AddMstService(RouteMasterDTO dataObj) {
		return route.AddMaster(dataObj);
	}

	@Override
	public int ModifyMstService(RouteMasterDTO dataObj) {
		// TODO Auto-generated method stub
		
		return route.ModifyMaster(dataObj);
		
	}

	@Override
	public int DeleteMStService(String code) {
		// TODO Auto-generated method stub
		
		return route.DeleteMaster(code);
	}

	@Override
	public List<RouteMasterDTO> getInfo(String code) {
		return null;
		// TODO Auto-generated method stub
		
	}

}
