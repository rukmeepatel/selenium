package com.sli_system;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newtestcase {
	public static WebDriver driver;

	@BeforeClass
	public static void settingWebdriver() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/sanjay/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
	}

	@Test
	public void test() throws InterruptedException {

		driver.get("https://www.sli-systems.com");
		driver.findElement(By.xpath(".//*[@id='sli_search_box']/form/input[1]")).sendKeys("red");
		driver.findElement(By.xpath(".//*[@id='sli_search_box']/form/input[2]")).click();

		// driver.getPageSource().contains("Valentines");
		String str = driver.findElement(By.xpath(".//*[@id='content']/main")).getText();
		Assert.assertTrue(str.contains("Valentines"));
	}

	@AfterClass
	public static void closingWebdriver() throws InterruptedException {
		driver.quit();
	}
}
