package com.revature.cuketests;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.revature.pom.Login;
import com.revature.pom.NavBar;
import com.revature.pom.OverviewTab;
import com.revature.util.LoginUtil;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OverviewCukes {
	

	@Given("^That I am in the Overview tab$")
	public static void isInOverview() throws Throwable {
		System.out.println("In Overview tab");
	}
	
	@Given("^I am logged in as a trainer$")
	public static void loggedAsTrainer(WebDriver wd) throws Throwable {
		System.out.println("Logged in as trainer");
	}

	@When("^Click the Overview tab$")
	public static void clickOverview(WebDriver wd) throws Throwable {
		Thread.sleep(2000);
		NavBar.navigateToLocationsPage(wd).click();
	}

	@Then("^I should see the Export to CSV button$")
	public static boolean exportButtonExists(WebDriver wd) throws Throwable {
		System.out.println("Looking for CSV button");
		if (OverviewTab.findCSVButton(wd) != null) {
			return true;
		}
		return false;
	}

	@Then("^Fiter button$")
	public static boolean filterButtonExists(WebDriver wd) throws Throwable {
		System.out.println("Looking for filter button");
		if (OverviewTab.findFilterButton(wd) != null) {
			return true;
		}
		return false;	
	}


}
