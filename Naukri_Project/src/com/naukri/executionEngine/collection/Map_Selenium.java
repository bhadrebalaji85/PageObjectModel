package com.naukri.executionEngine.collection;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Map_Selenium {
	public WebDriver driver;
  @Test
  public void element_mapping() {
	  driver=new ChromeDriver();
	  driver.get("https://my.naukri.com/account/register/basicdetails");
	  driver.findElement(By.xpath("//button[contains(text(),'I am a Fresher')]")).click();
	  driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("Balaji");
	  
	  /*Map<String,String> map=new HashMap<String,String>();
	  map.put(driver.findElement(By.xpath("//form[@id='basicDetailForm']/div/label[contains(text(),'Name')]")).getText()
			  ,driver.findElement(By.xpath("//input[@id='fname']")).getAttribute("input"));
	  for(Map.Entry m:map.entrySet()){  
		   System.out.println("Element name is:"+m.getKey()+" Value Entered is "+m.getValue());  
		  }  */
  }
}
