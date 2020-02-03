package com.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.base.TestBase;

public class BankManagerLoginTest extends TestBase
{
	@Test(priority=1)
	public void loginasbankManager() throws Exception
	{ 
		    
		/*
	    try {
		Assert.assertEquals("xyz", "xyzz");
	    System.out.println("in try");
	       }
	    catch(Throwable e)
	    {
	    	System.out.println("inside catch");
	    	
	    }
		*/
		
      
		//show link on index click on that.. inside code listeners class
		  System.setProperty("org.uncommons.reportng.escape-output", "false");     
		
		verifyequal("vaibhav","vaibh");		
		
	    	driver.findElement(By.cssSelector(or.getProperty("bmlbtn"))).click();
             
		      Thread.sleep(4000);
		     Assert.assertTrue(isElementPresent(By.cssSelector(or.getProperty("addcustbtn"))),"Login not successfull");
		     Reporter.log("login successfully");
	        
         /*
		     // code inside Listeners class
		     //create screenshot and using target element go to new(next) page
		     Reporter.log("<a href=\"C:\\Users\\V K\\Pictures\\Screenshots\\Screenshot (471).png\">screenshot here</a>");
		     Reporter.log("<\br>");
		     Reporter.log("<a target=\"_blank\"href=\"C:\\Users\\V K\\Pictures\\Screenshots\\Screenshot (470).png\"><img src=\"C:\\Users\\V K\\Pictures\\Screenshots\\Screenshot (470).png\" height=250 weight=220></img></a>");
		   */
		 	
         // Assert.fail("login NOT successfully");	
	}

	  
}
