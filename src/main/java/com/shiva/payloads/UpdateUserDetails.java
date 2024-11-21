package com.shiva.payloads;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UpdateUserDetails {
private String name;
private String mobile;
private String email;
private int age;

private String gender;

private String addressLineOne;
private String addressLineTwo;
private int pinCode;
private String addressType;

	
	
	
	
}
