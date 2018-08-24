package com.cg.TestingAssignment1;





import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;



public class PageObjectLoginPage 
{

	@FindBy(id="firstname")
	WebElement fname;
	
	@FindBy(id="lastname")
	WebElement lname;
	
	@FindBy(id="mail")
	WebElement mail;
	
	@FindBy(id="phone")
	WebElement phone;
	
	@FindBy(id="address")
	WebElement address;
	
	@FindBy(id="city")
	WebElement city;
	
	@FindBy(id="state")
	WebElement state;
	
	@FindBy(id="submit")
	WebElement submit;
	
	@FindBy(id="projectname")
	WebElement projectName;
	
	@FindBy(id="clientname")
	WebElement clientName;
	
	@FindBy(id="teamsize")
	WebElement teamSize;
	
	@FindBy(id="submit1")
	WebElement submit1;
	
	
	
}


/*
System.setProperty("webdriver.chrome.driver", "D:\\Users\\tnikhilp\\Desktop\\selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("D:\\Users\\tnikhilp\\Desktop\\TestLoginPages\\Testing1\\LoginPage.html");
	   PageObjectLoginPage page=PageFactory.initElements(driver,PageObjectLoginPage.class);
	   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	   page.fname.sendKeys(arg1);
	   page.lname.sendKeys(arg2);
	   page.mail.sendKeys(arg3);
	   page.phone.sendKeys(arg4);
	   page.address.sendKeys(arg5);
	   page.city.sendKeys(arg6);
	  Select stateDrop=new Select(page.state);
	   stateDrop.selectByVisibleText(arg7);
	   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	   page.submit.click();
		







*/