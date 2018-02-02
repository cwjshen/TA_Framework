package com.revature.webservice;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.collections.Lists;

import com.revature.tests.vp.TestBatchesVP;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
	
	@GET
    public InputStream getIt() {
			
//		TestListenerAdapter tla = new TestListenerAdapter();
		TestNG testng = new TestNG();
		List<String> suites = Lists.newArrayList();
		suites.add("C:\\Users\\Jason\\Documents\\GitHub\\TA_Framework\\TA_Framework_Maven\\src\\main\\java\\TestNGCurricula");//path to xml..
		testng.setTestSuites(suites);
		testng.run();

//		String basePath = new File("").getAbsolutePath();
//		System.out.println(basePath);
//		
//		String path = new File("test-output/index.html").getAbsolutePath();
//		System.out.println(path);
//		
//		System.out.println(System.getProperty("user.dir"));
    	File f = new File("C:\\SpringToolSuite\\Workspace\\TA_Framework_WebService\\test-output\\index.html");
    	try {
			return new FileInputStream(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
    }
    

}
