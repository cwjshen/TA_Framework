package com.revature.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReportsTab {

	public static WebElement addNewCardButton(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-card[1]/get-batch-gen-table-toolbar/md-toolbar/button[1]/md-icon"));
	}

	public static WebElement toggleBatchContentButton(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"batchArrow\"]"));
	}
	
	public static WebElement graduateExportToCSVButton(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-card[2]/get-grad-table-toolbar/md-toolbar/button[1]/md-icon"));
	}
	
	public static WebElement graduateSettingsButton(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-card[2]/get-grad-table-toolbar/md-toolbar/md-menu/button/md-icon"));
	}
	
	public static WebElement toggleGraduateContentButton(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"gradArrow\"]"));
	}	
	
	public static WebElement incomingExportToCSVButton(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-card[3]/get-train-table-toolbar/md-toolbar/button[1]/md-icon"));
	}
	
	public static WebElement incomingSettingsButton(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-card[3]/get-train-table-toolbar/md-toolbar/md-menu/button/md-icon"));
	}
	
	public static WebElement toggleIncomingContentButton(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"incArrow\"]"));
	}	
	
}
