package com.revature.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TrainersTab {

	public static WebElement findCalendarButton(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-toolbar[1]/div/button[2]/md-icon"));
	}

	public static WebElement downloadResumeButton(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-content[1]/md-list/md-list-item[1]/div[1]/div[1]/button[1]"));
	
	}
	
	public static WebElement clickTrainer(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-content[1]/md-list/md-list-item[1]/div[1]/button"));
	}
	
	public static WebElement isCalendarOpen(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"dpPopup1\"]/div"));
	}
	
	public static WebElement addPtoRequestButton(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"dialogContent_1\"]/md-dialog-actions/button[1]"));
		
	}
	
	public static WebElement isPtoRequestWindowOpen(WebDriver driver) {
		return driver.findElement(By.xpath("/html/body/div[3]/md-dialog/form"));
	}
	
	public static WebElement cancelButton(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"dialogContent_1\"]/md-dialog-actions/button[2]"));
	}
}
