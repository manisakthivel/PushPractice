package com.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class LoginPage extends BaseClass{
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private static WebElement userName;
	
	@FindBy(id="password")
	private static WebElement passWord;
	
	@FindBy(xpath="//a[text()='New User Register Here']")
	private static WebElement tagname;
	
	@FindBy(id="login")
	private static WebElement login;
	
	public static WebElement getUserName() {
		return userName;
	}
	
	public static WebElement getPassword() {
		return passWord;
	}
	public static void getTag() {
		System.out.println(tagname.getText());
	}
	public static WebElement getLoginBtn() {
		return login;
	}
	
	
}
	
	
	
	

	

