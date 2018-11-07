package com.ncet.eatt.dao;

import java.util.List;
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
	private final String ADD_CONTACT="INSERT INTO signupdata(USERNAME,PASSWORD,MOBILE,EMAIL) VALUES(?,?,?,?)";
	private final String GET_ALL_CONTACTS="SELECT * FROM SIGNUPDATA";

	@Override
	public String addUser(Profile user) {
		Connection con = null;
		PreparedStatement pst = null;
		try {
			con = dbUtil.getConnection();
			pst = con.prepareStatement(ADD_CONTACT);
			pst.setString(1, user.getUserName());
			pst.setString(2, user.getPassword());
			pst.setString(3, user.getMobile());
			pst.setString(4, user.getEmail());
			
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
			rs = st.executeQuery(GET_ALL_CONTACTS);
			while (rs.next()) {

				Profile user = new Profile();
				user.setUid(rs.getInt("UID"));
				user.setUserName(rs.getString("USERNAME"));
				user.setPassword(rs.getString("PASSWORD"));
				user.setMobile(rs.getString("MOBILE"));
				user.setEmail(rs.getString("EMAIL"));
				list.add(user);

			}
		} catch (SQLException e) {
			System.out.println("Exception occured while Signing Up :" + e);
		}
		return list;
	}

}
