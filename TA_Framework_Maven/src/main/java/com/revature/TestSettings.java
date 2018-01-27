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
import com.revature.util.DriverUtil;
import com.revature.util.LoginUtil;
import com.revature.cuketests.SettingsCukes;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


	//Hook Class to run Cucumber Tests
	@CucumberOptions(features="src/test/java")
	public class TestSettings  extends TrainerSuite {
		

		@BeforeTest 
		public void beforeTest() {
			System.out.println("Running Settings Tab Test");

		}
		
		@Test
		public void TestOne() {
			try {
				// Need assert statements for these? Idk though because they can never be false
				//	since it would just jump to catch block with NoSuchElementException
			SettingsCukes.click_the_Setting_tab(wd);
			SettingsCukes.i_should_see_the_different_settings(wd);
			
			} catch (Throwable e) { 
				System.out.println("Error with Settings Tab for Trainer");
				e.printStackTrace();
			}
		}
		
		

		@AfterTest
		public void afterTest() {
			try {
				SettingsCukes.viewing_those_settings();
			} catch (Throwable e) {
				System.out.println("Error with After Test on the Settings Trainer Tab");
				e.printStackTrace();
			}
		}


	}


