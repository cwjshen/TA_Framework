package com.revature;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.revature.pom.Login;
import com.revature.pom.NavBar;
import com.revature.pom.OverviewTab;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OverviewCukes {
	

	@Given("^That I am in the Overview tab$")
	public static void that_I_am_in_the_Overview_tab() throws Throwable {
		System.out.println("Clicking Overview tab");
	}
	
	@Given("^I am logged in as a trainer$")
	public static void i_am_logged_in_as_a_trainer() throws Throwable {
		System.out.println("Logging in as trainer");
	}

	@When("^Click the Overview tab$")
	public static void click_the_Overview_tab(WebDriver wd) throws Throwable {
		Thread.sleep(2000);
		NavBar.navigateToOverviewPage(wd).click();
	}

	@Then("^I should see the 'Export to CSV' button$")
	public static boolean i_should_see_the_Export_to_CSV_button(WebDriver wd) throws Throwable {
		if (OverviewTab.findCSVButton(wd) != null) {
			return true;
		}
		return false;
	}

	@Then("^'Fiter' button$")
	public static boolean fiter_button(WebDriver wd) throws Throwable {
		if (OverviewTab.findFilterButton(wd) != null) {
			return true;
		}
		return false;	
	}


}
