package com.laptrinhjavaweb.dao.impl;

import java.util.List;

import com.laptrinhjavaweb.dao.IUserDAO;
import com.laptrinhjavaweb.mapper.UserMapper;
import com.laptrinhjavaweb.model.UserModel;

public class UserDAO extends AbtractDAO<UserModel> implements IUserDAO{

	@Override
	public List<UserModel> findByUserName(String userName) {
		String sql = "SELECT * FROM USER WHERE USERNAME = ?";
		return query(sql, new UserMapper(),userName);
	}

}
