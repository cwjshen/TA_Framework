package com.revature.tests.trainer;
import static org.testng.Assert.fail;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.revature.cukes.trainer.SettingsCukes;


	public class TestSettings extends TrainerSuite {
		

		@BeforeTest 
		public void beforeTest() {
			System.out.println("Running Settings Tab Test");

		}
		
		@Test
		public void TestOne() {
			try {
				// Need assert statements for these? Idk though because they can never be false
				//	since it would just jump to catch block with NoSuchElementException
			SettingsCukes.click_the_Setting_tab(wd);
			SettingsCukes.i_should_see_the_different_settings(wd);
			
			} catch (Throwable e) { 
				e.printStackTrace();
				fail("Error with Settings Tab for Trainer");
			}
		}
		
		

		@AfterTest
		public void afterTest() {
			try {
				SettingsCukes.viewing_those_settings();
			} catch (Throwable e) {
				System.out.println("Error with After Test on the Settings Trainer Tab");
				e.printStackTrace();
			}
		}


	}


