package com.revature.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.revature.util.WaitToLoad;

public class Locations {
	
	static WebElement e = null;
	
	//find Overview Tab
	public static WebElement findOverviewTab(WebDriver d) {
		return WaitToLoad.findDynamicElement(d, By.name("overview"), 10);
	}
	
	//check if we start on Overview/Home Page
	//NOTE: Overview Tab does not start selected, though we are on the page
	public static WebElement inHomePage(WebDriver d) {
		return WaitToLoad.findDynamicElement(d, By.xpath("//*[@id=\"view\"]/div/md-card/md-toolbar/div[1]/span"), 10);
	}
	
	//find Location Tab so we can check if we're in it
	public static WebElement findLocationsTab(WebDriver d) {
		return WaitToLoad.findDynamicElement(d, By.name("location"), 10);
	}
	
	//RevatureHQ location button
	public static WebElement findRevatureHQButton(WebDriver d) {
		return WaitToLoad.findDynamicElement(d, By.xpath("//*[@id=\"view\"]/md-card/md-content/md-list/md-list-item[1]/div[1]/button"), 10);
		//return d.findElement(By.xpath("span[@aria-label='Revature HQ Reston, VA Reston VA']"));
		//return d.findElement(By.xpath("/html/body/div/div[2]/div/md-card/md-content/md-list/md-list-item/div/button"));
	}
	
	//RevatureHQ location container for the subections
		public static WebElement findRevatureHQLocations(WebDriver d) {
			
			//return d.findElement(By.xpath("span[@aria-label='Revature HQ Reston, VA Reston VA']"));
			//return d.findElement(By.xpath("/html/body/div/div[2]/div/md-card/md-content/md-list/md-list-item/div/button"));
			return d.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-content/md-list/md-list[1]"));
		}
	
		public static WebElement findReston11710(WebDriver d) {
			return d.findElement(By.xpath("span[@aria-label='Reston 11710']"));
		}
			public static WebElement findReston209(WebDriver d) {
				return d.findElement(By.xpath("//*[@id='bldg1']/md-list-item[1]/div/button"));
			}
			public static WebElement findReston201(WebDriver d) {
				return d.findElement(By.xpath("//*[@id=bldg1']/md-list-item[2]/div/button"));
			}
			public static WebElement findReston202(WebDriver d) {
				return d.findElement(By.xpath("//*[@id='bldg1']/md-list-item[3]/div/button"));
			}
			public static WebElement findReston204(WebDriver d) {
				return d.findElement(By.xpath("//*[@id='bldg1']/md-list-item[4]/div/button"));
			}
			public static WebElement findReston205(WebDriver d) {
				return d.findElement(By.xpath("//*[@id='bldg1']/md-list-item[5]/div/button"));
			}
			public static WebElement findReston207(WebDriver d) {
				return d.findElement(By.xpath("//*[@id='bldg1']/md-list-item[6]/div/button"));
			}
			public static WebElement findRoom1(WebDriver d) {
				return d.findElement(By.xpath("//*[@id='bldg1']/md-list-item[7]/div/button"));
			}
	
	//NewYorkCity location
	public static WebElement findNewYorkCityButton(WebDriver d) {
		return WaitToLoad.findDynamicElement(d, By.xpath("//*[@id=\"view\"]/md-card/md-content/md-list/md-list-item[2]/div[1]/button"), 10);
		}
	
	//NewYorkCity location container for the subections
		public static WebElement findNewYorkCityLocations(WebDriver d) {
			return d.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-content/md-list/md-list[2]"));
			}

		public static WebElement findCunyQueens(WebDriver d) {
			return d.findElement(By.xpath("span[@aria-label='CUNY QUEENS']"));
		}
			public static WebElement findCunyQueens210(WebDriver d) {
				return d.findElement(By.xpath("//*[@id='bldg242']/md-list-item[1]/div/button"));
			}
			public static WebElement findCunyQueens1(WebDriver d) {
				return d.findElement(By.xpath("//*[@id='bldg242']/md-list-item[2]/div/button"));
			}
		
		public static WebElement findCunySPS(WebDriver d) {
			return d.findElement(By.xpath("span[@aria-label='CUNY SPS']"));
		}
			public static WebElement findCunySPS216(WebDriver d) {
				return d.findElement(By.xpath("//*[@id='bldg2']/md-list-item[1]/div/button"));
			}
			public static WebElement findCunySPS220(WebDriver d) {
				return d.findElement(By.xpath("//*[@id='bldg2']/md-list-item[2]/div/button"));
			}
	
}