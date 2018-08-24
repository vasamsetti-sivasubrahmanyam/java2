package com.cg.TestingAssignment1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AppStory
{
	public static WebDriver driver;
	 PageObjectLoginPage page;
	
	@Given("^Enter the firstname \"([^\"]*)\" and lastname \"([^\"]*)\" Email \"([^\"]*)\" contact \"([^\"]*)\" Address \"([^\"]*)\" City \"([^\"]*)\" state \"([^\"]*)\"$")
	public void enter_the_firstname_and_lastname_Email_contact_Address_City_state(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\JavaWorkspaceSTS\\RegistrationPage\\seleniumchromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("D:\\TestingAssignment1-master\\TestingAssignment_1\\src\\test\\java\\com\\cg\\TestingAssignment1\\LoginPage.html");
		page=PageFactory.initElements(driver,PageObjectLoginPage.class);
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   page.fname.sendKeys(arg1);
	   page.lname.sendKeys(arg2);
	   page.mail.sendKeys(arg3);
	   page.phone.sendKeys(arg4);
	   page.address.sendKeys(arg5);
	   page.city.sendKeys(arg6);
	  Select stateDrop=new Select(page.state);
	   stateDrop.selectByVisibleText(arg7);
	   page.submit.click();
	}

	@When("^clicked on SubmitDetails$")
	public void clicked_on_SubmitDetails() throws Throwable {
	    
	   
	}

	@Then("^forward to next page$")
	public void forward_to_next_page() throws Throwable {
	   
	}
	

	@When("^Enter Projectname \"([^\"]*)\" Clientname \"([^\"]*)\" TeamSize \"([^\"]*)\"$")
	public void enter_Projectname_Clientname_TeamSize(String arg1, String arg2, String arg3) throws Throwable {
	    
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 page.projectName.sendKeys(arg1);
		 page.clientName.sendKeys(arg2);
		 page.teamSize.sendKeys(arg3);
		 page.submit1.click();
		
	}

	@Then("^display alert box with message SuccessfullyRegistered$")
	public void display_alert_box_with_message_SuccessfullyRegistered() throws Throwable {
	    
	}
	
	@Then("^display invalid email$")
	public void display_invalid_email() throws Throwable {
	    
	}
	@Then("^display invalid teamsize$")
	public void display_invalid_teamsize() throws Throwable {
	    
	}
	
	
	
}
