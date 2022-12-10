package com.executionpage;

import org.apache.commons.collections4.KeyValue;
import org.openqa.selenium.WebElement;

import com.pagefactory.BookingPage;

public class BookingPageExecution extends BookingPage{

	//Booking Page Execution
	public static void location() {
		selectMethod(getLocation(), "Melbourne");
	}

	public static void hotel() {
		selectMethod(getHotel(), "Hotel Sunshine");
	}
	public static void roomType() {
		selectMethod(getRoomType(), "Double");
	}

	public static void numberOfRooms() {
		selectMethod(getNumOfRooms(), "3 - Three");
	}
	public static void checkIn() {
		typeText(getCheckIndate(), pro("checkIn"));
	}
	public static void checkOut() {
		typeText(getCheckOut(), pro("checkout"));
	}
	public static void adultsperRoom() {
		selectMethod(getAdultsPer(), "2 - Two");
	}
	public static void childrenperRoom() {
		selectMethod(getChildPer(), "1 - One");
	}
	public static void submit() {
		click(getSubmit());
	}
	public static void selectHotel() {
		click(getHotelSelectButton());
	}
	public static void contOption() {
		click(getContinueOption());
	}
	

}
