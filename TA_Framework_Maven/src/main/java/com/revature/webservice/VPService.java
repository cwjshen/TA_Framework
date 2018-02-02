package com.revature.webservice;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

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
    public InputStream testOverview() {
		String fileName = "TestNGOverviewVP";
			
		TestListenerAdapter tla = new TestListenerAdapter();
		TestNG testng = new TestNG();
		List<String> suites = Lists.newArrayList();
		suites.add(baseURL + fileName);//path to xml..
		testng.setTestSuites(suites);
		testng.run();

//		String basePath = new File("").getAbsolutePath();
//		System.out.println(basePath);
//		
//		String path = new File("test-output/index.html").getAbsolutePath();
//		System.out.println(path);
//		
//		System.out.println(System.getProperty("user.dir"));
    	File f = new File(testOutputURL);
    	try {
			return new FileInputStream(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
    }
	
	@GET
	@Path("/batches")
    public InputStream testBatches() {
		String fileName = "TestNGBatchesVP";
			
		TestListenerAdapter tla = new TestListenerAdapter();
		TestNG testng = new TestNG();
		List<String> suites = Lists.newArrayList();
		suites.add(baseURL + fileName);//path to xml..
		testng.setTestSuites(suites);
		testng.run();

    	File f = new File(testOutputURL);
    	try {
			return new FileInputStream(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
    }

	@GET
	@Path("/locations")
    public InputStream testLocations() {
		String fileName = "TestNGLocationsVP";
			
		TestListenerAdapter tla = new TestListenerAdapter();
		TestNG testng = new TestNG();
		List<String> suites = Lists.newArrayList();
		suites.add(baseURL + fileName);//path to xml..
		testng.setTestSuites(suites);
		testng.run();

    	File f = new File(testOutputURL);
    	try {
			return new FileInputStream(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
    }

	
	@GET
	@Path("/curricula")
    public InputStream testCurricula() {
		String fileName = "TestNGCurriculaVP";
			
		TestListenerAdapter tla = new TestListenerAdapter();
		TestNG testng = new TestNG();
		List<String> suites = Lists.newArrayList();
		suites.add(baseURL + fileName);//path to xml..
		testng.setTestSuites(suites);
		testng.run();

    	File f = new File(testOutputURL);
    	try {
			return new FileInputStream(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
    }
	

	@GET
	@Path("/trainers")
    public InputStream testTrainers() {
		String fileName = "TestNGTrainersVP";
			
		TestListenerAdapter tla = new TestListenerAdapter();
		TestNG testng = new TestNG();
		List<String> suites = Lists.newArrayList();
		suites.add(baseURL + fileName);//path to xml..
		testng.setTestSuites(suites);
		testng.run();

    	File f = new File(testOutputURL);
    	try {
			return new FileInputStream(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
    }
	
	@GET
	@Path("/settings")
    public InputStream testSettings() {
		String fileName = "TestNGSettingsVP";
			
		TestListenerAdapter tla = new TestListenerAdapter();
		TestNG testng = new TestNG();
		List<String> suites = Lists.newArrayList();
		suites.add(baseURL + fileName);//path to xml..
		testng.setTestSuites(suites);
		testng.run();

    	File f = new File(testOutputURL);
    	try {
			return new FileInputStream(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
    }
	

}
