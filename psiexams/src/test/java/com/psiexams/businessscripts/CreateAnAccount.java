package com.psiexams.businessscripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.psiexams.objectrepositories.TestObjectRepositories;
import com.psiexams.reusableseleniumscripts.ReusableTestNGScripts;
import com.psiexams.utilities.ReadingDataFromPropertyFile;

// No main method, only class and test cases inside it
public class CreateAnAccount extends ReusableTestNGScripts{
	
	ReadingDataFromPropertyFile prop;
	@BeforeTest
	public void launchapp() throws InterruptedException, IOException {
		prop= new ReadingDataFromPropertyFile();
		launchBrowser(prop.readingdata("browsername"));
	    openUrl(prop.readingdata("appurl"));
	    click(TestObjectRepositories.create_link);
	    }
	
	@Test
	 public void Validate_email_format(){
		sendText(By.name("emailid"), "test");
		String actualText=getText(By.className("errorInline"));
		Assert.assertEquals(actualText,"Please provide valid email address.");
		}
	@AfterTest
	public void closeapp() {
		driver.quit();
	}
}