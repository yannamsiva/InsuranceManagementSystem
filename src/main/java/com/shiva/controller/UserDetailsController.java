package com.shiva.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shiva.entities.UserDetails;
import com.shiva.repo.PresentAddressRepo;
import com.shiva.service.impl.UserDetailsServiceImpl;

@RestController
@RequestMapping("/wellness/user")
public class UserDetailsController {

	@Autowired
	private UserDetailsServiceImpl userService;
	
	@Autowired
	private PresentAddressRepo addressRepo;
	
	@PostMapping("/register")
	public ResponseEntity<Map<String,String>> createUser(@RequestBody UserDetails userDetails )
	{
	String message=null;
	message="message";
	String userRegistration=userService.userRegistration(userDetails);
		Map<String,String>response=new HashMap<>();
		response.put(message, userRegistration);
		
		return new ResponseEntity<>(response,HttpStatus.OK);
	}
	
	
	
	
}
