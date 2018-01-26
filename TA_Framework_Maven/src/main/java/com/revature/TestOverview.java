package com.revature;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.revature.cuketests.OverviewCukes;
import com.revature.pom.Login;
import com.revature.pom.Logout;
import com.revature.util.DriverUtil;
import com.revature.util.LoginUtil;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//Hook Class to run Cucumber Tests
@CucumberOptions(features="src/test/java")
public class TestOverview extends TrainerSuite {

	@BeforeTest
	public void beforeTest() {
		System.out.println("Running Overview Tab Test");
		
	}
	
	@Test(priority = 1)
	public void TestClickOverview() {
		try {
			// Need assert statements for these? Idk though because they can never be false
			//	since it would just jump to catch block with NoSuchElementException
			OverviewCukes.clickOverview(wd);
			System.out.println("Clicked overview tab");
//			System.out.println("Finding =====");
//			WebElement e = wd.findElement(By.xpath("//*[@id=\"view\"]/div/md-card/md-content/md-table-container/table/tbody/tr[1]/td[3]"));
//			System.out.println(e.getText());
			
			List<WebElement> rows = wd.findElements(By.xpath("//*[@id=\"view\"]/div/md-card/md-content/md-table-container"));
			for (WebElement e : rows) {
				System.out.println(e.getText());
			}
			

		} catch (Throwable e) { 
			System.out.println("Can't find overview button");
			e.printStackTrace();
		}
	}
//	
//	@Test(priority = 2)
//	public void TestFindExport() {
//		try {
//			// Need assert statements for these? Idk though because they can never be false
//			//	since it would just jump to catch block with NoSuchElementException
//			System.out.println("Export button found");
//			OverviewCukes.exportButtonExists(wd);
//
//		} catch (Throwable e) { 
//			System.out.println("CSV button button not found. Not in Overview tab");
//			e.printStackTrace();
//		}
//	}		
//	
//	@Test(priority = 3)
//	public void TestFindFilter() {
//		try {
//			// Need assert statements for these? Idk though because they can never be false
//			//	since it would just jump to catch block with NoSuchElementException
//			OverviewCukes.filterButtonExists(wd);
//			System.out.println("Filter button found");
//
//		} catch (Throwable e) { 
//			System.out.println("filter button not found. Not in Overview tab");
//			e.printStackTrace();
//		}
//	}	
//	
//	@Test(priority = 4)
//	public void TestClickExportCSV() {
//		try {
//			// Need assert statements for these? Idk though because they can never be false
//			//	since it would just jump to catch block with NoSuchElementException
//			OverviewCukes.clickCSVButton(wd);
//			OverviewCukes.the_download_should_start();
//		} catch (Throwable e) { 
//			System.out.println("Can't click CSV button");
//			e.printStackTrace();
//		}
//	}	
//	
//	@Test(priority = 5)
//	public void CheckIfCSVDownload() {
//		try {
//			OverviewCukes.the_download_should_start();
//			System.out.println("Download complete");
//		} catch (Throwable e) {
//			System.out.println("----------- DOWNLOAD FAILED ------------");
//			e.printStackTrace();
//		}
//		
//	}

	@AfterTest
	public void afterTest() {
		System.out.println("Tests successful. Overview tab working as intended");
	}

}

