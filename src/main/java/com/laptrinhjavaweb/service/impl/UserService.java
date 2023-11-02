package com.laptrinhjavaweb.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.laptrinhjavaweb.dao.IUserDAO;
import com.laptrinhjavaweb.model.UserModel;
import com.laptrinhjavaweb.service.IUserService;

public class UserService implements IUserService{
	
	@Inject
	private IUserDAO userDAO;

	@Override
	public List<UserModel> findByUserName(String userName) {
		// TODO Auto-generated method stub
		return userDAO.findByUserName(userName);
	}

}
