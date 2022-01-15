package Testautomation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {

	public static String getdata(int row,int cell) throws EncryptedDocumentException, IOException{
		
		FileInputStream file=new FileInputStream("C:\\Users\\admin\\Desktop\\Sneha Study\\Selenium\\Sneha.xlsx");
		
		String value=WorkbookFactory.create(file).getSheet("Sheet1").getRow(row).getCell(cell).getStringCellValue();
		
		return value;
	
	}

public static double getdata1(int row,int cell) throws EncryptedDocumentException, IOException{
		
		FileInputStream file=new FileInputStream("C:\\Users\\admin\\Desktop\\Sneha Study\\Selenium\\Sneha.xlsx");
		
		double value1=(int) WorkbookFactory.create(file).getSheet("Sheet1").getRow(row).getCell(cell).getNumericCellValue();
		
		return value1;
	
	}
}
