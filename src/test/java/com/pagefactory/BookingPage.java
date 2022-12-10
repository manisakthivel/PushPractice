package com.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.executionpage.LoginPageExecution;

public class BookingPage extends LoginPageExecution{
	
	public BookingPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="location")
	private static WebElement location;
	
	@FindBy(id="hotels")
	private static WebElement hotel;
	
	@FindBy(css = "select#room_type")
	private static WebElement roomType;
	
	@FindBy(id="room_nos")
	private static WebElement numOfRooms;
	
	@FindBy(id="datepick_in")
	private static WebElement checkIndate;
	
	@FindBy(id="datepick_out")
	private static WebElement checkOut;
	
	@FindBy(id="adult_room")
	private static WebElement adultsPer;
	
	@FindBy(id="child_room")
	private static WebElement childPer;
	
	
	@FindBy(id="Submit")
	private static WebElement submit;
	
	@FindBy(xpath="//input[@type='radio']")
	private static WebElement hotelButton;
	
	@FindBy(id="continue")
	private static WebElement continueOption;
	
	
	public static WebElement getSubmit() {
		 return submit;
		
	}
		
	public static WebElement getLocation() {
		return location;
	}

	public static WebElement getHotel() {
		return hotel;
	}

	public static WebElement getRoomType() {
		return roomType;
	}

	public static WebElement getNumOfRooms() {
		return numOfRooms;
	}

	public static WebElement getCheckIndate() {
		return checkIndate;
	}

	public static WebElement getCheckOut() {
		return checkOut;
	}

	public static WebElement getAdultsPer() {
		return adultsPer;
	}

	public static WebElement getChildPer() {
		return childPer;
	}
	
	public static WebElement getHotelSelectButton() {
		return hotelButton;
	}
	
	public static WebElement getContinueOption() {
		return continueOption;
	}
	
	
	
}
