package utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcell {
	
	 String  filePath="src//test//resource//XYZTestData.xlsx";
	 FileInputStream fis;
	 XSSFWorkbook workBook;
	 XSSFSheet sheet;
	FileOutputStream fos;
	public  XSSFSheet readData() throws IOException
	{
	 fis=new FileInputStream(filePath);
	 workBook=new XSSFWorkbook(fis);
	 sheet=workBook.getSheetAt(0);
	 return sheet;
	}
	public String getFirstName() throws IOException
	{
		String fName=readData().getRow(1).getCell(0).getStringCellValue();
		return fName;
	}
	public String getLastName() throws IOException
	{
		String lName=readData().getRow(1).getCell(1).getStringCellValue();
		return lName;
	}
	
	public String getPostalCode() throws IOException
	{
		int pinCode=(int) readData().getRow(1).getCell(2).getNumericCellValue();
		String pin=String.valueOf(pinCode);
		return pin;
	}
	public String getCurrency() throws IOException
	{
		String currency=readData().getRow(1).getCell(3).getStringCellValue();
		return currency;
	}
	public String getAccountNumber() throws IOException
	{
		int accountNumber=(int) readData().getRow(1).getCell(9).getNumericCellValue();
		String accountNo=String.valueOf(accountNumber);
		return accountNo;
	}
	public String getDepositAmount() throws IOException
	{
		int amount=(int) readData().getRow(1).getCell(4).getNumericCellValue();
		String depositAmount=String.valueOf(amount);
		return depositAmount;
	}
	public String getWithdrawAmount() throws IOException
	{
		int amount=(int) readData().getRow(1).getCell(5).getNumericCellValue();
		String withdrawAmount=String.valueOf(amount);
		return withdrawAmount;
	}
	
	public void writeDataInExcel(int i) throws IOException
	{
		XSSFCell cellname=sheet.getRow(0).createCell(8);
		XSSFCell	cellvalue=sheet.getRow(1).createCell(8);
		cellname.setCellValue("Customer Id");
		cellvalue.setCellValue(i);
		
		 fos=new FileOutputStream(filePath);
		workBook.write(fos);
	}
	public void writeAccountNumberinExcel(int i) throws IOException
	{
		XSSFCell cellname=sheet.getRow(0).createCell(9);
		XSSFCell	cellvalue=sheet.getRow(1).createCell(9);
		cellname.setCellValue("Account No");
		cellvalue.setCellValue(i);
		
		 fos=new FileOutputStream(filePath);
		workBook.write(fos);
	}
}
