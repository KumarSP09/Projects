package com.ksp.dao;

public interface IMasterDoa <T> {

	public int AddMaster(T dataObj);
	public int ModifyMaster(T dataObj);
	public void DeleteMaster(String Code);
	
}
