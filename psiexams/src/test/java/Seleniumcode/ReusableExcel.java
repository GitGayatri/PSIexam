package Seleniumcode;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReusableExcel {

	public static void main(String[] args) {
				// TODO Auto-generated method stub
		//public class Excel_Reusable {
		/*    public static File f;
		    public static FileInputStream fi;
		    public static XSSFWorkbook wb;
		    public static XSSFSheet sh;
		    public static FileOutputStream fo;
		    
		    public static void readExcelSheet(String excelFilePath, String sheetName) throws IOException {
		        f=new File(excelFilePath); // Create an object of File class to open xlsx file
		        fis=new FileInputStream(f); //Create an object of FileInputStream class to read excel file // or enter excel file path instead of (f)
		        wb=new XSSFWorkbook(fis); // creating object for workbook
		        sh=wb.getSheet(sheetName); // reading sheet
		    }
		    
		    public static void writeToExcel(String lookForSheetName, int create_Row_Index, int create_Cell_Index, String set_Cell_Value) throws IOException {
		        int sheet_count=wb.getNumberOfSheets();

		        // retreived all sheet names and stored in an array
		        String sheet_names[]=new String[sheet_count];
		        for(int i=0;i<sheet_names.length;i++){
		            sheet_names[i]=wb.getSheetAt(i).getSheetName();
		        }

		        // checking if desiredSheet is existing in workbook true/false
		        boolean status= Arrays.stream(sheet_names).anyMatch(lookForSheetName::equals);
		     //   System.out.println(dd);

		        // writting values into sheet and creating new sheet if it doesn't exist
		        if(status){
		            wb.getSheet(lookForSheetName).createRow(create_Row_Index).createCell(create_Cell_Index).setCellValue(set_Cell_Value);
		        }else{
		            wb.createSheet(lookForSheetName).createRow(create_Row_Index).createCell(create_Cell_Index).setCellValue(set_Cell_Value);
		        }

		        // saving entered values in excel file
		        fos=new FileOutputStream(f);
		        wb.write(fos); // save data in excel

		        fos.close();
		        wb.close();
		        fis.close();
		    }
		    */
	


	}

}
