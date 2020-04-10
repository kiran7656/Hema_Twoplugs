package com.utilities;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelConfig {
	XSSFWorkbook wb;
	XSSFSheet sheet;
	DataFormatter formatter = new DataFormatter();
	public ExcelConfig(String excelpath)
	{
		try {
			File src=new File(excelpath);
			FileInputStream fis=new FileInputStream(src);
			wb=new XSSFWorkbook(fis);
			sheet=wb.getSheet("0");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public String getData(String sheetnanme,int rowno,int colno)
	{
		sheet=wb.getSheet(sheetnanme);
		String data=formatter.formatCellValue(sheet.getRow(rowno).getCell(colno));
		return data;
		
	}
	public int getRowCount(String sheetname)
	{
		int row=wb.getSheet(sheetname).getLastRowNum();
		int rows=row+1;
		return rows;
		
	}
}
