package com.revature.tests.vp;

import com.revature.pom.vp.VPSettingsTab;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.revature.cukes.vp.VPSettingsCukes;




public class TestingSettingsVP extends VPSuite{
	@BeforeTest
	public void beforeTest() {
		System.out.println("Running Setting VP Test");
	    try {
			VPSettingsCukes.i_want_to_check_the_values_on_the_setting_tab_Webdriver(wd);
			System.out.println("Settings button click");
		} catch (Throwable e) {
			
			e.printStackTrace();
		}
	}

	@Test(priority=1)
	public void changeAllValues() {
	
	try {
		
		VPSettingsCukes.i_click_the_Timeline_Trainers_Per_Page_Webdriver(wd);
		VPSettingsCukes.i_click_reports_outgoing_grads_Webdriver(wd);
		VPSettingsCukes.i_click_reports_candidates_incoming_Webdriver(wd);
		VPSettingsCukes.i_click_default_batch_location_Webdriver(wd);
		VPSettingsCukes.i_click_default_batch_building_Webdriver(wd);
		VPSettingsCukes.i_click_minimum_batch_size_Webdriver(wd);
		VPSettingsCukes.i_click_maximum_batch_size_Webdriver(wd);
		VPSettingsCukes.i_click_default_batch_length_Webdriver(wd);
		VPSettingsCukes.i_click_Minimum_Day_Between_Trainer_Webdriver_VP(wd);
		VPSettingsCukes.i_click_the_save_button_Webdriver(wd);
	} catch (Throwable e) {
		
		e.printStackTrace();
	}
		
		
	}
	
	@Test(priority=2)
	public void checkingSaveValues() {
		System.out.println("Running value check since the values have changed");
	    try {
			VPSettingsCukes.i_want_to_check_the_values_on_the_setting_tab_Webdriver(wd);
			System.out.println("Settings button click again");
		} catch (Throwable e) {
			
			e.printStackTrace();
		}
	}
	
	@Test(priority=3) 
	public void checkingTimeline() {
		
		try {
		    int default_value =7;
			int ttpp = Integer.parseInt(VPSettingsTab.TimelineTrainers_PP(wd));
			if (default_value == ttpp){
				System.out.println("Timeline was successfully updated");
			} else {
			System.out.println("TimeLine was not updated correctly");
			}
			
		} catch (Throwable e) {
			
			e.printStackTrace();
		}
	}
	
	@Test(priority=4) 
	public void checkingReportsOutgoing() {
		
		try {
		    int default_value = 11;
			int ttpp = Integer.parseInt(VPSettingsTab.ReportsOutgoing_Grads(wd));
			if (default_value == ttpp){
				System.out.println("Reports Outgoing Grads updated");
			} else {
			System.out.println("Reports Outgoing Grads updated correctly");
			}
			
		} catch (Throwable e) {
			
			e.printStackTrace();
		}
	}
	
	@Test(priority=5) 
	public void checkingReportsCandidates() {
		
		try {
		    int default_value =12;
			int ttpp = Integer.parseInt(VPSettingsTab.ReportsCandidates_Incoming(wd));
			if (default_value == ttpp){
				System.out.println("Reports Candidates was successfully updated");
			} else {
			System.out.println("Reports Candidates was not updated correctly");
			}
			
		} catch (Throwable e) {
			
			e.printStackTrace();
		}
	}
	
	@Test(priority=6) 
	public void checkingDefaultBatchL() {
		
		try {
		    String default_value = "Revature HQ";
			String ttpp = VPSettingsTab.DefaultBatch_Location(wd);
			if (default_value.equals(ttpp)){
				System.out.println("Default Batch Location was successfully updated");
			} else {
			System.out.println("Default Batch Location was not updated correctly");
			}
			
		} catch (Throwable e) {
			
			e.printStackTrace();
		}
	}
	
	@Test(priority=7) 
	public void checkingDefaultBuilding() {
		
		try {
			String default_value = "No Default Building";
			String  ttpp = VPSettingsTab.DefaultBatch_Building(wd);
			if (default_value.equals(ttpp)){
				System.out.println("Default Building was successfully updated");
			} else {
			System.out.println("Default Building was not updated correctly");
			}
			
		} catch (Throwable e) {
			
			e.printStackTrace();
		}
	}
	
	@Test(priority=8) 
	public void checkingMinimumBatch() {
		
		try {
		    int default_value =30;
			int ttpp = Integer.parseInt(VPSettingsTab.TimelineTrainers_PP(wd));
			if (default_value == ttpp){
				System.out.println("Minimum Batch Size was successfully updated");
			} else {
			System.out.println("Minimum Batch was not updated correctly");
			}
			
		} catch (Throwable e) {
			
			e.printStackTrace();
		}
	}
	
	@Test(priority=9) 
	public void checkingMaximum() {
		
		try {
		    int default_value = 40;
			int ttpp = Integer.parseInt(VPSettingsTab.MaximumBatch_Size(wd));
			if (default_value == ttpp){
				System.out.println("Maximum Batch was successfully updated");
			} else {
			System.out.println("Maximum Batch was not updated correctly");
			}
			
		} catch (Throwable e) {
			
			e.printStackTrace();
		}
	}
	
	@Test(priority=10) 
	public void checkingDefaultBatch() {
		
		try {
		    int default_value = 25;
			int ttpp = Integer.parseInt(VPSettingsTab.DefaultBatch_Length(wd));
			if (default_value == ttpp){
				System.out.println("Default Batch Length was successfully updated");
			} else {
			System.out.println("Default Batch Length was not updated correctly");
			}
			
		} catch (Throwable e) {
			
			e.printStackTrace();
		}
	}
	
	@Test(priority=11) 
	public void checkingDefaulTDay() {
		
		try {
		    int default_value = 61;
			int ttpp = Integer.parseInt(VPSettingsTab.MinimumDayBetweenTrainer_Batches(wd));
			if (default_value == ttpp){
				System.out.println("Default Batch Length was successfully updated");
			} else {
			System.out.println("Default Batch Length was not updated correctly");
			}
			
		} catch (Throwable e) {
			
			e.printStackTrace();
		}
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("Settings VP Test Complete");
	}
	

}
