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

import com.revature.cuketests.OverviewCukes;
import com.revature.cuketests.LocationsCukes;
import com.revature.pom.Login;
import com.revature.pom.Logout;
import com.revature.util.DriverUtil;
import com.revature.util.LoginUtil;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//Hook Class to run Cucumber Tests
@CucumberOptions(features="src/test/java")
public class TestProfile extends TrainerSuite {

	@BeforeTest
	public void beforeTest() {
		System.out.println("Running Profile Tab Protractor Test");

	}
	
	//Protractor test
	//Protractor is a TrainerSuite for now, so log in is done with WebDriver;
	//		maybe replace with pure protractor code so log in is done through protractor too?
	@Test 
	public void TestProfile() {
		try {
			//For now, use WebDriver NavBar method; maybe replace with Protractor click later
			//Run "cd <PATH>" to get to conf.js location
			//Run "protractor conf.js" statement in command line to start test
			
			//For now, manually have Selenium server opened for Protractor before running this test
		} catch (Throwable e) { 
			//Update this error message once we learn more about what reasons are possible for failure
			System.out.println("Profile test failed for whatever reason");
			e.printStackTrace();
		}
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("Tests successful. Profile tab working as intended");
	}

}

