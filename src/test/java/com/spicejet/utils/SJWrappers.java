package com.spicejet.utils;

import org.openqa.selenium.support.PageFactory;

import com.spicejet.pages.OW_Page;
import com.spicejet.pages.RT_Page;
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
			oneTrip.clickonewaybutton();
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

	//////////////////////////////////////////////////////////

	//Round Trip Method
	public void roundTripwrapper(String place1, String place2, int value, String fname, String lname,
			String number, String email, String city) {
		try{
			Login_Page login_Page = PageFactory.initElements(driver, Login_Page.class);
			RT_Page roTrip= PageFactory.initElements(driver, RT_Page.class);
			roTrip.clickRoundTripbutton();
			roTrip.enterFromPlace(place1);
			roTrip.enterToPlace(place2);
			roTrip.selectDepaDate();
			roTrip.selectReqDate();
			roTrip.selectReturnDate();
			roTrip.selectReturnreqDate();
			roTrip.clicksearchFlight();
			roTrip.clickcontinueButton();
			roTrip.clicktitle(value);
			roTrip.enterFname(fname);
			roTrip.enterLname(lname);
			roTrip.entercontactNumber(number);
			roTrip.enteremailid(email);
			roTrip.entertownName(city);
			roTrip.clickcheckBox();
			roTrip.clickContinue();
			roTrip.clickContinue2();
			roTrip.clickSkipSkip();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
}