package com.finalexecution;

import org.junit.Test;

import com.baseclass.BaseClass;
import com.executionpage.BookingConfirmationPageExec;
import com.executionpage.BookingPageExecution;
import com.executionpage.LoginPageExecution;
import com.pagefactory.BookingPage;
import com.pagefactory.LoginPage;

public class FinalExecution extends BookingConfirmationPageExec{
	
	//public static void main(String[] args) {
	
			@Test			
			public void finalExecution() {
			userName();
			passWord();
			getTag();
			click(getLoginBtn());
			location();
			hotel();
			roomType();
			numberOfRooms();
			checkIn();
			checkOut();
			adultsperRoom();
			childrenperRoom();
			submit();
			selectHotel();
			contOption();
			firstNameHotel();
			lastNameHotel();
			addressHotel();
			cardNumber();
			cardType();
			expiryMonth();
			expiryYear();
			cvvNumber();
			bookNow();
			delay();
			selectedHotelList();
			selectHotelOrder();
			cancelSelected();
			alert();
			logoutButton();
			LoginPage l = new LoginPage();
			BookingPage bp = new BookingPage();
			}
			
			
			
			
			
			
			
			
			
			
			

			
			
		}

		


	
	
	
	
	
		
		
	
	
