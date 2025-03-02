package com.qa.base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.util.ReadProperties;

/**
 * @author praji
 *
 */
public class Base {

	public static WebDriver driver;
	/**
	 * @return
	 * method to launch app 
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	public WebDriver initializeWebDriver() throws InterruptedException  {

		 

		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

		// Start the Browser

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(ReadProperties.implicitWaitTime(), TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get(ReadProperties.getappURL());
		Thread.sleep(3000);
		return driver;


	}
	
	public void closeBrowser() {

		driver.quit();

	}
}
