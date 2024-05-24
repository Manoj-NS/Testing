package roughlearningselenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ApacheMultiLogin {
	public static void main(String[] args) throws IOException, AWTException, InterruptedException {
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		Thread.sleep(4000);
		
		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		String excelfilePath ="I:\\manoj\\Selenium\\Doc\\Apache Files\\Login Details.xlsx";
		FileInputStream inputsteam = new FileInputStream (excelfilePath);
		
		XSSFWorkbook workbook = new XSSFWorkbook (inputsteam);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		int rows=sheet.getLastRowNum();
		int col=sheet.getRow(1).getLastCellNum();
		
		System.out.println("Total rows: "+rows);
		System.out.println("Total columns: "+col);
		
		for(int r=1;r<=rows;r++)
			
		{
			XSSFRow row=sheet.getRow(r);
			

			String username = row.getCell(0).getStringCellValue();
			String password= row.getCell(1).getStringCellValue();
			
	
			Thread.sleep(2000);
			
			WebElement usernameElement = driver.findElement(By.id("user-name"));
			WebElement passwordElement = driver.findElement(By.id("password"));
			WebElement loginbuttonElement = driver.findElement(By.id("login-button"));
			
			Thread.sleep(2000);
		
			usernameElement.sendKeys(username);
			Thread.sleep(1000);
			passwordElement.sendKeys(password);
			Thread.sleep(1000);
			loginbuttonElement.click();
			
			
			String result="null";
			
			
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
             try
             {
            	 Boolean isloggedin=  driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).isDisplayed();
            	 
            	 if(isloggedin==true)
            	 {
            		 result="Pass";
            	 }
            	 
            	 System.out.println(r+"."+username+" || "+password+ "||Login Status: "+result);
            	 
            	 driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
                 
                 Thread.sleep(2000);
                 
                 driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
             }
             
             
          catch (Exception e)
             
          {
        	  Boolean errormessage=driver.findElement(By.xpath("//h3[contains(text(),'Epic sadface: Sorry, this user has been locked out')]")).isDisplayed();
        	  if(errormessage==true)
         	 {
         		 result="Fail";
         	 }
         	 
        	  driver.navigate().refresh();
        	  System.out.println(r+"."+username+" || "+password+ "||Login Status: "+result);
        	 
          }
             
             
             driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
             
             driver.getCurrentUrl();
  
		}
			
		/*	
			for(int c=0;c<col;c++)
			{
				
				XSSFCell cell=row.getCell(c);
				
				String username = row.getCell(0).getStringCellValue();
			String password= row.getCell(1).getStringCellValue();
			
			driver.get("https://www.saucedemo.com/");
			
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			
			WebElement usernameElement = driver.findElement(By.id("user-name"));
			WebElement passwordElement = driver.findElement(By.id("password"));
			WebElement loginbuttonElement = driver.findElement(By.id("login-button"));
			
		
			usernameElement.sendKeys(username);
			passwordElement.sendKeys(password);
			loginbuttonElement.click();
			
			Thread.sleep(2000);
			
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
             
             driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
             
             driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
             
             driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
             
             Thread.sleep(2000);
             
             System.out.println(r+"."+username+" || "+password);
				
				}
				/*
				
				
				XSSFCell username=row.getCell(c);
				XSSFCell password=row.getCell(c);
				
				switch(username.getCellType())
				
				{
				case STRING: System.out.print(username.getStringCellValue());break;
				case NUMERIC: System.out.print(username.getNumericCellValue());break;
				case BOOLEAN: System.out.print(username.getBooleanCellValue());break;
				}
				
				switch(password.getCellType())
				
				{
				case STRING: System.out.print(password.getStringCellValue());break;
				case NUMERIC: System.out.print(password.getNumericCellValue());break;
				case BOOLEAN: System.out.print(password.getBooleanCellValue());break;
				}
				
				
				
			}
			
		}
		*/
		
	}

}
