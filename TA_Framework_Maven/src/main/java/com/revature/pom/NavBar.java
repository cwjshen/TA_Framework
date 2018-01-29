package com.revature.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.revature.util.WaitToLoad;

public class NavBar {
	static WebElement e = null;

	public static WebElement navigateToOverviewPage(WebDriver d) throws InterruptedException {
		return WaitToLoad.findDynamicElement(d, By.xpath("/html/body/div[1]/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[1]") , 30);
	}
	public static WebElement navigateToBatchesPage(WebDriver d) throws InterruptedException {
		return WaitToLoad.findDynamicElement(d, By.xpath("/html/body/div[1]/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[2]") , 30);
	}
	public static WebElement navigateToLocationsPage(WebDriver d) throws InterruptedException {
		return WaitToLoad.findDynamicElement(d, By.xpath("/html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[3]") , 30);
	}
	public static WebElement navigateToCurriculaPage(WebDriver d) throws InterruptedException {
		return WaitToLoad.findDynamicElement(d, By.xpath("/html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[4]") , 30);
	}
	public static WebElement navigateToTrainersPage(WebDriver d) throws InterruptedException {
		return WaitToLoad.findDynamicElement(d, By.xpath("/html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[5]") , 30);
	}
	public static WebElement navigateToProfilePage(WebDriver d) throws InterruptedException {
		return WaitToLoad.findDynamicElement(d, By.xpath("/html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[6]") , 30);
	}
	public static WebElement navigateToReportsPage(WebDriver d) throws InterruptedException {
		return WaitToLoad.findDynamicElement(d, By.xpath("/html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[7]") , 30);
	}
	public static WebElement navigateToSettingsPage(WebDriver d) throws InterruptedException {
		return WaitToLoad.findDynamicElement(d, By.xpath("/html/body/div[1]/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[8]") , 30);
	}
}