package com.revature.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.revature.util.WaitToLoad;

public class NavBar {
	static WebElement e = null;

	public static WebElement navigateToOverviewPage(WebDriver d) throws InterruptedException {
		//Thread.sleep(1000);
		//WaitToLoad.waitForLoad(d, "/html/body/div[1]/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[1]");
		WaitToLoad.findDynamicElement(d, By.xpath("/html/body/div[1]/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[1]") , 30);
		e = d.findElement(By.xpath("/html/body/div[1]/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[1]"));
		return e;
	}
	public static WebElement navigateToBatchesPage(WebDriver d) throws InterruptedException {
		//Thread.sleep(1000);
		//WaitToLoad.waitForLoad(d, "/html/body/div[1]/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[2]");
		WaitToLoad.findDynamicElement(d, By.xpath("/html/body/div[1]/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[2]") , 30);
		e = d.findElement(By.xpath("/html/body/div[1]/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[2]"));
		return e;
	}
	public static WebElement navigateToLocationsPage(WebDriver d) throws InterruptedException {
		//Thread.sleep(1000);
		//WaitToLoad.waitForLoad(d, "/html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[3]");
		WaitToLoad.findDynamicElement(d, By.xpath("/html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[3]") , 30);
		e = d.findElement(By.xpath("/html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[3]"));
		return e;
	}
	public static WebElement navigateToCurriculaPage(WebDriver d) throws InterruptedException {
		//Thread.sleep(1000);
		//WaitToLoad.waitForLoad(d, "/html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[4]");
		WaitToLoad.findDynamicElement(d, By.xpath("/html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[4]") , 30);
		e = d.findElement(By.xpath("/html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[4]"));
		return e;
	}
	public static WebElement navigateToTrainersPage(WebDriver d) throws InterruptedException {
		//Thread.sleep(1000);
		//WaitToLoad.waitForLoad(d, "/html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[5]");
		WaitToLoad.findDynamicElement(d, By.xpath("/html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[5]") , 30);
		e = d.findElement(By.xpath("/html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[5]"));
		return e;
	}
	public static WebElement navigateToProfilePage(WebDriver d) throws InterruptedException {
		//Thread.sleep(1000);
		//WaitToLoad.waitForLoad(d, "/html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[6]");
		WaitToLoad.findDynamicElement(d, By.xpath("/html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[6]") , 30);
		e = d.findElement(By.xpath("/html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[6]"));
		return e;
	}
	public static WebElement navigateToReportsPage(WebDriver d) throws InterruptedException {
		//Thread.sleep(1000);
		//WaitToLoad.waitForLoad(d, "/html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[7]");
		WaitToLoad.findDynamicElement(d, By.xpath("/html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[7]") , 30);
		e = d.findElement(By.xpath("/html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[7]"));
		return e;
	}
	public static WebElement navigateToSettingsPage(WebDriver d) throws InterruptedException {
		//Thread.sleep(1000);
		//WaitToLoad.waitForLoad(d, "/html/body/div[1]/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[8]");
		WaitToLoad.findDynamicElement(d, By.xpath("/html/body/div[1]/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[8]") , 30);
		e = d.findElement(By.xpath("/html/body/div[1]/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[8]"));
		return e;
	}
}