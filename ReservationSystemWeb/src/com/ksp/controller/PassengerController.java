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
	
		session = request.getSession();
		
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
