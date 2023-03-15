package org.project;

import org.globalclass.GlobalClass;
import org.testng.annotations.Test;

public class Q8_Greens_ChromeReport extends GlobalClass {
//QUESTION 8
//URL : http://www.greenstechnologys.com/
//NOTE: Lanuch the browser in chrome and generate a report for that.
	
	@Test
	private void tc() {
		browserLanch("chrome");
		urlLanch("http://www.greenstechnologys.com/");
	}
}
