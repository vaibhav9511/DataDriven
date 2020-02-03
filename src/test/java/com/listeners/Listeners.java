package com.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.base.TestBase;
import com.relevantcodes.extentreports.LogStatus;
import com.utilities.TestUtils;

public class Listeners extends TestBase implements ITestListener
{

	
	public void onTestStart(ITestResult result) {

	}

	public void onTestSuccess(ITestResult result)
	{

		test.log(LogStatus.PASS, result.getName().toUpperCase()+"PASS");
		reo.endTest(test);
	     reo.flush();	
		
	}

	public void onTestFailure(ITestResult result)
	{
		
		//test.log(LogStatus.FAIL, result.getName().toUpperCase()+"FAILED"+result.getThrowable());
		//reo.endTest(test);
		//reo.flush();
		
		
	   System.setProperty("org.uncommns.reportng.escape-output","false");

	   
	   	Reporter.log("captured screenshot!!..");
	   	Reporter.log("<a target=\"_blank\"href=\"C:\\Users\\V K\\Pictures\\Screenshots\\Screenshot (469).png\">scrrenshot</a>");		     
		  Reporter.log("<br>");
		
		   Reporter.log("<a target=\"_blank\"href=\"C:\\Users\\V K\\Pictures\\Screenshots\\Screenshot (469).png\"><img src=\"C:\\Users\\V K\\Pictures\\Screenshots\\Screenshot (469).png\" height=250 weight=220></img></a>");		     
	    	
		   
	   /*
	   Reporter.log("<a target=\"_blank\"href=\"C:\\Users\\V K\\Pictures\\"+TestUtils.screenshotname+">scrrenshot</a>");		    
	   
	   Reporter.log("<br>");
		
		  //Reporter.log("<a target=\"_blank\"href=\"C:\\Users\\V K\\Pictures\\Screenshots\\Screenshot (469).png\"><img src=\"C:\\Users\\V K\\Pictures\\Screenshots\\Screenshot (469).png\" height=250 weight=220></img></a>");	
	   Reporter.log("<a target=\"_blank\"href=\"C:\\Users\\V K\\Pictures\\"+TestUtils.screenshotname+"\"><img src="+TestUtils.screenshotname+" height=250 weight=220></img></a>");	
	   */
         // Assert.fail("not successfully");	    		
		
		
	}

	public void onTestSkipped(ITestResult result) {

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	public void onStart(ITestContext context) {

	}

	public void onFinish(ITestContext context) {

	}

	
	
	
	
	
}
