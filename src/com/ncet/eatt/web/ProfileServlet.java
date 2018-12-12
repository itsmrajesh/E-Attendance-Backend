package com.ncet.eatt.web;

import java.io.IOException;
import java.util.List;
import java.util.Random;

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
@WebServlet("/")
public class ProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private ProfileService profileService = new ProfileServiceImpl();
		

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String requestUri = request.getRequestURI();
		if(requestUri.endsWith("signup")){
			String userName = request.getParameter("userName");
			String password = request.getParameter("password");
			String email = request.getParameter("email");
			String mobile = request.getParameter("mobile");
			Random r = new Random();
			int id = (r.nextInt(10000) +1000); //Generating Random ID for User
			int at=0;
			Profile user = new Profile();
			user.setUserName(userName);
			user.setPassword(password);
			user.setEmail(email);
			user.setMobile(mobile);
			user.setUid(id);
			user.setAtt(at);
			String message = profileService.addUser(user);
//			Mailer.send("itsmrajesh@gmail.com","qwerty@email","m.rajesh242@gmail.com","Welcome to Eattendance System ","This is testing mail");
			response.sendRedirect("login.jsp");
		
		}
		else if(requestUri.endsWith("adduser")){
			String userName = request.getParameter("userName");
			String password = request.getParameter("password");
			String email = request.getParameter("email");
			String mobile = request.getParameter("mobile");
			Random r = new Random();
			int id = (r.nextInt(10000) +1000); //Generating Random ID for User
			int at=0;
			Profile user = new Profile();
			user.setUserName(userName);
			user.setPassword(password);
			user.setEmail(email);
			user.setMobile(mobile);
			user.setUid(id);
			user.setAtt(at);
			String message = profileService.addUser(user);
//			Mailer.send("itsmrajesh@gmail.com","qwerty@email","m.rajesh242@gmail.com","Welcome to Eattendance System ","This is testing mail");
			List<Profile> list = profileService.getUsers();
			RequestDispatcher rd = request.getRequestDispatcher("admin.jsp");
			request.setAttribute("users",list);
			rd.forward(request,response);
		
		}
		else if(requestUri.endsWith("back")){
			
			List<Profile> list = profileService.getUsers();
			RequestDispatcher rd = request.getRequestDispatcher("admin.jsp");
			request.setAttribute("users",list);
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