package loginTest;

import org.testng.annotations.Test;



import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Calendar;
import java.util.List;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class loginTest {
	
	@Test(priority=1)
	public void testLogin() throws AWTException, MalformedURLException {
		
		   WebDriver driver;

		    

	      
	      //Setting the webdriver.ie.driver property to its executable's location
//	     System.setProperty("webdriver.ie.driver", "D:\\Drivers\\IEDriverServer.exe");
//		
//	      //Instantiating driver object
//	      driver = new InternetExplorerDriver();
	      
	      
	      System.setProperty("webdriver.ie.driver", "C:\\Program Files (x86)\\Jenkins\\IEDriverServer.exe");
	      
	      
	    
	      DesiredCapabilities capabilities=DesiredCapabilities.internetExplorer();
	      driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
	      System.out.println("Debug 1");
	      
	      driver.get("http://45.76.149.118:8081/smcfs/console/login.jsp");
	      driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);	
	      driver.findElement(By.name("UserId")).sendKeys("ganesh");

	      driver.findElement(By.name("Password")).sendKeys("ganesh");
	      System.out.println("Debug 2");
	      driver.findElement(By.name("btnLogin")).click();
	      driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	      System.out.println("Debug 3");	  
	      
	      String title = driver.getTitle();				 
			Assert.assertTrue(title.contains("IBM Sterling Selling and Fulfillment Suite: Application Console"));

			driver.quit();
		
		
	
		driver.quit();
	
	}
	
}

    		  
    		  
    		  
    		  