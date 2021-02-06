package Seleniumcode;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReader {
	String excelfilePath;
	Workbook workbook;
	String Sheet;
	public ExcelReader() {
		
	}
	public ExcelReader(String excelfilePath) throws EncryptedDocumentException, FileNotFoundException, IOException {
		this.excelfilePath = excelfilePath;
		workbook = WorkbookFactory.create(new FileInputStream(excelfilePath));
	}
	public int getRowCount(String sheetName) {
		int rowCount=0;
		return rowCount;
		 
		
	}

		}


