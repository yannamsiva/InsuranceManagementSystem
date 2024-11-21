package com.shiva.service;

import org.springframework.web.multipart.MultipartFile;

import com.shiva.entities.UserDetails;
import com.shiva.exception.UserExist;
import com.shiva.payloads.RestPasswordDTo;
import com.shiva.payloads.UpdateUserDetails;
import com.shiva.payloads.UserDetailsDTO;

public interface UserDetailsService {

	public String userRegistration(UserDetails userDetails);

	public String verifyOtp(String otp);

	public String userLogin(String email, String password);

	public String fotgotPassword(String email);

	public String changePassword(RestPasswordDTo resetPasswordDTO);

	public String updateUserDetails(UpdateUserDetails update);

	public UserDetailsDTO viewuserDetails(long userId);

	public String updateProfilepic(MultipartFile multipartfile, String email);

	public byte[] viewProfilePicture(String email);

}
