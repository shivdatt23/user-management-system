package com.org.usermanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.usermanagementsystem.dao.UserDao;
import com.org.usermanagementsystem.dto.User;
import com.org.usermanagementsystem.service.UserService;


@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService=null;
	
	@PostMapping("/save")
	public User saveAndUpdateUser(@RequestBody User user) {
		
		return userService.saveAndUpdate(user);
		
	}
	
	@GetMapping("/displayall")
	public List<User> displayData(){
		
		return userService.fetchAll();
		
	}
	
	@GetMapping("/display/{id}")
	public User displayDataByid(@PathVariable int id) {
		
		return userService.fetchUserById(id);
		
	}
	
	
	@DeleteMapping("delete/{id}")
	public String deleteDataById(@PathVariable int id) {
		
		return userService.deleteUserById(id);
		
	}
	
	@PutMapping("update/{id}")
	public User updateUserById(@PathVariable int id,@RequestBody User user) {
		
		
		
		if(user!=null) {
			User user_new=userService.fetchUserById(id);
			user_new.setName(user.getName());
			user_new.setAge(user.getAge());
			user_new.setEmail(user.getEmail());
			user_new.setMobile(user.getMobile());
			user_new.setPassword(user.getPassword());
			user_new.setSalary(user.getSalary());
			
			return userService.saveAndUpdate(user_new);
			
		}
		
		return null;
	}
	

}
