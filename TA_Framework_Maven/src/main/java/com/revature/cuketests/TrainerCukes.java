package com.revature.cuketests;

import org.openqa.selenium.WebDriver;

import com.revature.pom.NavBar;
import com.revature.pom.TrainersTab;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TrainerCukes {

	@Given("^That I am in the Trainers tab$")
	public static void isInTrainers() throws Throwable {
		System.out.println("In Trainers tab");
	}

	@When("^Click the Trainers tab <webdriver>$")
	public static void clickTrainers(WebDriver wd) throws Throwable {
		Thread.sleep(2000);
		NavBar.navigateToTrainersPage(wd).click();
	}

	@Then("^I should see the View PTO Calendar button$")
	public static boolean calendarButtonExists(WebDriver wd) throws Throwable {
		System.out.println("Looking for PTO Calendar button");
		if (TrainersTab.findCalendarButton(wd) != null) {
			return true;
		}
		return false;
	}

	@Then("^Download Resume button <webdriver>$")
	public static boolean downloadResumeButton(WebDriver wd) throws Throwable {
		System.out.println("Looking for download resume button");
		if (TrainersTab.downloadResumeButton(wd) != null) {
			return true;
		}
		return false;
	}

	@When("^Click the View PTO Calendar button <webdriver>$")
	public void clickPtoCalendarButton(WebDriver wd) throws Throwable {
		System.out.println("Clicking PTO Calendar button");
		TrainersTab.findCalendarButton(wd).click();
	}

	@Then("^I should see the PTO Calendar<webdriver>$")
	public void isPtoCalendarOpen(WebDriver wd) throws Throwable {
		System.out.println("Is the calendar open?");
		TrainersTab.isCalendarOpen(wd);
	}

	@Given("^that the PTO calendar is open$")
	public void calendarIsOpen(WebDriver wd) throws Throwable {
		System.out.println("Is the calendar open?");
		TrainersTab.isCalendarOpen(wd);
	}

	@When("^I click the new PTO request button$")
	public void clickAddPtoRequestButton(WebDriver wd) throws Throwable {
		System.out.println("Clicking PTO request button");
		TrainersTab.addPtoRequestButton(wd).click();
	}

	@Then("^A new window should appear which allows the user to enter a start date and an end date$")
	public void ptoRequestWindowOpen(WebDriver wd) throws Throwable {
		System.out.println("Is new request window open");
		TrainersTab.isPtoRequestWindowOpen(wd);
	}

	@When("^I click the cancel button$")
	public void clickCancelButton(WebDriver wd) throws Throwable {
		System.out.println("Clicking the cancel button");
		TrainersTab.cancelButton(wd).click();
	}

	@Then("^The PTO calendar should close$")
	public void ptoCalendarIsClosed(WebDriver wd) throws Throwable {
		System.out.println("PTO calendar should close");
		TrainersTab.addPtoRequestButton(wd).isDisplayed();
	}

	@Then("^I should see the Trainers tab$")
	public void inTrainersTab(WebDriver wd) throws Throwable {
		System.out.println("I should see the trainers tab");
		TrainersTab.findCalendarButton(wd);
	}

	@When("^I click on a trainer <webdriver>$")
	public void clickOnTrainer(WebDriver wd) throws Throwable {
		System.out.println("Click on a trainer");
		TrainersTab.clickTrainer(wd).click();
	}

	@Then("^I should see that trainers profile page<webdriver>$")
	public void trainersProfileShowing(WebDriver wd) throws Throwable {
		System.out.println("Should see trainers profile");
		
	}

	@When("^I click on the download resume button on a given trainer <webdriver>$")
	public void clickOnDownloadResumeButton(WebDriver wd) throws Throwable {
		System.out.println("Click on download resume button");
		TrainersTab.downloadResumeButton(wd).click();
	}

	@Then("^the download should start<webdriver>$")
	public void downloadShouldStart(WebDriver wd) throws Throwable {
		System.out.println("Did the download start");
	}

	@Then("^I should see the file in the download location$")
	public void isTheFileDownloaded(WebDriver wd) throws Throwable {
		System.out.println("Is the file downloaded");
	}
}
