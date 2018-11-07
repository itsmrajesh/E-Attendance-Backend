package com.ncet.eatt.service;

import java.util.List;
import com.ncet.eatt.dao.ProfileDao;
import com.ncet.eatt.dao.ProfileDaoImpl;
import com.ncet.eatt.domain.Profile;



public class ProfileServiceImpl implements ProfileService {

private ProfileDao profileDao;

public ProfileServiceImpl(){
	profileDao = new ProfileDaoImpl();
}
	@Override
	public String addUser(Profile user) {
		if(user!=null){
			String message = profileDao.addUser(user);
			return message;
		}
		throw new IllegalArgumentException("User Object can't be empty");
	}

	@Override
	public List<Profile> getUsers() {
		List<Profile> list = profileDao.getUsers();
		System.out.println("Total user found in the list is : "+list.size());
		return list;
	}

}
