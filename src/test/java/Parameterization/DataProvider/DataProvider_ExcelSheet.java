package Parameterization.DataProvider;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_ExcelSheet {

	public WebDriver driver;
	String sheet_name;
	public FileInputStream fi;
	public XSSFWorkbook wb;
	public XSSFSheet ws;
	public XSSFRow wr;
	public XSSFCell wc;
	
	@BeforeClass
	void setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@BeforeMethod
	void launch() throws InterruptedException {
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='login_Layer']")).click();
	}

	@Test(dataProvider = "LoginTestInput")
	void testLogin(String username, String password) throws InterruptedException {
		
		driver.findElement(By.cssSelector("[placeholder='Enter your active Email ID / Username']")).sendKeys(username);
		driver.findElement(By.cssSelector("[placeholder='Enter your password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Thread.sleep(2000);
		
		boolean profile = driver.findElement(By.xpath("//a[@class='nI-gNb-header__logo nI-gNb-company-logo']//img[@alt='Naukri Logo']")).isDisplayed();
	
		if (profile) {
			
			driver.findElement(By.xpath("//img[@alt='naukri user profile img']")).click();
			driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
			Thread.sleep(2000);
			Assert.assertTrue(profile);
		}
		else 
			Assert.fail();
		
	}
	
	@AfterClass
	void teardown() {
		driver.close();
	}
	
	@DataProvider(name = "LoginTestInput", indices = {2})
	String[][] testinput() throws IOException {
		
		sheet_name = System.getProperty("user.dir") + "\\DataProviderInput\\LoginInput.xlsx";
		
		fi = new FileInputStream(sheet_name);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet("Sheet1");
		
		int last_row = ws.getLastRowNum();
		int last_cell = ws.getRow(0).getLastCellNum();
		
		String[][] input = new String[last_row][last_cell];
		
		for(int i=1; i <= last_row; i++) {
				
			wr = ws.getRow(i);
			for(int j=0; j < last_cell; j++) {
				 
				wc = wr.getCell(j);
				String value = wc.toString();
				if(value.isEmpty() || value == null) {
					value = "";
				}
				
				input[i-1][j] = value;
				
				/*
				 if (wc == null) {
	                    input[i - 1][j] = ""; // Handle empty cells
	                } else {
	                    switch (wc.getCellType()) {
	                        case STRING:
	                            input[i - 1][j] = wc.getStringCellValue();
	                            break;
	                        case NUMERIC:
	                            input[i - 1][j] = (wc.getNumericCellValue() % 1 == 0) ? (int) wc.getNumericCellValue() : wc.getNumericCellValue();
	                            break;
	                        case BOOLEAN:
	                            input[i - 1][j] = wc.getBooleanCellValue();
	                            break;
	                        default:
	                            input[i - 1][j] = ""; // Handle unknown cell types
	                    }
	             */
			}
		}
		
		/*
		 for (int i = 1; i <= last_row; i++) {
        		wr = ws.getRow(i);
        		for (int j = 0; j < last_cell; j++) {
            		wc = (wr != null) ? wr.getCell(j) : null;
            		input[i - 1][j] = (wc != null) ? wc.toString() : ""; // Prevents NullPointerException
        		}
    	  }
 
		  */
		wb.close();
		fi.close();
		
		return input;
		
	}
}
