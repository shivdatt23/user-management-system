package com.org.usermanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.usermanagementsystem.dao.UserDao;
import com.org.usermanagementsystem.dto.User;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserDao dao;
	
	@Override
	public User saveAndUpdate(User user) {
	
		return 	dao.saveAndUpdate(user);
	}

	@Override
	public User fetchUserById(int id) {
		return dao.fetchUserById(id);
	}

	@Override
	public List<User> fetchAll() {
		
		return dao.fetchAll();
	}

	@Override
	public String deleteUserById(int id) {
		
		return dao.deleteUserById(id);
	}
}
