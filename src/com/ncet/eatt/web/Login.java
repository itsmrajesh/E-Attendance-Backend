package com.ncet.eatt.web;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ncet.eatt.domain.Loged;
import com.ncet.eatt.domain.Profile;
import com.ncet.eatt.service.ProfileService;
import com.ncet.eatt.service.ProfileServiceImpl;
import com.ncet.eatt.util.Dbutil;

/**
 * Servlet implementation class ProfileServlet
 */

public class Login extends HttpServlet {
	private Dbutil dbUtil = Dbutil.obj;
	// private final String GET_ALL_USERS="SELECT * FROM SIGNUPDATA";

	private ProfileService profileService = new ProfileServiceImpl();

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String un = request.getParameter("un");
		String pwd = request.getParameter("pwd");
		final String GET_ALL_USERSNAME = "SELECT USERNAME,PASSWORD FROM SIGNUPDATA WHERE USERNAME ='"
				+ un + "' and PASSWORD ='" + pwd + "'";
		String requestUri = request.getRequestURI();
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;

		try {
			con = dbUtil.getConnection();
			st = con.createStatement();
			rs = st.executeQuery(GET_ALL_USERSNAME);

			while (rs.next()) {
				String uname = rs.getString("USERNAME");
				String pword = rs.getString("PASSWORD");
				System.out.println("Username Logged in is :" + uname);
				if (uname != null && pword != null) {
					// request.setAttribute("username", uname);
					
					List<Profile> data = profileService.getUsers(); //get data from database
					
					int s = data.size();
					int j;
					if (s != 0) {
						for (int i = 0; i < s; i++) {
							Profile p = data.get(i);
							String name = p.getUserName();
							if (uname.equals(name)) {
								j=p.getAtt();
								j++;
								p.setAtt(j);
								int id = p.getUid();
								int att = p.getAtt();
								List<Loged> lg = new ArrayList<>();
								Loged ll = new Loged(uname, id, att);
								lg.add(ll);
								request.setAttribute("id", id);
								request.setAttribute("att", att);
								request.setAttribute("name", name);
							}
						}
					}
					RequestDispatcher rd = request
							.getRequestDispatcher("Dashboard.jsp");
					rd.forward(request, response);
				}
			}
		} catch (SQLException e) {
			System.out.println("Exception occured while Logging IN :" + e);
		}

		if (un.equals("admin") && pwd.equals("pwd")) {
			List<Profile> list3 = profileService.getUsers();
			RequestDispatcher rd = request.getRequestDispatcher("admin.jsp");
			request.setAttribute("users", list3);
			rd.forward(request, response);
		} 
		//requestUri.endsWith("adminp")
		if(un.equals("admin") && pwd.equals("pwd")){
			List<Profile> listu = profileService.getUsers();
			int s = listu.size();
			 int count=0;
			if (s != 0){
				for(int k=0;k<s;k++){
					Profile p = listu.get(k);
				int att = p.getAtt();
				if(att>=70){
					List<Loged> lg = new ArrayList<>();
					String uname =p.getUserName();
					int id = p.getUid();
					int atte = p.getAtt();
					Loged ll = new Loged(uname, id, att);
					lg.add(ll);
					for(k=0;k<s;k++){
					float at= ll.getAtt();
					String nn = ll.getUn();
					int id1=ll.getId();
					count = count + k;
					}
					int[] aatten = new int[count];
					for(int g=0;g<count;g++)
					{
						aatten[g]=(int) ll.getAtt();
					}
					
					
					RequestDispatcher rd = request.getRequestDispatcher("admin.jsp");
					request.setAttribute("users", listu);
					rd.forward(request, response);
					
				}
				else{
					RequestDispatcher rd = request.getRequestDispatcher("admin.jsp");
					request.setAttribute("users", listu);
					rd.forward(request, response);
				}
				
				
				}
			}
			
		}
		
		else {
			RequestDispatcher rd = request.getRequestDispatcher("invalid.jsp");
			rd.forward(request, response);
		}
	}

}