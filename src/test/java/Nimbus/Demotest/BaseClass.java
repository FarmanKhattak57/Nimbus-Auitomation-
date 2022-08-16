package Nimbus.Demotest;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class BaseClass
{

	public static ExtentSparkReporter htmlReporter;
	public static ExtentReports  report;
	public static ExtentTest test;
	
	@BeforeSuite
	public void StratReport()  //yah jo method hy yah Extent Report banany k leau hy  is ko karny k leay ap ko pehly Extant report ki dependency add karni hy phr yah neachy wala code karna hy 
	{
		htmlReporter=new ExtentSparkReporter("ExtentReport.html");
		report=new ExtentReports();
		report.attachReporter(htmlReporter);
		
		//add envirment detail 
	 report.setSystemInfo("Machine", "Pc Cpomuter");
     report.setSystemInfo("OS ", "WINDOW 10");
     report.setSystemInfo("USER NAME", "FARMAN kHATTAK ");
     report.setSystemInfo("company name","Lumensoft");
     report.setSystemInfo("project NAME", "Nimbus Rms");
     report.setSystemInfo("Broswer", "Chrome ");
    
     // configuration for look and feel 
     htmlReporter.config().setDocumentTitle("Nimbus Rms Test Result Report");
     htmlReporter.config().setReportName("Test R00eport");
     htmlReporter.config().setTheme(Theme.STANDARD);
     htmlReporter.config().setTimeStampFormat("MMM dd yyyy HH:mm:ss");
     
		
	}
	
	@AfterMethod
	public void getresult(ITestResult Result)// yah b Extent report k leay hy 
	{
		
		if (Result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL, MarkupHelper.createLabel(Result.getTestName() + "Failed", ExtentColor.RED));
			
		}
		else if

			
			 (Result.getStatus()==ITestResult.SUCCESS)
			{
				test.log(Status.PASS,MarkupHelper.createLabel(Result.getName() +"PASSED",ExtentColor.GREEN));
				
			}
		else if (Result.getStatus()==ITestResult.SKIP)
			
		{
			test.log(Status.SKIP, MarkupHelper.createLabel(Result.getName() + "skiped", ExtentColor.YELLOW));
			
			
		}
			 
		}
	
	
	   @AfterSuite
	   public void Teadown()  // yah b E	Extent Report k leay hy 
	   {
		   report.flush();
		   
	   }

	
	
	
	
}
