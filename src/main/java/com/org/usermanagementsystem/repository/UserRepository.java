package com.org.usermanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.usermanagementsystem.dto.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	

}
