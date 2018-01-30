package com.revature.util;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverUtil {

	private static WebDriver chromeDriver = null;
	private static WebDriver firefoxDriver = null;
	
	private DriverUtil() {
		
	}
	
	public static WebDriver getChromeDriver() {
		if (chromeDriver == null) {
			File f1 = new File("src/main/resources/chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", f1.getAbsolutePath());
			return new ChromeDriver();
		}
		else 
			return chromeDriver;
	}
	
	public static WebDriver getFirefoxDriver() {
		if (firefoxDriver == null) {
			File f1 = new File("src/main/resources/geckodriver.exe");
			System.setProperty("webdriver.geckodriver.driver", f1.getAbsolutePath());
			return new FirefoxDriver();
		}
		else
			return firefoxDriver;
	}
	
}
