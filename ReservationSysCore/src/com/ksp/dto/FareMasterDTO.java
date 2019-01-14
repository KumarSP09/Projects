package com.ksp.dto;

public class FareMasterDTO {
	
	String FareCode;	
	String TransportCode;	
	String RouteCode;	
	double FareValue;	
	double Discounts;
	
	public String getFareCode() {
		return FareCode;
	}
	public void setFareCode(String fareCode) {
		FareCode = fareCode;
	}
	public String getTransportCode() {
		return TransportCode;
	}
	public void setTransportCode(String transportCode) {
		TransportCode = transportCode;
	}
	public String getRouteCode() {
		return RouteCode;
	}
	public void setRouteCode(String routeCode) {
		RouteCode = routeCode;
	}
	public double getFareValue() {
		return FareValue;
	}
	public void setFareValue(double fareValue) {
		FareValue = fareValue;
	}
	public double getDiscounts() {
		return Discounts;
	}
	public void setDiscounts(double discounts) {
		Discounts = discounts;
	}

	
}
