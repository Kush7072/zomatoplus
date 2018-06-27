package com.thinkxfactor.zomatoplus.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thinkxfactor.zomatoplus.models.User;
import com.thinkxfactor.zomatoplus.repo.UserRepository;


@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserRepository userRepository;
	

	@PostMapping("/create")
	public User userCreate(@RequestBody User user) {
		User persistedUser = userRepository.save(user);
		return persistedUser;
	}

	@PostMapping("/login")
	public User userLogin(@RequestBody User user) {
		User usr=userRepository.findByNameAndPassword(user.getName(),user.getPassword());
		return usr;
	}	
		
		@GetMapping("/getAll")
		public List<User> getAll(){
			List user=userRepository.findAll();
			return user;
		
		}
		
		
	

	

}
