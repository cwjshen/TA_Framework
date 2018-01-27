package com.revature.cuketests;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.revature.pom.NavBar;
import com.revature.pom.OverviewTab;
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
		NavBar.navigateToOverviewPage(wd).click();
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

	@When("^I click the CSV button <webdriver>$")
	public static void clickCSVButton(WebDriver wd) throws Throwable {
		Thread.sleep(2000);
		OverviewTab.findCSVButton(wd).click();
	}

	@Then("^The download should start$")
	public static void the_download_should_start() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Downloading CSV file...");
		isFileDownloaded("D:\\Users\\Tuan Pham\\Downloads", "batches.csv");

	}

	@Then("^it should be in the download location$")
	public static void it_should_be_in_the_download_location() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Deleting CSV file");
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
	
	@When("^I click the name button <webdriver>$")
	public static void i_click_the_name_button(WebDriver wd) throws Throwable {
		Thread.sleep(2000);
		OverviewTab.filterName(wd).click();
	}

	@Then("^The names should be filtered in ASC order <webdriver>$")
	public static boolean the_names_should_be_filtered_in_ASC_order(WebDriver wd) throws Throwable {
		// Get the list of all batch names
		boolean isSorted = true;
		List<String> names = new ArrayList<String>();
		for (WebElement col : OverviewTab.getBatchNames(wd)) {
			names.add(col.getText());
		}
		names.removeAll(Arrays.asList("", null));
		
		// Check if theyre already sorted
		List<String> sorted = new ArrayList<String>();
		for (WebElement col : OverviewTab.getBatchNames(wd)) {
			sorted.add(col.getText());
		}
		sorted.removeAll(Arrays.asList("", null));
		
		Collections.sort(names);
		for (int i = 0; i < names.size(); i++) {
			// If no match return false
			if (!(names.get(i).equals(sorted.get(i)))) {
				isSorted = false;
			}
		}
//		System.out.println("----NAMES IN ASC----");
//		for (String e : names) {
//			System.out.println(e);
//		}
		
		return isSorted;
	}
	
	

	@Then("^If I click the name button again <webdriver>$")
	public static void if_I_click_the_name_button_again(WebDriver wd) throws Throwable {
		Thread.sleep(2000);
		OverviewTab.filterName(wd).click();
	}

	@Then("^The names should be filtered in DSC order <webdriver>$")
	public static boolean the_names_should_be_filtered_in_DSC_order(WebDriver wd) throws Throwable {
		// Get the list of all batch names
		boolean isSorted = true;
		List<String> names = new ArrayList<String>();
		for (WebElement col : OverviewTab.getBatchNames(wd)) {
			names.add(col.getText());
		}
		names.removeAll(Arrays.asList("", null));
		
		// Check if theyre already sorted
		List<String> sorted = new ArrayList<String>();
		for (WebElement col : OverviewTab.getBatchNames(wd)) {
			sorted.add(col.getText());
		}
		sorted.removeAll(Arrays.asList("", null));
		
		   Collections.sort(names, Collections.reverseOrder());
		for (int i = 0; i < names.size(); i++) {
			// If no match return false
			if (!(names.get(i).equals(sorted.get(i)))) {
				isSorted = false;
			}
		}
		System.out.println("----NAMES IN DSC----");
		for (String e : names) {
			System.out.println(e);
		}
		
		return isSorted;
	}
}
