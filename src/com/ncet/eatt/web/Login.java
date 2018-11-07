package com.ncet.eatt.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ncet.eatt.domain.Profile;
import com.ncet.eatt.service.ProfileService;
import com.ncet.eatt.service.ProfileServiceImpl;

/**
 * Servlet implementation class ProfileServlet
 */

public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private ProfileService profileService = new ProfileServiceImpl();
		

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String requestUri = request.getRequestURI();
		
		String un = request.getParameter("un");
		String pwd = request.getParameter("pwd");
		
		if(un.equals("admin") && pwd.equals("pwd")){
			List<Profile> list = profileService.getUsers();
			RequestDispatcher rd = request.getRequestDispatcher("admin.jsp");
			request.setAttribute("users",list);
			rd.forward(request,response);
			}
		
		else if (un.equals("rajesh") && pwd.equals("pwd")) {
			RequestDispatcher rd = request.getRequestDispatcher("Dashboard.jsp");
			rd.forward(request,response);	
		}
		else {
			RequestDispatcher rd = request.getRequestDispatcher("invalid.jsp");
			rd.forward(request,response);
		}
	}
	


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
}