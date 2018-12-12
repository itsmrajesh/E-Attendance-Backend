package com.ncet.eatt.web;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
import com.ncet.eatt.util.Dbutil;

/**
 * Servlet implementation class AddAtten
 */
@WebServlet("/Add")
public class AddAtten extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Dbutil dbUtil = Dbutil.obj;
	private ProfileService profileService = new ProfileServiceImpl();
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String un = request.getParameter("username");
		String attper = request.getParameter("attper");
		
		
		
		final String UPDATE_PWD = "UPDATE SIGNUPDATA SET ATTEN='"+attper+"' WHERE USERNAME ='"
				+ un + "'";
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		PreparedStatement pst = null;

		try {
			con = dbUtil.getConnection();
			pst = con.prepareStatement(UPDATE_PWD);
			int i = pst.executeUpdate();

			 
				
				if (i>0) {
					System.out.println("Attendance is Added for : " + un);
					List<Profile> list = profileService.getUsers();
					RequestDispatcher rd = request.getRequestDispatcher("admin.jsp");
					request.setAttribute("users",list);
					rd.forward(request,response);
				}
				else{
					String status = "Failure";
					request.setAttribute("status", status);
					RequestDispatcher rd = request.getRequestDispatcher("auth.jsp");
					rd.forward(request, response);
				}
				
				} catch (SQLException e) {
			System.out.println("Exception occured while Updating :" + e);
		}
	}

}
