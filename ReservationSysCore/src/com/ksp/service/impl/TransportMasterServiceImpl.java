package com.ksp.service.impl;

import com.ksp.dao.ITransportMasterDao;
import com.ksp.dao.impl.TransportMasterDaoImpl;
import com.ksp.dto.TransportMasterDTO;
import com.ksp.service.ITransportMasterService;

public class TransportMasterServiceImpl implements ITransportMasterService<TransportMasterDTO> {
	
	ITransportMasterDao<TransportMasterDTO> transport = new TransportMasterDaoImpl();

	@Override
	public void AddMstService(TransportMasterDTO dataObj) {
		// TODO Auto-generated method stub
		transport.AddMaster(dataObj);
	}

	@Override
	public void ModifyMstService(TransportMasterDTO dataObj) {
		// TODO Auto-generated method stub
		transport.ModifyMaster(dataObj);
	}

	@Override
	public void DeleteMStService(String code) {
		// TODO Auto-generated method stub
		transport.DeleteMaster(code);
		
	}

}
