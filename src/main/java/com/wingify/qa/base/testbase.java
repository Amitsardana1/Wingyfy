package com.wingify.qa.base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.wingify.qa.util.testutil;


public class testbase {
	
	public static WebDriver driver;
	public static Properties pr;
	
	public testbase() //base class constructor
	{

		try{
		pr = new Properties();
		FileInputStream ip = new FileInputStream("/Users/amikumar/eclipse-workspace/Wingify_test/src/main/java/com/wingify/qa/config/config.properties");
		
		pr.load(ip);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
		
		public static void initialization() {
			
			String browsername= pr.getProperty("browser");
			
			if(browsername.equals("chrome")) {
				
				System.setProperty("webdriver.chrome.driver", "/Users/amikumar/eclipse-workspace/Wingify_test/drivers/chromedriver");
				driver = new ChromeDriver();	
				
			}
			else if (browsername.equals("firefox")){
				System.setProperty("webdriver.gecko.driver", "/Users/amikumar/eclipse-workspace/Wingify_test/drivers/geckodriver");
				driver = new FirefoxDriver();
			}
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(testutil.page_load_timeout , TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(testutil.implicit_wait ,TimeUnit.SECONDS);
			
			driver.get(pr.getProperty("URL"));
				
			}
		}
		
		
	

