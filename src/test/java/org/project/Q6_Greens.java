package org.project;

import org.globalclass.GlobalClass;
import org.locators.Flipkart;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Q6_Greens extends GlobalClass {
	@Parameters("Browser")
	@Test
	private void tc(String browsername) {
		if (browsername.startsWith("chrome")) {
			browserLanch("chrome");
		}else if (browsername.startsWith("edge")) {
			browserLanch("edge");
		} else {
			browserLanch("firefox");
		}
			maxiWindow();
		urlLanch("https://www.flipkart.com/account/login");
		Flipkart f = new Flipkart();
		javaScriptPasVal(f.getEmail(), "987654321");
		String mob = f.getEmail().getAttribute("value");
		Assert.assertEquals("987654321", mob);
	}
}
