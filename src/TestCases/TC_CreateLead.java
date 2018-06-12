package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import pages.*;
import wrappers.LeafTapsWrappers;

public class TC_CreateLead extends LeafTapsWrappers{

	
	@BeforeClass
	public void setValue(){
		testCaseName = "Create Lead";
		testDescription ="Create a Lead";
		category = "smoke";
		authors = "Shimul";
		browserName = "chrome";
		dataSheetName = "EnterCreateLead";
		
	}
	
	@Test(dataProvider = "fetchData")
	public void createLead(String userName, String pwd, String comName, String fName, String lName){
		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(pwd)
		.clickLogin()
		.clickCRMSFA()
		.clickLeads ()
		.clickCreateLeads ()
		.enterComName(comName)
		.enterFirstName(fName)
		.enterLastName(lName)
		.clickCreateLead()
		.verifyName (fName);
}
}

