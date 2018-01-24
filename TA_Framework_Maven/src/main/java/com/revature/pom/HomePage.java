//package com.revature.pom;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//
//public class HomePage {
//	static WebElement e = null;
//
//	public static WebElement navigateToReportsPage(WebDriver d) {
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		e = d.findElement(By.xpath("/html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[7]"));
//		return e;
//	}
//}