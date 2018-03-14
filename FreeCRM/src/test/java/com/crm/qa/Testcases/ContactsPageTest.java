package com.crm.qa.Testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class ContactsPageTest extends TestBase {

		HomePage homepage;
		LoginPage loginpage;
		TestUtil testutil;
		ContactPage contactpage;
		String sheetName = "contacts";

			public ContactsPageTest() throws IOException
				{
					super();
					// TODO Auto-generated constructor stub
				}

			@BeforeMethod
			public void beforeMethod() throws IOException 
			{
				initlization();
				homepage = new HomePage();
				testutil = new TestUtil();
				loginpage = new LoginPage();
				contactpage = new ContactPage();
				homepage = loginpage.login(prop.getProperty("username"),
				prop.getProperty("password"));
				// testutil.switchToFrame(prop.getProperty("HomePageFrame"));
				driver.switchTo().frame("mainpanel");

				contactpage = homepage.Clickoncontacts();

			}

				@Test()
				public void verifycontactlabeltest()
				{
					Assert.assertTrue(contactpage.contactlabel(), "Label is not present");
				}

				@Test
				public void verifycontacttests() 
				{
					contactpage.selectcontacts("Saanvi Bhadre");
				}
				
				@DataProvider
				public Object[][] getCRMTestData(){
					Object data[][] = TestUtil.getTestData(sheetName);
					return data;
				}
				
				

					@AfterMethod
						public void afterMethod() 
					{
							driver.quit();
					}
					
					
					@Test(priority=4, dataProvider="getCRMTestData")
					public void validateCreateNewContacttest(String title, String firstName, String lastName, String company){
						
						homepage.clickonNewContactsLink();
						contactpage.createNewContacts(title,firstName,lastName,company);
					}

}
