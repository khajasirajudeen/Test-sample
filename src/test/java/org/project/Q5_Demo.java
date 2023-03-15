package org.project;

import java.io.IOException;
import java.util.List;

import org.globalclass.GlobalClass;
import org.locators.Demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Q5_Demo extends GlobalClass {
//	QUESTION 5
//	URL : https://demoqa.com/registration/
//	NOTE: Register the form by taking the input from excel sheet(DataDriven) and  use POM
//	framework and also you have to create a project in maven and verify whether the input taken is 
//	correct or not by using Testng ,POM framework.
	@Test
	private void tc() throws IOException {
		browserLanch("chrome");
		maxiWindow();
		urlLanch("https://demoqa.com/automation-practice-form");
		Demo d = new Demo();
		SoftAssert sf = new SoftAssert();
		javaScriptPasVal(d.getFirstname(), getParDataFromExcel("domoform", 0, 1));
		String firstname = d.getFirstname().getAttribute("value");
		sf.assertTrue(firstname.contains("khaja"));
		javaScriptPasVal(d.getLastName(), getParDataFromExcel("domoform", 1, 1)); 
		String lastname = d.getFirstname().getAttribute("value");
		sf.assertTrue(lastname.contains("sirajudeen"));
		javaScriptPasVal(d.getEmail(), getParDataFromExcel("domoform", 2, 1)); 
		String mail = d.getFirstname().getAttribute("value");
		sf.assertTrue(mail.contains("khaja@gmail.com")); 
		javaScriptClick(d.getMale());
		javaScriptPasVal(d.getMobile(), getParDataFromExcel("domoform", 3, 1)); 
		String mob = d.getFirstname().getAttribute("value");
		sf.assertTrue(mob.contains("9876543210"));
//		javaScriptPasVal(d.getdOB(), getParDataFromExcel("domoform", 4, 1)); 
		javaScriptClick(d.getdOB());
		javaScriptClick(d.getYear());
		dropDownValue(d.getYear(), "1994");
		javaScriptClick(d.getMonth());
		dropDownValue(d.getMonth(), "5");
		javaScriptClick(d.getDay());
		javaScriptClick(d.getSport());
		javaScriptPasVal(d.getSubject(), getParDataFromExcel("domoform", 5, 1)); 
//		javaScriptPasVal(d.getAddress(), getParDataFromExcel("domoform", 6, 1)); 
		pasVal(d.getAddress(), getParDataFromExcel("domoform", 6, 1));
		String adderss = d.getFirstname().getAttribute("value");
		sf.assertTrue(adderss.contains("chennai"));
		WebElement dd = driver.findElement(By.xpath("(//div[@class=' css-1hwfws3'])[1]"));
		List<WebElement> alldd = dd.findElements(By.xpath("//div[text()='Select State']"));
		WebElement sta = alldd.get(0);
		javaScriptClick(sta);
	}
	

}
