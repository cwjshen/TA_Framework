package com.revature;

import java.io.File;

import org.openqa.selenium.WebDriver;
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

import com.revature.pom.Login;
import com.revature.pom.Logout;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//Hook Class to run Cucumber Tests
@CucumberOptions(features="src/test/java")
public class TestRunner extends AbstractTestNGCucumberTests {

	static WebDriver wd = null;
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("TA Framework Tests");

		try {
			File f1 = new File("src/main/resources/chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", f1.getAbsolutePath());
			wd = new ChromeDriver();
			wd.get("https://dev.assignforce.revaturelabs.com");
			
			OverviewCukes.that_I_am_in_the_Overview_tab();
			OverviewCukes.i_am_logged_in_as_a_trainer();
			// Log in as trainer
			Login.user(wd).sendKeys("test.trainer@revature.com.int1");
			Thread.sleep(1000);
			Login.password(wd).sendKeys("trainer123");
			Thread.sleep(1000);
			Login.signin(wd).submit();

			// Log in as VP
//			Login.user(wd).sendKeys("test.vpoftech@revature.com.int1");
//			Thread.sleep(1000);
//			Login.password(wd).sendKeys("p@$$w0rd1");
//			Thread.sleep(1000);
//			Login.signin(wd).submit();

		} catch(Exception e){
			e.printStackTrace();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Running Overview Tab Test");

	}

	@Test
	public void TestOne() {
		try {
			OverviewCukes.click_the_Overview_tab(wd);
			System.out.println("Looking for CSV button");
			OverviewCukes.i_should_see_the_Export_to_CSV_button(wd);
			System.out.println("Looking for filter button");
			OverviewCukes.fiter_button(wd);

		} catch (Throwable e) {
			System.out.println("CSV button/ filter button not found. Not in Overview tab");
			e.printStackTrace();
		}
	}
	
	
	@AfterTest
	public void afterTest() {
		System.out.println("Tests successful. Overview tab working as intended");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("Logging out");
		Logout.logout(wd);
		wd.close();
	}
}
