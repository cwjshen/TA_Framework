package com.revature.util;

import org.openqa.selenium.WebDriver;

import com.revature.pom.Login;

public class LoginUtil {
	private static String trainerEmail = "test.trainer@revature.com.int1";
	private static String trainerPassword = "trainer123";
	
	private static String vpEmail = "test.vpoftech@revature.com.int1";
	private static String vpPassword = "yuvi1712";
	
	public static void loginAsTrainer(WebDriver wd) {
		try {
			Login.user(wd).sendKeys(trainerEmail);
			Thread.sleep(1000);
			Login.password(wd).sendKeys(trainerPassword);
			Thread.sleep(1000);
			Login.signin(wd).submit();	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void loginAsVP(WebDriver wd) {
		try {
			Login.user(wd).sendKeys(vpEmail);
			Thread.sleep(1000);
			Login.password(wd).sendKeys(vpPassword);
			Thread.sleep(1000);
			Login.signin(wd).submit();	
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}
