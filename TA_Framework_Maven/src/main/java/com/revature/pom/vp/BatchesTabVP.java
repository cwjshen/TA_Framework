package com.revature.pom.vp;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.revature.util.WaitToLoad;

public class BatchesTabVP {

	static WebElement e = null;

	public static WebElement body(WebDriver driver) {
		return WaitToLoad.findDynamicElement(driver, By.xpath("html/body"), 30);
	}
	
	public static WebElement findNewBatchSection(WebDriver driver) {
		return WaitToLoad.findDynamicElement(driver, By.xpath("//*[@id=\"batchInfoDiv\"]/span"), 5);
	}
	
	public static WebElement findAllBatchesSection(WebDriver driver) {
		return WaitToLoad.findDynamicElement(driver, By.xpath("//*[@id=\"view\"]/md-card/md-content[2]/md-toolbar/div/span"), 30);
	}
	
	public static WebElement findBatchesTimelineSection(WebDriver driver) {
		return WaitToLoad.findDynamicElement(driver, By.xpath("//*[@id=\"view\"]/md-card/md-content[3]/md-toolbar/div/span"), 30);
	}
	

//	=====================================================================================
//	CURRICULUM
//	=====================================================================================		
	
	
	public static WebElement findCoreCurriculumDropdown(WebDriver driver) {
//		return WaitToLoad.findDynamicElement(driver, By.xpath("//md-select-value/span"), 30);
		return WaitToLoad.findDynamicElement(driver, By.xpath("html/body/div[contains(@class, 'toastContainer')]/div[2]/div/md-card/md-content[1]/form/div[1]/div/md-input-container[1]/md-select"), 30);
	}
	
	public static WebElement findCoreCurriculumMenuContainer(WebDriver driver) {
		return WaitToLoad.findDynamicElement(driver, By.cssSelector("#select_container_10"), 30);
	}
	
	public static List<WebElement> findCoreCurriculumSelections(WebDriver driver) {
		return driver.findElements(By.xpath("html/body/div/div[2]/div/md-card/md-content[1]/form/div[1]/div/md-input-container/"
				+ "md-select/div/md-select-menu/md-content/md-option/div"));
	}
	
//	=====================================================================================
//	FOCUS
//	=====================================================================================	
	
	public static WebElement findFocusDropdown(WebDriver driver) {
//		return WaitToLoad.findDynamicElement(driver, By.xpath("//md-input-container[2]/md-select"), 30);
		return WaitToLoad.findDynamicElement(driver, By.xpath("html/body/div[contains(@class, 'toastContainer')]/div[2]/div/md-card/md-content[1]/form/div[1]/div/md-input-container[2]/md-select"), 30);
	}
	
	public static List<WebElement> findFocusDropdownSelections(WebDriver driver) {
		return driver.findElements(By.xpath("html/body/div[contains(@class, 'md-select-menu-container md-active')]/md-select-menu/md-content/div/md-option/div"));
	}	
	

//	=====================================================================================
//	SKILLS
//	=====================================================================================		
	
	
	public static WebElement findSkillsDropdown(WebDriver driver) {
		return WaitToLoad.findDynamicElement(driver, By.xpath("html/body/div[contains(@class, 'toastContainer')]/div[2]/div/md-card/md-content[1]/form/div[1]/div/md-input-container[3]/md-select"), 30);
	}

	public static List<WebElement> findSkillsDropdownSelectionsCheckbox(WebDriver driver) {
		return driver.findElements(By.xpath("html/body/div[contains(@class, 'md-select-menu-container md-active')]/md-select-menu/md-content/div/md-option"));
	}
	
	public static List<WebElement> findSkillsDropdownSelectionsText(WebDriver driver) {
		return driver.findElements(By.xpath("html/body/div[contains(@class, 'md-select-menu-container md-active')]/md-select-menu/md-content/div/md-option/div[2]"));
	}
	
	
//	=====================================================================================
//	START DATE / END DATE
//	=====================================================================================		
	
	public static WebElement findStartDateInput(WebDriver driver) {
		return WaitToLoad.findDynamicElement(driver, 
				By.xpath("html/body/div[contains(@class, 'toastContainer')]/div[2]/div/md-card/md-content[1]/form/div[2]/div[1]/md-input-container[1]/md-datepicker/div/input"), 
				30);
	}
	
	public static WebElement findEndDateInput(WebDriver driver) {
		return WaitToLoad.findDynamicElement(driver, 
				By.xpath("html/body/div[contains(@class, 'toastContainer')]/div[2]/div/md-card/md-content[1]/form/div[2]/div[1]/md-input-container[2]/md-datepicker/div/input"), 
				30);
	}
	
//	=====================================================================================
//	NAME
//	=====================================================================================			
	
