package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class CFL {
	
	WebDriver driver;  
  @Test
  public void f() 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\C10232C\\SeleniumWorkSapace\\NYApps\\driver\\chromedriver.exe");
	  driver= new ChromeDriver();
	  //driver = new FirefoxDriver();
	  
	  driver.get("http://commonlib-test.qbeai.com/_layouts/cfl/searchpage.aspx");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
	  WebElement LOB = driver.findElement(By.id("ddlInsur"));
	  
	  Select ddl = new Select(LOB);
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  ddl.selectByVisibleText("Accident and Health");
	  
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
	  WebElement Included= driver.findElement(By.xpath("//select[@id='ddlProgramBusiness']"));
	  
	  Select kk = new Select(Included);
	  kk.selectByVisibleText("Included");
	  
	  
	  WebElement PN = driver.findElement(By.id("lstProgName"));	  
	  Select Ls= new Select(PN);
	  Ls.selectByVisibleText("Mobility Equipment");
	  
	  WebElement Clk = driver.findElement(By.id("btnAddProg"));
	  Clk.click();
	  
	 WebElement MLOB= driver.findElement(By.id("lstLOB"));
     Select LL= new Select(MLOB);
     LL.selectByVisibleText("Accident and Health");
     
     WebElement Clk1=driver.findElement(By.id("btnAddlob"));
     Clk1.click();
     
     WebElement Comp = driver.findElement(By.xpath("//select[@id='lstCompanies']"));
     Select MM= new Select(Comp);
     MM.selectByVisibleText("General Casualty Insurance Company");
     
     WebElement Clk4=driver.findElement(By.xpath("//input[@id='btnCmpAdd']"));
     Clk4.click();
     
     WebElement State=driver.findElement(By.xpath("//select[@id='lstStates']"));
     Select NN= new Select(State);
     NN.selectByVisibleText("AR");
     
     WebElement Clk3=driver.findElement(By.xpath("//input[@id='btnAddState']"));
     Clk3.click();
     
   
     WebElement Clk2=driver.findElement(By.xpath("//input[@id='btnCmpAdd']"));
     Clk2.click();
     
     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     WebElement Src = driver.findElement(By.xpath("(//span[@class='ms-cui-ctl-largelabel'])[1]"));
     //WebElement Src = driver.findElement(By.linkText("Search"));
     //WebElement Src = driver.findElement(By.xpath("(//span[@class='ms-cui-ctl-largelabel'])[1]"));
     Src.click();
    
    
  }
}
