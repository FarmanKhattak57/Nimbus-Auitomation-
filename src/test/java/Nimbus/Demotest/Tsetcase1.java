package Nimbus.Demotest;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Tsetcase1  extends BaseClass
{
  
	
	
	
	WebDriver driver=null;   
//@BeforeSuite  // is ka matlb yah key agr ap key pas multiple casles hon oar ap cahty ho key jb main sary calses ko testng.xml say execuite karon to mera sub say pehly yah code chly to us k leay hum @BeforeSouit ues karty hain 
	//public void All_calsses_Exectuion_start() throws InterruptedException
	//{
		//System.out.println("ALL CALSSES will be  Execuite");
	
	//}
	//@BeforeSuite  // yah annotaion hy key jb sary calses Execuite hojain to end pey mera yah code chaly , mean sub say end pey 
	//public void All_calsse_execuited_done() throws InterruptedException
	//{
	//	System.out.println("Execuition of all classes has been Verified by Farman khattak ");
	
	//}
	
	
	
  @BeforeMethod   //BeforeMeTHOD KA MTLB HY KEY YAH JO method hy , is clase mey jitny b method mey jo b code call hoga us say pehly yah chly is ko annotation kehty hain 
	public void Setup() throws InterruptedException
	{
	WebDriverManager.chromedriver().setup();
     driver =new ChromeDriver();
	//open url
	driver.get("https://www.nimbusrms.com/");
	Reporter.log("Url successfully open");  /// is ka purs[pos yah key report key andr ap ko akcomplete despriction mil jatai hy , jo ap is key nadlikhogy vo report mey print hoag 
	//MAXIMIZE cHROME WINDOW
    driver.manage().window().maximize();
    Reporter.log("Chorm maximiz succesfully ");  /// is ka purs[pos yah key report key andr ap ko akcomplete despriction mil jatai hy , jo ap is key nadlikhogy vo report mey print hoag 
    Thread.sleep(1500);
	
	}
  
  @AfterMethod  // is ka matlb hy key jb  koi test case ,yah jo b method complete hoga us key and pey yah wala code chly ga is class k leay  , is ko anotation kehty hain 
  public void Quit() throws InterruptedException
	{
	  
	  driver.quit();
	}
  
  
  
	@Test
	public void Verfy_Nimbus_page_Title() throws InterruptedException 

	{
		
		test=report.createTest("Title has been compaire successfully");
		//WebDriverManager.chromedriver().setup();
       // WebDriver driver =new ChromeDriver();
		//open url
		//driver.get("https://www.nimbusrms.com/");
		//MAXIMIZE cHROME WINDOW
	   // driver.manage().window().maximize();
	    //Thread.sleep(1500);
	    String ExpectedTitle="Online Point of Sale & Inventory Management for Retail Businesses";
	    String ActualTitle=driver.getTitle();
	    Assert.assertEquals(ActualTitle, ExpectedTitle);
	    Thread.sleep(1000);
	    Reporter.log("Title has been compaire successfully-----"); /// is ka purspos yah key report key andr ap ko ak complete despriction mil jatai hy , jo ap is key nadlikhogy vo report mey print hoag 
	    
	    
	   // driver.close();
	    
	}
	
	
	@Test(enabled=true)  //yah jo (enabled=true) is key sat likha hy is ka matlb hy key yah test case chlna cheia agr main chthon key yah na chly baqi syb chly to main is true ki jgha false krdnga
	public void Verfy_login_Nimbus() throws InterruptedException 

	{	
		
		test=report.createTest("Login functionality compaire successfully");
		
	//Lanuch Chrome Broswer 
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver =new ChromeDriver();
		//open url
		//driver.get("https://www.nimbusrms.com/");
		//MAXIMIZE cHROME WINDOW
	   // driver.manage().window().maximize();
	    Thread.sleep(1500);
	    driver.findElement(By.cssSelector("#menu-item-8089 > a")).click();
	    Thread.sleep(1500);
	    driver.findElement(By.id("CompanyName")).sendKeys("Ls_Farman_Automastion");
	    Thread.sleep(2000);
	    driver.findElement(By.id("UserName")).sendKeys("farman@lumensoft.biz");
	    Thread.sleep(2000);
	    driver.findElement(By.id("Password")).sendKeys("12345");
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector("#submit_form > div > div.login_body > div:nth-child(6) > button")).click();
	    Thread.sleep(15000);
	 // switch session Popup k leay 
	    if (driver.findElement(By.id("exampleModalLabel")).isDisplayed())
		
	    {
	    
	    driver.findElement(By.cssSelector("#SwitchActiveSession > div > div > div.modal-footer > form > button.btn_style2.green_btn2.tooltip.tooltipstered")).click();
	    }
	   
	    
	     Reporter.log("click on Nimbus Login Button----- "); /// is ka purs[pos yah key report key andr ap ko akcomplete despriction mil jatai hy , jo ap is key nadlikhogy vo report mey print hoag 
	
	  
	    
	 
	    Thread.sleep(30000);
	    String ExpectedUrl="https://app.nimbusrms.com/Home";
	    String Actualurl=driver.getCurrentUrl();
	    Assert.assertEquals(Actualurl, ExpectedUrl);
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector("#user_img")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector("#left-nav > div.scoop-container > header > div > div.scoop-right-header > div.scoop-rr-header > ul > li.user-box.active > div > div > a.dropdown-item.logoutBtn")).click();
	    Reporter.log("logout successfully ");
	   // driver.close();
		
		
	}
    
	

	
//{	
   
//}
//}
	}
