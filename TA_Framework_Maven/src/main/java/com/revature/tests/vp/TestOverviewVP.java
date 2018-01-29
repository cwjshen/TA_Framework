package com.revature.tests.vp;

import org.testng.annotations.BeforeSuite;

import com.revature.cukes.trainer.OverviewCukes;
import com.revature.tests.trainer.TestOverview;
import com.revature.util.LoginUtil;

public class TestOverviewVP extends TestOverview {

	@Override
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("TA Framework Tests");
		try {
			wd.get("https://dev.assignforce.revaturelabs.com");		
			LoginUtil.loginAsVP(wd);
			// Log in as trainer 
//			we should put this login method inside of the overviewcukes.loggedastrainer method no?
			OverviewCukes.isInOverview();
			
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
	
}
