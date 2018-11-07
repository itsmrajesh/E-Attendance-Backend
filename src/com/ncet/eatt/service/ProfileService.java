package com.ncet.eatt.service;

import java.util.List;

import com.ncet.eatt.domain.Profile;

public interface ProfileService {
	String addUser(Profile user);
	List<Profile> getUsers();
}
