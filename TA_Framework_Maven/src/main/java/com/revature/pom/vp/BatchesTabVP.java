package com.revature.pom.vp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BatchesTabVP {

	static WebElement e = null;
	
	public static WebElement findNewBatchSection(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"batchInfoDiv\"]/span"));
	}
	
	public static WebElement findAllBatchesSection(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-content[2]/md-toolbar/div/span"));
	}
	
	public static WebElement findBatchesTimelineSection(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-content[3]/md-toolbar/div/span"));
	}
	
	public static WebElement findCoreCurriculumDropdown(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"select_value_label_1\"]"));
	}
	
	public static WebElement findCoreCurriculumSelection(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"select_value_label_1\"]/span[1]/div"));
	}
	
	public static WebElement findFocusDropdown(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"select_value_label_2\"]"));
	}
	
	public static WebElement findFocusDropdownSelection(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"select_value_label_2\"]/span[1]/div"));
	}	
	
	public static WebElement findSkillsDropdown(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"select_value_label_3\"]"));
	}
	
	public static WebElement findSkillsDropdownSelection(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"select_value_label_3\"]/span[1]/div"));
	}
	
	public static WebElement findStartDateInput(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"input_108\"]"));
	}

	public static WebElement findEndDateInput(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"input_110\"]"));
	}
}
