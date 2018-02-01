package com.revature.cukes.vp;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.ui.Select;

import com.revature.pom.vp.CurriculaTabVP;
import com.revature.util.JSClicker;

public class CurriculaCukesVP {
	
	@Given("^I want to click on the curricula tab <webdriver>$")
	public static void i_want_to_click_on_the_curricula_tab_webdriver(WebDriver wd) throws Throwable {
		//
		CurriculaTabVP.getCurriculaTabVP(wd).click();
	    String default_curricula = "CURRICULA";
	    String value_of_select  = CurriculaTabVP.getCurriculaTabValueVP(wd);
	    
	    if (default_curricula.equals(value_of_select)) {
	    	System.out.println("Your in the correct tab of Curricula");
	    }
	}

	@Given("^Check the first tab button to make sure it works <webdriver>$")
	public static void check_the_first_tab_button_to_make_sure_it_works_webdriver(WebDriver wd) throws Throwable {
		CurriculaTabVP.getCoreArrow(wd).click();
	   
	}

	@When("^I click the button it should toggle up or down <webdriver>$")
	public static void i_click_the_button_it_should_toggle_up_or_down_webdriver(WebDriver wd) throws Throwable {
		CurriculaTabVP.getFocusArrow(wd).click();
	}

	@Then("^I click the other toggle button <webdriver>$")
	public static void i_click_the_other_toggle_button_webdriver(WebDriver wd) throws Throwable {
	    CurriculaTabVP.getSkillsArrow(wd).click();
	}

	@Given("^then I got to the bottom of the page in curricula<webdriver>$")
	public static void then_I_got_to_the_bottom_of_the_page_in_curricula_webdriver(WebDriver wd) throws Throwable {
		CurriculaTabVP.getCoreArrow(wd).click();
		   
	}

	@When("^I click the skills button to add skills in curricula <webdriver>$")
	public static void i_click_the_skills_button_to_add_skills_in_curricula_webdriver(WebDriver wd) throws Throwable {
		CurriculaTabVP.getFocusArrow(wd).click();
		CurriculaTabVP.getSkillsArrow(wd).click();
		CurriculaTabVP.getSkillName(wd).sendKeys(".ANDRIOD");
	    CurriculaTabVP.getCreateButton(wd).click();	 
	    CurriculaTabVP.getCurriculaTabVP(wd).click();
	   
	}

	@When("^then I click the create button in curricula<webdriver>$")
	public static void then_I_click_the_create_button_in_curricula_webdriver(WebDriver wd) throws Throwable {
		CurriculaTabVP.addButtonCore(wd).click();
	}

	@Then("^I click the plus button to add new curricula <webdriver>$")
	public static void i_click_the_plus_button_to_add_new_curricula_webdriver(WebDriver wd) throws Throwable {
		CurriculaTabVP.addButtonCore(wd).click();
		CurriculaTabVP.addCoreCurriculmName(wd).clear();
		CurriculaTabVP.addCoreCurriculmName(wd).sendKeys("ADVANCE SKILLS");
		CurriculaTabVP.clickSkillsButton(wd).click();
		CurriculaTabVP.selectCoreCurriculmName(wd).click();
		CurriculaTabVP.selectCoreCurriculmName2(wd).click();
		CurriculaTabVP.selectCoreCurriculmName3(wd).click();
		CurriculaTabVP.randomClick(wd).click();
		CurriculaTabVP.selectSave(wd).click();
	}

	@Then("^I re-click the tab buttons curricula<webdriver>$")
	public static void i_re_click_the_tab_buttons_curricula_webdriver(WebDriver wd) throws Throwable {
	    
		CurriculaTabVP.getCoreArrow(wd).click();
	}

	@Given("^I click the plus button <webdriver>$")
	public void i_click_the_plus_button_webdriver() throws Throwable {
	   
	}

	@When("^I add the Curriculum Name <webdriver>$")
	public static void i_add_the_Curriculum_Name_webdriver(WebDriver wd) throws Throwable {
		CurriculaTabVP.editButtonCurricula(wd).click();
		CurriculaTabVP.addCoreCurriculmName(wd).clear();
		CurriculaTabVP.addCoreCurriculmName(wd).sendKeys("ADVANCE SKILLS");
		CurriculaTabVP.clickSkillsButton(wd).click();
		CurriculaTabVP.editCoreCurriculmName(wd).click();
		CurriculaTabVP.editCoreCurriculmName2(wd).click();
		CurriculaTabVP.randomClick(wd).click();
		CurriculaTabVP.selectSave(wd).click();
		
	   
	}

	@Then("^I select a skill <webdriver>$")
	public void i_select_a_skill_webdriver() throws Throwable {
	   
	}

	@Then("^I click the save button to save the new curricula <webdriver>$")
	public static void i_click_the_save_button_to_save_the_new_curricula_webdriver(WebDriver wd) throws Throwable {
		CurriculaTabVP.deletFocuCurricula(wd).click();
		CurriculaTabVP.confirmDeleteFocus(wd).click();
	   
	}

	@Then("^I click the delete button in curricula <webdriver>$")
	public static void i_click_the_delete_button_in_curricula_webdriver(WebDriver wd) throws Throwable {
		CurriculaTabVP.deletCorCurricula(wd).click();
		CurriculaTabVP.confirmDeleteFocus(wd).click();
	    
	}

	@Then("^I click the edit button in curricula<webdriver>$")
	public static void i_click_the_edit_button_in_curricula_webdriver(WebDriver wd) throws Throwable {
		CurriculaTabVP.editFocus(wd).click();
		CurriculaTabVP.clickSkillsButton(wd).click();
		CurriculaTabVP.editfocusCurriculmName(wd).click();
		CurriculaTabVP.editfocusCurriculmName2(wd).click();
		CurriculaTabVP.randomClick(wd).click();
	    CurriculaTabVP.selectSave(wd).click();
		 
	}

	@Then("^I change the curricula <webdriver>$")
	public static void i_change_the_curricula_webdriver(WebDriver wd) throws Throwable {
		CurriculaTabVP.editButtonCurricula(wd).click();
	    CurriculaTabVP.addCoreCurriculmName(wd).clear();
	    CurriculaTabVP.addCoreCurriculmName(wd).sendKeys(".NET");
	    CurriculaTabVP.selectCoreCurriculmName(wd);
	    CurriculaTabVP.randomClick(wd);
	    CurriculaTabVP.selectSave(wd);
	}

	@Then("^I change the skills curricula<webdriver>$")
	public void i_change_the_skills_curricula_webdriver() throws Throwable {
	    
	}

	@Then("^I save the changes curricula<webdriver>$")
	public void i_save_the_changes_curricula_webdriver() throws Throwable {
	   
	}

	@Then("^I reload the page curricula<webdriver>$")
	public static void i_reload_the_page_curricula_webdriver(WebDriver wd) throws Throwable {
	   CurriculaTabVP.getCurriculaTabVP(wd).click();
	}



}
