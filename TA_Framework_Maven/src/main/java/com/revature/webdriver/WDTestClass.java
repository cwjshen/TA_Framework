package com.revature.webdriver;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.revature.pom.NavBar;
import com.revature.pom.Login;
import com.revature.pom.Logout;

public class WDTestClass {
	static WebDriver wd = null;
	public static void main(String[] args) {
		openApplication();
		testMethod();
	}

	private static void openApplication() {
		File f1 = new File("src/main/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", f1.getAbsolutePath());
		wd = new ChromeDriver();
		wd.get("https://dev.assignforce.revaturelabs.com");
	}

	private static void testMethod() {
		Login.user(wd).sendKeys("test.trainer@revature.com.int1");
		Login.password(wd).sendKeys("p@$$w0rd2");
		Login.signin(wd).submit();
		
		NavBar.navigateToReportsPage(wd).click();
		Logout.logout(wd).click();
		
		wd.close();
	}
}
