package com.revature.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SettingsTab {
	static WebElement e = null;
	public static WebElement getSettingsTab(WebDriver d) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
      e = d.findElement(By.xpath("html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[8]/a/span/span"));
      return e;
	}
	public static String Timeline_Trainers_PP(WebDriver d) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	   String t = d.findElement(By.xpath("//*[@id=\"input_3\"]")).getAttribute("value");
	   System.out.println(t);
	   return t;
	}
	public static String Reports_Outgoing_Grads(WebDriver d) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		 String t  = d.findElement(By.xpath("//*[@id=\"input_4\"]")).getAttribute("value");
		 return t ;
	}
	public static String Reports_Candidates_Incoming(WebDriver d) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String t = d.findElement(By.xpath("//*[@id=\"input_5\"]")).getAttribute("value");
		return t;
	}
	public static String Default_Batch_Location(WebDriver d) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		 String t = d.findElement(By.xpath("//*[@id=\"select_6\"]")).getText();
		 return t;
	}
	public static String Default_Batch_Building(WebDriver d) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String t = d.findElement(By.xpath("//*[@id=\"select_8\"]")).getText();
		return t;
	}
	public static String Minimum_Batch_Size(WebDriver d) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String t = d.findElement(By.xpath("//*[@id=\"input_10\"]")).getAttribute("value");
		return t;
	}
	public static String Maximum_Batch_Size(WebDriver d) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    String t = d.findElement(By.xpath("//*[@id=\"input_11\"]")).getAttribute("value");
	    return t;
	}
	public static String Default_Batch_Length(WebDriver d) {
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	  String t = d.findElement(By.xpath("//*[@id=\"input_12\"]")).getAttribute("value");
		return t;
	}
	public static String MinimumDayBetweenTrainerBatches(WebDriver d) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	  String t = d.findElement(By.xpath("//*[@id=\"input_13\"]")).getAttribute("value");
	  return t;
	}
	
}
