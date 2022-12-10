package com.executionpage;

import com.pagefactory.BookingConfirmationPage;

public class BookingConfirmationPageExec extends BookingConfirmationPage{
	
	
	public static void selectedHotelList() {
		click(getselectedHotel());
	}
	public static void selectHotelOrder() {
		click(getSelectedOrder());
	}
	public static void cancelSelected() {
		click(getCanceledOrder());
	}
	public static void logoutButton() {
		click(getLogout());
	}

}
