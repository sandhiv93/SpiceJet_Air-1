package com.spicejet.utils;

import org.openqa.selenium.support.PageFactory;

import com.spicejet.pages.OW_Page;
import com.spicejet.pages.PayPage;
import com.spicejet.pages.RT_Page;
import com.spicejet.pages.Login_Page;
import com.spicejet.pages.OW_Page;
import com.spicejet.pages.SignUp_Page;
import com.spicejet.pages.extraTaskPage;

public class SJWrappers extends SeWrappers{

	//SignUp page methods
	public void signupwrapper(int num, String Fname, String Lname, String date, String month, String year, String mobilenum, String emailid,
			String newpwd, String Copwd, String URLbroken) {
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
			signupPage.getmyAllDetails(URLbroken);
			screenshot("SignUpPage_SpiceJet");
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	//////////////////////////////////////////////////////////

	//Login Page Methods
	public void loginwrapper(String myemaild, String mypassowrd, String URLbroken) {
		try {
			Login_Page loginPage = PageFactory.initElements(driver, Login_Page.class);
			loginPage.clickloginMainpage();
			loginPage.clickEmailRadioButton();
			loginPage.enteremailid(myemaild);
			loginPage.enterpassword(mypassowrd);
			loginPage.clickLoginMyacc();
			loginPage.getmyAllDetails(URLbroken);
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
			oneTrip.clearFirstname();
			oneTrip.enterFname(fname);
			oneTrip.clearLastname();
			oneTrip.enterLname(lname);
			oneTrip.clearcontactBox();
			oneTrip.entercontactNumber(number);
			oneTrip.clearmailid();
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
			roTrip.clearFirstname();
			roTrip.enterFname(fname);
			roTrip.clearLastname();
			roTrip.enterLname(lname);
			roTrip.clearcontactBox();
			roTrip.entercontactNumber(number);
			roTrip.clearmailid();
			roTrip.enteremailid(email);
			roTrip.entertownName(city);
			roTrip.clickcheckBox();
			roTrip.clickContinue();
			roTrip.clickContinue2();
			roTrip.clickSkipSkip();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

	//Dummy Payment Data
	public void paymentwrapper(String cardnum, String myname, String month, String year, String cvvnum) {
		try {
			Login_Page login_Page = PageFactory.initElements(driver, Login_Page.class);
			OW_Page oneTrip= PageFactory.initElements(driver, OW_Page.class);
			RT_Page roTrip= PageFactory.initElements(driver, RT_Page.class);
			PayPage pay = PageFactory.initElements(driver, PayPage.class);
			pay.clickandEntercardNumframe(cardnum);
			pay.clickandEntercardNameframe(myname);
			pay.clickandEntercardMonthframe(month);
			pay.clickandEnterYearframe(year);
			pay.clickandEnterCVVframe(cvvnum);
			pay.clickPaybutton();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//Extra Tasks
	public void extrataskWrapper(){
		try{
			Login_Page login_Page = PageFactory.initElements(driver, Login_Page.class);
			extraTaskPage ETPage= PageFactory.initElements(driver, extraTaskPage.class);
			ETPage.clickcheckInn();
			ETPage.clickflightstatus();
			ETPage.clickmanageBook();
			screenshot("CheckInn");
			screenshot("FlightStatus");
			screenshot("ManageBooking");
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
	}
}