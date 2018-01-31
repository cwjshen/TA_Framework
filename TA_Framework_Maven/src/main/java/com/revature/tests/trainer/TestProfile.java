package com.revature.tests.trainer;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
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
		assertTrue(ProfileCukes.fNamePopulated(wd));
	}
	
	@Test (priority = 4)
	public void clicklNameBox() {
		assertTrue(ProfileCukes.OnProfileTab(wd));
		assertTrue(ProfileCukes.clicklNameBox(wd));
		assertTrue(ProfileCukes.lNameBoxSelected(wd));
	}
	
	@Test (priority = 5)
	public void populatelNameBox() {
		assertTrue(ProfileCukes.lNameBoxClicked(wd));
		assertTrue(ProfileCukes.lNamePopulated(wd));
	}
	
	@Test (priority = 6)
	public void clickAddResumeButton() throws AWTException {
		assertTrue(ProfileCukes.clickAddResumeButton(wd));
		assertTrue(ProfileCukes.newWindowOpens(wd));
	}
	
	@Test (priority = 7)
	public void clickAddSkillButton() {
		assertTrue(ProfileCukes.clickAddSkill(wd));
	}
	
	@Test (priority = 8)
	public void clickRemoveSkillButton() {
		assertTrue(ProfileCukes.clickOnCurrentSkill(wd));
	}
	
	@Test (priority = 9)
	public void clickSaveSkillButton() {
		assertTrue(ProfileCukes.clickSaveSkills(wd));
	}
	
	@Test (priority = 10)
	public void clickAddCertsButton() throws AWTException {
		assertTrue(ProfileCukes.clickAddCertificationButton(wd));
		assertTrue(ProfileCukes.newWindowOpens(wd));
	}
	
//	@Test (priority = 12)
//	public void clickCertNameBox() {
//		
//	}
	
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
	@Test (priority = 11)
	public void clickRemoveCertButton(){
		assertTrue(ProfileCukes.clickRemoveCertButton(wd));
	}
	
	@Test (priority = 12)
	public void clickCertButton(){
		assertTrue(ProfileCukes.clickOnCert(wd));
	}
}
