package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.qa.util.TestUtil;



public class BaseClass {

	public static WebDriver driver;
	public static Properties prop;
	public  static EventFiringWebDriver e_driver;
	
	public BaseClass() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("E:\\GEO\\Selenium Sample\\P_EzyTracker\\src\\main\\java\\com\\qa\\config\\config.properties");
			prop.load(ip);
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}	
			
	public static void initialization() {
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\GEO\\Selenium Sample\\P_EzyTracker\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equals("Firefox")) {
			System.getProperty("webdriver.gecko.driver","E:\\GEO\\Selenium Sample\\P_EzyTracker\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		e_driver = new EventFiringWebDriver(driver);
		
		driver= e_driver;
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
	}
	
}
