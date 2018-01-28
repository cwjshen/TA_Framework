package com.revature.cuketests;

import org.openqa.selenium.WebDriver;

import com.revature.pom.NavBar;
import com.revature.pom.ReportsTab;
import com.revature.pom.TrainersTab;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ReportsCukes {

	@Given("^That I am in the Reports tab$")
	public static void isInReports() throws Throwable {
		System.out.println("In Trainers tab");
	}

	@Given("^I'm logged in as a trainer <webdriver>$")
	public static void loggedAsTrainer(WebDriver wd) throws Throwable {
		System.out.println("Logged in as trainer");
	}

	@When("^Click the Reports tab <webdriver>$")
	public static void clickReports(WebDriver wd) throws Throwable {
		Thread.sleep(2000);
		NavBar.navigateToReportsPage(wd).click();
	}

	@Then("^I should see the Add new card button<webdriver>$")
	public static boolean addNewCardButton(WebDriver wd) throws Throwable {
		System.out.println("Looking for add new card button");
		if (ReportsTab.addNewCardButton(wd) != null) {
			return true;
		}
		return false;
	}

	@Then("^Export to CSV button <webdriver>$")
	public static void graduateExportToCSVButton(WebDriver wd) throws Throwable {
		
	}

}
