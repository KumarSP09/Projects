package com.ksp.service.impl;

import java.util.List;

import com.ksp.dao.ITransportMasterDao;
import com.ksp.dao.impl.TransportMasterDaoImpl;
import com.ksp.dto.TransportMasterDTO;
import com.ksp.service.ITransportMasterService;

public class TransportMasterServiceImpl implements ITransportMasterService<TransportMasterDTO> {
	
	ITransportMasterDao<TransportMasterDTO> transport = new TransportMasterDaoImpl();

	@Override
	public int AddMstService(TransportMasterDTO dataObj) {
		return transport.AddMaster(dataObj);
	}

	@Override
	public int ModifyMstService(TransportMasterDTO dataObj) {
		return transport.ModifyMaster(dataObj);
	}

	@Override
	public int DeleteMStService(String code) {
		return transport.DeleteMaster(code);
		
	}

	@Override
	public List<TransportMasterDTO> getInfo(String code) {
		return null;
		// TODO Auto-generated method stub
		
	}

}
