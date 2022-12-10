package com.executionpage;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import com.pagefactory.BookingPage;
import com.pagefactory.LoginPage;

public class LoginPageExecution extends LoginPage{
	
	public static void userName() {
		typeText(getUserName(), pro("user"));
		}
	
	public static void passWord() {
		typeText(getPassword(), pro("pass"));
		}
	
	
	
	
	
	
	
		

	
		
}


