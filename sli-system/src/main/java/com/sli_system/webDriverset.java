package com.sli_system;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * create the java class for setting the web driver object
 *
 */
public class webDriverset 
{
	public WebDriver driver;
	public String URL="https://www.sli-systems.com/";
	public String WebDriverkey = "webdriver.chrome.driver";
	public String WebDriverpath = "/Users/sanjay/Downloads/chromedriver";
	
	public void settingChromeDriver() {
		System.setProperty(WebDriverkey,WebDriverpath);
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get(URL);
	}	

}
