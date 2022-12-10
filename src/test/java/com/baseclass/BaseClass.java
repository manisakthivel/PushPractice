package com.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.text.WordUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	
	@BeforeClass
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(pro("url"));
	}
	
	
	public static void extentReport() {
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("report.html");
		extent.attachReporter(spark);
		extent.createTest("pass any message");
		extent.flush();
	}
	
		
	
	public static void delay() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public static String pro(String key) {
		try {
			File file = new File("C:\\Users\\Manikandan Sakthivel\\eclipse-workspace\\AdactinProjectPractice\\src\\test\\resources\\test.property");
			FileInputStream fi = new FileInputStream(file);
			Properties po = new Properties();
			po.load(fi);
			String out = po.getProperty(key);
			return out;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return key;
	}
	
	public static void alert() {
		driver.switchTo().alert().accept();
	}
	public static void getUrl(String url) {
		driver.get(url);
	}
	
	public static void click(WebElement element){
		element.click();
	}
	public static void submit(WebElement element){
		element.submit();
	}

	public static void close() {
		driver.close();
	}
	
	public static void typeText(WebElement element,String text) {
		element.sendKeys(text);
	}
	
	public static String selectMethod(WebElement element, String a ) {
		Select select = new Select(element);
		select.selectByVisibleText(a);
		return a;
			}
	

	
	/*public static String readExcelData(int i , int j)  {
		String value = null;
		try{
				
			File file = new File("D:\\Demo\\HotelData1.xlsx");
			FileInputStream fi = new FileInputStream(file);
			Workbook wb = new XSSFWorkbook(fi);
			Sheet sheet = wb.getSheet("Sheet2");
			int rows = sheet.getPhysicalNumberOfRows();
			//for(int i=0;i<rows;i++) {
			Row row = sheet.getRow(i);
			int cells = row.getPhysicalNumberOfCells();
			//for(int j=0;j<cells;j++) {
			Cell cell = row.getCell(j);
			int cellType = cell.getCellType();
			if(cellType==1) {
				value = cell.getStringCellValue();
						}
			if(cellType==0) {
				if(DateUtil.isCellDateFormatted(cell)) {
					Date dateCellValue = cell.getDateCellValue();
					SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
					value = sdf.format(dateCellValue);
				}
				else {
					double numericCellValue = cell.getNumericCellValue();
					long l = (long) numericCellValue;
					value = String.valueOf(l);
				}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return value;
	}*/
	
	
	
	public static String readExcelData(int i , int j)  {
		String value = null;
		
		try {
		File file = new File("D:\\Demo\\HotelData1.xlsx");
		FileInputStream fi = new FileInputStream(file);
		Workbook wb = new XSSFWorkbook(fi);
		Sheet sheet = wb.getSheet("Sheet2");
		int noOfRows = sheet.getPhysicalNumberOfRows();
		int noOfCells = sheet.getRow(0).getLastCellNum();
//		for( int i=0;i<noOfRows;i++) {
//			for(int j=0;j<noOfCells;j++) {
				Cell cell = sheet.getRow(i).getCell(j);
				DataFormatter df = new DataFormatter();
				 value = df.formatCellValue(cell);
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return value;
		
		
	}
	
	public static String readExcelData1()  {
		String value = null;
		
		try {
		File file = new File("D:\\Demo\\HotelData1.xlsx");
		FileInputStream fi = new FileInputStream(file);
		Workbook wb = new XSSFWorkbook(fi);
		Sheet sheet = wb.getSheet("Sheet1");
		int noOfRows = sheet.getPhysicalNumberOfRows();
		int noOfCells = sheet.getRow(0).getLastCellNum();
		for( int i=1;i<noOfRows;i++) {
			for(int j=0;j<noOfCells;j++) {
				Cell cell = sheet.getRow(i).getCell(j);
				DataFormatter df = new DataFormatter();
				 value = df.formatCellValue(cell);
		
		}
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return value;
	
	}

	
		public static void main(String[] args) {
			
		
		
}
}