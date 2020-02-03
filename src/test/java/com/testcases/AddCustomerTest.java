package com.testcases;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.base.TestBase;

public class AddCustomerTest extends TestBase
{ 
/*	@Test(dataProvider="getData")
    public void getData(String firstname,String lastname)
	{
    	driver.findElement(By.cssSelector(or.getProperty("addcustbtn"))).click();
      //driver.findElement(By.cssSelector(or.getProperty("firstname"))).sendKeys("vaibhav");
    	//driver.findElement(By.cssSelector(or.getProperty("addcustbtn"))).sendKeys("kabade");
    	//driver.findElement(By.cssSelector(or.getProperty("addbtn"))).click();
	    	
	

	 }
	
	
	@DataProvider
	public Object[][] getData()
	{
		 // Create object with two paraments
		 // first parameter is row and second one is column
		 Object[][] data = new Object[2][2];
		 data[0][0] = "vaibhav";
		 data[0][1] = "kabade";
		 
		 data[1][0] = "arjun";
		 data[1][1] = "password";
		 
		 return data;
		 }
	*/
      
	   @Test(priority=2)
	  public void addcust() throws Exception 
	  {
		   
		    //show img on reportng
		    System.setProperty("org.uncommons.reportng.escape-output", "false");

		   
		   
		  driver.findElement(By.cssSelector(or.getProperty("addcustbtn"))).click();
		  Thread.sleep(4000);
		  driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div/form/div[1]/input")).sendKeys("pawan");
		  
		  driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div/form/div[2]/input")).sendKeys("patil");
     
		    driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div/form/div[3]/input")).sendKeys("424344");
		    
		    driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div/form/button")).click();
		    
		    Thread.sleep(4000);
		      driver.switchTo().alert().accept();
	   	    
		  //add screenshot and link
			Reporter.log("OHH! vaibhav add cust successfully");
		    Reporter.log("<a href=\"C:\\Users\\V K\\Pictures\\Screenshots\\Screenshot (470).png\">screenshot here</a>");
		    Reporter.log("<a target=\"_blank\"href=\"C:\\Users\\V K\\Pictures\\Screenshots\\Screenshot (470).png\"><img src=\"C:\\Users\\V K\\Pictures\\Screenshots\\Screenshot (470).png\" height=250 weight=220></img></a>");
	  }



}