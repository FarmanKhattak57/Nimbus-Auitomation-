package Nimbus.Demotest;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Item_Def extends BaseClass
{
	
	
	
	WebDriver driver=null;
	
	  @BeforeMethod   //BeforeMeTHOD KA MTLB HY KEY YAH JO method hy , is clase mey jitny b method mey jo b code call hoga us say pehly yah chly is ko annotation kehty hain 
		public void Setup() throws InterruptedException
		{
		WebDriverManager.chromedriver().setup();
	     driver =new ChromeDriver();
		//open url
		driver.get("https://www.nimbusrms.com/");
		//MAXIMIZE cHROME WINDOW
	    driver.manage().window().maximize();
	    Thread.sleep(1500);
	    // How to scroll down on a web page   jitna b neachy karna ho to ap 1000 ko barhatey  jain oar ager up karna hy to 1000 key sat -ve lagain yah jtna b karna hy up k lea hum sat mey -ve ka sign ues karaty hain 
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,1000)","");
	    
	    
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector("#menu-item-8089 > a")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.id("CompanyName")).sendKeys("Ls_Farman_Automastion");
	    Thread.sleep(2000);
	    driver.findElement(By.id("UserName")).sendKeys("farman@lumensoft.biz");
	    Thread.sleep(2000);
	    driver.findElement(By.id("Password")).sendKeys("12345");
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector("#submit_form > div > div.login_body > div:nth-child(6) > button")).click();
	    Thread.sleep(30000);
		
	    // switch session Popup k leay 
	    if (driver.findElement(By.id("exampleModalLabel")).isDisplayed())
		
	    {
	    
	    driver.findElement(By.cssSelector("#SwitchActiveSession > div > div > div.modal-footer > form > button.btn_style2.green_btn2.tooltip.tooltipstered")).click();
	    }
	   
	    
	     Reporter.log("click on Nimbus Login Button----- "); /// is ka purs[pos yah key report key andr ap ko akcomplete despriction mil jatai hy , jo ap is key nadlikhogy vo report mey print hoag 
	
		}
	  
	  @AfterMethod  // is ka matlb hy key jb  koi test case ,yah jo b method complete hoga us key and pey yah wala code chly ga is class k leay  , is ko anotation kehty hain 
	  public void Quit() throws InterruptedException
		{
		  
		  driver.quit();
		}
	 
	
	@Test(enabled=true , priority=1)
	public void Verify_to_Define_new_item() throws InterruptedException 

	{	
	//Lanuch Chrome Broswer 
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver =new ChromeDriver();
		//open url
		//driver.get("https://www.nimbusrms.com/");
		//MAXIMIZE cHROME WINDOW
	    //driver.manage().window().maximize();
	    //Thread.sleep(1500);
	   // driver.findElement(By.cssSelector("#menu-item-8089 > a")).click();
	   // Thread.sleep(1500);
	  //  driver.findElement(By.id("CompanyName")).sendKeys("Ls_Farman_Automastion1");
	 //   Thread.sleep(2000);
	 //   driver.findElement(By.id("UserName")).sendKeys("farman@lumensoft.biz");
	 //   Thread.sleep(2000);
	 //   driver.findElement(By.id("Password")).sendKeys("12345");
	 //   Thread.sleep(2000);
	 //   driver.findElement(By.cssSelector("#submit_form > div > div.login_body > div:nth-child(6) > button")).click();
	 //   Thread.sleep(15000);
	    // switch session Popup k leay 
	 //  if (driver.findElement(By.id("SwitchActiveSession")).isDisplayed();
	    		
	   // {
	    
	 // driver.findElement(By.cssSelector("#SwitchActiveSession > div > div > div.modal-footer > form > button.btn_style2.green_btn2.tooltip.tooltipstered")).click();
	  // }
		
		test=report.createTest("Verify_to_Define_new_item");
		
	    Thread.sleep(30000);
	    Thread.sleep(15000);
	   driver.get("https://app.nimbusrms.com/ProductDefinition/Index");
	   Thread.sleep(10000);
	   driver.get("https://app.nimbusrms.com/ProductDefinition/Index");
		
	   // Explicit wait .. yah code hy Explicit ka is ka purpos yah hy key is mey ap ak time add karlity ho oar sat mey ak conition b add karlaity ho , program ko agr vo element il jata hy to vo execuite next karta hy warna wo jitna time ap ney menstion kea hota hy us tak wait karat hy 
	   Thread.sleep(3000);
	   WebDriverWait  wait=new WebDriverWait(driver,30);
	    wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("btnNew")));
	   driver.findElement(By.id("btnNew")).click();
	   Thread.sleep(4000);
	   driver.findElement(By.id("ddlLineItemDef")).sendKeys("General");
	   Thread.sleep(3000);
	   Random rad1= new Random();
	   driver.findElement(By.id("ProductCode")).sendKeys("Su5 "+rad1.nextInt(50));
	   
	   Thread.sleep(3000);
	   Random rad= new Random();
	   
	   driver.findElement(By.id("ProductName")).sendKeys("Surf Excel "+rad.nextInt(50));
	   Thread.sleep(1500);
	   driver.findElement(By.id("AverageCost")).sendKeys("500");
	   Thread.sleep(1500);
	   driver.findElement(By.id("Price")).sendKeys("800");
	   Thread.sleep(1500);
	   driver.findElement(By.id("btnSaveProduct")).click();
		   Thread.sleep(1500);
	   driver.findElement(By.id("okButton")).click();  
	   
	    String ExpectedSuccessMessage="";
	    String ActualSuccessMessage=driver.findElement(By.xpath("//*[@id=\"tabs-1\"]/div[1]")).getText();
	    Assert.assertEquals(ActualSuccessMessage, ExpectedSuccessMessage);
	    Thread.sleep(30000);
	     //Fluent WAIT-- YAH B ak WAIT HY JIS MEY HUM AK TIME ADD KARTYA HAIN SAT MEY AK POLLING TIME DAITY HAIN JIS KA MATLB HOTA HY key e,g ap ney main time 30 second dia hy oar polling time 2 dia hy to yah program hr 2 second bad element ko donagy oar execption ko ignore karga 30 second k leay .
	    
	    Wait <WebDriver> Wait=new FluentWait<WebDriver>(driver)
	    		.withTimeout(Duration.ofSeconds(10))
	    		.pollingEvery(Duration.ofSeconds(2))
	    		.ignoring(NoSuchElementException.class);
	     wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("#user_img")));
	     Thread.sleep(15000);
	    driver.findElement(By.cssSelector("#user_img")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector("#left-nav > div.scoop-container > header > div > div.scoop-right-header > div.scoop-rr-header > ul > li.user-box.active > div > div > a.dropdown-item.logoutBtn")).click();
	   
	   // Reporter.log("New Item Define successfully-----");
	
	}
	
	@Test (enabled=true ,priority=2)
	public void Verify_to_Update_newley_Defined_item() throws InterruptedException 

	{
		test=report.createTest("Verify_to_Update_newley_Defined_item");
		
		  Thread.sleep(30000);
		  Thread.sleep(30000);
		   driver.get("https://app.nimbusrms.com/ProductDefinition/Index");
		   Thread.sleep(10000);
		   driver.get("https://app.nimbusrms.com/ProductDefinition/Index");
		   Thread.sleep(10000);
		   driver.findElement(By.id("btnEdit")).click();
		   Thread.sleep(3000); 
		   driver.findElement(By.id("btnUpdateProduct")).click();
		   Thread.sleep(3000); 
		   driver.findElement(By.id("okButton")).click();		  
		   Thread.sleep(3000);
		    driver.findElement(By.cssSelector("#user_img")).click();
		    Thread.sleep(1000);
		    driver.findElement(By.cssSelector("#left-nav > div.scoop-container > header > div > div.scoop-right-header > div.scoop-rr-header > ul > li.user-box.active > div > div > a.dropdown-item.logoutBtn")).click();
		    Thread.sleep(3000); 
			System.out.println("Update itam Successfully ");			
			
			Reporter.log("Item update Successfully ");
			
	}
	 @Test  (enabled=true ,priority=3)
	public void Verify_to_Delete_newley_Defined_item() throws InterruptedException 

	{
		 test=report.createTest("Verify_to_Delete_newley_Defined_item");
		 
		  Thread.sleep(30000);
		  Thread.sleep(30000);
		   driver.get("https://app.nimbusrms.com/ProductDefinition/Index");
		   Thread.sleep(10000);
		   driver.get("https://app.nimbusrms.com/ProductDefinition/Index");
		   Thread.sleep(10000);
		   driver.findElement(By.id("btnEdit")).click();
		   Thread.sleep(3000);
		   driver.findElement(By.cssSelector("#btnDeleteProduct")).click();
		   Thread.sleep(3000);
		   driver.findElement(By.id("okButton")).click();
		   Thread.sleep(3000);
		    driver.findElement(By.cssSelector("#user_img")).click();
		    Thread.sleep(1500);
		    driver.findElement(By.cssSelector("#left-nav > div.scoop-container > header > div > div.scoop-right-header > div.scoop-rr-header > ul > li.user-box.active > div > div > a.dropdown-item.logoutBtn")).click();
		   
		   Thread.sleep(3000); 
		   System.out.println("Delete itam Successfully ");
		   
		   Reporter.log("Newley Defined item Delete Successfully");
		   driver.close();
	}
}



