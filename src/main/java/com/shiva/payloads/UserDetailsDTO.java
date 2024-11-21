package com.shiva.payloads;

import java.util.ArrayList;
import java.util.List;

import com.shiva.entities.Roles;

import lombok.Data;

@Data
public class UserDetailsDTO {

	private Long userId;
	
	private String name;
	private String email;
	private String mobile;
	private int age;
	private String gender;
	
	private List<SubStriberDetailsDTO> subscriptiondetails=new ArrayList<SubStriberDetailsDTO>();
	
	
	private List<SubStriberDetailsDTO> subScriptonDetails=
			new ArrayList<SubStriberDetailsDTO>();
	private Roles roles;
	
}
