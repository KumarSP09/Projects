package com.ksp.dao;

import java.util.List;

public interface IMasterDoa <T> {

	public int AddMaster(T dataObj);
	public int ModifyMaster(T dataObj);
	public void DeleteMaster(String Code);
	public List<T> getInfo(String code);
}
