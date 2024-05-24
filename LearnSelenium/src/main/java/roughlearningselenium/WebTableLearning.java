package roughlearningselenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableLearning {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/webtables");
		
		Robot robot = new Robot();
		
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
//		WebElement tableselectElement = driver.findElement(By.cssSelector("div[role='grid']"));
		
//To find the row count:
		
		List <WebElement> rowElement = driver.findElements(By.xpath("//div[@class='rt-tr-group']"));

		int rowCount = rowElement.size();
		System.out.println("No of rows in this table : " + rowCount+"\n");
		
//To find column count:
		
		List<WebElement> columnElement = driver.findElements(By.xpath("//div[@class='rt-td']"));
		
		int columnCount = columnElement.size();
		System.out.println("No of columns in this table : " + columnCount+"\n");
		
//To get the value:
		
	//	WebElement editbuttonElement = driver.findElement(By.xpath("//span[@id='edit-record-1']//*[name()='svg']//*[name()='path' and contains(@d,'M880 836H1')]"));
		
		String data1="Gentry";
		
		for (WebElement columndata: columnElement)
		{
		String columnvalue= columndata.getText();
	//	System.out.println("Column Values are : " + columnvalue);
		
			if (data1.equals(columnvalue)) {
				
				Thread.sleep(2000);
				
				System.out.println("Data found");
				
			//	editbuttonElement.click();	
				break;
			}

			else {
				System.out.println("Data not found");
				
			}
			
		}
		
// To get value for particular row:
		
		WebElement rowvalueElement = driver.findElement(By.xpath("(//div[@role='rowgroup'])[1]"));
		//rowvalueElement.getText();
		
		System.out.println("\nSelected row value: \n"+rowvalueElement.getText());
		
// To get cell value:
		
		WebElement cellvalueElement = driver.findElement(By.xpath("//div[normalize-space()='alden@example.com']"));
	//	cellvalueElement.getText();
		String cellvalue=cellvalueElement.getText();
		System.out.println("\nSelected cell value: "+cellvalue);
	
//Search text box
		
		WebElement searchElement = driver.findElement(By.id("searchBox"));
		
		searchElement.sendKeys("al");
/*		
		
//To add a data in table
		
		
		WebElement addbuttonElement = driver.findElement(By.id("addNewRecordButton"));
		addbuttonElement.click();
		
		Thread.sleep(2000);
		
		WebElement firstnameElement = driver.findElement(By.id("firstName"));
		firstnameElement.sendKeys("Suraj",Keys.TAB);
		
		Thread.sleep(2000);
		
		WebElement lastnameElement = driver.findElement(By.id("lastName"));
		lastnameElement.sendKeys("Kumar",Keys.TAB);
		
		Thread.sleep(2000);
		
		WebElement emailElement = driver.findElement(By.id("userEmail"));
		emailElement.sendKeys("sk@example.com",Keys.TAB);
		
		Thread.sleep(2000);
		
		WebElement ageElement = driver.findElement(By.id("age"));
		ageElement.sendKeys("25",Keys.TAB);
	
		Thread.sleep(2000);
		
		WebElement salaryElement = driver.findElement(By.id("salary"));
		salaryElement.sendKeys("28000",Keys.TAB);
		
		Thread.sleep(2000);
		
		WebElement departmentElement = driver.findElement(By.id("department"));
		departmentElement.sendKeys("QC",Keys.TAB);
		
		Thread.sleep(2000);
		
		WebElement submitElement = driver.findElement(By.id("submit"));
		submitElement.click();
		
		System.out.println("Data added succesfully");
		
		driver.getCurrentUrl();
		
	*/	
	/*	
	 * List <WebElement> rowElement = driver.findElements(By.cssSelector(".rt-tbody"));
		
		for (WebElement row : rowElement) {
			
			String rowlist=row.getText();
			System.out.println(rowlist);
			
		}
	*/	
			
	}

}
