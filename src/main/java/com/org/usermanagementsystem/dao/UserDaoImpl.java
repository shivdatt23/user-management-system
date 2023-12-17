package com.org.usermanagementsystem.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.org.usermanagementsystem.dto.User;
import com.org.usermanagementsystem.repository.UserRepository;

@Repository
public class UserDaoImpl implements UserDao{

	@Autowired
	UserRepository repo;
	@Override
	public User saveAndUpdate(User user) {
		
		return repo.save(user);
	}

	@Override
	public User fetchUserById(int id) {
		Optional<User> option = repo.findById(id);
		
		if(option.isPresent()) 
			return option.get();
		
		return null;
	}

	@Override
	public List<User> fetchAll() {
		List<User> list = repo.findAll();
		return list;
	}

	@Override
	public String deleteUserById(int id) {
		repo.deleteById(id);
		//if id is provided wrong what to do
		
		return "user deleted";
	}
	
	

}
