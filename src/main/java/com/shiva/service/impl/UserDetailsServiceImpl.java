package com.shiva.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.shiva.entities.PresentAddress;
import com.shiva.entities.UserDetails;
import com.shiva.exception.UserExist;
import com.shiva.payloads.RestPasswordDTo;
import com.shiva.payloads.UpdateUserDetails;
import com.shiva.payloads.UserDetailsDTO;
import com.shiva.repo.PresentAddressRepo;
import com.shiva.repo.RolesRepo;
import com.shiva.repo.UserDetailsRepo;
import com.shiva.service.UserDetailsService;
import com.shiva.utils.EmailUtils;
import com.shiva.utils.Otpgenerator;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserDetailsRepo userRepo;
	@Autowired
	private PresentAddressRepo presetnAddressrepo;
	@Autowired
	private RolesRepo rolesrepo;

	@Override
	public String userRegistration(UserDetails userDetails) {
		// TODO Auto-generated method stub
		// checkrecord is exist or not if not exist then register
		Optional<UserDetails> user = userRepo.findByEmail(userDetails.getEmail());
		String message = "User Already Exist";

		if (user.isEmpty()) {
			String otp = Otpgenerator.getOtp();
			// Send a Otp to user mail ...
			System.out.println(otp);
			EmailUtils.sendOtpMail(userDetails.getEmail(), otp);
			message = "Failed to send Otp";
			if (otp != null) {
				userDetails.setOtp(otp);
				UserDetails saveUser = userRepo.save(userDetails);
				PresentAddress address = new PresentAddress();
				address.setCity(userDetails.getCity());
				address.setUserId(userDetails.getUserId());
				PresentAddress saveAddress = presetnAddressrepo.save(address);
				if (saveUser != null && saveAddress != null) {
					message = "Otp sent to repsected email address";
				}

			}

		} else {
			throw new UserExist("User Already exist with : " + userDetails.getEmail() + "address");
		}

		return message;
	}

	@Override
	public String verifyOtp(String otp) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String userLogin(String email, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String fotgotPassword(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String changePassword(RestPasswordDTo resetPasswordDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateUserDetails(UpdateUserDetails update) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDetailsDTO viewuserDetails(long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateProfilepic(MultipartFile multipartfile, String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] viewProfilePicture(String email) {
		// TODO Auto-generated method stub
		return null;
	}

}