	public static WebElement findNameInput (WebDriver driver) {
		return WaitToLoad.findDynamicElement(driver, 
				By.xpath("html/body/div[contains(@class, 'toastContainer')]/div[2]/div/md-card/md-content[1]/form/div[2]/div[2]/md-input-container/input"), 
				30);
	}
	
//	=====================================================================================
//  TRAINER
//	=====================================================================================			
		
	public static WebElement findTrainerDropdown (WebDriver driver) {
		return WaitToLoad.findDynamicElement(driver, 
				By.xpath("html/body/div[contains(@class, 'toastContainer')]/div[2]/div/md-card/md-content[1]/form/div[3]/div/md-input-container[1]/md-select"),  
				30);
	}
	
	public static List<WebElement> findTrainerSelections (WebDriver driver) {
		return driver.findElements(By.xpath("html/body/div[contains(@class, 'md-select-menu-container md-active')]/)/md-select-menu/md-content/div/div/div"));
	}
	
	public static List<WebElement> findTrainerSelectionsText (WebDriver driver) {
		return driver.findElements(By.xpath("html/body/div[contains(@class, 'md-select-menu-container md-active')]/md-select-menu/md-content/div/div/div/md-option/div[contains(@class, 'md-text')]"));
//		return driver.findElements(By.xpath("//*div[contains(@class, 'md-text ng-binding"))
	}
	
//	=====================================================================================
//  CO-TRAINER
//	=====================================================================================			
		
	public static WebElement findCoTrainerDropdown (WebDriver driver) {
		return WaitToLoad.findDynamicElement(driver, 
				By.xpath("html/body/div[contains(@class, 'toastContainer')]/div[2]/div/md-card/md-content[1]/form/div[3]/div/md-input-container[2]/md-select"),  
				30);
	}	
	
//	=====================================================================================
//  LOCATION
//	=====================================================================================			
		
	public static WebElement findLocationDropdown (WebDriver driver) {
		return WaitToLoad.findDynamicElement(driver, 
				By.xpath("html/body/div[contains(@class, 'toastContainer')]/div[2]/div/md-card/md-content[1]/form/div[4]/div/md-input-container[1]/md-select"), 
				30);
	}	

	public static List<WebElement> findLocationSelectionsText (WebDriver driver) {
		return driver.findElements(By.xpath("html/body/div[contains(@class, 'md-select-menu-container md-active')]/md-select-menu/md-content/md-option/div[contains(@class, 'md-text')]"));
	}
	
//	=====================================================================================
//  BUILDING
//	=====================================================================================			
		
	public static WebElement findBuildingDropdown (WebDriver driver) {
		return WaitToLoad.findDynamicElement(driver, 
				By.xpath("html/body/div[contains(@class, 'toastContainer')]/div[2]/div/md-card/md-content[1]/form/div[4]/div/md-input-container[2]/md-select"), 
				30);
	}	

	public static List<WebElement> findBuildingSelectionsText (WebDriver driver) {
		return driver.findElements(By.xpath("html/body/div[contains(@class, 'md-select-menu-container md-active')]/md-select-menu/md-content/div/div/div/md-option/div[contains(@class, 'md-text')]"));
	}
//	=====================================================================================
//  ROOM
//	=====================================================================================			
		
	public static WebElement findRoomDropdown (WebDriver driver) {
		return WaitToLoad.findDynamicElement(driver, 
				By.xpath("html/body/div[contains(@class, 'toastContainer')]/div[2]/div/md-card/md-content[1]/form/div[4]/div/md-input-container[3]/md-select"), 
				30);
	}	
	
//	=====================================================================================
//  CREATE BATCH BUTTON
//	=====================================================================================
	
	public static WebElement findCreateBatchButton (WebDriver driver) {
		return WaitToLoad.findDynamicElement(driver, By.cssSelector(".batchForm > md-toolbar:nth-child(1) > button:nth-child(3)"), 30);
	}	
	
//	=====================================================================================
//  BATCH TABLE
//	=====================================================================================
	public static List<WebElement> findBatchTableBodyRows(WebDriver driver) {
		return driver.findElements(By.xpath("/html/body/div[1]/div[2]/div/md-card/md-content[2]/div/md-table-container/table/tbody/tr[contains(@class, 'batchRow')]"));
	}
	
	// Create a list of lists, where each sublist contains the fields per row
	public static List<List<WebElement>> findBatchTableBodyRowFields (WebDriver driver) {
		List<List<WebElement>> rows_with_fields = new ArrayList<List<WebElement>>();
		List<WebElement> rows = findBatchTableBodyRows(driver);
		
		for (WebElement row : rows) {
//			System.out.println(row.findElements(By.xpath(".//td").size());
			rows_with_fields.add(row.findElements(By.xpath(".//td")));
			
		}
		return rows_with_fields;
	}
	
}
