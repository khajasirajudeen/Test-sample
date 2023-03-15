package org.project;

import java.awt.AWTException;
import java.awt.event.KeyEvent;

import org.globalclass.GlobalClass;
import org.locators.Gmail;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import okhttp3.Credentials;

//QUESTION 15
//URL : https://mail.google.com/
//NOTE: Open the Gmail application ,  Define the method credentials() which is defined as a Dataprovider using the annotation.
//This method returns array of object array.Add a method test() to your DataProviderTest class. This method takes two strings 
//as input parameters. Add the annotation @Test(dataProvider = “Authentication”) to this method. The attribute dataProvider is
//mapped to “Authentication”.

public class Q15_Gmail extends GlobalClass {

	@Test(dataProvider="Authentication")
	private void test(String username,String password) throws InterruptedException, AWTException {
		browserLanch("chrome");
		maxiWindow();
		urlLanch("https://accounts.google.com/");
		impWait(5);
		Gmail g = new Gmail();
		javaScriptPasVal(g.getUsername(), username);
//		javaScriptClick(g.getnext());
//		javaScriptPasVal(g.getpassword(), password);
//		javaScriptClick(g.getnext());
		tsleep(5000);
		

		
		
}	
	@DataProvider(name="Authentication")
	public Object[][] credentials() {
		return new Object[] [] {
			{"khaja@gmail.com","12345"},
			{"aashiq@gmail.com","54321"},
			{"siraj@gmail.com","98765"},
			{"deen@gmail.com","56789"}
			
		};
	}
}