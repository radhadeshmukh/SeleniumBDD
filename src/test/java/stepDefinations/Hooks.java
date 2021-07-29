package stepDefinations;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Cucumber_Automation.Baseclass;
import Pageobject.Homepage;
import io.cucumber.java.After;
import io.cucumber.java.Before;

 
	public class Hooks extends Baseclass {

public static WebDriver driver;


public static void login() throws IOException
{

       Baseclass.getDriver();
			
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
		@After
		public void cleanUp()
		{
			Baseclass.driver.close();
			Baseclass.driver.quit();
		}
	}