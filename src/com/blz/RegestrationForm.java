package com.blz;

import java.util.regex.Pattern;
import com.blz.utilis.Constants;

public class RegestrationForm{

		public boolean userEmail(String userEmail) {
			return IsValidPattern(userEmail,Constants.EMAIL_REGEX);
		}
		
		
		public boolean userNumber(String userNumber) {
			return IsValidPattern(userNumber, Constants.MOBILE_NUMBER_REGEX);
		}
		
		
		public boolean userName(String userName) {
			return IsValidPattern(userName,Constants.FirstNAME_REGEX);
		}
		
		
		public boolean userLatName(String userLastName) {
			return IsValidPattern(userLastName,Constants.LastName_REGEX);
		}
	
		
		public boolean userPassword(String userPassword) {
			return IsValidPattern(userPassword,Constants.PASSWORD_REGEX);
			}
		
		
		public static  boolean IsValidPattern(String input, String regex) {
			return Pattern.compile(regex).matcher(input).matches();
		}
	}
			