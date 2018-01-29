package com.revature.cukes.trainer;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.revature.pom.NavBar;
import com.revature.pom.TrainersTab;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TrainerCukes {

	@Given("^That I am in the Trainers tab$")
	public static void isInTrainers(WebDriver wd) throws Throwable {
		System.out.println("In Trainers tab");
		TrainersTab.findCalendarButton(wd);
	}

	@When("^Click the Trainers tab$")
	public static void clickTrainers(WebDriver wd) throws Throwable {
		Thread.sleep(2000);
		NavBar.navigateToTrainersPage(wd).click();
	}

	@Then("^I should see the View PTO Calendar button$")
	public static void calendarButtonExists(WebDriver wd) throws Throwable {
		System.out.println("Looking for PTO Calendar button");
		TrainersTab.findCalendarButton(wd);
	}

	@Then("^Download Resume button$")
	public static boolean downloadResumeButton(WebDriver wd) throws Throwable {
		System.out.println("Looking for download resume button");
		if (TrainersTab.downloadResumeButton(wd) != null) {
			return true;
		}
		return false;
	}

	@When("^Click the View PTO Calendar button$")
	public static void clickPtoCalendarButton(WebDriver wd) throws Throwable {
		System.out.println("Clicking PTO Calendar button");
		Thread.sleep(1000);
		TrainersTab.findCalendarButton(wd).click();
	}

	@Then("^I should see the PTO Calendar$")
	public static void isPtoCalendarOpen(WebDriver wd) throws Throwable {
		System.out.println("Is the calendar open?");
		TrainersTab.isCalendarOpen(wd);
	}

	@Given("^that the PTO calendar is open$")
	public static void calendarIsOpen(WebDriver wd) throws Throwable {
		System.out.println("Is the calendar open?");
		TrainersTab.isCalendarOpen(wd);
	}

	@When("^I click the new PTO request button$")
	public static void clickAddPtoRequestButton(WebDriver wd) throws Throwable {
		System.out.println("Clicking PTO request button");
		TrainersTab.addPtoRequestButton(wd);
	}

	@Then("^A new window should appear which allows the user to enter a start date and an end date$")
	public static void ptoRequestWindowOpen(WebDriver wd) throws Throwable {
		System.out.println("Is new request window open");
		TrainersTab.isPtoRequestWindowOpen(wd);
	}
	
	@When("^I click the cancel PTO request button$")
	public static void clickCancelRequestButton(WebDriver wd) throws Throwable {
		System.out.println("Clicking the cancel request button");
		TrainersTab.cancelRequestButton(wd);
	}

	@When("^I click the cancel button$")
	public static void clickCancelButton(WebDriver wd) throws Throwable {
		System.out.println("Clicking the cancel button");
		TrainersTab.cancelButton(wd);
	}

	@Then("^The PTO calendar should close$")
	public static void ptoCalendarIsClosed(WebDriver wd) throws Throwable {
		System.out.println("PTO calendar should close");
		TrainersTab.addPtoRequestButton(wd);
	}

	@Then("^I should see the Trainers tab$")
	public static void inTrainersTab(WebDriver wd) throws Throwable {
		System.out.println("I should see the trainers tab");
		TrainersTab.findCalendarButton(wd);
	}

	@When("^I click on a trainer$")
	public static void clickOnTrainer(WebDriver wd) throws Throwable {
		System.out.println("Click on a trainer");
		TrainersTab.clickTrainer(wd).click();
	}

	@Then("^I should see that trainers profile page$")
	public static void trainersProfileShowing(WebDriver wd) throws Throwable {
		System.out.println("Should see trainers profile");
		System.out.println(wd
				.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-content[1]/md-list/md-list-item[6]/div[1]/button"))
				.getText());
	}

	@When("^I click on the download resume button on a given trainer$")
	public static void clickOnDownloadResumeButton(WebDriver wd) throws Throwable {
		System.out.println("Click on download resume button");
		TrainersTab.downloadResumeButton(wd).click();
	}

	@Then("^the download should start$")
	public static void downloadShouldStart(WebDriver wd) throws Throwable {
		System.out.println("Did the download start");
		isFileDownloaded("C:\\Downloads", "resume.pdf");
	}

	public static boolean isFileDownloaded(String downloadPath, String fileName) {
		try {
			Thread.sleep(2000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		File dir = new File(downloadPath);
		File[] dirContents = dir.listFiles();

		for (int i = 0; i < dirContents.length; i++) {
			if (dirContents[i].getName().equals(fileName)) {
				// File has been found, it can now be deleted:
				System.out.println("Downloaded file found. Deleting file...");
				dirContents[i].delete();
				return true;
			}
		}
		return false;
	}

	@Then("^I should see the file in the download location$")
	public static void isTheFileDownloaded(WebDriver wd) throws Throwable {
		System.out.println("Deleting the file");
	}
	
	@When("^I click on the start date input field$")
	public static void clickOnStartDate(WebDriver wd) throws Throwable {
		System.out.println("Click on start date field");
		TrainersTab.requestStartDate(wd);
	}

	@When("^I click on a start date$")
	public static void pickStartDate(WebDriver wd) throws Throwable {
		System.out.println("Click on a start date");
		TrainersTab.pickStartYear(wd);
		Thread.sleep(1000);
		TrainersTab.pickStartDate(wd);
	}
	
	@When("^I click on the end date input field$")
	public static void clickOnEndDate(WebDriver wd) throws Throwable {
		System.out.println("Click on start date field");
		TrainersTab.requestEndDate(wd);
	}
	
	@When("^I click on an end date$")
	public static void pickEndDate(WebDriver wd) throws Throwable {
		System.out.println("Click on a start date");
		TrainersTab.pickEndYear(wd);
		Thread.sleep(1000);
		TrainersTab.pickEndDate(wd);
	}
	
	@When("^I click on send request$")
	public static void clickSendRequestButton(WebDriver wd) throws Throwable {
		System.out.println("Click send request");
		TrainersTab.sendRequestButton(wd);
	}
}
