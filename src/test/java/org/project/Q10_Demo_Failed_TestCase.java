package org.project;
//<listeners>
//<listener class-name="org.project.RerunExecution"> </listener>
//</listeners>
import java.io.IOException;
import java.util.List;

import org.globalclass.GlobalClass;
import org.locators.Demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class Q10_Demo_Failed_TestCase extends GlobalClass {
	@BeforeClass
	private void setUP() {
		browserLanch("chrome");
		maxiWindow();
		urlLanch("https://demoqa.com/automation-practice-form");
	}
//	SoftAssert sf = new SoftAssert();
	@Test
	private void tc1() throws IOException {
		Demo d = new Demo();
		javaScriptPasVal(d.getFirstname(), getParDataFromExcel("domoform", 0, 1));
		String firstname = d.getFirstname().getAttribute("value");
		Assert.assertTrue(firstname.contains("khaja0"), "check First Name");

	}
	
	@Test
	private void tc2() throws IOException {
		Demo d = new Demo();
		javaScriptPasVal(d.getLastName(), getParDataFromExcel("domoform", 1, 1)); 
		String lastname = d.getFirstname().getAttribute("value");
		Assert.assertTrue(lastname.contains("sirajudeen0"),"check last Name");
	}
	
	@Test
	private void tc3() throws IOException {
		Demo d = new Demo();
		javaScriptPasVal(d.getEmail(), getParDataFromExcel("domoform", 2, 1)); 
		String mail = d.getFirstname().getAttribute("value");
		Assert.assertTrue(mail.contains("khaja@gmail.com0"),"check Email"); 
	}
	
	@Test
	private void tc4() throws IOException {
		Demo d = new Demo();
		javaScriptClick(d.getMale());
	}
	
	@Test()
	private void tc5() throws IOException {
		Demo d = new Demo();
		javaScriptPasVal(d.getMobile(), getParDataFromExcel("domoform", 3, 1)); 
		String mob = d.getFirstname().getAttribute("value");
		Assert.assertTrue(mob.contains("9876543210"),"check mobile no");
	}
	
	@Test
	private void tc6() throws IOException {
		Demo d = new Demo();
		javaScriptClick(d.getdOB());
		javaScriptClick(d.getYear());
		dropDownValue(d.getYear(), "1994");
		javaScriptClick(d.getMonth());
		dropDownValue(d.getMonth(), "5");
		javaScriptClick(d.getDay());
		javaScriptClick(d.getSport());
	}
	
	@Test
	private void tc7() throws IOException {
		Demo d = new Demo();
		javaScriptPasVal(d.getSubject(), getParDataFromExcel("domoform", 5, 1)); 
	}
	
	@Test
	private void tc8() throws IOException {
		Demo d = new Demo();
		pasVal(d.getAddress(), getParDataFromExcel("domoform", 6, 1));
		String adderss = d.getFirstname().getAttribute("value");
		Assert.assertTrue(adderss.contains("chennai"),"check Address");
	}
	
	@Test
	private void tc9() throws IOException {
		WebElement dd = driver.findElement(By.xpath("(//div[@class=' css-1hwfws3'])[1]"));
		List<WebElement> alldd = dd.findElements(By.xpath("//div[text()='Select State']"));
		WebElement sta = alldd.get(0);
		javaScriptClick(sta);
	}
	@AfterClass
	private void tc10() {
//		close();
	}

	
		
		
		
	
//		javaScriptPasVal(d.getdOB(), getParDataFromExcel("domoform", 4, 1)); 
		
	
//		javaScriptPasVal(d.getAddress(), getParDataFromExcel("domoform", 6, 1)); 
		
		
}
