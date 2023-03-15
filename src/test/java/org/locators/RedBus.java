package org.locators;

import org.globalclass.GlobalClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RedBus extends GlobalClass {

	public RedBus() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="signin-block")
	private WebElement signclick;
	
	@FindBy(id="signInLink")   
	private WebElement signup;
	
	
//	xpath="//div[@class='mobileInput clearfix errorParent']"
	@FindBy(id="mobileNoInp")
	private WebElement mobile;  
	
	@FindBy(xpath="//iframe[@class='modalIframe']")
	private WebElement frame;

	public WebElement getFrame() {
		return frame;
	}

	public WebElement getSignclick() {
		return signclick;
	}

	public WebElement getSignup() {
		return signup;
	}

	public WebElement getMobile() {
		return mobile;
	}
}
