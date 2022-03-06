package com.Example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestLibraries {

	public static void main(String[] args) 
	{
	 //System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver.exe");
	   // WebDriver driver= new ChromeDriver();
	  //  driver.get("https://www.google.com/");
	    System.setProperty("webdriver.gecko.driver", "./");
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.google.com/");	
		
	}

}
