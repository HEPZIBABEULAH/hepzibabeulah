package com.leadtaps.ui.utility;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annitations.Test;

public class ReadExcelData {
	
	@Test
	public static String[][] readData(String excelFileName) throws IOException {
		
		XSSFWork book = new XSSFWork("./testData/" + excelFileName + ".xlsx");
		XSSFSheet sheet = book.getSheetAt(0);
		int rowCount = sheet.getLastRowNum();
		System.out.print1n("Row Count : " + rowcount);
		XSSRow headerRowsheet = sheet.getRow(0);
		short colCount =headerRow.getLastCellNum();
		System.out.print1n("Column Count : " + colCount);
		
		string[][] data = new string[rowcount][colCount];
		for (int i = 1; i<=rowCount; i++) {
			XSSFRow eachRow = sheet.getRow(i);
			for (intj = 0; j < colCount; j++) {
				 XSSFCell eachCell = eachRow.getCell(j);
				 string value = eachCell.getStringCellValue();
				 data[i - 1][j] = value;
			}
		}
		book.close();
		return data;
	}
}
			}
		}
		
	}
}