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
	public static WebElement filterName(WebDriver d) {
		return d.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/md-card/md-content/md-table-container/table/thead/tr/th[1]"));
	}
	public static WebElement filterCurriculum(WebDriver d) {
		return d.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/md-card/md-content/md-table-container/table/thead/tr/th[2]"));
	}
	public static WebElement filterTrainer(WebDriver d) {
		return d.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/md-card/md-content/md-table-container/table/thead/tr/th[3]"));
	}
	public static WebElement filterLocation(WebDriver d) {
		return d.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/md-card/md-content/md-table-container/table/thead/tr/th[4]"));
	}
	public static WebElement filterBuilding(WebDriver d) {
		return d.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/md-card/md-content/md-table-container/table/thead/tr/th[5]"));
	}
	public static WebElement filterRoom(WebDriver d) {
		return d.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/md-card/md-content/md-table-container/table/thead/tr/th[6]"));
	}
	public static WebElement filterStartDate(WebDriver d) {
		return d.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/md-card/md-content/md-table-container/table/thead/tr/th[7]"));
	}
	public static WebElement filterEndDate(WebDriver d) {
		return d.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/md-card/md-content/md-table-container/table/thead/tr/th[8]"));
	}
}
