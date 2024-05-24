package roughlearningselenium;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

	public class ExtentReport {

//LearnExtentReport 
		
		public static void main(String[] args) throws IOException {
			
		
			
			/*
			 * ExtentHtmlReporter, ExtentLoggerReporter The ExtentHtmlReporter and ExtentLoggerReporter were 
			 * deprecated in series 4.1.x and have been removed in version 5. 
			 * The replacement is ExtentSparkReporter, which is comprehensive, ports all features along with a 
			 * host of new ones.

				ExtentSparkReporter spark = new ExtentSparkReporter("Spark.html");*/
			
			//Step:01 Setup a physical report path
			
			ExtentHtmlReporter reporter = new ExtentHtmlReporter("./reports/result.html");
			
			
			//to keep report history
			reporter.setAppendExisting(true);
		
			//Step 02: Create object for Extent Report
			ExtentReports extent = new ExtentReports();

			//Step:03 to attach the data in physical file
			extent.attachReporter(reporter);

			//Step:04 to create test cases and assign details
			ExtentTest testcase1= extent.createTest("LoginAndLogout","Testing login page");
			testcase1.assignCategory("smoke");
			testcase1.assignAuthor("Manoj");
			
			ExtentTest testcase2= extent.createTest("AddAndEdit","Employee Information");
			testcase2.assignCategory("Regression");
			testcase2.assignAuthor("Venketesh");
			
			//Step:05 to get the testing status
			testcase1.pass("Enter Username");
			testcase1.fail("Enter Password");
			testcase1.pass("Click login button");
			
			testcase2.pass("Add Employee");
			testcase2.pass("Edit Employee");
			
			//To come out of reports folder use ../
			
			testcase2.pass("Click Save Button",MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/Test04.jpg").build());
			
			//Step06: Mandatory Step
			extent.flush();
			
		}

	}



