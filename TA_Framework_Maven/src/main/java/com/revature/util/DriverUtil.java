package com.revature.util;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverUtil {

	private static WebDriver chromeDriver = null;
	private static WebDriver firefoxDriver = null;
	
	private static String chromeDriverFilePath = "C:\\selenium\\chromedriver.exe";
	private static String firefoxDriverFilePath = "C:\\selenium\\geckodriver.exe";
	
	private DriverUtil() {
		
	}
	
	public static WebDriver getChromeDriver() {
		if (chromeDriver == null) {
			File f1 = new File(chromeDriverFilePath);
			System.setProperty("webdriver.chrome.driver", f1.getAbsolutePath());
			return new ChromeDriver();
		}
		else 
			return chromeDriver;
	}
	
	public static WebDriver getFirefoxDriver() {
		if (firefoxDriver == null) {
			File f1 = new File(firefoxDriverFilePath);
			System.setProperty("webdriver.geckodriver.driver", f1.getAbsolutePath());
			return new FirefoxDriver();
		}
		else
			return firefoxDriver;
	}
	
}
