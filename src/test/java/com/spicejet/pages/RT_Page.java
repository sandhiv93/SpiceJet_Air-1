package com.spicejet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.spicejet.utils.SeWrappers;

public class RT_Page extends SeWrappers{

	//1. In Main page click RoundTrip option 
	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-zso239'])[2]")
	public WebElement roundtripradio;

	public void clickRoundTripbutton() {
		setImplicitWait(15);
		clickElement(roundtripradio);
	}

	//////////////////////////////////////////////////////////

	//2. In Main page click FROM place
	@FindBy(xpath = "//body/div[@id='react-root']/div[@id='main-container']/div[1]/div[1]/div[3]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/input[1]")
	public WebElement from;

	public void enterFromPlace(String place1) {
		waitforelementExplicitwait(from, 15);
		clickElement(from);
		typeText(from, place1);
	}

	//////////////////////////////////////////////////////////	

	//3. In Main page click TO place
	@FindBy(xpath = "//div[@data-testid='to-testID-destination']//input[@type='text']")
	public WebElement to;

	public void enterToPlace(String place2) {
		waitforelementExplicitwait(to, 20);
		clickElement(to);
		typeText(to, place2);
	}

	//////////////////////////////////////////////////////////

	//4. In Main page pick depature date
	@FindBy(xpath = "//div[normalize-space()='Departure Date']")
	public WebElement departureDate;
	public void selectDepaDate() throws InterruptedException {
		clickElement(departureDate);
		Thread.sleep(5000);
	}

	@FindBy(xpath = "(//div[@dir='auto'][normalize-space()='1'])[2]")
	//Jan1
	public WebElement reqdate;
	public void selectReqDate() throws InterruptedException {
		Thread.sleep(5000);
		waitforelementExplicitwait(reqdate, 10);
		clickElement(reqdate);
	}
	
	
	// In main page pick Return date
	@FindBy(xpath = "//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[4]/div/div[1]/div[2]/div[1]")
	public WebElement returnDate;
	public void selectReturnDate() {
		waitforelementExplicitwait(returnDate, 10);
		clickElement(returnDate);
	}

	@FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div[3]/div[2]/div[4]/div/div[2]/div[2]/div[3]/div[2]/div/div[3]/div/div[3]/div[2]/div[6]/div/div")
	//Feb10
	public WebElement retreqdate;
	public void selectReturnreqDate() {
		waitforelementExplicitwait(retreqdate, 10);
		clickElement(retreqdate);
	}

	//////////////////////////////////////////////////////////	

	//5. In Main page clicksearchFlight
	@FindBy(xpath = "//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[7]/div[2]/div")
	public WebElement searchFlights;

	public void clicksearchFlight() throws InterruptedException {
		//waitforelementExplicitwait(searchFlights, 05);
		clickElement(searchFlights);
		Thread.sleep(5000);
	}

	//////////////////////////////////////////////////////////

	//6. Next page click continue button
	@FindBy(xpath = "//*[@id=\"main-container\"]/div/div[1]/div[5]/div/div/div[3]/div[2]")
	public WebElement nxtpgcontinueButton;

	public void clickcontinueButton() throws InterruptedException {
		waitforelementExplicitwait(nxtpgcontinueButton, 10);
		clickElement(nxtpgcontinueButton);
		Thread.sleep(5000);
	}

	//////////////////////////////////////////////////////////

	//7. Next page Enter personal details
	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[1]")
	public WebElement title;
	public void clicktitle(int value) {
		waitforelementExplicitwait(title, 10);
		setImplicitWait(15);
		selectByindexDropDown(title, value);
	}
	@FindBy(xpath = "//*[@id=\"primary-contact-details\"]/div[3]/div[2]/div/div/div[2]/input")
	public WebElement Fname;
	public void enterFname(String fname) throws InterruptedException {
		clickElement(Fname);
		waitforelementExplicitwait(Fname, 15);
		Fname.clear();
		waitforelementExplicitwait(Fname, 40);
		typeText(Fname, fname);
	}
	@FindBy(xpath = "//*[@id=\"primary-contact-details\"]/div[3]/div[3]/div/div/div[2]/input")
	public WebElement Lname;
	public void enterLname(String lname) throws InterruptedException {
		clickElement(Lname);
		waitforelementExplicitwait(Lname, 15);
		Lname.clear();
		waitforelementExplicitwait(Lname, 40);
		typeText(Lname, lname);
	}
	@FindBy(xpath = "//*[@data-testid='contact-number-input-box']")
	public WebElement contactbox;
	public void entercontactNumber(String number) throws InterruptedException {
		clickElement(contactbox);
		waitforelementExplicitwait(contactbox, 15);
		contactbox.clear();
		waitforelementExplicitwait(contactbox, 40);
		typeText(contactbox, number);
	}
	@FindBy(xpath = "//*[@id=\"primary-contact-details\"]/div[4]/div[1]/div/div/div[2]/input")
	public WebElement mailid;
	public void enteremailid(String email) throws InterruptedException {
		clickElement(mailid);
		waitforelementExplicitwait(mailid, 15);
		mailid.clear();
		waitforelementExplicitwait(mailid, 40);
		typeText(mailid , email);
	}
	@FindBy(xpath = "//*[@id=\"primary-contact-details\"]/div[4]/div[3]/div/div/div[2]/input")
	public WebElement townname;
	public void entertownName(String city) throws InterruptedException {
		clickElement(townname);
		setImplicitWait(15);
		townname.clear();
		Thread.sleep(3000);
		typeText(townname, city);
	}
	@FindBy(xpath = "//div[@class='css-1dbjc4n']//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1otgn73']//div[@class='css-1dbjc4n r-zso239']")
	public WebElement checkBox;
	public void clickcheckBox() {
		clickElement(checkBox);
	}

	//////////////////////////////////////////////////////////

	//8.Click continue button in Main page
	@FindBy(xpath = "//*[@id=\"travellers-view\"]/div[2]/div/div/div[2]")
	public WebElement mainContinuebutton;

	public void clickContinue() throws InterruptedException {
		setImplicitWait(15);
		clickElement(mainContinuebutton);
		Thread.sleep(3000);
	}

	//////////////////////////////////////////////////////////

	//9.Click again continue button in next Main page
	@FindBy(xpath = "/html/body/div[3]/div/div/div[5]/div/div/div[2]/div/div/div[4]")
	public WebElement main2Continuebutton;

	public void clickContinue2() throws InterruptedException {
		clickElement(main2Continuebutton);
	}

	//////////////////////////////////////////////////////////

	//10.Skip the seat selecting from popupwindow
	@FindBy(xpath = "//span[text()='Skip this to skip comfort.']")
	public WebElement skipskip;

	public void clickSkipSkip()throws InterruptedException  {
		Thread.sleep(5000);
		waitforelementExplicitwait(skipskip, 20);
		clickElement(skipskip);
	}
}
