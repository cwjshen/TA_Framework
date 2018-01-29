
package com.revature.cukes.trainer;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
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
		NavBar.navigateToOverviewPage(wd).click();
	}

	@Then("^I should see the Export to CSV button$")
	public static boolean exportButtonExists(WebDriver wd) throws Throwable {
		System.out.println("Looking for CSV button");
		if (OverviewTab.findCSVButton(wd) != null) {
			System.out.println("true");
			return true;
		}
		System.out.println("false");
		return false;
	}

	@Then("^Fiter button$")
	public static boolean filterButtonExists(WebDriver wd) throws Throwable {
		System.out.println("Looking for filter button");
		if (OverviewTab.findFilterButton(wd) != null) {
			System.out.println("true");
			return true;
		}
		System.out.println("false");
		return false;	
	}

	@When("^I click the CSV button <webdriver>$")
	public static void clickCSVButton(WebDriver wd) throws Throwable {
		OverviewTab.findCSVButton(wd).click();
	}

	@Then("^The download should start$")
	public static void the_download_should_start() throws Throwable {
		System.out.println("Downloading CSV file...");
		isFileDownloaded("D:\\Users\\Tuan Pham\\Downloads", "batches.csv");

	}

	@Then("^it should be in the download location$")
	public static void it_should_be_in_the_download_location() throws Throwable {
		System.out.println("Deleting CSV file");
	}

	public static boolean isFileDownloaded(String downloadPath, String fileName) {
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
		
		Collections.sort(sorted);

		for (int i = 0; i < names.size(); i++) {
			// If no match return false
			if (!(names.get(i).equals(sorted.get(i)))) {
				isSorted = false;
			}
		}
		return isSorted;
	}
	
	@Then("^If I click the name button again <webdriver>$")
	public static void if_I_click_the_name_button_again(WebDriver wd) throws Throwable {
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
		
		   Collections.sort(sorted, Collections.reverseOrder());
		   
		for (int i = 0; i < names.size(); i++) {
			// If no match return false
			if (!(names.get(i).equals(sorted.get(i)))) {
				isSorted = false;
			}
		}
		return isSorted;
	}
	
	@When("^I click the curriculum button <webdriver>$")
	public static void i_click_the_curriculum_button(WebDriver wd) throws Throwable {
		OverviewTab.filterCurriculum(wd).click();
	}

	@Then("^The curricula should be filtered in ASC order <webdriver>$")
	public static boolean the_curricula_should_be_filtered_in_ASC_order(WebDriver wd) throws Throwable {
		// Get the list of all batch names
		boolean isSorted = true;
		List<String> curr = new ArrayList<String>();
		for (WebElement col : OverviewTab.getCurricula(wd)) {
			curr.add(col.getText());
		}
		curr.removeAll(Arrays.asList("", null));
		// Check if theyre already sorted
		List<String> sorted = new ArrayList<String>();
		for (WebElement col : OverviewTab.getCurricula(wd)) {
			sorted.add(col.getText());
		}
		sorted.removeAll(Arrays.asList("", null));
		
		Collections.sort(sorted);
		
		for (int i = 0; i < curr.size(); i++) {
			// If no match return false
			if (!(curr.get(i).equals(sorted.get(i)))) {
				isSorted = false;
			}
		}
		return isSorted;
	}
	
	@Then("^If I click the curriculum button again <webdriver>$")
	public static void if_I_click_the_curriculum_button_again(WebDriver wd) throws Throwable {
		OverviewTab.filterCurriculum(wd).click();
	}

	@Then("^The curricula should be filtered in DSC order <webdriver>$")
	public static boolean the_curricula_should_be_filtered_in_DSC_order(WebDriver wd) throws Throwable {
		// Get the list of all batch names
		boolean isSorted = true;
		List<String> curr = new ArrayList<String>();
		for (WebElement col : OverviewTab.getCurricula(wd)) {
			curr.add(col.getText());
		}
		curr.removeAll(Arrays.asList("", null));
		
		// Check if theyre already sorted
		List<String> sorted = new ArrayList<String>();
		for (WebElement col : OverviewTab.getCurricula(wd)) {
			sorted.add(col.getText());
		}
		sorted.removeAll(Arrays.asList("", null));
		
		   Collections.sort(sorted, Collections.reverseOrder());
		for (int i = 0; i < curr.size(); i++) {
			// If no match return false
			if (!(curr.get(i).equals(sorted.get(i)))) {
				isSorted = false;
			}
		}
		return isSorted;
	}
	
	@When("^I click the trainer button <webdriver>$")
	public static void i_click_the_trainer_button(WebDriver wd) throws Throwable {
		OverviewTab.filterTrainer(wd).click();
	}

	@Then("^The trainers should be filtered in ASC order <webdriver>$")
	public static boolean the_trainers_should_be_filtered_in_ASC_order(WebDriver wd) throws Throwable {
		// Get the list of all trainer names
		boolean isSorted = true;
		List<String> names = new ArrayList<String>();
		for (WebElement col : OverviewTab.getTrainer(wd)) {
			names.add(col.getText());
		}
		names.removeAll(Arrays.asList("", null));
		
		
		// Check if theyre already sorted
		List<String> sorted = new ArrayList<String>();
		for (WebElement col : OverviewTab.getTrainer(wd)) {
			sorted.add(col.getText());
		}
		sorted.removeAll(Arrays.asList("", null));
		
		Collections.sort(sorted);
		
		
		for (int i = 0; i < names.size(); i++) {
			// If no match return false
			if (!(names.get(i).equals(sorted.get(i)))) {
				isSorted = false;
			}
		}
		return isSorted;
	}
	
	@Then("^If I click the trainer button again <webdriver>$")
	public static void if_I_click_the_trainer_button_again(WebDriver wd) throws Throwable {
		OverviewTab.filterTrainer(wd).click();
	}

	@Then("^The trainers should be filtered in DSC order <webdriver>$")
	public static boolean the_trainers_should_be_filtered_in_DSC_order(WebDriver wd) throws Throwable {
		// Get the list of all batch names
		boolean isSorted = true;
		List<String> names = new ArrayList<String>();
		for (WebElement col : OverviewTab.getTrainer(wd)) {
			names.add(col.getText());
		}
		names.removeAll(Arrays.asList("", null));
		
		// Check if theyre already sorted
		List<String> sorted = new ArrayList<String>();
		for (WebElement col : OverviewTab.getTrainer(wd)) {
			sorted.add(col.getText());
		}
		sorted.removeAll(Arrays.asList("", null));
		
		   Collections.sort(sorted, Collections.reverseOrder());
		for (int i = 0; i < names.size(); i++) {
			// If no match return false
			if (!(names.get(i).equals(sorted.get(i)))) {
				isSorted = false;
			}
		}
		return isSorted;
	}
	
	@When("^I click the location button <webdriver>$")
	public static void i_click_the_location_button(WebDriver wd) throws Throwable {
		OverviewTab.filterLocation(wd).click();
	}

	@Then("^The locations should be filtered in ASC order <webdriver>$")
	public static boolean the_locations_should_be_filtered_in_ASC_order(WebDriver wd) throws Throwable {
		// Get the list of all trainer names
		boolean isSorted = true;
		List<String> names = new ArrayList<String>();
		for (WebElement col : OverviewTab.getLocation(wd)) {
			names.add(col.getText());
		}
		names.removeAll(Arrays.asList("", null));
		
		// Check if theyre already sorted
		List<String> sorted = new ArrayList<String>();
		for (WebElement col : OverviewTab.getLocation(wd)) {
			sorted.add(col.getText());
		}
		sorted.removeAll(Arrays.asList("", null));
		
		Collections.sort(sorted);
		for (int i = 0; i < names.size(); i++) {
			// If no match return false
			if (!(names.get(i).equals(sorted.get(i)))) {
				isSorted = false;
			}
		}
		return isSorted;
	}
	
	@Then("^If I click the location button again <webdriver>$")
	public static void if_I_click_the_location_button_again(WebDriver wd) throws Throwable {
		OverviewTab.filterLocation(wd).click();
	}

	@Then("^The location should be filtered in DSC order <webdriver>$")
	public static boolean the_locations_should_be_filtered_in_DSC_order(WebDriver wd) throws Throwable {
		// Get the list of all batch names
		boolean isSorted = true;
		List<String> names = new ArrayList<String>();
		for (WebElement col : OverviewTab.getLocation(wd)) {
			names.add(col.getText());
		}
		names.removeAll(Arrays.asList("", null));
		
		// Check if theyre already sorted
		List<String> sorted = new ArrayList<String>();
		for (WebElement col : OverviewTab.getLocation(wd)) {
			sorted.add(col.getText());
		}
		sorted.removeAll(Arrays.asList("", null));
		
		   Collections.sort(sorted, Collections.reverseOrder());
		for (int i = 0; i < names.size(); i++) {
			// If no match return false
			if (!(names.get(i).equals(sorted.get(i)))) {
				isSorted = false;
			}
		}
		return isSorted;
	}
	
	@When("^I click the room button <webdriver>$")
	public static void i_click_the_room_button(WebDriver wd) throws Throwable {
		OverviewTab.filterRoom(wd).click();
	}

	@Then("^The rooms should be filtered in ASC order <webdriver>$")
	public static boolean the_rooms_should_be_filtered_in_ASC_order(WebDriver wd) throws Throwable {
		// Get the list of all trainer names
		boolean isSorted = true;
		List<String> names = new ArrayList<String>();
		for (WebElement col : OverviewTab.getRoom(wd)) {
			names.add(col.getText());
		}
		names.removeAll(Arrays.asList("", null));
		
		// Check if theyre already sorted
		List<String> sorted = new ArrayList<String>();
		for (WebElement col : OverviewTab.getRoom(wd)) {
			sorted.add(col.getText());
		}
		sorted.removeAll(Arrays.asList("", null));
		
		Collections.sort(sorted);
		for (int i = 0; i < names.size(); i++) {
			// If no match return false
			if (!(names.get(i).equals(sorted.get(i)))) {
				isSorted = false;
			}
		}
		return isSorted;
	}
	
	@Then("^If I click the room button again <webdriver>$")
	public static void if_I_click_the_room_button_again(WebDriver wd) throws Throwable {
		OverviewTab.filterRoom(wd).click();
	}

	@Then("^The rooms should be filtered in DSC order <webdriver>$")
	public static boolean the_rooms_should_be_filtered_in_DSC_order(WebDriver wd) throws Throwable {
		// Get the list of all batch names
		boolean isSorted = true;
		List<String> names = new ArrayList<String>();
		for (WebElement col : OverviewTab.getRoom(wd)) {
			names.add(col.getText());
		}
		names.removeAll(Arrays.asList("", null));
		
		// Check if theyre already sorted
		List<String> sorted = new ArrayList<String>();
		for (WebElement col : OverviewTab.getRoom(wd)) {
			sorted.add(col.getText());
		}
		sorted.removeAll(Arrays.asList("", null));
		
		   Collections.sort(sorted, Collections.reverseOrder());
		for (int i = 0; i < names.size(); i++) {
			// If no match return false
			if (!(names.get(i).equals(sorted.get(i)))) {
				isSorted = false;
			}
		}
		return isSorted;
	}
	
	@When("^I click the start button <webdriver>$")
	public static void i_click_the_start_button(WebDriver wd) throws Throwable {
		OverviewTab.filterStartDate(wd).click();
	}

	@Then("^The starts should be filtered in ASC order <webdriver>$")
	public static boolean the_start_should_be_filtered_in_ASC_order(WebDriver wd) throws Throwable {
		// Get the list of all trainer names
		boolean isSorted = true;
		List<String> startD = new ArrayList<String>();
		for (WebElement col : OverviewTab.getStartDates(wd)) {
			startD.add(col.getText());
		}
		startD.removeAll(Arrays.asList("", null));
		
		ArrayList<Date> theDates = new ArrayList<Date>();
		for (int i=0; i < startD.size(); i++) {
			Date startDate=new SimpleDateFormat("MMM. dd, yyyy").parse(startD.get(i));
				theDates.add(startDate);
		}

		// Check if theyre already sorted
		List<String> sorted = new ArrayList<String>();
		for (WebElement col : OverviewTab.getStartDates(wd)) {
			sorted.add(col.getText());
		}
		sorted.removeAll(Arrays.asList("", null));
		
		ArrayList<Date> theDatesE = new ArrayList<Date>();
		for (int i=0; i < sorted.size(); i++) {
			Date startDate=new SimpleDateFormat("MMM. dd, yyyy").parse(sorted.get(i));
				theDatesE.add(startDate);
		}
		Collections.sort(theDatesE);
		for (int i = 0; i < theDates.size(); i++) {
			// If no match return false
			if (!(theDates.get(i).equals(theDatesE.get(i)))) {
				isSorted = false;
			}
		}
		return isSorted;
	}
	
	@Then("^If I click the start button again <webdriver>$")
	public static void if_I_click_the_start_button_again(WebDriver wd) throws Throwable {
		OverviewTab.filterStartDate(wd).click();
	}

	@Then("^The starts should be filtered in DSC order <webdriver>$")
	public static boolean the_starts_should_be_filtered_in_DSC_order(WebDriver wd) throws Throwable {
		// Get the list of all batch names
		boolean isSorted = true;
		List<String> names = new ArrayList<String>();
		for (WebElement col : OverviewTab.getStartDates(wd)) {
			names.add(col.getText());
		}
		names.removeAll(Arrays.asList("", null));
		
		ArrayList<Date> theDates = new ArrayList<Date>();
		for (int i=0; i < names.size(); i++) {
			Date startDate=new SimpleDateFormat("MMM. dd, yyyy").parse(names.get(i));
				theDates.add(startDate);
		}
		
		// Check if theyre already sorted
		List<String> sorted = new ArrayList<String>();
		for (WebElement col : OverviewTab.getStartDates(wd)) {
			sorted.add(col.getText());
		}
		sorted.removeAll(Arrays.asList("", null));
		
		ArrayList<Date> theDatesE = new ArrayList<Date>();
		for (int i=0; i < sorted.size(); i++) {
			Date startDate=new SimpleDateFormat("MMM. dd, yyyy").parse(sorted.get(i));
				theDatesE.add(startDate);
		}
		Collections.sort(theDatesE, Collections.reverseOrder());
		for (int i = 0; i < names.size(); i++) {
			// If no match return false
			if (!(theDates.get(i).equals(theDatesE.get(i)))) {
				isSorted = false;
			}
		}
		return isSorted;
	}
	
	@When("^I click the end button <webdriver>$")
	public static void i_click_the_end_button(WebDriver wd) throws Throwable {
		OverviewTab.filterEndDate(wd).click();
	}

	@Then("^The ends should be filtered in ASC order <webdriver>$")
	public static boolean the_ends_should_be_filtered_in_ASC_order(WebDriver wd) throws Throwable {
		// Get the list of all trainer names
		boolean isSorted = true;
		List<String> names = new ArrayList<String>();
		for (WebElement col : OverviewTab.getEndDates(wd)) {
			names.add(col.getText());
		}
		names.removeAll(Arrays.asList("", null));
		
		ArrayList<Date> theDates = new ArrayList<Date>();
		for (int i=0; i < names.size(); i++) {
			Date startDate=new SimpleDateFormat("MMM. dd, yyyy").parse(names.get(i));
				theDates.add(startDate);
		}
		
		// Check if theyre already sorted
		List<String> sorted = new ArrayList<String>();
		for (WebElement col : OverviewTab.getEndDates(wd)) {
			sorted.add(col.getText());
		}
		sorted.removeAll(Arrays.asList("", null));
		
		ArrayList<Date> theDatesE = new ArrayList<Date>();
		for (int i=0; i < sorted.size(); i++) {
			Date startDate=new SimpleDateFormat("MMM. dd, yyyy").parse(sorted.get(i));
				theDatesE.add(startDate);
		}
		Collections.sort(theDatesE);
		for (int i = 0; i < names.size(); i++) {
			// If no match return false
			if (!(theDates.get(i).equals(theDatesE.get(i)))) {
				isSorted = false;
			}
		}
		return isSorted;
	}
	
	@Then("^If I click the end button again <webdriver>$")
	public static void if_I_click_the_end_button_again(WebDriver wd) throws Throwable {
		OverviewTab.filterEndDate(wd).click();
	}

	@Then("^The ends should be filtered in DSC order <webdriver>$")
	public static boolean the_ends_should_be_filtered_in_DSC_order(WebDriver wd) throws Throwable {
		// Get the list of all batch names
		boolean isSorted = true;
		List<String> names = new ArrayList<String>();
		for (WebElement col : OverviewTab.getEndDates(wd)) {
			names.add(col.getText());
		}
		names.removeAll(Arrays.asList("", null));
		
		ArrayList<Date> theDates = new ArrayList<Date>();
		for (int i=0; i < names.size(); i++) {
			Date startDate=new SimpleDateFormat("MMM. dd, yyyy").parse(names.get(i));
				theDates.add(startDate);
		}
		
		// Check if theyre already sorted
		List<String> sorted = new ArrayList<String>();
		for (WebElement col : OverviewTab.getEndDates(wd)) {
			sorted.add(col.getText());
		}
		sorted.removeAll(Arrays.asList("", null));
		
		ArrayList<Date> theDatesE = new ArrayList<Date>();
		for (int i=0; i < sorted.size(); i++) {
			Date startDate=new SimpleDateFormat("MMM. dd, yyyy").parse(sorted.get(i));
				theDatesE.add(startDate);
		}
		Collections.sort(theDatesE, Collections.reverseOrder());
		for (int i = 0; i < names.size(); i++) {
			// If no match return false
			if (!(theDates.get(i).equals(theDatesE.get(i)))) {
				isSorted = false;
			}
		}
		return isSorted;
	}
	
	@When("^I click the building button <webdriver>$")
	public static void i_click_the_building_button(WebDriver wd) throws Throwable {
		OverviewTab.filterBuilding(wd).click();
	}

	@Then("^The buildings should be filtered in ASC order <webdriver>$")
	public static boolean the_buildings_should_be_filtered_in_ASC_order(WebDriver wd) throws Throwable {
		// Get the list of all trainer names
		boolean isSorted = true;
		List<String> names = new ArrayList<String>();
		for (WebElement col : OverviewTab.getBuilding(wd)) {
			names.add(col.getText());
		}
		names.removeAll(Arrays.asList("", null));
		
		// Check if theyre already sorted
		List<String> sorted = new ArrayList<String>();
		for (WebElement col : OverviewTab.getBuilding(wd)) {
			sorted.add(col.getText());
		}
		sorted.removeAll(Arrays.asList("", null));
		
		Collections.sort(sorted);
		for (int i = 0; i < names.size(); i++) {
			// If no match return false
			if (!(names.get(i).equals(sorted.get(i)))) {
				isSorted = false;
			}
		}
		return isSorted;
	}
	
	@Then("^If I click the building button again <webdriver>$")
	public static void if_I_click_the_building_button_again(WebDriver wd) throws Throwable {
		OverviewTab.filterBuilding(wd).click();
	}

	@Then("^The buildings should be filtered in DSC order <webdriver>$")
	public static boolean the_buildings_should_be_filtered_in_DSC_order(WebDriver wd) throws Throwable {
		// Get the list of all batch names
		boolean isSorted = true;
		List<String> names = new ArrayList<String>();
		for (WebElement col : OverviewTab.getBuilding(wd)) {
			names.add(col.getText());
		}
		names.removeAll(Arrays.asList("", null));
		
		// Check if theyre already sorted
		List<String> sorted = new ArrayList<String>();
		for (WebElement col : OverviewTab.getBuilding(wd)) {
			sorted.add(col.getText());
		}
		sorted.removeAll(Arrays.asList("", null));
		
		   Collections.sort(sorted, Collections.reverseOrder());
		for (int i = 0; i < names.size(); i++) {
			// If no match return false
			if (!(names.get(i).equals(sorted.get(i)))) {
				isSorted = false;
			}
		}
		return isSorted;
	}
	
	@When("^I click the filter button <webdriver>$")
	public static void i_click_the_filter_button_webdriver(WebDriver wd) throws Throwable {
		OverviewTab.clickFilterButton(wd);
	}

	@Then("^Three options should show <webdriver>$")
	public static void three_options_should_show_webdriver(WebDriver wd) throws Throwable {
		System.out.println("Filter Button Clicked");
	}

	@Then("^If I click the In Progress button <webdriver>$")
	public static void if_I_click_the_In_Progress_button_webdriver(WebDriver wd) throws Throwable {
		OverviewTab.findFilterInProgress(wd).click();
	}

	@Then("^The batches in progress should display <webdriver>$")
	public static void the_batches_in_progress_should_display_webdriver(WebDriver wd) throws Throwable {
		
	}
	
	@Then("^If I click the In Two Weeks button <webdriver>$")
	public static void if_I_click_the_In_Two_Weeks_button_webdriver(WebDriver wd) throws Throwable {
		OverviewTab.findFilterInTwoWeeks(wd).click();
	}

	@Then("^If I click the All button <webdriver>$")
	public static void if_I_click_the_all_button_webdriver(WebDriver wd) throws Throwable {
		OverviewTab.findFilterAll(wd).click();
	}

	@Then("^The batches in progress should display everything <webdriver>$")
	public static boolean the_batches_in_progress_should_display_everything_webdriver(WebDriver wd) throws Throwable {
		return OverviewTab.isInProgress(OverviewTab.getStartDates(wd), OverviewTab.getEndDates(wd), wd);
	}

	
	public static boolean the_batches_in_two_weeks_should_display(WebDriver wd) throws Throwable {
		return OverviewTab.isInTwoWeeks(OverviewTab.getStartDates(wd), wd);
	}
	
	public static boolean all_batches_should_display(WebDriver wd) throws Throwable {
		return OverviewTab.allBatchesDisplayed(wd, OverviewTab.getBatchNames(wd));
	}
}
