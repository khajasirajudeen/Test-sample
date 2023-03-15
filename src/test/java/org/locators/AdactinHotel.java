package org.locators;

import org.globalclass.GlobalClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinHotel extends GlobalClass {
	public AdactinHotel() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="username")
	private WebElement username;

	@FindBy(id="password")
	private WebElement password;     
	
	@FindBy(id="login")
	private WebElement login;
	
	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotels;
	
	@FindBy(id="room_type")
	private WebElement roomtype;
	
	@FindBy(id="room_nos")
	private WebElement roomnos;
	
	@FindBy(id="datepick_in")
	private WebElement checkin;
	
	@FindBy(id="datepick_out")
	private WebElement checkout;
	
	@FindBy(id="adult_room")
	private WebElement adultroom;  
	
	@FindBy(id="child_room")
	private WebElement childroom;   
	
	@FindBy(id="Submit")
	private WebElement Submit;  
	
	@FindBy(id="radiobutton_0")
	private WebElement radioclick;

	@FindBy(id="continue")
	private WebElement hotelconfirm;  
	
	@FindBy(id="first_name")
	private WebElement firstname;
	
	@FindBy(id="last_name")
	private WebElement lastname;
	
	@FindBy(id="address")
	private WebElement billaddress;
	
	@FindBy(id="cc_num")
	private WebElement ccnum;
	
	@FindBy(id="cc_type")
	private WebElement cc_type;
	
	@FindBy(id="cc_exp_month")
	private WebElement cc_exp_month;
	
	@FindBy(id="cc_exp_year")
	private WebElement cc_exp_year;  
	
	@FindBy(id="cc_cvv")
	private WebElement cc_cvv;  
	
	@FindBy(id="book_now")
	private WebElement book_now;
	
	@FindBy(id="order_no")
	private WebElement order_no;
	
	public WebElement getOrder_no() {
		return order_no;
	}

	public WebElement getRadioclick() {
		return radioclick;
	}

	public WebElement getHotelconfirm() {
		return hotelconfirm;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getBilladdress() {
		return billaddress;
	}

	public WebElement getCcnum() {
		return ccnum;
	}

	public WebElement getCc_type() {
		return cc_type;
	}

	public WebElement getCc_exp_month() {
		return cc_exp_month;
	}

	public WebElement getCc_exp_year() {
		return cc_exp_year;
	}

	public WebElement getCc_cvv() {
		return cc_cvv;
	}

	public WebElement getBook_now() {
		return book_now;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoomnos() {
		return roomnos;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getAdultroom() {
		return adultroom;
	}

	public WebElement getChildroom() {
		return childroom;
	}

	public WebElement getSubmit() {
		return Submit;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getlogin() {
		return login;
	}
}
