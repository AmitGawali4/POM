package TestCases;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TEst {
	
	WebDriver driver;
	
	@Test
	public void add()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\C10232C\\SeleniumWorkSapace\\NYApps\\driver\\chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.get("http://commonlib-test.qbeai.com/_layouts/cfl/searchpage.aspx");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//span[@class='ms-cui-tt-span'])[3]")).click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//span[@class=' ms-cui-img-32by32 ms-cui-img-cont-float'])[1]")).click();
		
		driver.findElement(By.xpath("//textarea[@title='Project Description']")).sendKeys("MANGO");
		
		WebElement Program= driver.findElement(By.xpath("//select[@title='Program Name possible values']"));
		Select aa =new Select(Program); 
		aa.selectByValue("AFC");
	}

}
