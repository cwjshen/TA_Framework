package com.revature.tests.vp;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.revature.cukes.trainer.OverviewCukes;
import com.revature.pom.Logout;
import com.revature.util.DriverUtil;
import com.revature.util.LoginUtil;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//Hook Class to run Cucumber Tests
@CucumberOptions(features="src/test/resources/com/revature/features/trainer")
public class VPSuite extends AbstractTestNGCucumberTests{

	public static WebDriver wd = DriverUtil.getChromeDriver();
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("TA Framework Tests");
		try {
			wd.get("https://dev.assignforce.revaturelabs.com");		
			LoginUtil.loginAsVP(wd);
			// Log in as trainer 
//			we should put this login method inside of the overviewcukes.loggedastrainer method no?
			OverviewCukes.isInOverview();
			
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("Logging out");
		Logout.logout(wd).click();
		wd.close();
	}
}