package com.ksp.service;

import java.util.List;

public interface IMasterServices <T> {

	public int AddMstService(T dataObj);
	public int ModifyMstService(T dataObj);
	public int DeleteMStService(String code);
	public List<T> getInfo(String code);
	
}
