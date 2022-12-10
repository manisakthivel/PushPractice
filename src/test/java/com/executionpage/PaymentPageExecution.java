package com.executionpage;

import com.pagefactory.PaymentPage;

public class PaymentPageExecution extends PaymentPage {

	public static void firstNameHotel() {
		typeText(getFirstName(),readExcelData(0,1));
	}
	public static void lastNameHotel() {
		typeText(getLastName(), readExcelData(1,1));
	}
	public static void addressHotel() {
		typeText(getAddress(), readExcelData(2,1));
	}
	public static void cardNumber() {
		typeText(getCardNum(), readExcelData(3,1));
	}
	public static void cardType() {
		selectMethod(getSelectCreditCardType(), "VISA");
	}
	public static void expiryMonth() {
		selectMethod(getSelectExpiryDateMonth(), "November");
	}
	public static void expiryYear() {
		selectMethod(getSelectExpiryDateYear(), "2022");
	}
	public static void cvvNumber() {
		typeText(getCvvNum(), readExcelData(4,1));
	}
	public static void bookNow() {
		click(getBookBtn());
	}
	
	

}
