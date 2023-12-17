package com.org.usermanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.org.usermanagementsystem.dao.UserDao;
import com.org.usermanagementsystem.dto.User;

public interface UserService {


	
	 User saveAndUpdate(User user);
		
	 User fetchUserById(int id);
	 
	 List<User> fetchAll();
	 
	 String deleteUserById(int id);
	
	

}
