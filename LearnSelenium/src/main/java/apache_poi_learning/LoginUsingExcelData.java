package apache_poi_learning;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginUsingExcelData {
	
	public static void main(String[] args) throws IOException {
		
		
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
     /*  
        WebElement usrname = driver.findElement(By.xpath("//input[@id='user-name']"));
        WebElement pwd = driver.findElement(By.xpath("//input[@id='password']"));
        WebElement login = driver.findElement(By.xpath("//input[@id='login-button']"));
     */   
        FileInputStream file = new FileInputStream("D:\\Selenium\\Eclipse Code\\LearnSelenium\\DataFiles\\Login Details.xlsx");
        
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheet("Sheet1");
        
        int rows = sheet.getLastRowNum();
        int columns = sheet.getRow(1).getLastCellNum();
                                  
        System.out.println(rows);
        System.out.println(columns);
        
        for (int r=1;r<rows;r++)
        { 
                     XSSFRow rows1 = sheet.getRow(r);
          /*  XSSFRow rows1 = sheet.getRow(r);
            String usrname_excel = rows1.getCell(1).getStringCellValue();
                     String pwd_excel = rows1.getCell(1).getStringCellValue(); */
                     
            for (int c=0;c<columns;c++) {
                     XSSFCell colmns = rows1.getCell(c);
                    // System.out.println(colmns);
                     String usrname_excel = rows1.getCell(0).getStringCellValue();  
                     String pwd_excel = rows1.getCell(1).getStringCellValue(); 
                     
                    
                     WebElement usrname = driver.findElement(By.xpath("//input[@id='user-name']"));
                     WebElement pwd = driver.findElement(By.xpath("//input[@id='password']"));
                     WebElement login = driver.findElement(By.xpath("//input[@id='login-button']"));
                     
                     
                     usrname.sendKeys(usrname_excel);
                     pwd.sendKeys(pwd_excel);
                     login.click();
                     
                     
                                         
                     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
                     
                     driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
                     
                     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
                     
                     driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
                     
                    driver.getCurrentUrl();
                    
                     System.out.println("Tested login: " + usrname_excel);
                       
            }
            
        }

	}
	

}
