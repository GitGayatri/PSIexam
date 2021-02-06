package Seleniumcode;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriting {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f=new File("C:\\Users\\gayat\\Desktop\\WB.xlsx");
		FileInputStream fi =new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet sh= null;
		
		
		/*XSSFSheet sh = wb.getSheet("Sheet2");
		//XSSFRow row= sh.createRow(4);
		//XSSFCell cell = row.createCell(3);
		//cell.setCellValue("Writing");
		// these 3 commands can be combined into 1 since the return type of these methods is a classtype
		sh.createRow(4).createCell(4).setCellValue("Writing");
		
		
		FileOutputStream fo = new FileOutputStream(f);
		// write is a method used to save data that we have created
		wb.write(fo);
		fo.close();
		wb.close();
		fi.close();
		System.out.println("Done");
		*/
	
		
		//for creating new sheet name (if it already does not exist)

		
		int sheetCount= wb.getNumberOfSheets();
		boolean status=false;
		
		for(int i=0;i<sheetCount;i++) {
			String sheetNames= wb.getSheetName(i);
			System.out.println(sheetNames);
			if (sheetNames.equalsIgnoreCase("sheet6")){
					status=true;		
					sh=wb.getSheet("sheet6");
					System.out.println("Match found");
			
				break;
				
			  }
		}
		
		if(!status) {
			sh = wb.createSheet("sheet6");
		}
		sh.createRow(4).createCell(4).setCellValue("Writing");
		System.out.println("Match not found");
		FileOutputStream fo = new FileOutputStream(f);
		wb.write(fo);// write is a method used to save data that we have created		
		fo.close();
		wb.close();
		fi.close();
		
	}
		
	

}


