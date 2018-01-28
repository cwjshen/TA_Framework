package com.revature.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locations {
	
	static WebElement e = null;
	
	//RevatureHQ location
	public static WebElement findRevatureHQ(WebDriver d) {
		return d.findElement(By.xpath("/html/body/div/div[2]/div/md-card/md-content/md-list/md-list-item[1]/div[1]/button"));

	}
	
		public static WebElement findReston11730(WebDriver d) {
			return d.findElement(By.xpath("span[@aria-label='Reston 11730']"));
		}
			public static WebElement findReston209(WebDriver d) {
				return d.findElement(By.xpath("//*[@id='bldg1']/md-list-item[1]/div/button"));
			}
			public static WebElement findReston201(WebDriver d) {
				return d.findElement(By.xpath("//*[@id='bldg1']/md-list-item[2]/div/button"));
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
	public static WebElement findNewYorkCity(WebDriver d) {
		return d.findElement(By.xpath("/html/body/div/div[2]/div/md-card/md-content/md-list/md-list-item[2]/div[1]/button"));
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