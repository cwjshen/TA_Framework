package com.revature.tests.trainer;

import static org.testng.Assert.fail;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.revature.cukes.trainer.CurriculaCukes;

public class TestCurricula extends TrainerSuite {
	

	@BeforeTest 
	public void beforeTest() {
		System.out.println("Running Curricula Tab Test");

	}
	
	@Test
	public void TestOne() {
		try {
			// testing Curricula Cukes
		 CurriculaCukes.i_want_to_display_content(wd);
		 CurriculaCukes.someone_press_one_of_the_two_tabs_button(wd);
		} catch (Throwable e) { 
			fail("Error with Settings Tab for Trainer");
			e.printStackTrace();
		}
	}
	
	
	@AfterTest
	public void afterTest() {
		try {
	       CurriculaCukes.display_completed_tab(wd);
		} catch (Throwable e) {
			System.out.println("Error with After Test on the Curricula Trainer Tab");
			e.printStackTrace();
		}
	}


}
	
	
	

