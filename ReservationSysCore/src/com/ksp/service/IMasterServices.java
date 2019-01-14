package com.ksp.service;

public interface IMasterServices <T> {

	public void AddMstService(T dataObj);
	public void ModifyMstService(T dataObj);
	public void DeleteMStService(String code);
	
}
