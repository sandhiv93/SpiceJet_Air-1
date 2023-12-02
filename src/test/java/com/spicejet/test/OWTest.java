package com.spicejet.test;

import org.testng.annotations.Test;
import com.spicejet.utils.Reports;
import com.spicejet.utils.SJWrappers;
import com.spicejet.utils.SeWrappers;

public class OWTest extends SeWrappers {

	SeWrappers se=new SeWrappers();
	SJWrappers sj = new SJWrappers();
	Reports repo = new Reports();
	LoginTest_P_DataPVDR loginpass = new LoginTest_P_DataPVDR();
	
	@Test(priority=3)
	public void oneWayTrip(){
		try{
			repo.setTCDesc("OneWayTrip With Passenger Details of SpiceJet functionality");
			launchBrowser();
			sj.oneWaywrapper("che", "mum", 0, "Muruganandh", "Srinivasan", "9566259258", "devanandh2902@gmail.com", "Chennai");
			
		}
		catch(Exception ex){
			ex.printStackTrace();
			System.out.println("Fail to Validate OneWayTrip With Passenger Details");
			Reports.reportStep("FAIL", "Problem while OneWayTrip");
		}
	}
	
	public void closeBrowser(){
		try{
			driver.close();
			repo.reportStep("PASS", "Browser closed successfully");
		}
		catch(Exception ex){
			System.out.println("Problem in closing the browser");
			Reports.reportStep("FAIL", "Problem in closing the browser");
			ex.printStackTrace();
		}
	}
}
