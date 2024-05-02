package utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readex {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileInputStream fis=new FileInputStream("src//test//resource//XYZTestData.xlsx");
XSSFWorkbook wb=new XSSFWorkbook(fis);
XSSFSheet sheet=wb.getSheetAt(0);

XSSFRow row=sheet.getRow(0);
int colnum=row.getLastCellNum();
System.out.println(colnum);
	}

}
