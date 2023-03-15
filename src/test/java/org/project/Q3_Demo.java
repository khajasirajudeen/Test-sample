package org.project;

import java.io.IOException;
import java.util.List;

import org.globalclass.GlobalClass;
import org.locators.Demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.internal.BaseClassFinder;

public class Q3_Demo extends GlobalClass {
//	QUESTION 3
//	URL : https://demoqa.com/registration/
//	NOTE: Give the details and register the form and verify whether the input
//	are correct or not by using Testng framework and access the locator by using POM framework. 

	@BeforeClass
	private void setup() {
		browserLanch("chrome");
		maxiWindow();
		urlLanch("https://demoqa.com/automation-practice-form");
	}
	SoftAssert sf = new SoftAssert();
	@Test
	private void tc() {
		Demo d = new Demo();
		javaScriptPasVal(d.getFirstname(),"khaja"); 
		String firstname = d.getFirstname().getAttribute("value");
		sf.assertTrue(firstname.contains("khaja")); 
		javaScriptPasVal(d.getLastName(), "sirajudeen");
		String lastname = d.getFirstname().getAttribute("value");
		sf.assertTrue(lastname.contains("sirajudeen")); 
		javaScriptPasVal(d.getEmail(), "khaja@gmail.com");
		String mail = d.getFirstname().getAttribute("value");
		sf.assertTrue(mail.contains("khaja@gmail.com")); 
		javaScriptClick(d.getMale());
		javaScriptPasVal(d.getMobile(), "9876543210"); 
		String mob = d.getFirstname().getAttribute("value");
		sf.assertTrue(mob.contains("9876543210")); 
		javaScriptClick(d.getdOB());
		javaScriptClick(d.getYear());
		dropDownValue(d.getYear(), "1994");
		javaScriptClick(d.getMonth());
		dropDownValue(d.getMonth(), "5");
		javaScriptClick(d.getDay());
		javaScriptClick(d.getSport());
		javaScriptPasVal(d.getSubject(), "JAVA"); 
//		javaScriptPasVal(d.getAddress(), getParDataFromExcel("domoform", 6, 1)); 
		pasVal(d.getAddress(), "chennai");
		String adderss = d.getFirstname().getAttribute("value");
		sf.assertTrue(adderss.contains("chennai")); 
		WebElement dd = driver.findElement(By.xpath("(//div[@class=' css-1hwfws3'])[1]"));
		List<WebElement> alldd = dd.findElements(By.xpath("//div[text()='Select State']"));
		WebElement sta = alldd.get(0);
		javaScriptClick(sta);
	}
	
}	


	

