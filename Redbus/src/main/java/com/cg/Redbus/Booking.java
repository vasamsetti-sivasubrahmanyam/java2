package com.cg.Redbus;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;




public class Booking {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.redbus.in/");
	HomePage page = PageFactory.initElements(driver,HomePage.class);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Thread.sleep(2000);
	page.source.sendKeys("Pune");
	page.source1.click();
	//page.source1.click();
	page.destination.sendKeys("Hyderabad");
	page.destination1.click();
	page.date.click();
	page.onward_cal.click();
	page.submit.click();
}
}
