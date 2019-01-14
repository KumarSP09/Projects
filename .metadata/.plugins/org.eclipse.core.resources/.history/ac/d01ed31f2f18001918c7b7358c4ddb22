package com.ksp.controller;

import java.util.Scanner;

import com.ksp.dto.PassengerMasterDTO;
import com.ksp.service.impl.PassengerMasterServiceImpl;

public class PassengerController {


	public static void main(String[] args)
	{
		boolean IsExit = false;
		String choice = null;
		Scanner scan = new Scanner(System.in);
		String passengerCode =null;
		String passengerName=null;
		int passengerAge=0;
		String passengerGender=null;
		String passengerContact_Mail=null;
		String passengerContact_Number=null;
		
		PassengerMasterServiceImpl passengers = new PassengerMasterServiceImpl();
		PassengerMasterDTO PassengerDataObj = new PassengerMasterDTO();
		
		do {
			System.out.println("Enter your choice : add/update/delete/exit...");
			choice = scan.nextLine();
			switch (choice)
			{
			case "add" :
				System.out.println("Enter Passenger Code");
				passengerCode = scan.nextLine();
				PassengerDataObj.setPassenger_Code(passengerCode);
				
				System.out.println("Enter Passenger Name");
				passengerName = scan.nextLine();
				PassengerDataObj.setPassenger_Name(passengerName);	
				System.out.println("Enter Passenger Age");
				passengerAge = scan.nextInt();
				PassengerDataObj.setPassenger_Age(passengerAge);
				
				System.out.println("Enter Passenger Gender");
				passengerGender = scan.nextLine();
				PassengerDataObj.setPassenger_Gender(passengerGender);		
				
				System.out.println("Enter Passenger Mail");
				passengerContact_Mail = scan.nextLine();
				PassengerDataObj.setPassenger_Contact_Mail(passengerContact_Mail);	
				
				System.out.println("Enter Passenger Mobile");
				passengerContact_Number = scan.nextLine();
				PassengerDataObj.setPassenger_Contact_Number(passengerContact_Number);
				
				passengers.AddMstService(PassengerDataObj);
				break;
			case "exit" :
				IsExit= true;
			
			}
		}while(!IsExit);
		scan.close();
		
		
	}
	
	
}
