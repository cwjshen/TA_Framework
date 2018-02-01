package com.revature.pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.revature.util.WaitToLoad;

public class ProfileTab {
	
	public static WebElement findfNameBox(WebDriver d) {
		return WaitToLoad.findDynamicElement(d,By.xpath("//*[@id=\"input_1\"]") , 30);
	}

	public static WebElement findlNameBox(WebDriver d) {
		return WaitToLoad.findDynamicElement(d,By.xpath("//*[@id=\"input_2\"]") , 30);
	}
	
	public static WebElement findAddResumeButton(WebDriver d) {
		return WaitToLoad.findDynamicElement(d,By.xpath("/html/body/div/div[2]/div/md-card[1]/md-content[1]/div/div[3]/label/md-icon") , 30);
	}
	
	public static void clickAddResumeButton(WebDriver d) {
		WaitToLoad.findDynamicElement(d,By.xpath("/html/body/div/div[2]/div/md-card[1]/md-content[1]/div/div[3]/label/md-icon") , 30).click();
	}
	
	public static void clickfNameBox(WebDriver d) {
		WaitToLoad.findDynamicElement(d,By.xpath("//*[@id=\"input_1\"]") , 30).click();
	}
	
	public static WebElement fNameBoxSelected(WebDriver d) {
		return WaitToLoad.findDynamicElement(d,By.xpath("/html/body/div/div[2]/div/md-card[1]/md-content[1]/div/div[1]/form/md-input-container[1]") , 30);
	}
	
	public static WebElement populatefNameBox(WebDriver d) {
		WaitToLoad.findDynamicElement(d,By.xpath("//*[@id=\"input_1\"]") , 30).clear();
		WaitToLoad.findDynamicElement(d,By.xpath("//*[@id=\"input_1\"]") , 30).sendKeys("Kyrie");
		return WaitToLoad.findDynamicElement(d,By.xpath("//*[@id=\"input_1\"]") , 30);
	}
	
	public static void clicklNameBox(WebDriver d) {
		WaitToLoad.findDynamicElement(d,By.xpath("//*[@id=\"input_2\"]") , 30).click();
	}
	
	public static WebElement lNameBoxSelected(WebDriver d) {
		return WaitToLoad.findDynamicElement(d,By.xpath("/html/body/div/div[2]/div/md-card[1]/md-content[1]/div/div[1]/form/md-input-container[2]") , 30);
	}
	
	public static WebElement populatelNameBox(WebDriver d) {
		WaitToLoad.findDynamicElement(d,By.xpath("//*[@id=\"input_2\"]") , 30).clear();
		WaitToLoad.findDynamicElement(d,By.xpath("//*[@id=\"input_2\"]") , 30).sendKeys("Irving");
		return WaitToLoad.findDynamicElement(d,By.xpath("//*[@id=\"input_2\"]") , 30);
	}
	
	public static void closeWindow(WebDriver d) throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
	}
	
	public static void clickAddSkill(WebDriver d) {
		WaitToLoad.findDynamicElement(d,By.xpath("/html/body/div/div[2]/div/md-card[1]/md-content[2]/div/md-chips/md-chips-wrap/md-chip[2]/div/span") , 30).click();
	}
	
	public static WebElement skillList(WebDriver d) {
		return WaitToLoad.findDynamicElement(d,By.xpath("/html/body/div/div[2]/div/md-card[1]/md-content[2]/div/md-list/button[1]") , 30);
	}
	
	public static void findElementsInSkills(WebDriver d) {
		WaitToLoad.findDynamicElement(d,By.xpath("/html/body/div/div[2]/div/md-card[1]/md-content[2]/div/md-chips/md-chips-wrap") , 30);
	}
	
	public static void clickCurrentSkill(WebDriver d) {
		WaitToLoad.findDynamicElement(d,By.xpath("/html/body/div/div[2]/div/md-card[1]/md-content[2]/div/md-list/button[1]") , 30).click();
	}
	
	public static void clickSaveSkill(WebDriver d) {
		WaitToLoad.findDynamicElement(d,By.xpath("/html/body/div/div[2]/div/md-card[1]/md-content[2]/md-toolbar/div/button") , 30).click();
	}
	
	public static void clickAddCertButton(WebDriver d) {
		WaitToLoad.findDynamicElement(d,By.xpath("/html/body/div/div[2]/div/md-card[1]/md-content[3]/md-toolbar/div/label/md-icon") , 30).click();
	}
	
	public static void clickRemoveCertButton(WebDriver d) {
		WaitToLoad.findDynamicElement(d,By.xpath("/html/body/div/div[2]/div/md-card[1]/md-content[3]/div/md-list/md-list-item[2]/button") , 30).click();
	}
	
	public static void clickOnCert(WebDriver d) {
		WaitToLoad.findDynamicElement(d,By.xpath("/html/body/div/div[2]/div/md-card[1]/md-content[3]/div/md-list/md-list-item[1]") , 30).click();
	}
}
