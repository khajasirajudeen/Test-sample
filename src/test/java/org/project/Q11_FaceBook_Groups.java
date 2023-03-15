package org.project;

import org.globalclass.GlobalClass;
import org.locators.FaceBook;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Q11_FaceBook_Groups extends GlobalClass {
	SoftAssert sf = new SoftAssert();
	
	@BeforeMethod(groups="A")
	private void bc() {
		dateTime();
	}
	@AfterMethod(groups="B")
	private void ac() {
		dateTime();
	}
    @BeforeClass(groups= {"A","B"})
    public void setup() {
    	browserLanch("chrome");
    	 maxiWindow();
    	urlLanch("https://www.facebook.com/");
    	String title = driver.getTitle();
    	sf.assertTrue(title.contains("log in or sign up"));  	
   }
	@Test(groups="A")
	private void tc1() { 
		FaceBook f = new FaceBook();
		pasVal(f.getUsername(), "khaja");
		String attributeusername = f.getUsername().getAttribute("value");
		sf.assertTrue(attributeusername.contains( "khaja"));
	}
	@Test(groups="A")
	private void tc2() {
		FaceBook f = new FaceBook();
		pasVal(f.getPassword(), "123456");
		String attributepassword = f.getPassword().getAttribute("value");
		sf.assertTrue(attributepassword.contains( "123456"));
	}
	@Test(groups= {"A","B"})
	private void tc3() {
		FaceBook f = new FaceBook();
		mouseClickElement(f.getLogin());
		String login = f.getLogin().getText();
		sf.assertTrue(login.contains( "Log in"));
	}
}
