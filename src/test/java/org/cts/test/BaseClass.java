package org.cts.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	static WebDriver driver;
	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Hai Guys\\eclipse-workspace\\JUnit\\Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		

	}
	
	public static void quit() {
		driver.quit();
		

	}
	
	public static void type(WebElement e , String s) {
		e.sendKeys(s);
		

	}
	
	public static void btnClick(WebElement e) {
		e.click();

	}


}
