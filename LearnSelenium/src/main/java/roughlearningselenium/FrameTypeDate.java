package roughlearningselenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameTypeDate {
	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/#date-range"); 
		
//	To get the iframe size
		
		List<WebElement> iframeList=driver.findElements(By.tagName("iframe"));
		
		System.out.println("Number of iframes on the page are: "+iframeList.size());
		
		
/*
 * Selenium provides multiple ways to switch over to iFrame.
1. ID
2. Name
3. Index
4. WebElement		
 */
		
		//driver.switchTo().frame(0);
		//driver.switchTo().frame("demo-frame");
		WebElement iframeusingwebElement = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(iframeusingwebElement);
		
		WebElement fromdateElement = driver.findElement(By.id("from")); 

		fromdateElement.click();
		fromdateElement.sendKeys("10/05/2023");
		
		System.out.println("From Date: "+fromdateElement.getAttribute("value"));
		
		WebElement todateElement = driver.findElement(By.id("to"));
		todateElement.click();
		todateElement.sendKeys("10/08/2023");
		
		System.out.println("To Date: "+todateElement.getAttribute("value"));
		
		
		fromdateElement.clear();
		todateElement.clear();

		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		
//Date selecting using calendar window
		
		fromdateElement.click();
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement selectedfromdateElement = driver.findElement(By.linkText("24")); 
		selectedfromdateElement.click();
		
		System.out.println("Selected Date: "+fromdateElement.getAttribute("value")); 
		
		todateElement.click();
		WebElement selectedtodateElement = driver.findElement(By.linkText("30"));
		selectedtodateElement.click();
		
		System.out.println("Selected To Date: "+todateElement.getAttribute("value"));
		
		fromdateElement.clear();
		todateElement.clear();
		
System.out.println("------------- Selecting the date using String List:----------");
		
		//driver.switchTo().frame(0); 
		
		//WebElement fromdateElement = driver.findElement(By.id("from"));
		fromdateElement.click();
		
		WebElement fromddlElement = driver.findElement(By.xpath("//select[@aria-label='Select month']"));
		//fromddlElement.click();
				
		Select fromddl = new Select(fromddlElement);
		
	//	System.out.println("Test: "+fromddlElement.getText());
		
		if (fromddl.isMultiple()) {
			
			System.out.println("From Month have a multiple choices\n");
			
		}
		else {
			System.out.println("\nFrom Month does not have a multiple choices\n"); 
		}
		
//To find the count	
		int ddlsize = fromddl.getOptions().size();
		System.out.println("From Date Month Count: "+ddlsize);
		
//To find the names in the list:
		List <WebElement> ddlnames = driver.findElements(By.xpath("//select[@class='ui-datepicker-month']"));
		
		for (WebElement listNames : ddlnames) 
	
		{
			String datelist=listNames.getText();
			//System.out.println("\nFrom Month Names: \n"+datelist);
		}	
//Selecting the From date from DDL:
			
			fromddl.selectByVisibleText("Nov");
			
		//	String month=fromddl.getFirstSelectedOption().getText();
		//	System.out.println("Selected Month is "+month);
			
			String selectedDate="20";
			
			List<WebElement> dateList=driver.findElements(By.xpath("(//table[@class='ui-datepicker-calendar'])[1]//td"));
				
			for (WebElement dateList2 : dateList) {	
				String dateList3 = dateList2.getText();
		//		System.out.println(dateList3);
				
				if (selectedDate.equals(dateList3)) {
					dateList2.click();
					System.out.println("Seleted From Date is :"+dateList3);
					
					break;
					
				}
				
			}		
			
			System.out.println("----------------------------Select To Date------------------------------------------");
			
//Selecting To Date:
			
			//WebElement todateElement = driver.findElement(By.id("to"));
			todateElement.click();
			
			
			WebElement tomonthddlElelemt = driver.findElement(By.cssSelector("div#ui-datepicker-div>div>div>div>select")); 
			
			Select selecttoddl= new Select(tomonthddlElelemt);
			
			int toddlsize=selecttoddl.getOptions().size();
			System.out.println("Size of to DDL: "+toddlsize); 
			
			
			selecttoddl.selectByVisibleText("Dec");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(150));
			
			//String selectedMonth=selecttoddl.getFirstSelectedOption().getText();
			//System.out.println(selectedMonth);
			
			String selectedtoDate="15";		
			List<WebElement> toDates = driver.findElements(By.xpath("(//table[@class='ui-datepicker-calendar'])[1]//td"));
			
			
			for (WebElement todateddl : toDates) {
				
				String todatelist =todateddl.getText(); 
				//System.out.println("List of To Dates:\n"+todatelist);  
				
				if (selectedtoDate.equals(todatelist)) { 
					
					todateddl.click(); 
					
					System.out.println("Selected to date: "+todatelist);
					 
					fromdateElement.clear();			
					todateElement.clear();
					
					
					
				}
				
			}
			
			

	}

}
