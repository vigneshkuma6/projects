package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcell {
	public static String FilePath = "src//test//resource//SauceDemoTestData.xlsx";

	public ArrayList<String> Readdata(String TestCaseName) throws IOException {
		ArrayList<String> ar = new ArrayList<String>();
		FileInputStream fis = new FileInputStream(FilePath);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		int sheets = wb.getNumberOfSheets();

		for (int i = 0; i < sheets; i++) {
			if (wb.getSheetName(i).equalsIgnoreCase("Sheet1")) {

				XSSFSheet sh = wb.getSheetAt(i);
				// identify test cases column by scanning the entire first row
				Iterator<Row> rows = sh.iterator();
				Row FirstRow = rows.next();
				Iterator<Cell> ce = FirstRow.cellIterator();
				int k = 0;
				int column = 0;
				while (ce.hasNext()) {

					Cell value = ce.next();
					if (value.getStringCellValue().equalsIgnoreCase("TestCaseName")) {
						column = k;
					}
					k++;
				}

				while (rows.hasNext()) {
					Row r = rows.next();
					if (r.getCell(column).getStringCellValue().equalsIgnoreCase(TestCaseName)) {
						Iterator<Cell> c = r.cellIterator();
						while (c.hasNext()) {
							ar.add(c.next().getStringCellValue());

						}
					}
				}

			}

		}
		return ar;
	}

}
