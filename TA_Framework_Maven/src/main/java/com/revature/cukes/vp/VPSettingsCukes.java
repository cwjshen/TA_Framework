package com.revature.cukes.vp;
import org.openqa.selenium.WebDriver;

import com.revature.pom.vp.VPSettingsTab;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class VPSettingsCukes {

	@Given("^I want to check the values on the setting tab <Webdriver>$")
	public static void i_want_to_check_the_values_on_the_setting_tab_Webdriver(WebDriver wd) throws Throwable {
		VPSettingsTab.getSettingsTabVP(wd).click();	
	}

	@When("^I click the Timeline Trainers Per Page <Webdriver>$")
	public static String i_click_the_Timeline_Trainers_Per_Page_Webdriver(WebDriver wd) throws Throwable {
		//clearing settings
		VPSettingsTab.Timeline_Trainers_PP_VP(wd).clear();
		//using random values 
		VPSettingsTab.Timeline_Trainers_PP_VP(wd).sendKeys("7");
		//get value of value that was changed
		String timeline =  VPSettingsTab.Timeline_Trainers_PP_VP(wd).getText();
		return timeline;
	}

	@When("^I click reports outgoing grads<Webdriver>$")
	public static String i_click_reports_outgoing_grads_Webdriver(WebDriver wd) throws Throwable {
		//clearing settings
		VPSettingsTab.Reports_Outgoing_Grads_VP(wd).clear();
		//using random values
		VPSettingsTab.Reports_Outgoing_Grads_VP(wd).sendKeys("11");
		String Outgoing_Grads = VPSettingsTab.Reports_Outgoing_Grads_VP(wd).getText();
		return Outgoing_Grads;
	}

	@When("^I click reports candidates incoming <Webdriver>$")
	public static String i_click_reports_candidates_incoming_Webdriver(WebDriver wd) throws Throwable {
		// clearing values
		VPSettingsTab.Reports_Candidates_Incoming_VP(wd).clear();
		//using random values
		VPSettingsTab.Reports_Candidates_Incoming_VP(wd).sendKeys("12");
		String ReportsCandidates = VPSettingsTab.Reports_Candidates_Incoming_VP(wd).getText();
		return ReportsCandidates;
	}

	@When("^I click default batch location <Webdriver>$")
	public static String i_click_default_batch_location_Webdriver(WebDriver wd) throws Throwable {
		//using random values
		String batch = VPSettingsTab.Default_Batch_Location_VP(wd).getAttribute("value");
		return batch;
	}

	@When("^I click default batch building <Webdriver>$")
	public static String i_click_default_batch_building_Webdriver(WebDriver wd) throws Throwable {
		String building = VPSettingsTab.Default_Batch_Building_VP(wd).getAttribute("value"); 
		return building;
	}

	@When("^I click minimum batch size <Webdriver>$")
	public static String i_click_minimum_batch_size_Webdriver(WebDriver wd) throws Throwable {
		//using clear to clear values
		VPSettingsTab.Minimum_Batch_Size_VP(wd).clear();
		//using random values
		VPSettingsTab.Minimum_Batch_Size_VP(wd).sendKeys("30");
		String MinimumBatchSize = VPSettingsTab.Minimum_Batch_Size_VP(wd).getText();
		return MinimumBatchSize;
	}

	@When("^I click maximum batch size <Webdriver>$")
	public static String i_click_maximum_batch_size_Webdriver(WebDriver wd) throws Throwable {
		//clear settings
		VPSettingsTab.Maximum_Batch_Size_VP(wd).clear();
		//using random values
		VPSettingsTab.Maximum_Batch_Size_VP(wd).sendKeys("40");
		String MaximumBatchSize = VPSettingsTab.Maximum_Batch_Size_VP(wd).getText(); 
		return MaximumBatchSize;
	}

	@When("^I click default batch length<Webdriver>$")
	public static String i_click_default_batch_length_Webdriver(WebDriver wd) throws Throwable {
		//clear settings
		VPSettingsTab.Default_Batch_Length_VP(wd).clear();
		//using random values
		VPSettingsTab.Default_Batch_Length_VP(wd).sendKeys("25");
		String DefaultBLength = VPSettingsTab.Default_Batch_Length_VP(wd).getText(); 
		return DefaultBLength;

	}

	@When("^I click Minimum Day Between Trainer<Webdriver>$")
	public static String i_click_Minimum_Day_Between_Trainer_Webdriver_VP(WebDriver wd) throws Throwable {
		//clear settings
		VPSettingsTab.MinimumDayBetweenTrainerBatches_VP(wd).clear();
		//using random values
		VPSettingsTab.MinimumDayBetweenTrainerBatches_VP(wd).sendKeys("61");
		String MiniumDayBetween = VPSettingsTab.Default_Batch_Length_VP(wd).getText(); 
		return MiniumDayBetween;
	}



	@Then("^I click the save button  <Webdriver>$")
	public static  void i_click_the_save_button_Webdriver(WebDriver wd) throws Throwable {
		//click the save button to save values entered
		VPSettingsTab.SaveButton(wd).click();
	}

}
