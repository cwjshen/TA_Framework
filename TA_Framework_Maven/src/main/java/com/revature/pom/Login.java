package com.revature.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

// ONE CLASS PER HOMEPAGE
public class Login {
	static WebElement e = null;
	
	public static WebElement user(WebDriver d) {
		e = d.findElement(By.name("username"));
		return e;
	}
	
	public static WebElement password(WebDriver d) {
		e = d.findElement(By.name("pw"));
		return e;
	}
	public static WebElement signin(WebDriver d) {
		e = d.findElement(By.name("Login"));
		return e;
	}
}