package org.project;

import static org.testng.Assert.assertTrue;

import org.globalclass.GlobalClass;
import org.locators.FaceBook;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Q1_FaceBook extends GlobalClass{
//	QUESTION 1
//	URL : https://www.facebook.com/
//	NOTE: Enter the username and password and verify whether the input is correct or not by using Testng framework.
	SoftAssert sf = new SoftAssert();
	@BeforeMethod
	private void bc() {
		dateTime();
	}
	@AfterMethod
	private void ac() {
		dateTime();
	}
    @BeforeClass
    public void setup() {
    	browserLanch("chrome");
    	 maxiWindow();
    	urlLanch("https://www.facebook.com/");
    	String title = driver.getTitle();
    	sf.assertTrue(title.contains("log in or sign up"));  	
   }
	@Test
	private void tc1() { 
		FaceBook f = new FaceBook();
		pasVal(f.getUsername(), "khaja");
		String attributeusername = f.getUsername().getAttribute("value");
		sf.assertTrue(attributeusername.contains( "khaja"));
	}
	@Test
	private void tc2() {
		FaceBook f = new FaceBook();
		pasVal(f.getPassword(), "123456");
		String attributepassword = f.getPassword().getAttribute("value");
		sf.assertTrue(attributepassword.contains( "123456"));
	}
	@Test
	private void tc3() {
		FaceBook f = new FaceBook();
		mouseClickElement(f.getLogin());
		String login = f.getLogin().getText();
		sf.assertTrue(login.contains( "Log in"));
	}
	    
	

	
}
	
