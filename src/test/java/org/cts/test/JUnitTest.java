package org.cts.test;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

public class JUnitTest extends BaseClass {
	@BeforeClass
	public static void browserlaunch() {
		launchBrowser();
		System.out.println("browser launched successfully");
		}

	@AfterClass
	public static void closelaunch() {
		quit();
		System.out.println("closed");}

	@Before
	public void startTime() {
		
		Date d = new Date();
		System.out.println("Start time"+d);
	}

	@After
	public void endTime() {
		Date d = new Date();
		System.out.println("end time"+d);}

	@Test
	public void test1() {
		driver.get("https://www.facebook.com/");

		System.out.println("facebook opened");
		
		LoginPOJOClass l= new LoginPOJOClass();
		
		WebElement f1 = driver.findElement(By.id("email"));
		f1.sendKeys("manoj@gmail.com");
		String s = f1.getAttribute("value");
		Assert.assertTrue(s.equals("manoj@gmail.com"));
		Assert.assertEquals("manoj@gmail.com", s);
		System.out.println("true");
		
		driver.findElement(By.id("pass")).sendKeys("7863214");
		WebElement f3 = driver.findElement(By.id("loginbutton"));
		
		boolean d = f3.isDisplayed();
		System.out.println(d);
		boolean e = f3.isEnabled();
		System.out.println(e);
		boolean ss = f3.isSelected();
		System.out.println(ss);
		System.out.println(f1.getCssValue("font-weight"));
		System.out.println(f1.getCssValue("color"));
		System.out.println(f1.getCssValue("font-size"));
		System.out.println(f1.getCssValue("background-color"));
		System.out.println(f1.getCssValue("text-align"));
		
		f3.click();
		
		Assert.assertEquals("https://www.facebook.com/mano.dhoni.73", driver.getCurrentUrl());
		System.out.println("login pass");
	
	}
	@Ignore
	@Test
	public void test2() {
		
		driver.get("https://www.facebook.com/");
		System.out.println("facebook opened");
		
		LoginPOJOClass l= new LoginPOJOClass();
		
		driver.findElement(By.id("email")).sendKeys("raj@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("7863214");
		driver.findElement(By.id("loginbutton")).click();
	
	}
	@Test
	public void test3() {
		
		driver.get("https://www.facebook.com/");
		System.out.println("facebook opened");
		
		LoginPOJOClass l= new LoginPOJOClass();
		
		driver.findElement(By.id("email")).sendKeys("kiruba@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("7863214");
		driver.findElement(By.id("loginbutton")).click();}


}
