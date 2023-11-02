package com.laptrinhjavaweb.service;

import java.util.List;

import com.laptrinhjavaweb.model.UserModel;

public interface IUserService {
	List<UserModel> findByUserName(String userName);
}
