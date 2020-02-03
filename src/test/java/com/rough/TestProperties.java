package com.rough;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestProperties
{
    public static void main(String[] args) throws IOException 
   {
      System.out.println(System.getProperty("user.dir"));
	
	Properties config=new Properties();
	Properties or=new Properties();
	
	FileInputStream f=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\Properties\\Config.properties");
     config.load(f);	
    
     f=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\Properties\\Orproperties");
     or.load(f);
   
     System.out.println(config.getProperty("browser"));
     System.out.println(or.getProperty("bmlbtn"));
     
   }
}
