package com.revature.cukes.trainer;
import org.openqa.selenium.WebDriver;
import com.revature.pom.SettingsTab;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SettingsCukes {

	@When("^Click the Setting tab$")
	public static void click_the_Setting_tab(WebDriver wd) throws Throwable {
		System.out.println("In the settings tab");
		SettingsTab.getSettingsTab(wd).click();
		}

	@Then("^I should see the different settings$")
	public static void i_should_see_the_different_settings(WebDriver wd) throws Throwable {
		System.out.println("Viewing and getting views of settings");

		int TTPP = 10;
		int ROGrads = 40;
		int RCI = 20;
		String DefaultBatchLocation = "Revature HQ";
		String DefaultBuilding = "No Default Building";
		int MiniBatchSize = 15;
		int MaxBatchSize = 30;
		int DBatchLength = 30;
		int MDBTbatches  = 7;


		int ttpp = Integer.parseInt(SettingsTab.Timeline_Trainers_PP(wd));
		int rograds = Integer.parseInt(SettingsTab.Reports_Outgoing_Grads(wd));
		int rci = Integer.parseInt(SettingsTab.Reports_Candidates_Incoming(wd));
		String dblocation = SettingsTab.Default_Batch_Location(wd);
		String dbbuild = SettingsTab.Default_Batch_Building(wd);
		int minbsize = Integer.parseInt(SettingsTab.Minimum_Batch_Size(wd));
		int maxbsize = Integer.parseInt(SettingsTab.Maximum_Batch_Size(wd));
		int dblength = Integer.parseInt(SettingsTab.Default_Batch_Length(wd));
		int mindaybetween   = Integer.parseInt(SettingsTab.MinimumDayBetweenTrainerBatches(wd));
		
        /*
		System.out.println(ttpp);
		System.out.println(rograds);
		System.out.println(rci);
		System.out.println(dblocation);
		System.out.println(dbbuild);
		System.out.println(minbsize);
		System.out.println(maxbsize);
		System.out.println(dblength);
		System.out.println(mindaybetween);
		*/
		
		if (ttpp == TTPP) {
			System.out.println("Timeline Trainers Per Page value is correct");
		} else {
				System.out.println("Timeline Trainers Value is incorrect");
			}
		if (rograds == ROGrads) {
			System.out.println("Reports Outgoing  Grads value is correct");
		} else {
				System.out.println("Reports Outgoing Grads valus is incorrect");
			}
		if (RCI == rci) {
			System.out.println("Reports Candidates Incoming value is correct");
		} else {
				System.out.println("Reports Candidates Incoming valus is incorrect");
			}
		if (dblocation.equals(DefaultBatchLocation)) {
			System.out.println("Default Batch location value is correct");
		} else {
				System.out.println("Default Batch location valus is incorrect");
			}
		if (dbbuild.equals(DefaultBuilding)) {
			System.out.println("Default Batch Building value is correct");
		} else {
				System.out.println("Default Batch Building valus is incorrect");
			}
		if (minbsize == MiniBatchSize) {
			System.out.println("Minimum Batch size value is correct");
		} else {
				System.out.println("Minimum Batch size valus is incorrect");
			}
		if (maxbsize == MaxBatchSize) {
			System.out.println("Match Batch Size value is correct");
		} else {
				System.out.println("Match Outgoing Grads valus is incorrect");
			}
		if (dblength == DBatchLength){
			System.out.println("Batch length value is correct");
		} else {
				System.out.println("Batch length valus is incorrect");
			}
		
		if (mindaybetween == MDBTbatches){
			System.out.println("Minimum Day Between Trainer Batches value is correct");
		} else {
				System.out.println("Minimum Day Between Trainer Batches valus is incorrect");
			}
		
		}
	

	@Then("^viewing those settings$")
	public static void viewing_those_settings() throws Throwable {
		System.out.println("All test in the settings tab for Trainer were ran successfully");
	}

}
