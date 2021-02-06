package com.psiexams.businessscripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.psiexams.objectrepositories.TestObjectRepositories;
import com.psiexams.reusableseleniumscripts.ReusableTestNGScripts;
import com.psiexams.utilities.ReadingDataFromPropertyFile;

public class Registration extends ReusableTestNGScripts{
	ReadingDataFromPropertyFile prop;
	
	static String parent_window;
	
	@BeforeTest
	
	public void launchapp() throws InterruptedException, IOException {
		prop= new ReadingDataFromPropertyFile();
		launchBrowser(prop.readingdata("browsername"));
	    openUrl(prop.readingdata("appurl"));
	    parent_window=driver.getWindowHandle();
	}
	    
	 @Test 
	 public void ReturningUsers() throws InterruptedException, IOException{
		 sendText(By.name("emailid"),"Testaddress@gmail.com");
		 sendText(By.name("password"),"Pass123#");
		 click(By.name("Submit"));	
		 click(By.linkText("Register for a test"));
		 click(By.id("c0"));
		 List <WebElement>organisation=driver.findElements(By.xpath("//*[@id=\'c0\']/option"));
			for (int i=0;i<organisation.size();i++) {
				String values= organisation.get(i).getText();
				//System.out.println(values);
				//System.out.println(values.length());
				if (values.equalsIgnoreCase("Certification/Professional Associations")) {
				
					organisation.get(i).click();
					break;
				}
			}
				
				List <WebElement>sponsorname=driver.findElements(By.xpath("//*[@id='c1']/option"));
				for (int j=0;j<sponsorname.size();j++) {
					String name= sponsorname.get(j).getText();
					System.out.println(name);
					//System.out.println(values.length());
					if (name.equalsIgnoreCase("American Academy of Nurse Practitioners Certification Board (AANPCB)")) {
						System.out.println("inside the if ");
						sponsorname.get(j).click();
						break;   
					}	 
		 	 }
			
				click(By.xpath("//*[@id=\'LicenseTable\']/tbody/tr[3]/td[2]"));
				click(By.linkText("Test Centers"));
				Set<String> child_windows = driver.getWindowHandles();
	 			for(String windowNames:child_windows){
	 				System.out.println(windowNames);
	 				if(!windowNames.equalsIgnoreCase(parent_window)) {
	 					driver.switchTo().window(windowNames);
	 					Select dropdown=new Select(driver.findElement(By.id("country")));
	 					dropdown.selectByVisibleText("Canada");
	 					Select dropdown1=new Select(driver.findElement(By.id("testcenterstate")));
	 					dropdown1.selectByVisibleText("British Columbia - BC");
	  					
	 					File f=new File("C:\\Users\\gayat\\Desktop\\WB.xlsx");
	 					FileInputStream fi =new FileInputStream(f);
	 					XSSFWorkbook wb = new XSSFWorkbook(fi);
	 					XSSFSheet sh= wb.createSheet("TestCenters");
	 					WebElement table_body = driver.findElement(By.xpath("//*[@id='testcenterdetailsTable']/tbody"));
	 					List<WebElement> table_row = table_body.findElements(By.tagName("tr"));
	 						for(int row1=0;row1<table_row.size();row1++) {
	 							List<WebElement> table_col1=table_row.get(row1).findElements(By.tagName("td"));
	 							for(int col1=0; col1<table_col1.size();col1++){
	 							
	 							if(sh.getRow(row1)!=null) {
	 								sh.getRow(row1).createCell(col1).setCellValue(table_col1.get(col1).getText());
	 								
	 							}
	 							else {
	 							sh.createRow(row1).createCell(col1).setCellValue(table_col1.get(col1).getText());
	 							}
	 							}
	 						}
	 					FileOutputStream fo = new FileOutputStream(f);
	 					wb.write(fo);
	 					fo.close();
	 					wb.close();
	 					fi.close();
	 				}
	 					

	 			}			
	 				
	 			}
	 			
	 		
	 			
    @AfterTest
	   public void closeApp(){
	 			driver.quit();
	}
}

