package com.revature.pom;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.revature.util.WaitToLoad;

public class BatchesTab {
	static WebElement e = null;
	public static WebElement batchesTag(WebDriver d) {
		return WaitToLoad.findDynamicElement(d, By.xpath("/html/body/div[1]/div[2]/div/md-card/md-content[1]/md-toolbar/div/span"), 30);
	}
	public static WebElement nameFilter(WebDriver d) {
		return WaitToLoad.findDynamicElement(d, By.xpath("/html/body/div[1]/div[2]/div/md-card/md-content[1]/div/md-table-container/table/thead/tr/th[2]"), 30);
	}
	public static WebElement curriculumFilter(WebDriver d) {
		return WaitToLoad.findDynamicElement(d, By.xpath("/html/body/div[1]/div[2]/div/md-card/md-content[1]/div/md-table-container/table/thead/tr/th[3]"), 30);
	}
	public static WebElement focusFilter(WebDriver d) {
		return WaitToLoad.findDynamicElement(d, By.xpath("/html/body/div[1]/div[2]/div/md-card/md-content[1]/div/md-table-container/table/thead/tr/th[4]"), 30);
	}
	public static WebElement trainerFilter(WebDriver d) {
		return WaitToLoad.findDynamicElement(d, By.xpath("/html/body/div[1]/div[2]/div/md-card/md-content[1]/div/md-table-container/table/thead/tr/th[5]"), 30);
	}
	public static WebElement locationFilter(WebDriver d) {
		return WaitToLoad.findDynamicElement(d, By.xpath("/html/body/div[1]/div[2]/div/md-card/md-content[1]/div/md-table-container/table/thead/tr/th[6]"), 30);
	}
	public static WebElement buildingFilter(WebDriver d) {
		return WaitToLoad.findDynamicElement(d, By.xpath("/html/body/div[1]/div[2]/div/md-card/md-content[1]/div/md-table-container/table/thead/tr/th[7]"), 30);
	}
	public static WebElement roomFilter(WebDriver d) {
		return WaitToLoad.findDynamicElement(d, By.xpath("/html/body/div[1]/div[2]/div/md-card/md-content[1]/div/md-table-container/table/thead/tr/th[8]"), 30);
	}
	public static WebElement startFilter(WebDriver d) {
		return WaitToLoad.findDynamicElement(d, By.xpath("/html/body/div[1]/div[2]/div/md-card/md-content[1]/div/md-table-container/table/thead/tr/th[9]"), 30);
	}
	public static WebElement endFilter(WebDriver d) {
		return WaitToLoad.findDynamicElement(d, By.xpath("/html/body/div[1]/div[2]/div/md-card/md-content[1]/div/md-table-container/table/thead/tr/th[10]"), 30);
	}
	public static WebElement startDateSelector(WebDriver d) {
		return WaitToLoad.findDynamicElement(d, By.xpath("/html/body/div[1]/div[2]/div/md-card/md-content[2]/div/div[1]/div[1]/div[1]/div[1]/md-input-container[1]/md-datepicker/div/button"), 30);
	}
	public static WebElement endDateSelector(WebDriver d) {
		return WaitToLoad.findDynamicElement(d, By.xpath("/html/body/div[1]/div[2]/div/md-card/md-content[2]/div/div[1]/div[1]/div[1]/div[1]/md-input-container[2]/md-datepicker/div[1]/button"), 30);
	}
	public static WebElement curriculumSelector(WebDriver d) {
		return WaitToLoad.findDynamicElement(d, By.xpath("/html/body/div[1]/div[2]/div/md-card/md-content[2]/div/div[1]/div[1]/md-input-container[1]/md-select/md-select-value/span[2]"), 30);
	}
	public static WebElement focusSelector(WebDriver d) {
		return WaitToLoad.findDynamicElement(d, By.xpath("/html/body/div[1]/div[2]/div/md-card/md-content[2]/div/div[1]/div[1]/md-input-container[2]/md-select/md-select-value/span[2]"), 30);
	}
	public static WebElement locationSelector(WebDriver d) {
		return WaitToLoad.findDynamicElement(d, By.xpath("span[@aria-label='Location']"), 30);
	}
	public static WebElement buildingSelector(WebDriver d) {
		return WaitToLoad.findDynamicElement(d, By.xpath("/html/body/div[1]/div[2]/div/md-card/md-content[2]/div/div[1]/div[1]/div[1]/div[1]/md-input-container[1]/md-datepicker/div/button"), 30);
	}
	public static List<WebElement> getBatchNames(WebDriver wd) {
		WebElement table_element = WaitToLoad.findDynamicElement(wd, By.xpath("/html/body/div[1]/div[2]/div/md-card/md-content[1]/div/md-table-container/table"), 30);
		//WebElement table_element = WaitToLoad.findDynamicElement(wd, By.xpath("//*[@id=\"view\"]/div/md-card/md-content/md-table-container/table"), 30);
        //List<WebElement> rows=table_element.findElements(By.xpath("//*[@id=\"view\"]/div/md-card/md-content/md-table-container/table/tbody/tr"));
        List<WebElement> rows=table_element.findElements(By.xpath("/html/body/div[1]/div[2]/div/md-card/md-content[1]/div/md-table-container/table/tbody/tr"));
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
		WebElement table_element = WaitToLoad.findDynamicElement(wd, By.xpath("//*[@id=\"view\"]/div/md-card/md-content/md-table-container/table"), 30);
        List<WebElement> rows=table_element.findElements(By.xpath("//*[@id=\"view\"]/div/md-card/md-content/md-table-container/table/tbody/tr"));
        List<WebElement> columns = new ArrayList<WebElement>();
        
		for (WebElement e : rows) {
			columns.addAll(e.findElements(By.xpath("td[3]")));
		}
		return columns;
	}
	public static List<WebElement> getLocation(WebDriver wd) {
		WebElement table_element = WaitToLoad.findDynamicElement(wd, By.xpath("//*[@id=\"view\"]/div/md-card/md-content/md-table-container/table"), 30);
        List<WebElement> rows=table_element.findElements(By.xpath("//*[@id=\"view\"]/div/md-card/md-content/md-table-container/table/tbody/tr"));
        List<WebElement> columns = new ArrayList<WebElement>();
        
		for (WebElement e : rows) {
			columns.addAll(e.findElements(By.xpath("td[4]")));
		}
		return columns;
	}
	public static List<WebElement> getBuilding(WebDriver wd) {
		WebElement table_element = WaitToLoad.findDynamicElement(wd, By.xpath("//*[@id=\"view\"]/div/md-card/md-content/md-table-container/table"), 30);
        List<WebElement> rows=table_element.findElements(By.xpath("//*[@id=\"view\"]/div/md-card/md-content/md-table-container/table/tbody/tr"));
        List<WebElement> columns = new ArrayList<WebElement>();
        
		for (WebElement e : rows) {
			columns.addAll(e.findElements(By.xpath("td[5]")));
		}
		return columns;
	}
	public static List<WebElement> getRoom(WebDriver wd) {
		WebElement table_element = WaitToLoad.findDynamicElement(wd, By.xpath("//*[@id=\"view\"]/div/md-card/md-content/md-table-container/table"), 30);
        List<WebElement> rows=table_element.findElements(By.xpath("//*[@id=\"view\"]/div/md-card/md-content/md-table-container/table/tbody/tr"));
        List<WebElement> columns = new ArrayList<WebElement>();
        
		for (WebElement e : rows) {
			columns.addAll(e.findElements(By.xpath("td[6]")));
		}
		return columns;
	}
	public static List<WebElement> getStartDates(WebDriver wd) {
		WebElement table_element = WaitToLoad.findDynamicElement(wd, By.xpath("//*[@id=\"view\"]/div/md-card/md-content/md-table-container/table"), 30);
        List<WebElement> rows=table_element.findElements(By.xpath("//*[@id=\"view\"]/div/md-card/md-content/md-table-container/table/tbody/tr"));
        List<WebElement> columns = new ArrayList<WebElement>();
        
		for (WebElement e : rows) {
			columns.addAll(e.findElements(By.xpath("td[7]")));
		}
		return columns;
	}
	public static List<WebElement> getEndDates(WebDriver wd) {
		WebElement table_element = WaitToLoad.findDynamicElement(wd, By.xpath("//*[@id=\"view\"]/div/md-card/md-content/md-table-container/table"), 30);
        List<WebElement> rows=table_element.findElements(By.xpath("//*[@id=\"view\"]/div/md-card/md-content/md-table-container/table/tbody/tr"));
        List<WebElement> columns = new ArrayList<WebElement>();
        
		for (WebElement e : rows) {
			columns.addAll(e.findElements(By.xpath("td[8]")));
		}
		return columns;
	}
	
}
