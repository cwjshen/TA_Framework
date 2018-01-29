package com.revature.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.revature.util.JSClicker;

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
	
	public static void addPtoRequestButton(WebDriver driver) {
		JSClicker.executeJSClick(driver, driver.findElement(By.xpath("/html/body/div[3]/md-dialog/md-dialog-actions/button[1]")));
	}
	
	public static WebElement isPtoRequestWindowOpen(WebDriver driver) {
		return driver.findElement(By.xpath("/html/body/div[3]/md-dialog/form"));
	}
	
	public static void cancelButton(WebDriver driver) {
		JSClicker.executeJSClick(driver, driver.findElement(By.xpath("/html/body/div[3]/md-dialog/md-dialog-actions/button[2]")));
	}
	
	public static void requestStartDate(WebDriver driver) {
		JSClicker.executeJSClick(driver, driver.findElement(By.xpath("/html/body/div[3]/md-dialog/form/md-dialog-content/div/md-input-container[1]/md-datepicker/div[1]/button")));
	}
	
	public static void cancelRequestButton(WebDriver driver) {
		JSClicker.executeJSClick(driver, driver.findElement(By.xpath("/html/body/div[3]/md-dialog/form/md-dialog-actions/button[2]")));
	}
	
	public static void pickStartYear(WebDriver driver) {
		JSClicker.executeJSClick(driver, driver.findElement(By.xpath("/html/body/div[4]/div[2]/md-calendar/div/md-calendar-year/div/md-virtual-repeat-container/div/div[2]/table/tbody[4]/tr[1]/td[4]/span")));
	}
	
	public static void pickStartDate(WebDriver driver) {
		JSClicker.executeJSClick(driver, driver.findElement(By.xpath("/html/body/div[4]/div[2]/md-calendar/div/md-calendar-month/div/md-virtual-repeat-container/div/div[2]/table/tbody[4]/tr[3]/td[3]/span")));
	}
	
	public static void requestEndDate(WebDriver driver) {
		JSClicker.executeJSClick(driver, driver.findElement(By.xpath("/html/body/div[3]/md-dialog/form/md-dialog-content/div/md-input-container[2]/md-datepicker/div/button")));
	}
	
	public static void pickEndYear(WebDriver driver) {
		JSClicker.executeJSClick(driver, driver.findElement(By.xpath("/html/body/div[4]/div[2]/md-calendar/div/md-calendar-year/div/md-virtual-repeat-container/div/div[2]/table/tbody[4]/tr[1]/td[4]/span")));
	}
	
	public static void pickEndDate(WebDriver driver) {
		JSClicker.executeJSClick(driver, driver.findElement(By.xpath("/html/body/div[4]/div[2]/md-calendar/div/md-calendar-month/div/md-virtual-repeat-container/div/div[2]/table/tbody[4]/tr[4]/td[6]/span")));
	}
	
	public static void sendRequestButton(WebDriver driver) {
		JSClicker.executeJSClick(driver, driver.findElement(By.xpath("/html/body/div[3]/md-dialog/form/md-dialog-actions/button[1]")));
	}
	
	public static void clickDownloadButton(WebDriver driver) {
		JSClicker.executeJSClick(driver, driver.findElement(By.xpath("/html/body/div/div[2]/div/md-card/md-content[1]/md-list/md-list-item[1]/div[1]/div[1]/button[1]")));
	}
}
