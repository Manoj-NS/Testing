package apache_poi_learning;

import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelDDLValidation {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver= new EdgeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		XSSFWorkbook workbook =new XSSFWorkbook("D:\\Selenium\\Eclipse Code\\LearnSelenium\\DataFiles\\Login_DDL_Validation.xlsx");
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		int rowCount = sheet.getLastRowNum();
		int colCount = sheet.getRow(0).getLastCellNum();
		
		String[][] data = new String [rowCount][colCount];
		DataFormatter dataFormatter = new DataFormatter();

		for (int i=1; i<=rowCount; i++) {
			XSSFRow eachRow = sheet.getRow(i);
			
			for(int j=0; j<colCount; j++) {
				XSSFCell eachCell=eachRow.getCell(j);
								
				if (eachCell.getCellType() == CellType.NUMERIC) {
                    
                    data[i-1][j] = dataFormatter.formatCellValue(eachCell);

                } else {
                    
                    data[i-1][j] = eachCell.getStringCellValue();
                
                }
			}	
				String usrname_excel=eachRow.getCell(0).getStringCellValue();
				String pwd_excel=eachRow.getCell(1).getStringCellValue();
				String source_excel=eachRow.getCell(2).getStringCellValue();
				// Split the source_excel value into an array of options

				String[] expectedOptions = source_excel.split( ", ");
				
				
 System.out.println("Username: "+usrname_excel+ " || Password: "+pwd_excel+" ||DDL Options: "+source_excel);							
				

 		
 			WebElement usernameElement = driver.findElement(By.id("username"));
			usernameElement.sendKeys(usrname_excel);
			WebElement passwordElement = driver.findElement(By.id("password"));
			passwordElement.sendKeys(pwd_excel);
			WebElement loginbuttonElement = driver.findElement(By.className("decorativeSubmit"));
			loginbuttonElement.click();			
			
			WebElement welcomepageElement = driver.findElement(By.linkText("CRM/SFA"));
			welcomepageElement.click();
			WebElement createleadElement = driver.findElement(By.linkText("Create Lead"));
			createleadElement.click();	
				
			WebElement sourceddlElement = driver.findElement(By.id("createLeadForm_dataSourceId"));		 
				 Select sourceList= new Select(sourceddlElement);
				 
				 List<WebElement> sourceOptions =sourceList.getOptions();
				 
				// Iterate through the options in the dropdown

				 for (int k = 1; k < sourceOptions.size(); k++) {
			         String actualOptions = sourceOptions.get(k).getText().trim();
			         System.out.println("Source DDL options: "+actualOptions);			     			         	         	         
			         
			         if(Arrays.asList(expectedOptions).contains(actualOptions)) {
			        	 
			        	 System.out.println("Source dropdown have a expacted options \n");
		        	 	} else {
		        		 System.out.println("Source dropdown not have a expacted options \n");}
				 
				 }
				 				 
			/*		
					  WebElement logoutElement = driver.findElement(By.linkText("Logout"));
					  logoutElement.click();
					  
					  WebElement username2Element = driver.findElement(By.xpath("(//input[@name='USERNAME'])[1]"));
						username2Element.sendKeys(usrname_excel);
						WebElement password2Element = driver.findElement(By.xpath("//input[@name='PASSWORD']"));
						password2Element.sendKeys(pwd_excel);
						WebElement loginbutton2Element = driver.findElement(By.xpath("//input[@value='Login']"));
						loginbutton2Element.click();	
						
						WebElement createleadElement2 = driver.findElement(By.xpath("//select[@id='createLeadForm_dataSourceId']"));
						createleadElement2.click();
						sourceList.selectByVisibleText(source_excel);
			*/			
			//		System.out.print(data[i-1][j]);
			//		System.out.print(" || ");
				
			//	System.out.println();
			}
	
		
		}
}
