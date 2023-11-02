package com.laptrinhjavaweb.dao;

import java.util.List;

import com.laptrinhjavaweb.model.UserModel;

public interface IUserDAO extends GenericDAO<UserModel>{
	List<UserModel> findByUserName(String userName);
}
