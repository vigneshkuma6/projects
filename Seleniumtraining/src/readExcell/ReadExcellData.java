package readExcell;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcellData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String filePath="src//test//resource//files//testData.xlsx";
		
		FileInputStream fis=new FileInputStream(filePath);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(0);
		
		System.out.println(sheet.getRow(0).getCell(0).getStringCellValue());
		System.out.println(sheet.getRow(0).getCell(1).getStringCellValue());
		System.out.println(sheet.getRow(1).getCell(0).getStringCellValue());
		System.out.println(sheet.getRow(1).getCell(1).getStringCellValue());
	}

}
