package com.spicejet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.spicejet.utils.SeWrappers;

public class PayPage extends SeWrappers{

	//Dummy payment Data's

	//1. Click card and enter number
	@FindBy(xpath="//iframe[@class='card_number_iframe']")
	public WebElement FrameCard;
	public void clickintocardNumframe() {
		waitforelementExplicitwait(FrameCard, 10);
		frameByWebElement(FrameCard);
	}

	@FindBy(xpath="//input[@id='card_number']")
	public WebElement cardno;
	public void entercardnumber(String cardnum) {
		waitforelementExplicitwait(cardno, 10);
		typeText(cardno, cardnum);
	}
	/////////////////////////////////////////////////

	//2. Enter card name
	@FindBy(xpath="//*[@class='name_on_card_iframe']")
	public WebElement frameName;
	public void clickintocardNameframe() {
		waitforelementExplicitwait(frameName, 10);
		frameByWebElement(frameName);
	}
	@FindBy(xpath="//*[@placeholder='Cardholder Name']")
	public WebElement cardname;
	public void entercardName(String myname) {
		waitforelementExplicitwait(cardname, 10);
		typeText(cardname, myname); 
	}
	/////////////////////////////////////////////////

	//3. Enter card Month name
	@FindBy(xpath="//*[@class='card_exp_month_iframe']")
	public WebElement frameMonth;
	public void clickintocardMonthframe() {
		waitforelementExplicitwait(frameMonth, 10);
		frameByWebElement(frameMonth);
	}
	@FindBy(xpath="//*[@placeholder='MM']")
	public WebElement expmonth;
	public void entercardMonth(String month) {
		waitforelementExplicitwait(expmonth, 10);
		typeText(expmonth, month);
	}

	/////////////////////////////////////////////////
	
	//4. Enter card Year
	@FindBy(xpath="//*[@class='card_exp_year_iframe']")
	public WebElement frameYear;

	public void clickintoYearframe() {
		waitforelementExplicitwait(frameYear, 10);
		frameByWebElement(frameYear);
	}
	@FindBy(xpath="//*[@placeholder='YY']")
	public WebElement expYear;
	public void entercardYear(String year) {
		waitforelementExplicitwait(frameYear, 10);
		typeText(expYear, year);
	}

	/////////////////////////////////////////////////

	//5. Enter card CVV
	@FindBy(xpath="//*[@class='security_code_iframe']")
	public WebElement frameCVV;

	public void clickintoCVVframe() {
		waitforelementExplicitwait(frameCVV, 10);
		frameByWebElement(frameCVV);
	}
	@FindBy(xpath="//*[@placeholder='123']")
	public WebElement cvvNum;

	public void enterCVVNum(String cvvnum) {
		waitforelementExplicitwait(cvvNum, 10);
		typeText(cvvNum, cvvnum);
	}

	/////////////////////////////////////////////////

	
	//6. Click paybutton
	@FindBy(xpath="//*[@class='css-1dbjc4n r-2ka9w3 r-zr9zts']//*[contains(text(),'Proceed to pay')]")
	public WebElement clickPayBtn;

	public void clickPaybutton() {
		waitforelementExplicitwait(clickPayBtn, 10);
		clickElement(clickPayBtn);
	}
}
