package com.utilities;

import java.io.File;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;

public class ExtentReport 
{

	private static ExtentReports extent;
	
	@Test
	public static ExtentReports get()
	{
		
		if(extent==null)
		{
			extent=new ExtentReports(System.getProperty("user.dir")+"\\test-output\\html\\extent.html",true,DisplayOrder.OLDEST_FIRST);
		  	
			 extent.loadConfig(new File(System.getProperty("user.dir")+"\\src\\test\\resources\\extentconfig\\ReportsConfig.xml"));
		} 
		
		return extent;
	}
	
	
	
	
}
