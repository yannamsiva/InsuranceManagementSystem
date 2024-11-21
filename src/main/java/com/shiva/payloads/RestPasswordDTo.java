package com.shiva.payloads;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RestPasswordDTo {

	private String email;
	
	private String newPassword;
	
	private String confirmPassword;
	
	
}
