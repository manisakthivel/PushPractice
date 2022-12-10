package com.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.executionpage.BookingPageExecution;

public class PaymentPage extends BookingPageExecution{

	@FindBy(xpath="//input[@id='first_name']")
	private static WebElement firstName;
	
	@FindBy(xpath="//input[@id='last_name']")
	private static WebElement lastName;
	
	@FindBy(id="address")
	private static WebElement address;
	
	@FindBy(xpath="//input[@id='cc_num']")
	private static WebElement cardNum;
	
	@FindBy(xpath="//select[@id='cc_type']")
	private static WebElement creditCardType;
	
	@FindBy(id="cc_exp_month")
	private static WebElement expiryDateMonth;
	
	@FindBy(id="cc_exp_year")
	private static WebElement expiryDateYear;
	
	@FindBy(xpath="//input[@id='cc_cvv']")
	private static WebElement cvvNum;
	
	@FindBy(id="book_now")
	private static WebElement bookBtn;
	
	public static WebElement getFirstName() {
		return firstName;
	}
	
	public static WebElement getLastName() {
		return lastName;
	}
	public static WebElement getAddress() {
		return address;
	}
	
	public static WebElement getCardNum() {
		return cardNum;
	}
	
	public static WebElement getSelectCreditCardType() {
		return creditCardType;
	}
	
	public static WebElement getSelectExpiryDateMonth() {
		return expiryDateMonth;
	}
	public static WebElement getSelectExpiryDateYear() {
		return expiryDateYear;
	}
	public static WebElement getCvvNum() {
		return cvvNum;
	}
	public static WebElement getBookBtn() {
		return bookBtn;
	}
}
