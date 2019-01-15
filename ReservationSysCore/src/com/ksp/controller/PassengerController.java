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
			System.out.println("Enter your choice : add/update/delete/show/exit...");
			choice = scan.nextLine();
			switch (choice)
			{
			case "add" :
				System.out.println("Enter Passenger Code");
				passengerCode = scan.nextLine();
				PassengerDataObj.setPassengerCode(passengerCode);
				
				System.out.println("Enter Passenger Name");
				passengerName = scan.nextLine();
				PassengerDataObj.setPassengerName(passengerName);	
				System.out.println("Enter Passenger Age");
				passengerAge = scan.nextInt();
				PassengerDataObj.setPassengerAge(passengerAge);
				
				System.out.println("Enter Passenger Gender");
				scan.nextLine();
				passengerGender = scan.nextLine();
				PassengerDataObj.setPassengerGender(passengerGender);	
				
				
				System.out.println("Enter Passenger Mail");
				passengerContact_Mail = scan.nextLine();
				PassengerDataObj.setPassengerContactMail(passengerContact_Mail);	
				
				System.out.println("Enter Passenger Mobile");
				passengerContact_Number = scan.nextLine();
				PassengerDataObj.setPassengerContactNumber(passengerContact_Number);
				
				passengers.AddMstService(PassengerDataObj);
				break;
			case "update":
				System.out.println("Enter Passenger Code");
				passengerCode = scan.nextLine();
				PassengerDataObj.setPassengerCode(passengerCode);
				
				System.out.println("Enter Passenger Name");
				passengerName = scan.nextLine();
				PassengerDataObj.setPassengerName(passengerName);	
				System.out.println("Enter Passenger Age");
				passengerAge = scan.nextInt();
				PassengerDataObj.setPassengerAge(passengerAge);
				
				System.out.println("Enter Passenger Gender");
				scan.nextLine();
				passengerGender = scan.nextLine();
				PassengerDataObj.setPassengerGender(passengerGender);	
				
				
				System.out.println("Enter Passenger Mail");
				passengerContact_Mail = scan.nextLine();
				PassengerDataObj.setPassengerContactMail(passengerContact_Mail);	
				
				System.out.println("Enter Passenger Mobile");
				passengerContact_Number = scan.nextLine();
				PassengerDataObj.setPassengerContactNumber(passengerContact_Number);
				
				passengers.ModifyMstService(PassengerDataObj);
				break;
			case "delete":
				System.out.println("Enter Passenger Code");
				passengerCode = scan.nextLine();
				passengers.DeleteMStService(passengerCode);
				break;
			case "show":
				System.out.println("Enter Passenger Code");
				passengerCode = scan.nextLine();
				passengers.getInfo(passengerCode);
				break;
			case "exit" :
				IsExit= true;
				break;
			
			}
		}while(!IsExit);
		scan.close();
		
		
	}
	
	
}
