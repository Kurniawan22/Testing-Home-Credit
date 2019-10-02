package readExcel

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import internal.GlobalVariable



public class read {
	@Keyword
	def demoKey(String name) throws IOException{
		FileInputStream fis = new FileInputStream("D:\\katalon-excel-file\\id-laporan.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
		Row row = sheet.createRow(rowCount);
		Cell cell = row.createCell(0);
		cell.setCellType(cell.CELL_TYPE_STRING);
		cell.setCellValue(name);
		FileOutputStream fos = new FileOutputStream("D:\\katalon-excel-file\\id-laporan.xlsx");
		workbook.write(fos);
		fos.close();
	}
}
