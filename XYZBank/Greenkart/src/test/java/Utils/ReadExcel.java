package Utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	String filePath="src//test//resource//testData.xlsx";
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	public String readUserID() throws IOException
	{
		 fis=new FileInputStream(filePath);
 wb=new XSSFWorkbook(fis);
		 sheet =wb.getSheetAt(0);
		String username=sheet.getRow(1).getCell(0).getStringCellValue();
		 System.out.println(username);
		 return username;
	}
	
	public String readPassword()
	{
	String password=	sheet.getRow(1).getCell(1).getStringCellValue();
	System.out.println(password);
	return password;
	}
	
	public void writeData(String s) throws IOException
	{
		XSSFCell cell=sheet.getRow(0).createCell(6);
		cell.setCellValue(s);
		
		FileOutputStream fos=new FileOutputStream(filePath);
		wb.write(fos);
	
	}
}
