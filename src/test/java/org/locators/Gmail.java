package org.locators;

import org.globalclass.GlobalClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gmail extends GlobalClass{
	public Gmail() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="identifierId")
	private WebElement username;

	public WebElement getUsername() {
		return username;
	}

	@FindBy(xpath="//span[text()='Next']")
	private WebElement next;

	public WebElement getnext() {
		return next;
	}
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;

	public WebElement getpassword() {
		return password;
	}
}
