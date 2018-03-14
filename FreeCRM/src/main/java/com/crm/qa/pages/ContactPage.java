package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class ContactPage extends TestBase{

	
	
		@FindBy(xpath="//*[@id='vContactsForm']/table/tbody/tr[1]/td/table/tbody/tr/td[1]")
		WebElement contacts_label;
		
		@FindBy(id="first_name")
		WebElement FirstName;
		
		@FindBy(id="surname")
		WebElement LastName;
		
		@FindBy(name="client_lookup")
		WebElement Company_name;
		
		@FindBy(xpath="//input[@type='submit' and @value='Save']")
		WebElement save_button;

		
		public ContactPage() throws IOException {
			PageFactory.initElements(driver,this);
			// TODO Auto-generated constructor stub
		}
		
		public boolean contactlabel()
		{
			return contacts_label.isDisplayed(); 
		}
		
		public void selectcontacts(String name)
		{
			driver.findElement(By.xpath("//*[text()='"+name+"']/parent::td[@class='datalistrow']/" +
					"preceding-sibling::td[@class='datalistrow']/input[@name='contact_id']")).click();
		}
		
		public void createNewContacts(String title,String fname,String lname,String cname)
		{
			Select select=new Select(driver.findElement(By.name("title")));
			select.selectByVisibleText(title);
			FirstName.sendKeys(fname);
			LastName.sendKeys(lname);
			Company_name.sendKeys(cname);
			save_button.click();
			
			
		}
}
