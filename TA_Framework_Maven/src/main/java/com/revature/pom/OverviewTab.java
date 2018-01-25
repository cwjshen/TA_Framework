package com.revature.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OverviewTab {
	static WebElement e = null;
	public static boolean findCSVButton(WebDriver d) {
		if (d.findElement(By.xpath("html/body/div/div[2]/div/div/md-card/md-toolbar/div[1]/button")) != null) {
			return true;
		}
		return false;
	}
	
	public static boolean findFilterButton(WebDriver d) {
		if (d.findElement(By.xpath("/html/body/div/div[2]/div/div/md-card/md-toolbar/md-menu/button")) != null) {
			return true;
		}
		return false;
	}
	

}
