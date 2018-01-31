package com.revature.pom;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.revature.util.JSClicker;
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
	public static void curriculumSelector(WebDriver d) {
		//WaitToLoad.findDynamicElement(d, By.xpath("/html/body/div[1]/div[2]/div/md-card/md-content[2]/div/div[1]/div[1]/md-input-container[1]"), 30).click();
		//return WaitToLoad.findDynamicElement(d, By.cssSelector("#select_container_19"), 10);
		//JSClicker.executeJSClick(d, d.findElement(By.xpath("/html/body/div[1]/div[2]/div/md-card/md-content[2]/div/div[1]/div[1]/md-input-container[1]")));
		
		WaitToLoad.findDynamicElement(d, By.cssSelector("[ng-model*='selectCurricula']"), 10).click();
	}
	public static void focusSelector(WebDriver d) {
		//return WaitToLoad.findDynamicElement(d, By.xpath("/html/body/div[1]/div[2]/div/md-card/md-content[2]/div/div[1]/div[1]/md-input-container[2]/md-select/md-select-value/span[2]"), 30);
		WaitToLoad.findDynamicElement(d, By.cssSelector("[ng-model*='selectFoci']"), 10).click();
	}
	public static void locationSelector(WebDriver d) {
		WaitToLoad.findDynamicElement(d, By.cssSelector("[ng-model*='selectLocations']"), 10).click();
	}
	public static void buildingSelector(WebDriver d) {
		WaitToLoad.findDynamicElement(d, By.cssSelector("[ng-model*='selectBuildings']"), 10).click();
	}
	public static List<WebElement> getBatchNames(WebDriver wd) {
		WebElement table_element = WaitToLoad.findDynamicElement(wd, By.xpath("/html/body/div[1]/div[2]/div/md-card/md-content[1]/div/md-table-container/table"), 30);
        List<WebElement> rows=table_element.findElements(By.xpath("/html/body/div[1]/div[2]/div/md-card/md-content[1]/div/md-table-container/table/tbody/tr"));
      
        List<WebElement> columns = new ArrayList<WebElement>();
        
		for (WebElement e : rows) {
			columns.addAll(e.findElements(By.xpath("td[2]")));
		}
		return columns;
	}
	public static List<WebElement> getCurricula(WebDriver wd) {
		WebElement table_element = WaitToLoad.findDynamicElement(wd, By.xpath("/html/body/div[1]/div[2]/div/md-card/md-content[1]/div/md-table-container/table"), 30);
        List<WebElement> rows=table_element.findElements(By.xpath("/html/body/div[1]/div[2]/div/md-card/md-content[1]/div/md-table-container/table/tbody/tr"));
        List<WebElement> columns = new ArrayList<WebElement>();
        
		for (WebElement e : rows) {
			columns.addAll(e.findElements(By.xpath("td[3]")));
		}
		return columns;
	}
	public static List<WebElement> getFocus(WebDriver wd) {
		WebElement table_element = WaitToLoad.findDynamicElement(wd, By.xpath("/html/body/div[1]/div[2]/div/md-card/md-content[1]/div/md-table-container/table"), 30);
        List<WebElement> rows=table_element.findElements(By.xpath("/html/body/div[1]/div[2]/div/md-card/md-content[1]/div/md-table-container/table/tbody/tr"));
        List<WebElement> columns = new ArrayList<WebElement>();
        
		for (WebElement e : rows) {
			columns.addAll(e.findElements(By.xpath("td[4]")));
		}
		return columns;
	}
	
	public static List<WebElement> getTrainer(WebDriver wd) {
		WebElement table_element = WaitToLoad.findDynamicElement(wd, By.xpath("/html/body/div[1]/div[2]/div/md-card/md-content[1]/div/md-table-container/table"), 30);
        List<WebElement> rows=table_element.findElements(By.xpath("/html/body/div[1]/div[2]/div/md-card/md-content[1]/div/md-table-container/table/tbody/tr"));
        List<WebElement> columns = new ArrayList<WebElement>();
        
		for (WebElement e : rows) {
			columns.addAll(e.findElements(By.xpath("td[5]")));
		}
		return columns;
	}
	public static List<WebElement> getLocation(WebDriver wd) {
		WebElement table_element = WaitToLoad.findDynamicElement(wd, By.xpath("/html/body/div[1]/div[2]/div/md-card/md-content[1]/div/md-table-container/table"), 30);
        List<WebElement> rows=table_element.findElements(By.xpath("/html/body/div[1]/div[2]/div/md-card/md-content[1]/div/md-table-container/table/tbody/tr"));
        List<WebElement> columns = new ArrayList<WebElement>();
        
		for (WebElement e : rows) {
			columns.addAll(e.findElements(By.xpath("td[6]")));
		}
		return columns;
	}
	public static List<WebElement> getBuilding(WebDriver wd) {
		WebElement table_element = WaitToLoad.findDynamicElement(wd, By.xpath("/html/body/div[1]/div[2]/div/md-card/md-content[1]/div/md-table-container/table"), 30);
        List<WebElement> rows=table_element.findElements(By.xpath("/html/body/div[1]/div[2]/div/md-card/md-content[1]/div/md-table-container/table/tbody/tr"));
        List<WebElement> columns = new ArrayList<WebElement>();
        
		for (WebElement e : rows) {
			columns.addAll(e.findElements(By.xpath("td[7]")));
		}

		return columns;
	}
	public static List<WebElement> getRoom(WebDriver wd) {
		WebElement table_element = WaitToLoad.findDynamicElement(wd, By.xpath("/html/body/div[1]/div[2]/div/md-card/md-content[1]/div/md-table-container/table"), 30);
        List<WebElement> rows=table_element.findElements(By.xpath("/html/body/div[1]/div[2]/div/md-card/md-content[1]/div/md-table-container/table/tbody/tr"));
        List<WebElement> columns = new ArrayList<WebElement>();
        
		for (WebElement e : rows) {
			columns.addAll(e.findElements(By.xpath("td[8]")));
		}
		return columns;
	}
	public static List<WebElement> getStartDates(WebDriver wd) {
		WebElement table_element = WaitToLoad.findDynamicElement(wd, By.xpath("/html/body/div[1]/div[2]/div/md-card/md-content[1]/div/md-table-container/table"), 30);
        List<WebElement> rows=table_element.findElements(By.xpath("/html/body/div[1]/div[2]/div/md-card/md-content[1]/div/md-table-container/table/tbody/tr"));
        List<WebElement> columns = new ArrayList<WebElement>();
        
		for (WebElement e : rows) {
			columns.addAll(e.findElements(By.xpath("td[9]")));
		}
		return columns;
	}
	public static List<WebElement> getEndDates(WebDriver wd) {
		WebElement table_element = WaitToLoad.findDynamicElement(wd, By.xpath("/html/body/div[1]/div[2]/div/md-card/md-content[1]/div/md-table-container/table"), 30);
        List<WebElement> rows=table_element.findElements(By.xpath("/html/body/div[1]/div[2]/div/md-card/md-content[1]/div/md-table-container/table/tbody/tr"));
        List<WebElement> columns = new ArrayList<WebElement>();
        
		for (WebElement e : rows) {
			columns.addAll(e.findElements(By.xpath("td[10]")));
		}
		return columns;
	}
	
	public static void clickNextPage(WebDriver wd) {
		WaitToLoad.findDynamicElement(wd, By.xpath("//*[@id=\"nextTrainerPageButton\"]"), 10).click();
	}
	public static void clickJumpLast(WebDriver wd) {
		WaitToLoad.findDynamicElement(wd, By.xpath("//*[@id=\"lastTrainerPageButton\"]"), 10).click();
	}
	public static void clickPreviousPage(WebDriver wd) {
		WaitToLoad.findDynamicElement(wd, By.xpath("//*[@id=\"previousTrainerPageButton\"]"), 10).click();
	}
	public static void clickJumpFirst(WebDriver wd) {
		WaitToLoad.findDynamicElement(wd, By.xpath("//*[@id=\"firstTrainerPageButton\"]"), 10).click();
	}
	public static void clickSelectAutomaticallyBox(WebDriver wd) {
		WaitToLoad.findDynamicElement(wd, By.xpath("/html/body/div[1]/div[2]/div/md-card/md-content[2]/div/div[1]/div[1]/div[1]/div[2]/md-checkbox/div[1]"), 10).click();
	}
	public static void clickHideConcludedBox(WebDriver wd) {
		WaitToLoad.findDynamicElement(wd, By.xpath("/html/body/div[1]/div[2]/div/md-card/md-content[2]/div/div[1]/div[1]/div[8]/md-checkbox[1]/div[1]"), 10).click();
	}
	public static void clickHideBatchlessBox(WebDriver wd) {
		WaitToLoad.findDynamicElement(wd, By.xpath("/html/body/div[1]/div[2]/div/md-card/md-content[2]/div/div[1]/div[1]/div[8]/md-checkbox[2]/div[1]"), 10).click();
	}
	public static List<WebElement> curriculumDropDownOptions(WebDriver wd) {
		//return wd.findElements(By.xpath("/html/body/div[14]/md-select-menu/md-content/md-option/div[2]"));
		return wd.findElements(By.xpath("/html/body/div[4]/md-select-menu/md-content"));
	}
	public static WebElement chooseJACurriculum(WebDriver wd) {
		return WaitToLoad.findDynamicElement(wd, By.id("select_option_123"), 10);
	}
	public static void chooseStartingMonth(WebDriver wd) {
		//WaitToLoad.findDynamicElement(wd, By.xpath("/html/body/div[11]/div[2]/md-calendar/div/md-calendar-year/div/md-virtual-repeat-container/div/div[2]/table/tbody[1]/tr[2]/td[7]/span"), 10).click();
		JSClicker.executeJSClick(wd, wd.findElement(By.xpath("/html/body/div[4]/div[2]/md-calendar/div/md-calendar-year/div/md-virtual-repeat-container/div/div[2]/table/tbody[2]/tr[1]/td[3]/span")));
	}
	public static void chooseStartingDate(WebDriver wd) {
		//WaitToLoad.findDynamicElement(wd, By.xpath("/html/body/div[11]/div[2]/md-calendar/div/md-calendar-month/div/md-virtual-repeat-container/div/div[2]/table/tbody[1]/tr[2]/td[2]/span"), 10).click();
		JSClicker.executeJSClick(wd, wd.findElement(By.xpath("/html/body/div[4]/div[2]/md-calendar/div/md-calendar-month/div/md-virtual-repeat-container/div/div[2]/table/tbody[3]/tr[3]/td[3]/span")));
	}
	public static boolean checkIfNextPage(WebDriver wd) {
		String page = WaitToLoad.findDynamicElement(wd, By.xpath("/html/body/div[1]/div[2]/div/md-card/md-content[2]/div/div[1]/div[2]/div/div[3]/div/div/b"), 10).getText();
		clickNextPage(wd);
		String npage = WaitToLoad.findDynamicElement(wd, By.xpath("/html/body/div[1]/div[2]/div/md-card/md-content[2]/div/div[1]/div[2]/div/div[3]/div/div/b"), 10).getText();
		int fpage = (Integer.parseInt(page));
		int lpage = (Integer.parseInt(npage));
		if (++fpage == lpage) {
			return true;
		}
		return false;
	}
	
	public static boolean checkLastPage(WebDriver wd) {
		String page = WaitToLoad.findDynamicElement(wd, By.xpath("/html/body/div[1]/div[2]/div/md-card/md-content[2]/div/div[1]/div[2]/div/div[3]/div/div/b"), 10).getText();
		clickJumpLast(wd);
		String npage = WaitToLoad.findDynamicElement(wd, By.xpath("/html/body/div[1]/div[2]/div/md-card/md-content[2]/div/div[1]/div[2]/div/div[3]/div/div"), 10).getText();
		int fpage = (Integer.parseInt(page));
		
		int lpage = (Integer.parseInt(npage.substring(npage.length()-1)));
		if (fpage == lpage) {
			return true;
		}
		return false;
	}
	public static boolean trainersPerPage(WebDriver wd) {
		//String page = WaitToLoad.findDynamicElement(wd, By.xpath("//*[@id=\"timeline\"]"), 10).getText();
		
		// ^ grabs ton of data. you want to grab the rows of trainer
		
		//System.out.println(page);
		return false;
	}
	public static void chooseRubyFocus(WebDriver wd) {
		//return WaitToLoad.findDynamicElement(wd, By.id("select_option_85"), 10);
		//return WaitToLoad.findDynamicElement(wd, By.xpath("//*[text() = 'Ruby On Rails']"), 10);
		
		//return WaitToLoad.findDynamicElement(wd, By.xpath("//*[@id=\"select_option_85\"]"), 10);
		
//		List<WebElement> allelemts = wd.findElements(By.xpath("//md-option[@id='select_option_0QD']/div"));
//		  for(WebElement ele: allelemts){List<WebElement> allelemts = wd.findElements(By.xpath("
//
//		    wd.findElement(By.xpath("//md-option[@id='select_option_85']")).click();
//
//		    JavascriptExecutor executor = (JavascriptExecutor) wd;
//		    executor.executeScript("arguments[0].click();", ele);
//
//		  }
		// All options div text
		List<WebElement> allelemts = wd.findElements(By.xpath("html/body/div[contains(@class, 'md-select-menu-container md-active')]/md-select-menu/md-content/md-option/div[2]"));
		List<WebElement> allcheckboxes = wd.findElements(By.xpath("html/body/div[contains(@class, 'md-select-menu-container md-active')]/md-select-menu/md-content/md-option"));
//		
//		for (WebElement e : allelemts) {
//			System.out.println("Text should be...");
//			System.out.println(e.getText());
//		}
		
		Actions actions = new Actions(wd);
		for (WebElement e : allelemts) {
			System.out.println("Current selection: " + e.getText());
			if (e.getText().equals("Ruby on Rails")) {
				int target_index = allelemts.indexOf(e);
				System.out.println(target_index);
				if (allcheckboxes.get(target_index).getAttribute("aria-selected").equals("false")) {
					actions.moveToElement(allcheckboxes.get(target_index)).click().perform();
					break;
				}
			}
		}
		// text
		
	}
	
	public static WebElement chooseRestonHQ(WebDriver wd) {
		return WaitToLoad.findDynamicElement(wd, By.id("select_option_113"), 10);
	}
	public static WebElement chooseReston11730(WebDriver wd) {
		return WaitToLoad.findDynamicElement(wd, By.id("select_option_220"), 10);
	}
}
