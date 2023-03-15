package org.project;



import org.globalclass.GlobalClass;
import org.locators.Gmail;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Q14_Gmail_Paramater extends GlobalClass {
	
	@Parameters({"username","password"})
	@Test
	private void tc(String username,String password) {
		browserLanch("chrome");
		maxiWindow();
		urlLanch("https://accounts.google.com/");
		impWait(5);
		Gmail g = new Gmail();
		javaScriptPasVal(g.getUsername(), username);
		javaScriptClick(g.getnext());
		javaScriptPasVal(g.getpassword(), password);
		javaScriptClick(g.getnext());
		
		
		

	}
}
