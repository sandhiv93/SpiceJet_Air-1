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
	@FindBy(xpath = "(//*[name()='circle'])[13]")
	public WebElement radioemailid;

	public void clickEmailRadioButton() {
		waitforelementExplicitwait(radioemailid, 10);
		windowhandleParentWindow();
		clickElement(radioemailid);
	}

	//////////////////////////////////////////////////////////	

	//3. Enter emailid for login
	@FindBy(xpath = "(//input[@type='email'])[1]")
	public WebElement emailid;

	public void enteremailid(String myemail) {
		waitforelementExplicitwait(emailid, 10);
		clickElement(emailid);
		typeText(emailid, myemail);
	}

	//////////////////////////////////////////////////////////

	//4.Enter password for login
	@FindBy(xpath = "//input[@data-testid='password-input-box-cta']")
	public WebElement mypasswd;

	public void enterpassword(String mypwd) {
		waitforelementExplicitwait(mypasswd, 20);
		clickElement(mypasswd);
		typeText(emailid, mypwd);
	}

	//////////////////////////////////////////////////////////

	//5. Enter login for My account
	@FindBy(xpath = "//div[@data-testid='login-cta']")
	public WebElement loginbutton2;

	public void clickLoginMyacc() {
		waitforelementExplicitwait(loginbutton2, 20);
		clickElement(loginbutton2);
	}

	//////////////////////////////////////////////////////////

}
