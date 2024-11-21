package com.shiva.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;





@Entity


@Data
@ AllArgsConstructor
@NoArgsConstructor
public class PresentAddress {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	
	private long addressId;
	
	private int pindCode;
	private String city;
	private String addressLineOne;
	private String addressLineTwo;
	
	private String addressType;
	@JsonIgnore
	private long userId;
	
	
}
