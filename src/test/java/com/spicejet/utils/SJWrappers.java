package com.spicejet.utils;

import org.openqa.selenium.support.PageFactory;

import com.spicejet.pages.OW_Page;
import com.spicejet.pages.Login_Page;
import com.spicejet.pages.OW_Page;
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

	//OneWay trip
	public void oneWaywrapper(String place1, String place2, int value, String fname, String lname,
			String number, String email, String city) {
		try{
			Login_Page login_Page = PageFactory.initElements(driver, Login_Page.class);
			OW_Page oneTrip= PageFactory.initElements(driver, OW_Page.class);
			oneTrip.enterFromPlace(place1);
			oneTrip.enterToPlace(place2);
			oneTrip.selectDepaDate();
			oneTrip.selectReqDate();
			oneTrip.clicksearchFlight();
			oneTrip.clickcontinueButton();
			oneTrip.clicktitle(value);
			oneTrip.enterFname(fname);
			oneTrip.enterLname(lname);
			oneTrip.entercontactNumber(number);
			oneTrip.enteremailid(email);
			oneTrip.entertownName(city);
			oneTrip.clickcheckBox();
			oneTrip.clickContinue();
			oneTrip.clickContinue2();
			oneTrip.clickSkipSkip();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
}