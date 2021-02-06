package Seleniumcode;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReading {

	public static void main(String[] args) throws IOException {
		// First step is to give the file location. File is the inbuilt class for that
		/*File f=new File("C:\\Users\\gayat\\Desktop\\WB.xlsx");
		//File input data is the class used to read the streams of characers in a file
		FileInputStream fi= new FileInputStream(f);
		//Create an object for workbook before giving the sheet from which data has to be read
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		//Another way to write the above two lines
		//XSSFWorkbook wb = new XSSFWorkbook(new FileInputStream (f));
		//one more way to write the same
		//Workbook workbook;
		
		//Workbook workbook = WorkbookFactory.create(new FileInputStream(f));
		//to access the sheet 
		XSSFSheet sh= wb.getSheet("Sheet2");
		//to access the particular row		
		System.out.println(sh.getLastRowNum());
		XSSFRow row= sh.getRow(3);
		System.out.println(row.getLastCellNum());
		//to access the particular cell
		XSSFCell cell = row.getCell(0);
		// to get the data in that cell. Always store int as string (with an apostrophe) in Selenium
		String c=cell.getStringCellValue();
		// these 3 commands can be combined into 1 since the return type of these methods is a classtype
		sh.getRow(3).getCell(0).getStringCellValue();
		
		
		System.out.println(c);
		 
		//close the workbook
		wb.close();
		fi.close();*/
		
		
		// To read the entire sheet
		File f=new File("C:\\Users\\gayat\\Desktop\\WB.xlsx");
		
		FileInputStream fi= new FileInputStream(f);
		
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		
		XSSFSheet sh= wb.getSheet("Sheet2");
		int totalRowCount = sh.getLastRowNum();
	
		System.out.println(totalRowCount);
		for(int row=0;row<=totalRowCount;row++) {
			XSSFRow row_value= sh.getRow(row);
			
			int totalColumnCount= row_value.getLastCellNum();
			System.out.println(totalColumnCount);
			
			for(int col=0;col<totalColumnCount;col++) {
				XSSFCell cell = row_value.getCell(col);
				String c=cell.getStringCellValue();
				System.out.println(c);
			}
		}
		
			
	}

}
