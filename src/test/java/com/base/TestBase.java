package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.testcases.AddCustomerTest;
import com.utilities.ExtentReport;

public class TestBase
{

	public static WebDriver driver;
	public static Properties config=new Properties();
	public static Properties or=new Properties();
	public static FileInputStream f;
	public static AddCustomerTest add=new AddCustomerTest();
	
	public  ExtentReports reo=ExtentReport.get();
	public static ExtentTest test;
	@BeforeSuite
	public void setUp()
	{
	    if(driver==null)
	    {
	    	try {
				f=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\Properties\\Config.properties");
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	        try {
				config.load(f);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
	       
	        try {
				f=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\Properties\\Orproperties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        try {
				or.load(f);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	      
	         
	    	if(config.getProperty("browser").equals("chrome"))
	    	{
	    		driver=new ChromeDriver();
	    	}
	    	else if(config.getProperty("browser").equals("firefox"))
	    	{
	    	   System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\geckodriver.exe");
	    	   
	    		driver=new FirefoxDriver();
	    	}
 	    		
           driver.get(config.getProperty("testsiteurl"));	
           driver.manage().window().maximize();
           driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicit.wait")), TimeUnit.SECONDS);
            }
		
}
 
     public boolean isElementPresent(By by)
     {
    	 try 
    	 {
    		 driver.findElement(by);
    		 return true;
    	  }
    	 catch(NoSuchElementException e)
    	 {
    		 return false;
    		 
    	 }
    	 
     }
	
	public static void verifyequal(String expect,String actual)
	{
		
		try{
			
			Assert.assertEquals(expect,actual);
		    }
		
		
		catch(Throwable e)
		{
			
			System.out.println("failed but continue execution"+e.getMessage());
			Reporter.log("<br>"+"verification failed"+e.getMessage());
			 //Reporter.log("<a target=\"_blank\"href=\"C:\\Users\\V K\\Pictures\\Screenshots\\Screenshot (470).png\"><img src=\"C:\\Users\\V K\\Pictures\\Screenshots\\Screenshot (470).png\" height=250 weight=220></img></a>");	
			
		}		
		
	}
	
	
	/*
	@AfterSuite
	public void teardown()
	{
		if(driver!=null)
		{
		driver.quit();
		}
	}*/
	
	
}
