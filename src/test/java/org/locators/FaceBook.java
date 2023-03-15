package org.locators;

import org.globalclass.GlobalClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBook  extends GlobalClass{

	public FaceBook() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	private WebElement username;

	public WebElement getUsername() {
		return username;
	}

	@FindBy(id="pass")
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}
	
	@FindBy(xpath="//button[@name='login']")
	private WebElement login;

	public WebElement getLogin() {
		return login;
	}
}
