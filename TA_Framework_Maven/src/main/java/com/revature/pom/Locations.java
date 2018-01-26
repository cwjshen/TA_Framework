package com.revature.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locations {
	
	static WebElement e = null;
	
	//RevatureHQ location
	public static WebElement RevatureHQ(WebDriver d) {
		return d.findElement(By.xpath("span[@aria-label='Revature HQ Reston, VA Reston VA']"));
	}
		public static WebElement Reston11730(WebDriver d) {
			return d.findElement(By.xpath("span[@aria-label='Reston 11730']"));
		}
			public static WebElement Reston209(WebDriver d) {
				return d.findElement(By.xpath("//*[@id='bldg1']/md-list-item[1]/div/button"));
			}
			public static WebElement Reston201(WebDriver d) {
				return d.findElement(By.xpath("//*[@id='bldg1']/md-list-item[2]/div/button"));
			}
			public static WebElement Reston202(WebDriver d) {
				return d.findElement(By.xpath("//*[@id='bldg1']/md-list-item[3]/div/button"));
			}
			public static WebElement Reston204(WebDriver d) {
				return d.findElement(By.xpath("//*[@id='bldg1']/md-list-item[4]/div/button"));
			}
			public static WebElement Reston205(WebDriver d) {
				return d.findElement(By.xpath("//*[@id='bldg1']/md-list-item[5]/div/button"));
			}
			public static WebElement Reston207(WebDriver d) {
				return d.findElement(By.xpath("//*[@id='bldg1']/md-list-item[6]/div/button"));
			}
			public static WebElement Room1(WebDriver d) {
				return d.findElement(By.xpath("//*[@id='bldg1']/md-list-item[7]/div/button"));
			}
	
	//NewYorkCity location
	public static WebElement NewYorkCity(WebDriver d) {
		return d.findElement(By.xpath("span[@aria-label='New York City New York, NY New York NY']"));
	}
		public static WebElement CunyQueens(WebDriver d) {
			return d.findElement(By.xpath("span[@aria-label='CUNY QUEENS']"));
		}
			public static WebElement CunyQueens210(WebDriver d) {
				return d.findElement(By.xpath("//*[@id=\'bldg242\']/md-list-item[1]/div/button"));
			}
			public static WebElement CunyQueens1(WebDriver d) {
				return d.findElement(By.xpath("//*[@id=\'bldg242\']/md-list-item[2]/div/button"));
			}
		
		public static WebElement CunySPS(WebDriver d) {
			return d.findElement(By.xpath("span[@aria-label='CUNY SPS']"));
		}
			public static WebElement CunySPS216(WebDriver d) {
				return d.findElement(By.xpath("//*[@id='bldg2']/md-list-item[1]/div/button"));
			}
			public static WebElement CunySPS220(WebDriver d) {
				return d.findElement(By.xpath("//*[@id='bldg2']/md-list-item[2]/div/button"));
			}
	
}