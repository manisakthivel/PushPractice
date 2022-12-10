package com.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.executionpage.PaymentPageExecution;

public class BookingConfirmationPage extends PaymentPageExecution {

	@FindBy(id="my_itinerary")
	private static WebElement selectedHotel;
	
	public static WebElement getselectedHotel() {
		return selectedHotel;
	}
	@FindBy(xpath="//input[@id='check_all']")
	private static WebElement selectOrder;
	
	public static WebElement getSelectedOrder() {
		return selectOrder;
	}
	@FindBy(name="cancelall")
	private static WebElement cancelOrder;
	
	public static WebElement getCanceledOrder() {
		return cancelOrder;
	}
	@FindBy(xpath="//input[@id='logout']")
	private static WebElement logout;
	
	public static WebElement getLogout() {
		return logout;
	}

}
