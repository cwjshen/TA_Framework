package com.revature.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BatchesTab {
	static WebElement e = null;
	public static WebElement nameFilter(WebDriver d) {
		return d.findElement(By.xpath("/html/body/div[1]/div[2]/div/md-card/md-content[1]/div/md-table-container/table/thead/tr/th[2]/b"));
	}
	public static WebElement curriculumFilter(WebDriver d) {
		return d.findElement(By.xpath("/html/body/div[1]/div[2]/div/md-card/md-content[1]/div/md-table-container/table/thead/tr/th[3]"));
	}
	public static WebElement focusFilter(WebDriver d) {
		return d.findElement(By.xpath("/html/body/div[1]/div[2]/div/md-card/md-content[1]/div/md-table-container/table/thead/tr/th[4]"));
	}
	public static WebElement trainerFilter(WebDriver d) {
		return d.findElement(By.xpath("/html/body/div[1]/div[2]/div/md-card/md-content[1]/div/md-table-container/table/thead/tr/th[5]"));
	}
	public static WebElement locationFilter(WebDriver d) {
		return d.findElement(By.xpath("/html/body/div[1]/div[2]/div/md-card/md-content[1]/div/md-table-container/table/thead/tr/th[6]"));
	}
	public static WebElement buildingFilter(WebDriver d) {
		return d.findElement(By.xpath("/html/body/div[1]/div[2]/div/md-card/md-content[1]/div/md-table-container/table/thead/tr/th[7]"));
	}
	public static WebElement roomFilter(WebDriver d) {
		return d.findElement(By.xpath("/html/body/div[1]/div[2]/div/md-card/md-content[1]/div/md-table-container/table/thead/tr/th[8]"));
	}
	public static WebElement startFilter(WebDriver d) {
		return d.findElement(By.xpath("/html/body/div[1]/div[2]/div/md-card/md-content[1]/div/md-table-container/table/thead/tr/th[9]"));
	}
	public static WebElement endFilter(WebDriver d) {
		return d.findElement(By.xpath("/html/body/div[1]/div[2]/div/md-card/md-content[1]/div/md-table-container/table/thead/tr/th[10]"));
	}
	public static WebElement startDateSelector(WebDriver d) {
		return d.findElement(By.xpath("/html/body/div[1]/div[2]/div/md-card/md-content[2]/div/div[1]/div[1]/div[1]/div[1]/md-input-container[1]/md-datepicker/div/button"));
	}
	public static WebElement endDateSelector(WebDriver d) {
		return d.findElement(By.xpath("/html/body/div[1]/div[2]/div/md-card/md-content[2]/div/div[1]/div[1]/div[1]/div[1]/md-input-container[2]/md-datepicker/div[1]/button"));
	}
	public static WebElement curriculumSelector(WebDriver d) {
		return d.findElement(By.xpath("/html/body/div[1]/div[2]/div/md-card/md-content[2]/div/div[1]/div[1]/md-input-container[1]/md-select/md-select-value/span[2]"));
	}
	public static WebElement focusSelector(WebDriver d) {
		return d.findElement(By.xpath("/html/body/div[1]/div[2]/div/md-card/md-content[2]/div/div[1]/div[1]/md-input-container[2]/md-select/md-select-value/span[2]"));
	}
	public static WebElement locationSelector(WebDriver d) {
		return d.findElement(By.xpath("span[@aria-label='Location']"));
	}
	public static WebElement buildingSelector(WebDriver d) {
		return d.findElement(By.xpath("/html/body/div[1]/div[2]/div/md-card/md-content[2]/div/div[1]/div[1]/div[1]/div[1]/md-input-container[1]/md-datepicker/div/button"));
	}
	
}
