package com.sli_system;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

/**
 * Unit test for execution success.
 */
public class CodeExecutionTest extends webDriverset {
	webDriverset webdriverset = new webDriverset();
	@Test
	public void searchRedValidateValentines() throws InterruptedException {
		
		webdriverset.settingChromeDriver();
		
		webdriverset.driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		
		webdriverset.driver.findElement(By.xpath(".//*[@id='sli_search_box']/form/input[1]")).sendKeys("red");
		webdriverset.driver.findElement(By.xpath(".//*[@id='sli_search_box']/form/input[2]")).click();
		webdriverset.driver.getPageSource().contains("Valentines");
		String bodyText = webdriverset.driver.findElement(By.xpath(".//*[@id='sli_search_suggestions_header']/div/a[2]")).getText();
		System.out.println(bodyText);
		Assert.assertTrue("Text not found!", bodyText.contains("Valentines"));
	}
	@After
	public void Closingdriver () throws InterruptedException{
	webdriverset.driver.quit();
	}
	
}
