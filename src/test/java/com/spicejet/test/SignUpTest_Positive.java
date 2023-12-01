package com.spicejet.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.spicejet.utils.Reports;
import com.aventstack.extentreports.model.Report;
import com.spicejet.utils.SJWrappers;
import com.spicejet.utils.SeWrappers;

public class SignUpTest_Positive extends SeWrappers{

	SeWrappers se=new SeWrappers();
	SJWrappers sj = new SJWrappers();
	Reports repo = new Reports();
	
	@Test(priority=1)
	public void signUpWithValidCredentials(){
		try{
			repo.setTCDesc("SignUp of SpiceJet functionality with valid credentials");
			launchBrowser();
			sj.signupwrapper(1, "Muruganandh", "Srinivasan", "29", "1996", "February", "9566259258", "devanandh2902@gmail.com", "Batman12@#", "Batman12@#");
		    Assert.assertFalse(false);
		}
		catch(Exception ex){
			ex.printStackTrace();
			System.out.println("Fail to SignUp");
			repo.reportStep("FAIL", "Problem while SignUp");
		}
	}
	
	@AfterMethod
	public void closeBrowser(){
		try{
			driver.	quit();
			repo.reportStep("PASS", "Browser closed successfully");
		}
		catch(Exception ex){
			System.out.println("Problem in closing the browser");
			repo.reportStep("FAIL", "Problem in closing the browser");
			ex.printStackTrace();
		}
	}
}
