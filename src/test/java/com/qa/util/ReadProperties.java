package com.qa.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @author praji shift+alt+J this class contains method to Read properties from
 *         property file
 */
/**
 * @author praji
 *
 */
public class ReadProperties {

	public static Properties loadProperties() {

		// Open the File

		File objfile = new File("AppConfig/config.properties");

		// Read the File

		FileInputStream objfis = null;

		try {

			objfis = new FileInputStream(objfile);

		} catch (FileNotFoundException e1) {

			e1.printStackTrace();

		}

		Properties objprop = new Properties();

		try {

			objprop.load(objfis);

		} catch (IOException e) {

			e.printStackTrace();

		}

		return objprop;

	}

	/**
	 * @return
	 * @throws IOException
	 * method to read appurl from config
	 */
	public static String getappURL() {

		return loadProperties().getProperty("appURL");

	}

	/**
	 * @return
	 * method to read username from config
	 */
	public static String getappUserName() {

		return loadProperties().getProperty("userName");

	}

	/**
	 * @return
	 * method to read password from config
	 */
	public static String getAppPassword() {

		return loadProperties().getProperty("password");

	}

	/**
	 * @return
	 * method to read implicitWaitTime from config
	 */
	public static long implicitWaitTime() {

		return Long.parseLong(loadProperties().getProperty("implicitWaitTime"));
	}

	public static long getFluentWaitTime() {

		return Long.parseLong(loadProperties().getProperty("fluentWaitTime"));
	}
	
}
