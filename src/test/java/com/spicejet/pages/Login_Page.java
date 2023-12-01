package com.spicejet.pages;

import com.spicejet.utils.SeWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Page extends SeWrappers {

	//1. Main page Login button click 
	@FindBy(xpath = "//div[contains(text(),'Login')]")
	public WebElement loginbutton;

	public void clickloginMainpage() {
		setImplicitWait(15);
		clickElement(loginbutton);
	}

	//////////////////////////////////////////////////////////

	//2. Click email Radio button click 
	@FindBy(xpath = "//div[@class='css-1dbjc4n r-18u37iz r-m611by']//div[2]//div[1]//div[1]//*[name()='svg']")
	public WebElement radioemailid;

	public void clickEmailRadioButton() {
		setImplicitWait(15);
		clickElement(radioemailid);
	}

	//////////////////////////////////////////////////////////	

	//3. Enter emailid for login
	@FindBy(xpath = "//input[@type='email']")
	public WebElement emailid;

	public void enteremailid(String myemail) {
		waitforelementExplicitwait(emailid, 10);
		typeText(emailid, myemail);
	}

	//////////////////////////////////////////////////////////

	//4.Enter password for login
	@FindBy(xpath = "//input[@type='password']")
	public WebElement mypasswd;

	public void enterpassword(String mypwd) {
		waitforelementExplicitwait(mypasswd, 10);
		typeText(emailid, mypwd);
	}

	//////////////////////////////////////////////////////////

	//5. Enter login for My account
	@FindBy(xpath = "//div[@class='css-1dbjc4n r-z2wwpe r-1loqt21 r-1x0uki6 r-ah5dr5 r-1otgn73']")
	public WebElement loginbutton2;

	public void clickLoginMyacc() {
		waitforelementExplicitwait(loginbutton2, 10);
		clickElement(loginbutton2);
	}

	//////////////////////////////////////////////////////////

}
