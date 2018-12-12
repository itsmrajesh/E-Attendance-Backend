package com.ncet.eatt.web;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ncet.eatt.util.Dbutil;

/**
 * Servlet implementation class Number
 */

public class Number extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Dbutil dbUtil = Dbutil.obj;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String un = request.getParameter("username");
		String pwd = request.getParameter("psw");
		String nub = request.getParameter("number");
		final String UPDATE_PWD = "UPDATE SIGNUPDATA SET MOBILE='"+nub+"' WHERE USERNAME ='"
				+ un + "' and password = '"+pwd+"'";
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		PreparedStatement pst = null;

		try {
			con = dbUtil.getConnection();
			pst = con.prepareStatement(UPDATE_PWD);
			int i = pst.executeUpdate();

			 
				
				if (i>0) {
					System.out.println("Mobile Number is Updated for : " + un);
					String status = "Success";
					request.setAttribute("status", status);
					RequestDispatcher rd = request.getRequestDispatcher("auth.jsp");
					rd.forward(request, response);
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
