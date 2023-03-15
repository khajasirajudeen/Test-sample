package org.project;

import java.io.IOException;

import org.globalclass.GlobalClass;
import org.locators.RedBus;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Q2_RedBus extends GlobalClass {

	  @Test
	    public void tc() throws IOException {
		browserLanch("edge");
		maxiWindow();
		urlLanch("https://www.redbus.in/");
		impWait(5);
		RedBus r = new RedBus();
		javaScriptClick(r.getSignclick());
		javaScriptClick(r.getSignup());
		driver.switchTo().frame(r.getFrame());
		javaScriptPasVal(r.getMobile(), "9876543210");
		String mob = r.getMobile().getAttribute("value");
		Assert.assertEquals( "9876543210",mob,"check the mobile NO ");
}
}