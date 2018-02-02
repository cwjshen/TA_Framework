package com.revature.webservice;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.testng.ITestNGListener;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.collections.Lists;

import com.revature.tests.vp.TestBatchesVP;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("vp")
public class VPService {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
	
	private static String baseURL = "C:\\Users\\Jason\\Documents\\GitHub\\TA_Framework\\TA_Framework_Maven\\src\\main\\java\\";
	private static String testOutputURL = "C:\\Users\\Jason\\Documents\\GitHub\\TA_Framework\\TA_Framework_Maven\\test-output\\index.html";
	
	@GET
	@Path("/overview")
    public String testOverview() {
		String fileName = "TestNGOverviewVP";
			
		TestListenerAdapter tla = new TestListenerAdapter();
		TestNG testng = new TestNG();
		testng.setOutputDirectory("C:\\Users\\Jason\\Desktop\\test-ouput");
		List<String> suites = Lists.newArrayList();
		suites.add(baseURL + fileName);//path to xml..
		
		ITestNGListener listener = tla;
		testng.addListener(listener);
		
		testng.setTestSuites(suites);
		testng.run();
		
		StringBuffer passed = new StringBuffer();
		for (ITestResult result : ((TestListenerAdapter) listener).getPassedTests()) {
			passed.append(" " + result.getName() + "...passed!<br>");
		}

		StringBuffer failed = new StringBuffer();
		for (ITestResult result : ((TestListenerAdapter) listener).getFailedTests()) {
			failed.append(" " + result.getName() + "...failed :(<br>");
		}		
		
		return "Test complete!<br>" + passed.toString() + "<br>" + failed.toString();
    }
	
	@GET
	@Path("/batches")
    public String testBatches() {
		String fileName = "TestNGBatchesVP";
			
		TestListenerAdapter tla = new TestListenerAdapter();
		TestNG testng = new TestNG();
		testng.setOutputDirectory("C:\\Users\\Jason\\Desktop\\test-ouput");
		List<String> suites = Lists.newArrayList();
		suites.add(baseURL + fileName);//path to xml..
		
		ITestNGListener listener = tla;
		testng.addListener(listener);
		
		testng.setTestSuites(suites);
		testng.run();
		
		StringBuffer passed = new StringBuffer();
		for (ITestResult result : ((TestListenerAdapter) listener).getPassedTests()) {
			passed.append(" " + result.getName() + "...passed!<br>");
		}

		StringBuffer failed = new StringBuffer();
		for (ITestResult result : ((TestListenerAdapter) listener).getFailedTests()) {
			failed.append(" " + result.getName() + "...failed :(<br>");
		}		
		
		return "Test complete!<br>" + passed.toString() + "<br>" + failed.toString();
    }

	@GET
	@Path("/locations")
    public String testLocations() {
		String fileName = "TestNGLocationsVP";
			
		TestListenerAdapter tla = new TestListenerAdapter();
		TestNG testng = new TestNG();
		testng.setOutputDirectory("C:\\Users\\Jason\\Desktop\\test-ouput");
		List<String> suites = Lists.newArrayList();
		suites.add(baseURL + fileName);//path to xml..
		
		ITestNGListener listener = tla;
		testng.addListener(listener);
		
		testng.setTestSuites(suites);
		testng.run();
		
		StringBuffer passed = new StringBuffer();
		for (ITestResult result : ((TestListenerAdapter) listener).getPassedTests()) {
			passed.append(" " + result.getName() + "...passed!<br>");
		}

		StringBuffer failed = new StringBuffer();
		for (ITestResult result : ((TestListenerAdapter) listener).getFailedTests()) {
			failed.append(" " + result.getName() + "...failed :(<br>");
		}		
		
		return "Test complete!<br>" + passed.toString() + "<br>" + failed.toString();
    }

	
	@GET
	@Path("/curricula")
    public String testCurricula() {
		String fileName = "TestNGCurriculaVP";
			
		TestListenerAdapter tla = new TestListenerAdapter();
		TestNG testng = new TestNG();
		testng.setOutputDirectory("C:\\Users\\Jason\\Desktop\\test-ouput");
		List<String> suites = Lists.newArrayList();
		suites.add(baseURL + fileName);//path to xml..
		
		ITestNGListener listener = tla;
		testng.addListener(listener);
		
		testng.setTestSuites(suites);
		testng.run();
		
		StringBuffer passed = new StringBuffer();
		for (ITestResult result : ((TestListenerAdapter) listener).getPassedTests()) {
			passed.append(" " + result.getName() + "...passed!<br>");
		}

		StringBuffer failed = new StringBuffer();
		for (ITestResult result : ((TestListenerAdapter) listener).getFailedTests()) {
			failed.append(" " + result.getName() + "...failed :(<br>");
		}		
		
		return "Test complete!<br>" + passed.toString() + "<br>" + failed.toString();
    }
	

	@GET
	@Path("/trainers")
    public String testTrainers() {
		String fileName = "TestNGTrainersVP";
			
		TestListenerAdapter tla = new TestListenerAdapter();
		TestNG testng = new TestNG();
		testng.setOutputDirectory("C:\\Users\\Jason\\Desktop\\test-ouput");
		List<String> suites = Lists.newArrayList();
		suites.add(baseURL + fileName);//path to xml..
		
		ITestNGListener listener = tla;
		testng.addListener(listener);
		
		testng.setTestSuites(suites);
		testng.run();
		
		StringBuffer passed = new StringBuffer();
		for (ITestResult result : ((TestListenerAdapter) listener).getPassedTests()) {
			passed.append(" " + result.getName() + "...passed!<br>");
		}

		StringBuffer failed = new StringBuffer();
		for (ITestResult result : ((TestListenerAdapter) listener).getFailedTests()) {
			failed.append(" " + result.getName() + "...failed :(<br>");
		}		
		
		return "Test complete!<br>" + passed.toString() + "<br>" + failed.toString();
    }
	
	@GET
	@Path("/settings")
    public String testSettings() {
		String fileName = "TestNGSettingsVP";
			
		TestListenerAdapter tla = new TestListenerAdapter();
		TestNG testng = new TestNG();
		testng.setOutputDirectory("C:\\Users\\Jason\\Desktop\\test-ouput");
		List<String> suites = Lists.newArrayList();
		suites.add(baseURL + fileName);//path to xml..
		
		ITestNGListener listener = tla;
		testng.addListener(listener);
		
		testng.setTestSuites(suites);
		testng.run();
		
		StringBuffer passed = new StringBuffer();
		for (ITestResult result : ((TestListenerAdapter) listener).getPassedTests()) {
			passed.append(" " + result.getName() + "...passed!<br>");
		}

		StringBuffer failed = new StringBuffer();
		for (ITestResult result : ((TestListenerAdapter) listener).getFailedTests()) {
			failed.append(" " + result.getName() + "...failed :(<br>");
		}		
		
		return "Test complete!<br>" + passed.toString() + "<br>" + failed.toString();
    }
	

}
