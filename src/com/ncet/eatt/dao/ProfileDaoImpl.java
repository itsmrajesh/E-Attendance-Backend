package com.ncet.eatt.dao;

import java.util.List;
import java.awt.DisplayMode;
import java.lang.reflect.Method;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ncet.eatt.domain.Profile;
import com.ncet.eatt.util.Dbutil;

import com.ncet.eatt.domain.Profile;

public class ProfileDaoImpl implements ProfileDao {
	private Dbutil dbUtil = Dbutil.obj;
	private final String ADD_USER = "INSERT INTO signupdata(USERNAME,PASSWORD,MOBILE,EMAIL,ID,ATTEN) VALUES(?,?,?,?,?,?)";
	private final String GET_ALL_USERS = "SELECT * FROM SIGNUPDATA";

	@Override
	public String addUser(Profile user) {
		Connection con = null;
		PreparedStatement pst = null;
		try {
			con = dbUtil.getConnection();
			pst = con.prepareStatement(ADD_USER);
			pst.setString(1, user.getUserName());
			pst.setString(2, user.getPassword());
			pst.setString(3, user.getMobile());
			pst.setString(4, user.getEmail());
			pst.setInt(5, user.getUid());
			pst.setInt(6, user.getAtt());
			int i = pst.executeUpdate();
			if (i > 0) {
				return user.getUserName() + " is added successfully!";
			}
		} catch (SQLException e) {
			System.out.println("Exception occured while adding User :" + e);
		}
		return "Something went wroning while adding :" + user.getUserName();
	}

	@Override
	public List<Profile> getUsers() {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		List<Profile> list = new ArrayList<>();
		try {
			con = dbUtil.getConnection();
			st = con.createStatement();
			rs = st.executeQuery(GET_ALL_USERS);
			while (rs.next()) {

				Profile user = new Profile();
				user.setUid(rs.getInt("id"));
				user.setUserName(rs.getString("USERNAME"));
				user.setPassword(rs.getString("PASSWORD"));
				user.setMobile(rs.getString("MOBILE"));
				user.setEmail(rs.getString("EMAIL"));
				user.setAtt(rs.getInt("atten"));
				list.add(user);
		
//				for( int i=0;i<list.size();i++){
//					
//					System.out.println("ID :"+user.getUid());
//					System.out.println("UN :"+user.getUserName());
//					System.out.println("PWD :"+user.getPassword());
//					System.out.println("MOB :" +user.getMobile());
//					System.out.println("EMAIL :"+user.getEmail());
//					System.out.println("---------------------------");
//				}

			}
		} catch (SQLException e) {
			System.out.println("Exception occured while Signing Up :" + e);
		}
		return list;
		
	}
	
	

}
