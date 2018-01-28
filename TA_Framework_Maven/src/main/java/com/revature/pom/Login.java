package com.revature.pom;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {

	static WebDriver wd = null;
	
	public static void main(String[] args) {
//		openApp();
		//login();
		//login2();
		//loginWrongUser();
		//loginWrongPassword();
		//forgotPasswordButton();
	}
	
//	static void openApp() {
//		File f1 = new File("src/main/resources/chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver", f1.getAbsolutePath());
//		wd = new ChromeDriver();
//		wd.get("https://dev.assignforce.revaturelabs.com");
//	}
	
//	public static void login() {
//		wd.findElement(By.id("username")).sendKeys("test.trainer@revature.com.int1");
//		wd.findElement(By.name("pw")).sendKeys("p@$$w0rd2");
//		wd.findElement(By.id("Login")).submit();
//	}
//	
//	public static void login2() {
//		wd.findElement(By.id("username")).sendKeys("test");
//		wd.findElement(By.name("pw")).sendKeys("testpw");
//		wd.findElement(By.id("Login")).submit();
//	}
//	
//	public static void loginWrongUser() {
//		wd.findElement(By.id("username")).sendKeys("wronguser");
//		wd.findElement(By.name("pw")).sendKeys("p@$$w0rd2");
//		wd.findElement(By.id("Login")).submit();
//	}
//	
//	public static void loginWrongPassword() {
//		wd.findElement(By.id("username")).sendKeys("test.trainer@revature.com.int1");
//		wd.findElement(By.name("pw")).sendKeys("wrongPass");
//		wd.findElement(By.id("Login")).submit();
//	}
//	
//	public static void forgotPasswordButton() {
//		wd.findElement(By.id("forgot_password_link")).click();
//	}
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

 