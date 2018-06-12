package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class CreateLead extends LeafTapsWrappers{
	
	public CreateLead(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test =test;
		
		if(!verifyTitle("Create Lead | opentaps CRM")){
			reportStep("This is not Create Lead Page", "FAIL");
		}		
	}
	
	/*public MyHome enterUserName(String data){
		enterById("username", data);
		return this;
	}
	
	public MyHome enterPassword(String data){
		enterById("password", data);
		return this;
	}*/
	
	public ViewLead clickCreateLead(){
		clickByClassName("smallSubmit");	
		/*HomePage hp = new HomePage();
		return hp;*/		
		return new ViewLead(driver, test);		
	}
	
	
	public CreateLead enterComName(String data){
		enterById("createLeadForm_companyName", data);
		return this;
	}
	
	public CreateLead enterFirstName(String data){
		enterById("createLeadForm_firstName", data);
		return this;
	}
	
	public CreateLead enterLastName(String data){
		enterById("createLeadForm_lastName", data);
		return this;
	}
	
	/*public MyLeads clickLeadsforFailure(){
		clickByLink("Leads");
		/*HomePage hp = new HomePage();
		return hp;		
		return this;		
	}
	
	public MyHome verifyLoginDetails(String text){
		verifyTextContainsById("errorDiv", text);
		return this;
	}*/

}











