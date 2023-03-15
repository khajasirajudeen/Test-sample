package org.project;

import org.globalclass.GlobalClass;

import org.locators.Flipkart;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Q4_Flipkart extends GlobalClass {

//	QUESTION 4
//	URL : https://www.flipkart.com/account/login
//	NOTE: Enter the email and password and verify whether the input are 
//	correct or not by using Testng framework,POM framework.
	
	@Test
	public void flipkart() {
		browserLanch("edge");
		maxiWindow();
		urlLanch("https://www.flipkart.com/account/login");
		Flipkart f = new Flipkart();
		javaScriptPasVal(f.getEmail(), "987654321");
		String mob = f.getEmail().getAttribute("value");
		Assert.assertEquals("987654321", mob);
	
}
}