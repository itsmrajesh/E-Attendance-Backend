package com.ncet.eatt.dao;

import java.util.List;

import com.ncet.eatt.domain.Profile;

public interface ProfileDao {
	String addUser(Profile user);
	List<Profile> getUsers();
}
