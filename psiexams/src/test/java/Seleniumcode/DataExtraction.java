package Seleniumcode;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream; 
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DataExtraction extends ReusableScripts {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		
		File f=new File("C:\\Users\\gayat\\Desktop\\WB.xlsx");
		FileInputStream fi =new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		//Dropdown data extraction
		//create a new sheet to which the data is extracted
	/*	XSSFSheet sh= wb.createSheet("PrintttValuess");
		launchBrowser();
		openUrl("https://candidate.psiexams.com/catalog/displayagencylicenses.jsp?catalogID=334");
		
		List <WebElement>sponsorname=driver.findElementsByXPath("//*[@id=\'c0\']/option");
		System.out.println(sponsorname.size());
		for (int i=0;i<sponsorname.size();i++) {
			
		 sh.createRow(i).createCell(1).setCellValue(sponsorname.get(i).getText());
		}
			
			//to extract data into the sheet
			//sh.createRow(i).createCell(1).setCellValue(sponsorname.get(i).getText());
			
		
		//to save the data 
		FileOutputStream fo = new FileOutputStream(f);
		wb.write(fo);
		fo.close();
		wb.close();
		fi.close();
		driver.close(); */
		
		
		// Web Table data extraction
		XSSFSheet sh= wb.createSheet("PrintTable2");
		launchBrowser("chrome");
		openUrl("https://money.rediff.com/gainers");
		//WebElement table_head = driver.findElement(By.xpath("//*[@id='leftcontainer']/table/thead"));
		System.out.println("head");
	//	List<WebElement> table_head_row= driver.findElements(By.xpath("//*[@id='leftcontainer']/table/thead"));
			for(int row=0;row<1;row++) {
				List<WebElement> table_col=driver.findElements(By.xpath("//*[@id='leftcontainer']/table/thead/tr/th"));
				System.out.println(table_col.size());
				for(int col=0; col<table_col.size();col++){
					if(sh.getRow(row)!=null) {
						sh.getRow(row).createCell(col).setCellValue(table_col.get(col).getText());
						
					}
					else {
					sh.createRow(row).createCell(col).setCellValue(table_col.get(col).getText());
					}
				}
					
			}
		WebElement table_body = driver.findElement(By.xpath("//*[@id=\'leftcontainer\']/table/tbody"));
		List<WebElement> table_row = table_body.findElements(By.tagName("tr"));
			for(int row1=1;row1<6;row1++) {
				List<WebElement> table_col1=table_row.get(row1).findElements(By.tagName("td"));
				for(int col1=0; col1<table_col1.size();col1++){
				//System.out.println(table_col.size());
				// to extract data into the sheet
				//System.out.println(table_col.get(col).getText());
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
		close();
		
		
	


	}

}


