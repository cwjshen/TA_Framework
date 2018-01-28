package com.revature.pom;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class OverviewTab {
	static WebElement e = null;
//	public static List<WebElement> tr_collection = new ArrayList<WebElement>();
//	public static List<WebElement> td_collection = new ArrayList<WebElement>();
	
	
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
	public static List<WebElement> getBatchNames(WebDriver wd) {
		WebElement table_element = wd.findElement(By.xpath("//*[@id=\"view\"]/div/md-card/md-content/md-table-container/table"));
        List<WebElement> rows=table_element.findElements(By.xpath("//*[@id=\"view\"]/div/md-card/md-content/md-table-container/table/tbody/tr"));
        List<WebElement> columns = new ArrayList<WebElement>();
        
		for (WebElement e : rows) {
			columns.addAll(e.findElements(By.xpath("td[1]")));
		}
		return columns;
	}
	public static List<WebElement> getCurricula(WebDriver wd) {
		WebElement table_element = wd.findElement(By.xpath("//*[@id=\"view\"]/div/md-card/md-content/md-table-container/table"));
        List<WebElement> rows=table_element.findElements(By.xpath("//*[@id=\"view\"]/div/md-card/md-content/md-table-container/table/tbody/tr"));
        List<WebElement> columns = new ArrayList<WebElement>();
        
		for (WebElement e : rows) {
			columns.addAll(e.findElements(By.xpath("td[2]")));
		}
		return columns;
	}
	public static List<WebElement> getTrainer(WebDriver wd) {
		WebElement table_element = wd.findElement(By.xpath("//*[@id=\"view\"]/div/md-card/md-content/md-table-container/table"));
        List<WebElement> rows=table_element.findElements(By.xpath("//*[@id=\"view\"]/div/md-card/md-content/md-table-container/table/tbody/tr"));
        List<WebElement> columns = new ArrayList<WebElement>();
        
		for (WebElement e : rows) {
			columns.addAll(e.findElements(By.xpath("td[3]")));
		}
		return columns;
	}
	public static List<WebElement> getLocation(WebDriver wd) {
		WebElement table_element = wd.findElement(By.xpath("//*[@id=\"view\"]/div/md-card/md-content/md-table-container/table"));
        List<WebElement> rows=table_element.findElements(By.xpath("//*[@id=\"view\"]/div/md-card/md-content/md-table-container/table/tbody/tr"));
        List<WebElement> columns = new ArrayList<WebElement>();
        
		for (WebElement e : rows) {
			columns.addAll(e.findElements(By.xpath("td[4]")));
		}
		return columns;
	}
	public static List<WebElement> getBuilding(WebDriver wd) {
		WebElement table_element = wd.findElement(By.xpath("//*[@id=\"view\"]/div/md-card/md-content/md-table-container/table"));
        List<WebElement> rows=table_element.findElements(By.xpath("//*[@id=\"view\"]/div/md-card/md-content/md-table-container/table/tbody/tr"));
        List<WebElement> columns = new ArrayList<WebElement>();
        
		for (WebElement e : rows) {
			columns.addAll(e.findElements(By.xpath("td[5]")));
		}
		return columns;
	}
	public static List<WebElement> getRoom(WebDriver wd) {
		WebElement table_element = wd.findElement(By.xpath("//*[@id=\"view\"]/div/md-card/md-content/md-table-container/table"));
        List<WebElement> rows=table_element.findElements(By.xpath("//*[@id=\"view\"]/div/md-card/md-content/md-table-container/table/tbody/tr"));
        List<WebElement> columns = new ArrayList<WebElement>();
        
		for (WebElement e : rows) {
			columns.addAll(e.findElements(By.xpath("td[6]")));
		}
		return columns;
	}
	public static List<WebElement> getStartDates(WebDriver wd) {
		WebElement table_element = wd.findElement(By.xpath("//*[@id=\"view\"]/div/md-card/md-content/md-table-container/table"));
        List<WebElement> rows=table_element.findElements(By.xpath("//*[@id=\"view\"]/div/md-card/md-content/md-table-container/table/tbody/tr"));
        List<WebElement> columns = new ArrayList<WebElement>();
        
		for (WebElement e : rows) {
			columns.addAll(e.findElements(By.xpath("td[7]")));
		}
		return columns;
	}
	public static List<WebElement> getEndDates(WebDriver wd) {
		WebElement table_element = wd.findElement(By.xpath("//*[@id=\"view\"]/div/md-card/md-content/md-table-container/table"));
        List<WebElement> rows=table_element.findElements(By.xpath("//*[@id=\"view\"]/div/md-card/md-content/md-table-container/table/tbody/tr"));
        List<WebElement> columns = new ArrayList<WebElement>();
        
		for (WebElement e : rows) {
			columns.addAll(e.findElements(By.xpath("td[8]")));
		}
		return columns;
	}
}
