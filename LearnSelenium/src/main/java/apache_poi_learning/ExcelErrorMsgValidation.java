package apache_poi_learning;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelErrorMsgValidation {
	public static void main(String[] args) throws IOException, InterruptedException {
		
			
			
			WebDriverManager.edgedriver().setup();
			EdgeDriver driver= new EdgeDriver();
			
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			XSSFWorkbook workbook =new XSSFWorkbook("D:\\Selenium\\Eclipse Code\\LearnSelenium\\DataFiles\\Login_Error_Msg_Validation.xlsx");
			XSSFSheet sheet = workbook.getSheetAt(0);
			
			int rowCount = sheet.getLastRowNum();
			int colCount = sheet.getRow(0).getLastCellNum();
			
			String[][] data = new String [rowCount][colCount];
			
			for (int i=1; i<=rowCount; i++) {
				XSSFRow eachRow = sheet.getRow(i);
				
				
		/*		for(int j=0; j<colCount; j++) {
					XSSFCell eachCell=eachRow.getCell(j);
					
					data[i-1][j] = eachCell.getStringCellValue();
					
					System.out.println(data[i-1][j]);*/
					
					String usrname_excel=eachRow.getCell(0).getStringCellValue();
					String pwd_excel=eachRow.getCell(1).getStringCellValue();
					String error_excel=eachRow.getCell(2).getStringCellValue();
	System.out.println("Username: "+usrname_excel+ " || Password: "+pwd_excel+" ||Error Message: "+error_excel);
				
					Thread.sleep(3000);
					
					WebElement usernameElement = driver.findElement(By.id("username"));
					WebElement passwordElement = driver.findElement(By.id("password"));
					WebElement loginbuttonElement = driver.findElement(By.className("decorativeSubmit"));
									
				
					usernameElement.sendKeys(usrname_excel);
					passwordElement.sendKeys(pwd_excel);
					loginbuttonElement.click();
					
			Thread.sleep(1000);	
			
			try {
					WebElement useralertElement = driver.findElement(By.xpath("//*[text()[contains(.,'User not found.')]]"));
					String actualUserAlert = useralertElement.getText();
								
					if(actualUserAlert.equals(error_excel)) {
						System.out.println("Invalid Username error message text: Passed ");}
					
					else {
						System.out.println("Invalid Username error message text: Fail");}
				}
			catch(Exception e) {
						//	System.out.println("Username: Unknown exception occured while verifying the Text");
					}
			
			Thread.sleep(1000);
			
			try {	
					WebElement passwordalertElement=driver.findElement(By.xpath("//*[text()[contains(.,'Password incorrect')]]"));
					String actualPasswordalert=passwordalertElement.getText();
					
					if(actualPasswordalert.equals(error_excel)) {
						System.out.println("Invalid password error message text: Passed ");}
					else {
						System.out.println("Invalid password error message text: Fail");}						
				}
			
			catch(Exception e) {
			//	System.out.println("Password: Unknown exception occured while verifying the Text");
						}
			
			Thread.sleep(1000);
			
			try {
				WebElement logoutElement = driver.findElement(By.linkText("CRM/SFA"));
				String loginStatus=logoutElement.getText();
				
				if (loginStatus.equalsIgnoreCase(error_excel)){
					System.out.println("Login Successfully");}
					else {
						System.out.println("Please check the login credentials");}
				
				}
			catch(Exception e) {
				//System.out.println("Login Status: Unknown exception occured while verifying the Text");
				
			}
			
			Thread.sleep(1000);
			
			try {
				 WebElement nouserElement =driver.findElement(By.xpath("//p[text()='username was empty reenter']"));
				 String Actualnouseralert=nouserElement.getText();
				 
				 if(Actualnouseralert.equals(error_excel)) {
						System.out.println("Username is empty");}
				 else {
						System.out.println("Username is not empty");}		
					
				}
			catch (Exception e) {
			//	System.out.println("Empty username: Unknown exception occured while verifying the Text");
				
			}
			
			Thread.sleep(1000);
			
			try {
					WebElement nopasswordElement =driver.findElement(By.xpath("//p[text()='password was empty reenter']"));
					String Actualnopasswordalert=nopasswordElement.getText();
					
					if(Actualnopasswordalert.equals(error_excel)) {
						System.out.println("Password is empty");}
					else {
						System.out.println("Password is not empty");}		
			
			}
			catch (Exception e) {
			//	System.out.println("Empty Password: Unknown exception occurred while verifying the Text");	
			}
			
			workbook.close();
			}
		}
	}
			
					
			
		