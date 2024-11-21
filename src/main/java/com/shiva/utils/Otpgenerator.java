package com.shiva.utils;

import java.util.function.Supplier;

public class Otpgenerator {

	public static String getOtp()
	{
		Supplier<String> otp=()->
		{
			String otp1="";
			for(int i=1;i<=6;++i)
			{
				otp1=otp1+(int)(Math.random()*10);
			}
			return otp1;
		};
		return otp.get();
	}
}
