package com.revature.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OverviewTab {
	static WebElement e = null;
	public static WebElement findCSVButton(WebDriver d) {
		return d.findElement(By.xpath("html/body/div/div[2]/div/div/md-card/md-toolbar/div[1]/button"));
	}
	
	public static WebElement findFilterButton(WebDriver d) {
		return d.findElement(By.xpath("/html/body/div/div[2]/div/div/md-card/md-toolbar/md-menu/button"));
	}

}
