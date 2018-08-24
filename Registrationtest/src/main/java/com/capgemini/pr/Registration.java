package com.capgemini.pr;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;



public class Registration {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("D:\\JavaWorkspaceSTS\\Registrationtest\\RegistrationPage.html");
		 ProjectDetails page = PageFactory.initElements(driver, ProjectDetails.class);	
		 page.fname.sendKeys("Krishna");
		 Thread.sleep(2000);
		 page.lname.sendKeys("Vamshi");
		 Thread.sleep(2000);
		 page.email.sendKeys("kistavamsi@gmail.com");
		 Thread.sleep(2000);
		 page.contact.sendKeys("9652119");
		 Thread.sleep(2000);
		 page.address.sendKeys("Main Hospital Area");
		 Thread.sleep(2000);
		 page.city.sendKeys("Kothagudem");
		 Thread.sleep(2000);
		 page.state(driver);
		 Thread.sleep(2000);
		 ProjectDetails.button(driver).click();
		 	
		 driver.navigate().to("D:\\JavaWorkspaceSTS\\Registrationtest\\ProjectDetails.html");
		 page.projectname.sendKeys("Dhruva Project");
		 Thread.sleep(2000);
		 page.Clientname.sendKeys("Indian Cement");
		 Thread.sleep(2000);
		 page.Teamsize.sendKeys("6");
		 Thread.sleep(2000);
		 page.submit(driver).click();
		
		 
	}
}
