package com.naukri.executionEngine;

import java.io.File;
import java.io.IOException;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.openqa.selenium.TakesScreenshot;

public class Logo_google {
	public static WebDriver driver;

  @Test
  public void Logo() {
	  driver =new ChromeDriver();
		driver.get("https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=V2p8WpLuHbOIX8vjr6AL");
		driver.manage().window().maximize();
		Boolean b=driver.findElement(By.xpath("//*[@id='hplogo']")).isDisplayed();
		Assert.assertTrue(b);
  }	
  @AfterMethod
  public void teardown(ITestResult result) throws IOException
  {
	  if(ITestResult.SUCCESS==result.getStatus())
	  {
		  File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			//String currentDir = System.getProperty("user.dir");
			
			//FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
			FileUtils.copyFile(scrFile, new File("E://webdriver_Framework//Screenshot//Screenshot_" + result.getName() + "+ "+timestamp()+".png"));
	  }
  }
  
  public  String timestamp() {
      return new SimpleDateFormat("YYYY-MM-dd HH-mm-ss").format(new Date());
  }
  @AfterTest
  public void close()
  {
	  driver.close();
  }
  }
  

