package com.revature.pom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CurriculaTab {

		static WebElement e = null;
		
		public static String getCurriculaTabValue(WebDriver d) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	     String t = d.findElement(By.xpath("/html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[4]/a/span/span")).getText();
	      return t;
		}
		
		public static WebElement getCurriculaTab(WebDriver d) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	     e = d.findElement(By.xpath("/html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[4]/a/span/span"));
	      return e;
		}
		
		public static WebElement Core_Curricula(WebDriver d) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		   e = d.findElement(By.xpath("//*[@id=\"coreArrow\"]"));
		   return e;
		}
		
		public static WebElement Focus_Curricula(WebDriver d) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		   e = d.findElement(By.xpath("//*[@id=\"focusArrow\"]"));
		   
		   return e;
		}
}
