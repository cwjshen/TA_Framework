package com.revature.pom.vp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.revature.util.WaitToLoad;

public class OverviewTabVP {
	static WebElement e = null;
	
	public static WebElement findCSVButton(WebDriver d) {
		return WaitToLoad.findDynamicElement(d,By.xpath("html/body/div/div[2]/div/div/md-card/md-toolbar/div[1]/button") , 30);
	}
	public static WebElement findFilterButton(WebDriver d) {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return WaitToLoad.findDynamicElement(d,By.xpath("/html/body/div/div[2]/div/div/md-card/md-toolbar/md-menu/button") , 30);
	}
	public static void clickFilterButton(WebDriver d) {
		WaitToLoad.findDynamicElement(d, By.xpath("/html/body/div/div[2]/div/div/md-card/md-toolbar/md-menu/button") , 30).click();
	}
	public static WebElement findFilterInProgress(WebDriver d) {
		return WaitToLoad.findDynamicElement(d, By.xpath("/html/body/div[3]/md-menu-content/md-menu-item[1]/button") , 30);
	}
	public static WebElement findFilterInTwoWeeks(WebDriver d) {
		return WaitToLoad.findDynamicElement(d, By.xpath("/html/body/div[3]/md-menu-content/md-menu-item[2]/button") , 30);
	}
	public static WebElement findFilterAll(WebDriver d) {
		return WaitToLoad.findDynamicElement(d, By.xpath("/html/body/div[3]/md-menu-content/md-menu-item[3]/button") , 30);
	}
	public static WebElement filterName(WebDriver d) {
		return WaitToLoad.findDynamicElement(d, By.xpath("/html/body/div[1]/div[2]/div/div/md-card/md-content/md-table-container/table/thead/tr/th[1]") , 30);
	}
	public static WebElement filterCurriculum(WebDriver d) {
		return WaitToLoad.findDynamicElement(d, By.xpath("/html/body/div[1]/div[2]/div/div/md-card/md-content/md-table-container/table/thead/tr/th[2]") , 30);
	}
	public static WebElement filterTrainer(WebDriver d) {
		return WaitToLoad.findDynamicElement(d, By.xpath("/html/body/div[1]/div[2]/div/div/md-card/md-content/md-table-container/table/thead/tr/th[3]") , 30);
	}
	public static WebElement filterLocation(WebDriver d) {
		return WaitToLoad.findDynamicElement(d, By.xpath("/html/body/div[1]/div[2]/div/div/md-card/md-content/md-table-container/table/thead/tr/th[4]") , 30);
	}
	public static WebElement filterBuilding(WebDriver d) {
		return WaitToLoad.findDynamicElement(d, By.xpath("/html/body/div[1]/div[2]/div/div/md-card/md-content/md-table-container/table/thead/tr/th[5]") , 30);
	}
	public static WebElement filterRoom(WebDriver d) {
		return WaitToLoad.findDynamicElement(d, By.xpath("/html/body/div[1]/div[2]/div/div/md-card/md-content/md-table-container/table/thead/tr/th[6]") , 30);
	}
	public static WebElement filterStartDate(WebDriver d) {
		return WaitToLoad.findDynamicElement(d, By.xpath("/html/body/div[1]/div[2]/div/div/md-card/md-content/md-table-container/table/thead/tr/th[7]") , 30);
	}
	public static WebElement filterEndDate(WebDriver d) {
		return WaitToLoad.findDynamicElement(d, By.xpath("/html/body/div[1]/div[2]/div/div/md-card/md-content/md-table-container/table/thead/tr/th[8]") , 30);
	}
	public static List<WebElement> getTable(WebDriver d) {
		WebElement table_element = WaitToLoad.findDynamicElement(d, By.xpath("//*[@id=\"view\"]/div/md-card/md-content/md-table-container/table"), 30);
        List<WebElement> rows = table_element.findElements(By.xpath("//*[@id=\"view\"]/div/md-card/md-content/md-table-container/table/tbody/tr"));
        return rows;
	}
	public static List<WebElement> getBatchNames(WebDriver wd) {
		WebElement table_element = WaitToLoad.findDynamicElement(wd, By.xpath("//*[@id=\"view\"]/div/md-card/md-content/md-table-container/table"), 30);
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
	
	public static boolean isInProgress(List<WebElement> Nstart, List<WebElement> Nend, WebDriver wd) {
		boolean done = true;
		List<String> start = new ArrayList<String>();
		for (WebElement col : Nstart) {
			start.add(col.getText());
		}
		start.removeAll(Arrays.asList("", null));
		List<String> end = new ArrayList<String>();
		for (WebElement col : Nend) {
			end.add(col.getText());
		}
		end.removeAll(Arrays.asList("", null));
		
		SimpleDateFormat format=new SimpleDateFormat("MMM. dd, yyyy");  
		Date date = new Date();
		System.out.println(format.format(date));
		
		for (int i=0; i < start.size(); i++) {
			try {
				Date date1=new SimpleDateFormat("MMM. dd, yyyy").parse(start.get(i));
				Date date2=new SimpleDateFormat("MMM. dd, yyyy").parse(end.get(i));
				if (!(date.before(date2)
						&& date.after(date1))) {
					done = false;
				} 
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		return done;
	}
	
	public static boolean isInTwoWeeks(List<WebElement> Nstart, WebDriver wd) {
		Date cdate = new Date();
		int noOfDays = 14;
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(cdate);            
		calendar.add(Calendar.DAY_OF_YEAR, noOfDays);
		Date dateTwoWeeks = calendar.getTime();
		
		boolean done = true;
		List<String> start = new ArrayList<String>();
		for (WebElement col : Nstart) {
			start.add(col.getText());
		}
		start.removeAll(Arrays.asList("", null));
		Date currentDate = new Date();
		
		for (int i=0; i < start.size(); i++) {
			try {
				Date startDate=new SimpleDateFormat("MMM. dd, yyyy").parse(start.get(i));

				if (!(startDate.before(dateTwoWeeks)
						&& startDate.after(currentDate))) {
					done = false;
				} 
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		return done;
	}
	
	public static boolean allBatchesDisplayed(WebDriver wd, List<WebElement> table) {
		boolean compare = true;
		WebElement table_element = WaitToLoad.findDynamicElement(wd, By.xpath("//*[@id=\"view\"]/div/md-card/md-content/md-table-container/table"), 30);
        List<WebElement> rows=table_element.findElements(By.xpath("//*[@id=\"view\"]/div/md-card/md-content/md-table-container/table/tbody/tr"));
        for (int i = 0; i < rows.size(); i++) {
        	if (!(rows.get(i).equals(table.get(i)))) {
        		compare = false;
        	}
        }
        return compare;
	}
}
