package org.locators;

import org.globalclass.GlobalClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Demo extends GlobalClass {

	public Demo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="firstName")
	private WebElement firstname;

	@FindBy(id="lastName")
	private WebElement lastName;
	
	@FindBy(id="userEmail")
	private WebElement email;
	
	@FindBy(id="gender-radio-1")
	private WebElement male;
		@FindBy(id="userNumber")             

	private WebElement mobile;
	
	@FindBy(id="dateOfBirthInput")      
	private WebElement dOB;
	
	@FindBy(xpath="//select[@class='react-datepicker__year-select']")     
	private WebElement year;
	
	public WebElement getYear() {
		return year;
	}
	
	@FindBy(xpath="//select[@class='react-datepicker__month-select']")     
	private WebElement month;

	public WebElement getMonth() {
		return month;
	}
	
	@FindBy(xpath="//option[@value='5']")      
	private WebElement june;
	
	public WebElement getJune() {
		return june;
	}

	@FindBy(xpath=" //div[text()=\"23\"]")      
	private WebElement day;

	public WebElement getDay() {
		return day;
	}

	@FindBy(id="subjectsContainer")
	private WebElement subject;
	
	@FindBy(id="hobbies-checkbox-1")
	private WebElement sport;
	
	@FindBy(xpath="//textarea[@placeholder='Current Address']")
	private WebElement address;
	
	@FindBy(id="state")
	private WebElement state;
	
	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getMale() {
		return male;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getdOB() {
		return dOB;
	}

	public WebElement getSubject() {
		return subject;
	}

	public WebElement getSport() {
		return sport;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getState() {
		return state;
	}
}
