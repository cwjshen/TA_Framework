package com.revature;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.revature.cuketests.OverviewCukes;
import com.revature.pom.Logout;
import com.revature.util.DriverUtil;
import com.revature.util.LoginUtil;

import cucumber.api.testng.AbstractTestNGCucumberTests;

public class TrainerSuite extends AbstractTestNGCucumberTests{

	static WebDriver wd = DriverUtil.getChromeDriver();
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("TA Framework Tests");
		try {
			wd.get("https://dev.assignforce.revaturelabs.com");		
			LoginUtil.loginAsTrainer(wd);
			// Log in as trainer 
//			we should put this login method inside of the overviewcukes.loggedastrainer method no?
			OverviewCukes.loggedAsTrainer(wd);
			OverviewCukes.isInOverview();
			
			// Log in as VP
//			LoginUtil.loginAsVP(wd);
			
		} catch (Throwable e) {
			// TODO Auto-generated catch block
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
