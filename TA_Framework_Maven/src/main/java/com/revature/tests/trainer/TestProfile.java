package com.revature.tests.trainer;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.revature.cukes.trainer.ProfileCukes;

public class TestProfile extends TrainerSuite {

	@BeforeTest
	public void beforeTest() {
		System.out.println("Running Profile Tab Test");
	}
	
	@Test (priority = 1)
	public void navigateToProfile() {
		assertTrue(ProfileCukes.clickProfile(wd));
		assertTrue(ProfileCukes.seeFirstAndLast(wd));
		assertTrue(ProfileCukes.seeAddResumeButton(wd));
	}
	
	@Test (priority = 2)
	public void clickfNameBox() {
		assertTrue(ProfileCukes.OnProfileTab(wd));
		assertTrue(ProfileCukes.clickfNameBox(wd));
		assertTrue(ProfileCukes.fNameBoxSelected(wd));
	}
	
	@Test (priority = 3)
	public void populatefNameBox() {
		assertTrue(ProfileCukes.fNameBoxClicked(wd));
		//assertTrue(ProfileCukes.populatefName(wd));
		assertTrue(ProfileCukes.fNamePopulated(wd));
	}
//	
//	@Test (priority = 4)
//	public void clicklNameBox() {
//		
//	}
//	
//	@Test (priority = 5)
//	public void populatelNameBox() {
//		
//	}
//	
//	@Test (priority = 6)
//	public void clickAddResumeButton() {
//		
//	}
//	
//	@Test (priority = 7)
//	public void clickUpdateResumeButton() {
//		
//	}
//	
//	@Test (priority = 8)
//	public void clickAddSkillButton() {
//		
//	}
//	
//	@Test (priority = 9)
//	public void clickRemoveSkillButton() {
//		
//	}
//	
//	@Test (priority = 10)
//	public void clickSaveSkillButton() {
//		
//	}
//	
//	@Test (priority = 11)
//	public void clickAddCertsButton() {
//		
//	}
//	
//	@Test (priority = 12)
//	public void clickCertNameBox() {
//		
//	}
//	
//	@Test (priority = 13)
//	public void populateCertNameBox() {
//		
//	}
//	
//	@Test (priority = 14)
//	public void clickUpdateCertButton() {
//		
//	}
//	
//	@Test (priority = 15)
//	public void clickRemoveCertButton(){
//		
//	}
//	
//	@Test (priority = 16)
//	public void clickCertButton(){
//		
//	}
}
