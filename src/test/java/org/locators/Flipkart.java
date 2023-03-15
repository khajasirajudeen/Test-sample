package org.locators;

import org.globalclass.GlobalClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flipkart extends GlobalClass {

	public Flipkart() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement email;

	public WebElement getEmail() {
		return email;
	}
}
