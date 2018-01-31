package com.revature.pom;

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
}
