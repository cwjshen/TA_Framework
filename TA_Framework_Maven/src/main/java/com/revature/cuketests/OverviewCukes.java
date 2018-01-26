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
	
	@When("^I click the CSV button$")
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
			// TODO Auto-generated catch block
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


}
