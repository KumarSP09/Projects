create Database ReservationSys;

CREATE TABLE TranportMaster
(
	Transporter_Code	varchar(20) primary key,
	Transport_Mode	varchar(20),
	Transport_Type	varchar(20),
	Transport_Vechicle varchar(20),	
	Max_Capacity integer,	
	Available_Capacity integer,	
	NoOfDrivers integer,	
	NoOfSupportingStaffs integer
); 

CREATE TABLE RouteMaster
( 
	Route_Code	varchar(20) primary key,
	Source	varchar(20),
	Destination	varchar(20),
	DistancesInKM	integer,
	Route_Type	varchar(20),
	Travel_TimeInHr Integer
);

CREATE TABLE FareMaster
(
	Fare_Code	varchar(20) primary key,
	Transport_Code	varchar(20),
	Route_Code	varchar(20),
	Fare_Value	double,
	Discounts	double
);

CREATE TABLE PassengerMaster
(
	Passenger_Code	varchar(20) primary key,
	Passenger_Name	varchar(20),
	Passenger_Age	Integer,
	Passenger_Gender varchar(2),
	Passenger_Contact_Number varchar(20),
	Passenger_Contact_Mail varchar(20)
);
