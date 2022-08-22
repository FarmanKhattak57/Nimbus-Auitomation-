package Nimbus.Demotest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Purchase_order {

	
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
	    
	    
	    Thread.sleep(4000);
	    driver.findElement(By.cssSelector("#menu-item-8089 > a")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.id("CompanyName")).sendKeys("Ls_Farman_Automastion");
	    Thread.sleep(2000);
	    driver.findElement(By.id("UserName")).sendKeys("farman@lumensoft.biz");
	    Thread.sleep(2000);
	    driver.findElement(By.id("Password")).sendKeys("12345");
	    Thread.sleep(3000);
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
	
	  
	  
	  
	  @Test

	  public void  save_po_order()
	  {
		  try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  driver.findElement(By.linkText("Purchase")).click();
		  try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				driver.findElement(By.linkText("Purchase Order")).click();
				
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
		  
		  
		  
	  }
}
	  
}



