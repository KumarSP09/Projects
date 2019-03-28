package com.ksp.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ksp.dao.impl.PassengerMasterDaoImpl;
import com.ksp.dto.PassengerMasterDTO;
import com.ksp.service.impl.PassengerMasterServiceImpl;

/**
 * Servlet implementation class PassengerController
 */
@WebServlet("/PassengerController")

public class PassengerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    PassengerMasterServiceImpl PassengerService = new PassengerMasterServiceImpl();
    HttpSession session = null;
    List<PassengerMasterDTO> PassengerList = new ArrayList<>();

    /**
     * Default constructor. 
     */
    public PassengerController() {
        // TODO Auto-generated constructor stub
    	super();
    	
    }
   
    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("===========");
		String action = null;
		String DelPassenger[];
	    PassengerMasterDTO passengers = null;
		session = request.getSession();
		
		action = request.getParameter("action");
		System.out.println("action="+action);
		
		if ("AddPassenger".equalsIgnoreCase(action))
		{
			passengers =  new PassengerMasterDTO();
			passengers.setPassengerCode(request.getParameter("passengerCode"));
			passengers.setPassengerName(request.getParameter("passengerName"));
			passengers.setPassengerAge(Integer.parseInt((request.getParameter("passengerAge"))));
			passengers.setPassengerGender(request.getParameter("passengerGender"));
			passengers.setPassengerContactNumber(request.getParameter("passengerContactNumber"));
			passengers.setPassengerContactMail(request.getParameter("passengerContactMail"));
			PassengerService.AddMstService(passengers);
		}
		else if("DeletePassenger".equalsIgnoreCase(action))
		{
			System.out.println("======***=====Delete================");
			DelPassenger = request.getParameterValues("delpassenger");
			
			for (String delpassenger : DelPassenger) {
				System.out.println(delpassenger);
				PassengerService.DeleteMStService(delpassenger);
				
				
			}
			System.out.println("===========Delete=***===============");
		}
		
		PassengerList = PassengerService.getInfo("(ALL)");
		session.setAttribute("PassengerList", PassengerList);		
		RequestDispatcher reqDispatch = request.getRequestDispatcher("View/passengers.jsp");
		reqDispatch.forward(request, response);
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
				
	}

}
