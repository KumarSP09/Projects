package com.ksp.dto;

public class RouteMasterDTO {
	
	String RouteCode;
	String Source;
	String Destination;
	int DistancesInKM;
	String RouteType;
	int TravelTimeInHrs;
	
	public String getRouteCode() {
		return RouteCode;
	}
	public void setRouteCode(String routeCode) {
		RouteCode = routeCode;
	}
	public String getSource() {
		return Source;
	}
	public void setSource(String source) {
		Source = source;
	}
	public String getDestination() {
		return Destination;
	}
	public void setDestination(String destination) {
		Destination = destination;
	}
	public int getDistancesInKM() {
		return DistancesInKM;
	}
	public void setDistancesInKM(int distancesInKM) {
		DistancesInKM = distancesInKM;
	}
	public String getRouteType() {
		return RouteType;
	}
	public void setRouteType(String routeType) {
		RouteType = routeType;
	}
	public int getTravelTimeInHrs() {
		return TravelTimeInHrs;
	}
	public void setTravelTimeInHrs(int travelTimeInHrs) {
		TravelTimeInHrs = travelTimeInHrs;
	}
	
	
}
