package com.shiva.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "WELLNESS_USER_dETAILS")
public class UserDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
private Long userId;	
	
	@NotEmpty
	@Size(min = 5,max = 20,message = "First Name must be between 5 to 20 characters ")
	@Pattern(regexp = "^[a-zA-Z]*$",message = "name must not contain Numbers or special characters")
	private String name;
	
	
	@NotEmpty
	@Size(min =2,max = 20,message = "city Name must be between 5 to 20 characters ")
	@Pattern(regexp = "^[a-zA-Z]*$",message = "name must not contain Numbers or special characters")
	private String city;


	
	@NotBlank
	@Column(unique = true)
	@Pattern(regexp = "[a-zA-Z0-9][a-zA-Z0-9.]@gmail[.]com",message = "Email format Should be yannamsiva@gmail.com")
	private String email;
	
	
	@NotEmpty
	@Size(min =10,max = 12,message = "Not Valid Mobile Number ")
	@Pattern(regexp = "(0|91)?[6-9][0-9]{9}",message="Enter Valid mobile Number")
	private String mboile;

private String password;
/*
 * @JsonIgnore
 * 
 * @Temporal(TemporalType.TIMESTAMP)
 * 
 * @Column(updatable = false) private Date createionDate;
 * 
 * @JsonIgnore
 * 
 * @Temporal(TemporalType.TIMESTAMP)
 * 
 * @Column(updatable = false) private Date updationDate;
 */
@JsonIgnore
private int age;
@JsonIgnore
private String gender;

@JsonIgnore
private String image;

@JsonIgnore
private String otp;

@JsonIgnore
private long roleId;

@JsonIgnore
private String designation;
}




