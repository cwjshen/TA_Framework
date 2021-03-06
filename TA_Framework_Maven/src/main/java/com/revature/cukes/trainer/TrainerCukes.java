package com.revature.cukes.trainer;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.revature.pom.NavBar;
import com.revature.pom.ProfileTab;
import com.revature.pom.TrainersTab;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TrainerCukes {

	@Given("^That I am in the Trainers tab$")
	public static boolean isInTrainers(WebDriver wd) {
		try {
			Thread.sleep(1000);
			TrainersTab.findCalendarButton(wd);
			return true;
		} catch (Throwable e) {
			e.printStackTrace();
			System.out.println("I am not in the Trainers tab");
			return false;
		}

	}

	@When("^Click the Trainers tab$")
	public static boolean clickTrainers(WebDriver wd) {
		try {
			Thread.sleep(1000);
			NavBar.navigateToTrainersPage(wd).click();
			Thread.sleep(1000);
			return true;
		} catch (Throwable e) {
			e.printStackTrace();
			System.out.println("Trainers tab was not clicked");
			return false;
		}

	}

	@Then("^I should see the View PTO Calendar button$")
	public static boolean calendarButtonExists(WebDriver wd) {
		try {
			Thread.sleep(1000);
			TrainersTab.findCalendarButton(wd);
			return true;
		} catch (Throwable e) {
			System.out.println("View PTO Calendar button is not appearing");
			return false;
		}

	}

	@Then("^Download Resume button$")
	public static boolean downloadResumeButton(WebDriver wd) {
		try {
			TrainersTab.downloadResumeButton(wd);
			return true;
		} catch (Throwable e) {
			System.out.println("I do not see the download resume button");
			return false;
		}

	}

	@When("^Click the View PTO Calendar button$")
	public static boolean clickPtoCalendarButton(WebDriver wd) {
		try {
			Thread.sleep(1000);
			TrainersTab.findCalendarButton(wd).click();
			Thread.sleep(1000);
			return true;

		} catch (Throwable e) {
			System.out.println("Calendar button was not clicked work");
			e.printStackTrace();
			return false;
		}
	}

	@Then("^I should see the PTO Calendar$")
	public static boolean isPtoCalendarOpen(WebDriver wd) {
		try {
			Thread.sleep(1000);
			TrainersTab.isCalendarOpen(wd);
			Thread.sleep(1000);
			return true;

		} catch (Throwable e) {
			System.out.println("Calendar button doesn't work");
			e.printStackTrace();
			return false;
		}
	}

	@Given("^that the PTO calendar is open$")
	public static boolean calendarIsOpen(WebDriver wd) {
		try {
			Thread.sleep(1000);
			TrainersTab.isCalendarOpen(wd);
			Thread.sleep(1000);
			return true;

		} catch (Throwable e) {
			System.out.println("Calendar button is not open");
			e.printStackTrace();
			return false;
		}
	}

	@When("^I click the new PTO request button$")
	public static boolean clickAddPtoRequestButton(WebDriver wd) {
		try {
			Thread.sleep(1000);
			TrainersTab.addPtoRequestButton(wd);
			Thread.sleep(1000);
			return true;
		} catch (Throwable e) {
			System.out.println("New PTO request button was not clicked");
			e.printStackTrace();
			return false;
		}
	}

	@Then("^A new window should appear which allows the user to enter a start date and an end date$")
	public static boolean ptoRequestWindowOpen(WebDriver wd) {
		try {
			Thread.sleep(1000);
			TrainersTab.isPtoRequestWindowOpen(wd);
			Thread.sleep(1000);
			return true;
		} catch (Throwable e) {
			System.out.println("New PTO Request button doesn't work");
			e.printStackTrace();
			return false;
		}
	}
		

	@When("^I click the cancel PTO request button$")
	public static boolean clickCancelRequestButton(WebDriver wd) {
		try {
			TrainersTab.cancelRequestButton(wd);
			Thread.sleep(1000);
			return true;
		} catch (Throwable e) {
			System.out.println("Cancel PTO Request button was not clicked");
			e.printStackTrace();
			return false;
		}
	}

	@When("^I click the cancel button$")
	public static boolean clickCancelButton(WebDriver wd) {
		try {
			Thread.sleep(1000);
			TrainersTab.cancelButton(wd);
			Thread.sleep(1000);
			return true;
		} catch (Throwable e) {
			System.out.println("Cancel button on PTO calendar window was not clicked");
			e.printStackTrace();
			return false;
		}
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
	public static boolean clickOnTrainer(WebDriver wd) {
		try {
			Thread.sleep(1000);
			TrainersTab.clickTrainer(wd).click();
			Thread.sleep(2000);
			wd.navigate().back();
			return true;
		} catch (Throwable e) {
			e.printStackTrace();
			return false;
		}
	}

	@Then("^I should see that trainers profile page$")
	public static void trainersProfileShowing(WebDriver wd) throws Throwable {
		System.out.println("Should see trainers profile");
		System.out.println(wd
				.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-content[1]/md-list/md-list-item[6]/div[1]/button"))
				.getText());
	}

	@When("^I click on the download resume button on a given trainer$")
	public static boolean clickOnDownloadResumeButton(WebDriver wd) {
		try {
			Thread.sleep(1000);
			TrainersTab.clickDownloadButton(wd);
			Thread.sleep(1000);
			return true;
		} catch (Throwable e) {
			e.printStackTrace();
			return false;
		}
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
	public static boolean clickOnStartDate(WebDriver wd) {
		try {
			TrainersTab.requestStartDate(wd);
			Thread.sleep(1000);
			return true;
		} catch (Throwable e) {
			e.printStackTrace();
			return false;
		}
	}

	@When("^I click on a start date$")
	public static boolean pickStartDate(WebDriver wd) {
		try {
			TrainersTab.pickStartYear(wd);
			Thread.sleep(1000);
			TrainersTab.pickStartDate(wd);
			return true;
		} catch (Throwable e) {
			e.printStackTrace();
			return false;
		}
	}

	@When("^I click on the end date input field$")
	public static boolean clickOnEndDate(WebDriver wd) {
		try {
			TrainersTab.requestEndDate(wd);
			Thread.sleep(1000);
			return true;
		} catch (Throwable e) {
			e.printStackTrace();
			return false;
		}
	}

	@When("^I click on an end date$")
	public static boolean pickEndDate(WebDriver wd) {
		try {
			TrainersTab.pickEndYear(wd);
			Thread.sleep(1000);
			TrainersTab.pickEndDate(wd);
			Thread.sleep(1000);
			return true;
		} catch (Throwable e) {
			e.printStackTrace();
			return false;
		}

	}

	@When("^I click on send request$")
	public static boolean clickSendRequestButton(WebDriver wd) {
		try {
			System.out.println("clicking send request button");
			Thread.sleep(1000);
			TrainersTab.sendRequestButton(wd);
			Thread.sleep(2000);
			wd.navigate().back();
			TrainerCukes.clickPtoCalendarButton(wd);
			Thread.sleep(1000);
			TrainerCukes.clickAddPtoRequestButton(wd);
			Thread.sleep(1000);
			TrainerCukes.clickOnStartDate(wd);
			Thread.sleep(1000);
			TrainerCukes.pickStartDate(wd);
			Thread.sleep(1000);
			TrainerCukes.clickOnEndDate(wd);
			Thread.sleep(1000);
			TrainerCukes.pickEndDate(wd);
			Thread.sleep(1000);
			return true;
		} catch (Throwable e) {
			e.printStackTrace();
			return false;
		}
	}
}
