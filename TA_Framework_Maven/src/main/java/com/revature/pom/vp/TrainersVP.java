package com.revature.pom.vp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.revature.util.JSClicker;
import com.revature.util.WaitToLoad;

public class TrainersVP {

	public static void findCalendarButtonVP(WebDriver d) {
		WaitToLoad.findDynamicElement(d,By.xpath("/html/body/div/div[2]/div/md-card/md-toolbar[1]/div/button[2]") , 30).click();
	}

	public static WebElement downloadResumeButtonVP(WebDriver d) {
		return WaitToLoad.findDynamicElement(d,By.xpath("/html/body/div/div[2]/div/md-card/md-content[1]/md-list/md-list-item[1]/div[1]/div[1]/button[1]") , 30);
	}
	
	public static void clickTrainerVP(WebDriver d) {
		WaitToLoad.findDynamicElement(d,By.xpath("/html/body/div/div[2]/div/md-card/md-content[1]/md-list/md-list-item[1]/div[1]/button") , 30).click();
	}
	
	public static WebElement isCalendarOpenVP(WebDriver d) {
		return WaitToLoad.findDynamicElement(d,By.xpath("//*[@id=\\\"dpPopup1\\\"]/div") , 30);
	}
	
	public static void addPtoRequestButtonVP(WebDriver d) {
		WaitToLoad.findDynamicElement(d,By.xpath("/html/body/div[3]/md-dialog/md-dialog-actions/button[1]") , 30).click();
	}
	
	public static WebElement isPtoRequestWindowOpenVP(WebDriver d) {
		return WaitToLoad.findDynamicElement(d,By.xpath("/html/body/div[3]/md-dialog/form") , 30);
	}
	
	public static WebElement cancelButtonVP(WebDriver d) {
		return WaitToLoad.findDynamicElement(d,By.xpath("/html/body/div[3]/md-dialog/md-dialog-actions/button[2]") , 30);
	}
	
	public static void requestStartDateVP(WebDriver d) {
		WaitToLoad.findDynamicElement(d,By.xpath("/html/body/div[3]/md-dialog/form/md-dialog-content/div/md-input-container[1]/md-datepicker/div[1]/button") , 30).click();
	}
	
	public static void cancelRequestButtonVP(WebDriver d) {
		WaitToLoad.findDynamicElement(d,By.xpath("/html/body/div[3]/md-dialog/form/md-dialog-actions/button[2]") , 30).click();
	}
	
	public static void pickStartYearVP(WebDriver d) {
		WaitToLoad.findDynamicElement(d,By.xpath("/html/body/div[4]/div[2]/md-calendar/div/md-calendar-year/div/md-virtual-repeat-container/div/div[2]/table/tbody[4]/tr[1]/td[2]/span") , 30).click();
	}
	
	public static void pickStartDateVP(WebDriver d) {
		WaitToLoad.findDynamicElement(d,By.xpath("/html/body/div[4]/div[2]/md-calendar/div/md-calendar-month/div/md-virtual-repeat-container/div/div[2]/table/tbody[4]/tr[5]/td[5]/span") , 30).click();
	}
	
	public static void requestEndDateVP(WebDriver d) {
		WaitToLoad.findDynamicElement(d,By.xpath("/html/body/div[3]/md-dialog/form/md-dialog-content/div/md-input-container[2]/md-datepicker/div/button") , 30).click();
	}
	
	public static void pickEndYearVP(WebDriver d) {
		WaitToLoad.findDynamicElement(d,By.xpath("/html/body/div[4]/div[2]/md-calendar/div/md-calendar-year/div/md-virtual-repeat-container/div/div[2]/table/tbody[4]/tr[1]/td[4]/span") , 30).click();
	}
	
	public static void pickEndDateVP(WebDriver d) {
		WaitToLoad.findDynamicElement(d,By.xpath("/html/body/div[4]/div[2]/md-calendar/div/md-calendar-month/div/md-virtual-repeat-container/div/div[2]/table/tbody[4]/tr[4]/td[5]/span") , 30).click();
	}
	
	public static void sendRequestButtonVP(WebDriver d) {
		WaitToLoad.findDynamicElement(d,By.xpath("/html/body/div[3]/md-dialog/form/md-dialog-actions/button[1]") , 30).click();
	}
	
	public static void clickDownloadButtonVP(WebDriver d) {
		JSClicker.executeJSClick(d, d.findElement(By.xpath("/html/body/div/div[2]/div/md-card/md-content[1]/md-list/md-list-item[1]/div[1]/div[1]/button[1]")));
	}
	
	public static void clickAddTrainerButtonVP(WebDriver d) {
		WaitToLoad.findDynamicElement(d,By.xpath("/html/body/div/div[2]/div/md-card/md-toolbar[1]/div/button[1]") , 30).click();
	} 
	
	public static void clickFirstNameBoxVP(WebDriver d) {
		WaitToLoad.findDynamicElement(d,By.xpath("//*[@id=\"input_1\"]") , 60).click();
		WaitToLoad.findDynamicElement(d,By.xpath("//*[@id=\"input_1\"]") , 60).sendKeys("Lebron");
	}
	
	public static void clickLastNameBoxVP(WebDriver d) {
		WaitToLoad.findDynamicElement(d,By.xpath("//*[@id=\"input_2\"]") , 30).click();
		WaitToLoad.findDynamicElement(d,By.xpath("//*[@id=\"input_2\"]") , 30).sendKeys("James");
	} 
	
	public static void clickSaveNewTrainerButtonVP(WebDriver d) {
		WaitToLoad.findDynamicElement(d,By.xpath("/html/body/div[3]/md-dialog/form/md-dialog-actions/button[1]") , 30).click();;
	} 
	
	public static void clickCancelNewTrainerButtonVP(WebDriver d) {
		WaitToLoad.findDynamicElement(d,By.xpath("/html/body/div[3]/md-dialog/form/md-dialog-actions/button[2]") , 30).click();
	} 
	
	public static void clickDeactivateTrainerVP(WebDriver d) {
		WaitToLoad.findDynamicElement(d,By.xpath("/html/body/div/div[2]/div/md-card/md-content[1]/md-list/md-list-item[1]/div[1]/div[1]/button[2]") , 30).click();													
	} 
	
	public static void clickReactivateTrainerVP(WebDriver d) {
		WaitToLoad.findDynamicElement(d,By.xpath("/html/body/div/div[2]/div/md-card/md-content[2]/md-list/md-list-item[1]/button") , 30).click();
	} 
	
	public static void cancelCalendarButtonVP(WebDriver d) {
		WaitToLoad.findDynamicElement(d,By.xpath("/html/body/div[3]/md-dialog/md-dialog-actions/button[2]") , 30).click();
	}
}
