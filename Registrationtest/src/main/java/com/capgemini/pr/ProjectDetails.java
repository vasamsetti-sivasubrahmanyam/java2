package com.capgemini.pr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class ProjectDetails {

	private static WebElement element = null;
	@FindBy(how=How.ID,using="fname")
	WebElement fname;
	@FindBy(how=How.ID,using="lname")
	WebElement lname;
	@FindBy(how=How.ID,using="email")
	WebElement email;
	@FindBy(how=How.ID,using="contact")
	WebElement contact;
	@FindBy(how=How.ID,using="address")
	WebElement address;
	@FindBy(how=How.ID,using="city")
	WebElement city;
	@FindBy(how=How.ID,using="state")
	WebElement state;
	public WebElement state(WebDriver driver){
		 
	       element = driver.findElement(By.id("select"));
	       Select select=new Select(element);
	       select.selectByVisibleText("Telangana");
	       return element;
	 }
	@FindBy(how=How.ID,using="submit")
	WebElement submit;
	 public static WebElement button(WebDriver driver){
		 
        element = driver.findElement(By.id("submit"));

        return element;
	 }
	 
	 @FindBy(how=How.ID,using="pname")
		WebElement projectname;
	 @FindBy(how=How.ID,using="cname")
		WebElement Clientname;
	 @FindBy(how=How.ID,using="tsize")
		WebElement Teamsize;
	 @FindBy(how=How.ID,using="sub")
	 	WebElement sub;
	 public WebElement submit(WebDriver driver) {
		 element=driver.findElement(By.id("sub"));
		 return element;
		 
	 }
}
