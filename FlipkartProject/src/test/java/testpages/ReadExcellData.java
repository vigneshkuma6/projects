package testpages;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Testcases.Baseclass;

public class ReadExcellData extends Baseclass
{
	Double pincode;
	Double UserID;
	XSSFSheet sh;


	//Method to Read data from excell
	public void readExcel() throws IOException
	{
		File src = new File(".\\src\\main\\resources\\FKTestdata.xlsx");
		FileInputStream fis= new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		sh = wb.getSheetAt(0);
	}

	// Method to get pincode from excell
	public  Double get_pincode() throws IOException
	{
		readExcel();
		Double pincode= sh.getRow(1).getCell(0).getNumericCellValue();
		return pincode;
	}

	//Method to get UserID from excell
	public Double get_User_ID() throws IOException
	{
		readExcel();
		Double UserID= sh.getRow(1).getCell(1).getNumericCellValue();
		return UserID;
	}

	//Method to get assertstring from excell
	public String get_assertstring() throws IOException
	{
		readExcel();
		String assertstring= sh.getRow(1).getCell(2).getStringCellValue();
		return assertstring;
	}

}