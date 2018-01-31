package com.revature.tests.vp;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.revature.pom.vp.CurriculaTabVP;
import com.revature.pom.vp.VPSettingsTab;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.revature.cukes.vp.CurriculaCukesVP;


public class TestCurriculaVP extends VPSuite {
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Running Curricula VP Test");
	    try {
			CurriculaCukesVP.i_want_to_click_on_the_curricula_tab_webdriver(wd);
		} catch (Throwable e) {
			
			e.printStackTrace();
		}
	}

	@Test(priority=1)
	public void checkClickTab() {
	
	try {
		CurriculaCukesVP.check_the_first_tab_button_to_make_sure_it_works_webdriver(wd);
	} catch (Throwable e) {
		
		e.printStackTrace();
	}
		
		
	}
	
	@Test(priority=2)
	public void secondClickTab() {
		
	    try {
	    	CurriculaCukesVP.i_click_the_button_it_should_toggle_up_or_down_webdriver(wd);
		} catch (Throwable e) {
			
			e.printStackTrace();
		}
	}
	
	@Test(priority=3) 
	public void thirdClickTab() {
		
		try {
			CurriculaCukesVP.i_click_the_other_toggle_button_webdriver(wd);
			System.out.println("All buttons click successfully");
		} catch (Throwable e) {
			
			e.printStackTrace();
		}
	}
	
	@Test(priority=4) 
	public void addingSkills() {
		
		try {
			CurriculaCukesVP.i_click_the_skills_button_to_add_skills_in_curricula_webdriver(wd);
			System.out.println("Successfully added skills");//Due to the number of skills being added this may process or not
			
		} catch (Throwable e) {
			
			e.printStackTrace();
		}
	}
	
	@Test(priority=5) 
	public void AddingNewC() {
	
		
		try {
			CurriculaCukesVP.i_click_the_plus_button_to_add_new_curricula_webdriver(wd);
			
		} catch (Throwable e) {
			
			e.printStackTrace();
		}
	}

	@Test(priority=6) 
	public void editingContent() {
	
		
		try {
		CurriculaCukesVP.i_re_click_the_tab_buttons_curricula_webdriver(wd);
		CurriculaCukesVP.i_add_the_Curriculum_Name_webdriver(wd);
			
		} catch (Throwable e) {
			
			e.printStackTrace();
		}
	}

	@Test(priority=7) 
	public void editingFocus() {
	
		
		try {
		CurriculaCukesVP.i_click_the_edit_button_in_curricula_webdriver(wd);
			
		} catch (Throwable e) {
			
			e.printStackTrace();
		}
		
	}

	@Test(priority=8) 
	public void deletingCurricula() {
		
		try {
		CurriculaCukesVP.i_reload_the_page_curricula_webdriver(wd);
		CurriculaCukesVP.i_click_the_delete_button_in_curricula_webdriver(wd);
			
		} catch (Throwable e) {
			
			e.printStackTrace();
		}
		
	}
	
	
	@Test(priority=9) 
	public void deletingFocus() {
		
		try {
			CurriculaCukesVP.i_click_the_save_button_to_save_the_new_curricula_webdriver(wd);
			CurriculaCukesVP.i_reload_the_page_curricula_webdriver(wd);
		} catch (Throwable e) {
			
			e.printStackTrace();
		}
		
	}
	
	
	@AfterTest
	public void afterTest() {
		System.out.println("Curricula VP Test Complete");
	}
	

}
