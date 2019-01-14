package com.ksp.dao;

import java.util.List;

public interface IPassengerMasterDao<T> extends IMasterDoa<T> {

	public List<T> getPassengersInfo(String passenger_code);
}
