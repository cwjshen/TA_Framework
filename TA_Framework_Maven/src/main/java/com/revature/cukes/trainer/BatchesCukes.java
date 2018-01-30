package com.revature.cukes.trainer;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.revature.pom.BatchesTab;
import com.revature.pom.NavBar;
import com.revature.pom.BatchesTab;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class BatchesCukes {
	
	@Given("^I am in Batches$")
	public static void i_am_in_Batches(WebDriver wd) throws Throwable {
		NavBar.navigateToBatchesPage(wd).click();
	}

	@Then("^I should see All Batches text$")
	public static boolean i_should_see_All_Batches_text(WebDriver wd) throws Throwable {
		try {
			BatchesTab.batchesTag(wd);
			return true;
		} catch(Throwable e) {
			return false;
		}
	}

	@Given("^I click the name button batches<webdriver>$")
	public static void i_click_the_name_button_webdriver(WebDriver wd) throws Throwable {
		BatchesTab.nameFilter(wd).click();
	}

	@Then("^The names should be filtered in ASC order batches <webdriver>$")
	public static boolean the_names_should_be_filtered_in_ASC_order_webdriver(WebDriver wd) throws Throwable {
		// Get the list of all batch names
		boolean isSorted = true;
		List<String> names = new ArrayList<String>();
		for (WebElement col : BatchesTab.getBatchNames(wd)) {
			names.add(col.getText());
		}
		names.removeAll(Arrays.asList("", null));
		
//		System.out.println("Original-----");
//		for (String e : names) {
//			System.out.println(e);
//		}
		// Check if theyre already sorted
		List<String> sorted = new ArrayList<String>(names);
//		for (WebElement col : BatchesTab.getBatchNames(wd)) {
//			sorted.add(col.getText());
//		}
		//sorted.removeAll(Arrays.asList("", null));
		
		Collections.sort(sorted);

		
//		System.out.println("sorted-----");
//		for (String e : sorted) {
//			System.out.println(e);
//		}
		for (int i = 0; i < names.size(); i++) {
			// If no match return false
			if (!(names.get(i).equals(sorted.get(i)))) {
				isSorted = false;
			}
		}
		return isSorted;
	}

	@Then("^If I click the name button again batches <webdriver>$")
	public static void if_I_click_the_name_button_again_webdriver(WebDriver wd) throws Throwable {
		BatchesTab.nameFilter(wd).click();
	}
	

	@Then("^The names should be filtered in DSC order batches <webdriver>$")
	public static boolean the_names_should_be_filtered_in_DSC_order_webdriver(WebDriver wd) throws Throwable {
		// Get the list of all batch names
				boolean isSorted = true;
				List<String> names = new ArrayList<String>();
				for (WebElement col : BatchesTab.getBatchNames(wd)) {
					names.add(col.getText());
				}
				names.removeAll(Arrays.asList("", null));
				
				// Check if theyre already sorted
				List<String> sorted = new ArrayList<String>(names);
//				for (WebElement col : BatchesTab.getBatchNames(wd)) {
//					sorted.add(col.getText());
//				}
//				sorted.removeAll(Arrays.asList("", null));
				
				   Collections.sort(sorted, Collections.reverseOrder());
				   
				for (int i = 0; i < names.size(); i++) {
					// If no match return false
					if (!(names.get(i).equals(sorted.get(i)))) {
						isSorted = false;
					}
				}
				return isSorted;
	}

	@Given("^I click the curriculum button batches <webdriver>$")
	public static void i_click_the_curriculum_button_webdriver(WebDriver wd) throws Throwable {
		BatchesTab.curriculumFilter(wd).click();
	}

	@Then("^The curricula should be filtered in ASC order batches <webdriver>$")
	public static boolean the_curricula_should_be_filtered_in_ASC_order_webdriver(WebDriver wd) throws Throwable {
		// Get the list of all batch names
				boolean isSorted = true;
				List<String> curr = new ArrayList<String>();
				for (WebElement col : BatchesTab.getCurricula(wd)) {
					curr.add(col.getText());
				}
				curr.removeAll(Arrays.asList("", null));
				// Check if theyre already sorted
				List<String> sorted = new ArrayList<String>();
				for (WebElement col : BatchesTab.getCurricula(wd)) {
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

	@Then("^If I click the curriculum button again batches <webdriver>$")
	public static void if_I_click_the_curriculum_button_again_webdriver(WebDriver wd) throws Throwable {
		BatchesTab.curriculumFilter(wd).click();
	}

	@Then("^The curricula should be filtered in DSC order batches <webdriver>$")
	public static boolean the_curricula_should_be_filtered_in_DSC_order_webdriver(WebDriver wd) throws Throwable {
		// Get the list of all batch names
		boolean isSorted = true;
		List<String> curr = new ArrayList<String>();
		for (WebElement col : BatchesTab.getCurricula(wd)) {
			curr.add(col.getText());
		}
		curr.removeAll(Arrays.asList("", null));
		
		// Check if theyre already sorted
		List<String> sorted = new ArrayList<String>();
		for (WebElement col : BatchesTab.getCurricula(wd)) {
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

	@Given("^I click the trainer button batches <webdriver>$")
	public static void i_click_the_trainer_button_webdriver(WebDriver wd) throws Throwable {
		BatchesTab.trainerFilter(wd).click();
	}

	@Then("^The trainers should be filtered in ASC order batches <webdriver>$")
	public static boolean the_trainers_should_be_filtered_in_ASC_order_webdriver(WebDriver wd) throws Throwable {
		// Get the list of all trainer names
				boolean isSorted = true;
				List<String> names = new ArrayList<String>();
				for (WebElement col : BatchesTab.getTrainer(wd)) {
					names.add(col.getText());
				}
				names.removeAll(Arrays.asList("", null));
				
				
				// Check if theyre already sorted
				List<String> sorted = new ArrayList<String>();
				for (WebElement col : BatchesTab.getTrainer(wd)) {
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

	@Then("^If I click the trainer button again batches <webdriver>$")
	public static void if_I_click_the_trainer_button_again_webdriver(WebDriver wd) throws Throwable {
		BatchesTab.trainerFilter(wd).click();
	}

	@Then("^The trainer should be filtered in DSC order batches <webdriver>$")
	public static boolean the_trainer_should_be_filtered_in_DSC_order_webdriver(WebDriver wd) throws Throwable {
		// Get the list of all batch names
				boolean isSorted = true;
				List<String> names = new ArrayList<String>();
				for (WebElement col : BatchesTab.getTrainer(wd)) {
					names.add(col.getText());
				}
				names.removeAll(Arrays.asList("", null));
				
				// Check if theyre already sorted
				List<String> sorted = new ArrayList<String>();
				for (WebElement col : BatchesTab.getTrainer(wd)) {
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

	@Given("^I click the location button batches <webdriver>$")
	public static void i_click_the_location_button_webdriver(WebDriver wd) throws Throwable {
		BatchesTab.locationFilter(wd).click();
	}

	@Then("^The locations should be filtered in ASC order batches <webdriver>$")
	public static boolean the_locations_should_be_filtered_in_ASC_order_webdriver(WebDriver wd) throws Throwable {
		// Get the list of all trainer names
		boolean isSorted = true;
		List<String> names = new ArrayList<String>();
		for (WebElement col : BatchesTab.getLocation(wd)) {
			names.add(col.getText());
		}
		names.removeAll(Arrays.asList("", null));
		
		// Check if theyre already sorted
		List<String> sorted = new ArrayList<String>();
		for (WebElement col : BatchesTab.getLocation(wd)) {
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

	@Then("^If I click the locations button again batches <webdriver>$")
	public static void if_I_click_the_locations_button_again_webdriver(WebDriver wd) throws Throwable {
		BatchesTab.locationFilter(wd).click();
	}

	@Then("^The locations should be filtered in DSC order batches <webdriver>$")
	public static boolean the_locations_should_be_filtered_in_DSC_order_webdriver(WebDriver wd) throws Throwable {
		// Get the list of all batch names
		boolean isSorted = true;
		List<String> names = new ArrayList<String>();
		for (WebElement col : BatchesTab.getLocation(wd)) {
			names.add(col.getText());
		}
		names.removeAll(Arrays.asList("", null));
		
		// Check if theyre already sorted
		List<String> sorted = new ArrayList<String>();
		for (WebElement col : BatchesTab.getLocation(wd)) {
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

	@Given("^I click the building button batches <webdriver>$")
	public static void i_click_the_building_button_webdriver(WebDriver wd) throws Throwable {
		BatchesTab.buildingFilter(wd).click();
	}

	@Then("^The buildings should be filtered in ASC order batches <webdriver>$")
	public static boolean the_buildings_should_be_filtered_in_ASC_order_webdriver(WebDriver wd) throws Throwable {
		// Get the list of all trainer names
				boolean isSorted = true;
				List<String> names = new ArrayList<String>();
				for (WebElement col : BatchesTab.getBuilding(wd)) {
					names.add(col.getText());
				}
				names.removeAll(Arrays.asList("", null));
				
				// Check if theyre already sorted
				List<String> sorted = new ArrayList<String>();
				for (WebElement col : BatchesTab.getBuilding(wd)) {
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

	@Then("^If I click the building button again batches <webdriver>$")
	public static void if_I_click_the_building_button_again_webdriver(WebDriver wd) throws Throwable {
		BatchesTab.buildingFilter(wd).click();
	}

	@Then("^The buildings should be filtered in DSC order batches <webdriver>$")
	public static boolean the_buildings_should_be_filtered_in_DSC_order_webdriver(WebDriver wd) throws Throwable {
		// Get the list of all batch names
				boolean isSorted = true;
				List<String> names = new ArrayList<String>();
				for (WebElement col : BatchesTab.getBuilding(wd)) {
					names.add(col.getText());
				}
				names.removeAll(Arrays.asList("", null));
				
				// Check if theyre already sorted
				List<String> sorted = new ArrayList<String>();
				for (WebElement col : BatchesTab.getBuilding(wd)) {
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

	@Given("^I click the room button batches <webdriver>$")
	public static void i_click_the_room_button_webdriver(WebDriver wd) throws Throwable {
		BatchesTab.roomFilter(wd).click();
	}

	@Then("^The rooms should be filtered in ASC order batches <webdriver>$")
	public static boolean the_rooms_should_be_filtered_in_ASC_order_webdriver(WebDriver wd) throws Throwable {
		// Get the list of all trainer names
				boolean isSorted = true;
				List<String> names = new ArrayList<String>();
				for (WebElement col : BatchesTab.getRoom(wd)) {
					names.add(col.getText());
				}
				names.removeAll(Arrays.asList("", null));
				
				// Check if theyre already sorted
				List<String> sorted = new ArrayList<String>();
				for (WebElement col : BatchesTab.getRoom(wd)) {
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

	@Then("^If I click the room button again batches <webdriver>$")
	public static void if_I_click_the_room_button_again_webdriver(WebDriver wd) throws Throwable {
		BatchesTab.roomFilter(wd).click();
	}

	@Then("^The rooms should be filtered in DSC order batches <webdriver>$")
	public static boolean the_rooms_should_be_filtered_in_DSC_order_webdriver(WebDriver wd) throws Throwable {
		// Get the list of all batch names
				boolean isSorted = true;
				List<String> names = new ArrayList<String>();
				for (WebElement col : BatchesTab.getRoom(wd)) {
					names.add(col.getText());
				}
				names.removeAll(Arrays.asList("", null));
				
				// Check if theyre already sorted
				List<String> sorted = new ArrayList<String>();
				for (WebElement col : BatchesTab.getRoom(wd)) {
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

	@Given("^I click the start button batches <webdriver>$")
	public static void i_click_the_start_button_webdriver(WebDriver wd) throws Throwable {
		BatchesTab.startFilter(wd).click();
	}

	@Then("^The start dates should be filtered in ASC order batches <webdriver>$")
	public static boolean the_start_dates_should_be_filtered_in_ASC_order_webdriver(WebDriver wd) throws Throwable {
		// Get the list of all trainer names
				boolean isSorted = true;
				List<String> startD = new ArrayList<String>();
				for (WebElement col : BatchesTab.getStartDates(wd)) {
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
				for (WebElement col : BatchesTab.getStartDates(wd)) {
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

	@Then("^If I click the start button again batches <webdriver>$")
	public static void if_I_click_the_start_button_again_webdriver(WebDriver wd) throws Throwable {
		BatchesTab.startFilter(wd).click();
	}

	@Then("^The start dates should be filtered in DSC order batches <webdriver>$")
	public static boolean the_start_dates_should_be_filtered_in_DSC_order_webdriver(WebDriver wd) throws Throwable {
		// Get the list of all batch names
				boolean isSorted = true;
				List<String> names = new ArrayList<String>();
				for (WebElement col : BatchesTab.getStartDates(wd)) {
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
				for (WebElement col : BatchesTab.getStartDates(wd)) {
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

	@Given("^I click the end button batches <webdriver>$")
	public static void i_click_the_end_button_webdriver(WebDriver wd) throws Throwable {
		BatchesTab.endFilter(wd).click();
	}

	@Then("^The end dates should be filtered in ASC order batches <webdriver>$")
	public static boolean the_end_dates_should_be_filtered_in_ASC_order_webdriver(WebDriver wd) throws Throwable {
		// Get the list of all trainer names
				boolean isSorted = true;
				List<String> names = new ArrayList<String>();
				for (WebElement col : BatchesTab.getEndDates(wd)) {
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
				for (WebElement col : BatchesTab.getEndDates(wd)) {
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

	@Then("^If I click the end button again batches <webdriver>$")
	public static void if_I_click_the_end_button_again_webdriver(WebDriver wd) throws Throwable {
		BatchesTab.endFilter(wd).click();
	}

	@Then("^The end dates should be filtered in DSC order batches <webdriver>$")
	public static boolean the_end_dates_should_be_filtered_in_DSC_order_webdriver(WebDriver wd) throws Throwable {
		// Get the list of all batch names
				boolean isSorted = true;
				List<String> names = new ArrayList<String>();
				for (WebElement col : BatchesTab.getEndDates(wd)) {
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
				for (WebElement col : BatchesTab.getEndDates(wd)) {
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
}
