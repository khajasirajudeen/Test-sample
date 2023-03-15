package org.project;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.util.RetryAnalyzerCount;

public class runner_Q10 implements IRetryAnalyzer {

	int min =1, max=3;
	
	public boolean retry(ITestResult result) {
		if (min<max) {
			min++;
			return true;		
			
		}
		return false;
	}
	
}
