package roughlearningselenium;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DateValidation {
	
	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize(); 
		
		
		
		driver.get("http://192.168.55.181:4300/form");
		
		WebElement dobtextElement = driver.findElement(By.xpath("(//label[@class='form-label'])[3]"));
		//System.out.println(dobElement.getText());
		
	String dobText="DOB";
		if (dobText.endsWith(dobtextElement.getText())) {
			System.out.println(dobText+": Text is correct");
			
		} else {
			System.out.println(dobText+": Text is In-correct");

		}
		
		WebElement dobElement = driver.findElement(By.id("dob"));
		//dobElement.sendKeys("12242023");
				
		String [] dateValue= {
				
				"test",
				"TEST",
				"T12",
				"1@3",
				"!@#Te",
				"23/23/2023",
				"12/25/2023",
				"10/99/2023",
				"99/25/2023",
				"99/99/9999",
				"10-10-2023",
				"11.25.2023",
				"25/10/2023",
				"12/30/2023",
				"02/25/2023",
				"09/31/2023"
		};
		
		for (String date : dateValue) {
			
			dobElement.sendKeys(date);
			dobElement.clear();

		}
		
		//String regex="^([0-9]{2})/([0-9]{2})/([0-9]{4})$";
		String regex = "^(0?[1-9]|1[012])\\/(0?[1-9]|[12][0-9]|3[01])\\/([0-9]{4})$";

		Pattern pattern=Pattern.compile(regex);
		
		for (String dateValidation : dateValue) 
		{
			
			Matcher matcher=pattern.matcher(dateValidation);
			
			//System.out.println(dateValidation+": "+matcher.matches());
	
			System.out.println(dateValidation);
			if (matcher.matches()) 
			{
				
				System.out.println("Date is valid format");
				
			} else 
			{
				System.out.println("Date is invalid format");

			}	
					
		
		}
		

//Date Picker:
	/*	
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		WebElement datepickerElement = driver.findElement(By.xpath("//input[contains(@class,'ng-tns-c58-10 ui-inputtext')]"));
		datepickerElement.click();
		
		WebElement dateselectElement = driver.findElement(By.linkText("10"));
		dateselectElement.click();
		
		String seletedDate=dateselectElement.getAttribute("value");
		
		System.out.println(seletedDate);
		
		WebElement monthnavigatorElement = driver.findElement(By.xpath("//span[contains(@class,'ui-datepicker-prev-icon pi')]"));
		monthnavigatorElement.click();
		
		WebElement datedisabledElement = driver.findElement(By.xpath("//span[text()='7']"));
		
		boolean disbledDate=datedisabledElement.isEnabled();
		
		if (disbledDate==false) {
			
			//datedisabledElement.click();
			
			System.out.println(datedisabledElement.isEnabled());
			
		}
*/		
		
	}

}
