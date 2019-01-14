package com.ksp.dto;

public class TransportMasterDTO {
	
	String TransporterCode;	
	String TransportMode;	
	String TransportType;	
	String TransportVechicle;	
	int MaxCapacity;	
	int AvailableCapacity;	
	int NoOfDrivers;	
	int NoOfSupportingStaffs;
	
	public String getTransporterCode() {
		return TransporterCode;
	}
	public void setTransporterCode(String transporterCode) {
		TransporterCode = transporterCode;
	}
	public String getTransportMode() {
		return TransportMode;
	}
	public void setTransportMode(String transportMode) {
		TransportMode = transportMode;
	}
	public String getTransportType() {
		return TransportType;
	}
	public void setTransportType(String transportType) {
		TransportType = transportType;
	}
	public String getTransportVechicle() {
		return TransportVechicle;
	}
	public void setTransportVechicle(String transportVechicle) {
		TransportVechicle = transportVechicle;
	}
	public int getMaxCapacity() {
		return MaxCapacity;
	}
	public void setMaxCapacity(int maxCapacity) {
		MaxCapacity = maxCapacity;
	}
	public int getAvailableCapacity() {
		return AvailableCapacity;
	}
	public void setAvailableCapacity(int availableCapacity) {
		AvailableCapacity = availableCapacity;
	}
	public int getNoOfDrivers() {
		return NoOfDrivers;
	}
	public void setNoOfDrivers(int noOfDrivers) {
		NoOfDrivers = noOfDrivers;
	}
	public int getNoOfSupportingStaffs() {
		return NoOfSupportingStaffs;
	}
	public void setNoOfSupportingStaffs(int noOfSupportingStaffs) {
		NoOfSupportingStaffs = noOfSupportingStaffs;
	}


}
