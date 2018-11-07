package com.ncet.eatt.util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public enum Dbutil {
	obj;

	static {
			try{
				Class.forName("com.mysql.jdbc.Driver");
				
			}catch(Exception e){
				e.printStackTrace();
			}
	}

	public Connection getConnection() {
			Connection con =null;
			try {
				con= DriverManager.getConnection("jdbc:mysql://localhost:3306/eattendance","rajesh","mysql123");
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			return con;
					
	}

	public void close(Statement st, Connection con) {
		try {
			if (st != null) {
				st.close();
			}
			if (con != null) {
				con.close();

			}
		} catch (SQLException e) {
			System.out.println("While closing resources : " + e);
		}
	}

	public void close(Statement st, ResultSet rs, Connection con) {
		try {
			if (st != null) {
				st.close();
			}
			if (rs != null) {
				rs.close();
			}

			if (con != null) {
				con.close();

			}

		} catch (SQLException e) {
			System.out.println("While closing resources : " + e);
		}
	}

	public void close(PreparedStatement pst, Connection con) {
		try {
			if (pst != null) {
				pst.close();
			}
			if (con != null) {
				con.close();

			}
		} catch (SQLException e) {
			System.out.println("While closing resources : " + e);
		}
	}

	public void close(PreparedStatement pst, ResultSet rs, Connection con) {
		try {
			if (pst != null) {
				pst.close();
			}
			if (rs != null) {
				rs.close();
			}

			if (con != null) {
				con.close();

			}

		} catch (SQLException e) {
			System.out.println("While closing resources : " + e);
		}
	}
}
