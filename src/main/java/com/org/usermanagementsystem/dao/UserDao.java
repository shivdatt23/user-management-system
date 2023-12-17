package com.org.usermanagementsystem.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.org.usermanagementsystem.dto.User;
import com.org.usermanagementsystem.repository.UserRepository;

@Repository
public interface UserDao {
	
	
	 User saveAndUpdate(User user);
	
	 User fetchUserById(int id);
	 
	 List<User> fetchAll();
	 
	 String deleteUserById(int id);
	

}
