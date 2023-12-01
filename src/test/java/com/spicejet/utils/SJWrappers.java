package com.spicejet.utils;

import org.openqa.selenium.support.PageFactory;

import com.spicejet.pages.Login_Page;
import com.spicejet.pages.SignUp_Page;

public class SJWrappers extends SeWrappers{

	//SignUp page methods
	public void signupwrapper(int num, String Fname, String Lname, String date, String month, String year, String mobilenum, String emailid,
			String newpwd, String Copwd) {
		try {
			SignUp_Page signupPage = PageFactory.initElements(driver, SignUp_Page.class);
			signupPage.clicksignup();
			signupPage.clicktitle(num);
			signupPage.enterFirstname(Fname);
			signupPage.enterLastname(Lname);
			signupPage.clickCalendar();
			signupPage.enterDate(date);
			signupPage.enterYear(year);
			signupPage.enterMonth(month);
			signupPage.enterMobilenum(mobilenum);
			signupPage.enterEmailId(emailid);
			signupPage.enternewPassword(newpwd);
			signupPage.enterconfirmPassword(Copwd);
			signupPage.clicktermsandCo();
			signupPage.clicksubmitSignup();
			screenshot("SignUpPage_SpiceJet");
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	//////////////////////////////////////////////////////////

	//Login Page Methods
	public void loginwrapper(String myemaild, String mypassowrd) {
		try {

			Login_Page loginPage = PageFactory.initElements(driver, Login_Page.class);
			loginPage.clickloginMainpage();
			loginPage.clickEmailRadioButton();
			loginPage.enteremailid(myemaild);
			loginPage.enterpassword(mypassowrd);
			loginPage.clickLoginMyacc();
			screenshot("LoginPage");
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	//////////////////////////////////////////////////////////













}
