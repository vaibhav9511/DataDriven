package com.testcases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.base.TestBase;

public class OpenAccount  extends TestBase
{
	
	   
      @Test(priority=3)
	  public void openAccount() throws Exception
	  {  
    	  System.setProperty("org.uncommons.reportng.escape-output", "false");

    	  
    	  Thread.sleep(3000);
		  driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[1]/button[2]")).click();  
		  
		  Select select=new Select(driver.findElement(By.xpath("//*[@id=\"userSelect\"]")));
		  
		   select.selectByVisibleText("Harry Potter");
		  
		   Select select1=new Select(driver.findElement(By.xpath("//*[@id=\"currency\"]")));
      
	        select1.selectByValue("Pound");
	  
	       driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div/form/button")).submit();
	  
	       Thread.sleep(5000);
	       driver.switchTo().alert().accept();
	       
	   	Reporter.log("OHH! vaibhav add cust successfully");
	    Reporter.log("<a href=\"C:\\Users\\V K\\Pictures\\Screenshots\\Screenshot (470).png\">screenshot here</a>");
	    Reporter.log("<a target=\"_blank\"href=\"C:\\Users\\V K\\Pictures\\Screenshots\\Screenshot (470).png\"><img src=\"C:\\Users\\V K\\Pictures\\Screenshots\\Screenshot (470).png\" height=250 weight=220></img></a>");
  
	       
	  }
	
	
	
	

	
	
	
	
}
