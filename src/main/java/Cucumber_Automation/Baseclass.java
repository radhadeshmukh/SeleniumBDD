package Cucumber_Automation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {
 public static WebDriver driver;
 public static  Properties prop;
 
 public static WebDriver getDriver() throws IOException
 {
	prop = new Properties();
	 FileInputStream fs= new FileInputStream("src/main/java/Cucumber_Automation/GlobalVariable.properties");
	 prop.load(fs);
	
	 System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
	 driver= new ChromeDriver();
	
	driver.get(prop.getProperty("url"));
	 return driver;
 }
}
