package com.qa.util;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenshot {
	
	
	/**
	 * @param driver
	 * @return
	 * method to capture screenshot and return in byte format to cucumber reports
	 */
	public static byte[] captureImage(WebDriver driver) 
	{
		TakesScreenshot srcShot = (TakesScreenshot) driver;
		WaitMethods.staticWait(3000);
		byte[] srcFile = srcShot.getScreenshotAs(OutputType.BYTES);
		return srcFile;
		}

}
