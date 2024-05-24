package roughlearningselenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RoughCode {
	public static void main(String[] args) {
		
			WebDriverManager.edgedriver().setup();
			EdgeDriver driver = new EdgeDriver();
			
			driver.manage().window().maximize();
			
			
			driver.get("https://demoqa.com/webtables");
			
			List <WebElement> rowElement = driver.findElements(By.xpath("//div[@class='rt-tr-group']"));
			
			String data1 = "Cierra";
			
			for (int i = 0; i < rowElement.size(); i++) {
			}
				
				List<WebElement> columnElement = driver.findElements(By.xpath("//div[@class='rt-td']"));
				
				for (int j = 0; j < columnElement.size(); j++) {
					
					String cellText = columnElement.get(j).getText();

					  if (data1.equals(cellText)) {
					  
					  System.out.println("True");
					  break;
					  } 
					  else 
					  { 
						  System.out.println("False");
					  
					  }
					 
	                System.out.print(cellText+"\t");
	                
				}
	            System.out.println();
			
			driver.close(); 
			
		/*	
			driver.get("https://jqueryui.com/datepicker/#date-range"); 
			
			driver.switchTo().frame(0);
			
			WebElement fromdateElement = driver.findElement(By.id("from"));
			fromdateElement.click();
			
			WebElement fromddlElement = driver.findElement(By.className("ui-datepicker-month"));
			
			Select fromddl = new Select (fromddlElement);
			
			fromddl.selectByVisibleText("Nov"); 
			System.out.println("Selected From-Month: "+fromddl.getFirstSelectedOption().getText());
			
			WebElement fromcalenderdateElement = driver.findElement(By.linkText("15"));
			fromcalenderdateElement.click();
			System.out.println("Selected From-Date: "+fromdateElement.getAttribute("value"));
			
//To Date
			WebElement todateElement = driver.findElement(By.id("to"));
			todateElement.click();
			
			WebElement toddlElement = driver.findElement(By.tagName("select"));
			
			Select toddl = new Select(toddlElement);
			
			toddl.selectByVisibleText("Nov"); 
			System.out.println("Selected To-Month: "+toddl.getFirstSelectedOption().getText());
		*/	
			
		/*	
			WebElement tocalenderdateElement = driver.findElement(By.linkText("16"));
			tocalenderdateElement.click();
			
			System.out.println("Selected To-Date: "+todateElement.getAttribute("value"));
	*/		
	/*		
			WebElement datedisableElement = driver.findElement(By.cssSelector("body > div:nth-child(5) > div:nth-child(1) > table:nth-child(2) > tbody:nth-child(2) > tr:nth-child(2) > td:nth-child(3)"));
			datedisableElement.isEnabled();
			
			if (datedisableElement.isDisplayed()) {
				System.out.println("Date is enabled");
				
			} else {
				System.out.println("Date is disabled");

			}
	*/	
			
	/*		
			String ddate="26";
			List<WebElement> disableddate = driver.findElements(By.xpath("(//table[@class='ui-datepicker-calendar'])[1]//td"));
			
			
			for (WebElement date01 : disableddate) {
				
				String date02=date01.getText();
				
				System.out.println(date02);
				
				if (ddate.equals(date02)) 
				
				{
					date01.click();
					
				}
				
				else 
				{
					System.out.println("Selected date is Disable");
					
					}
				
				
			}
			
		System.out.println("Date Enabled"+todateElement.getText()); 
	*/	
		
	}

}
